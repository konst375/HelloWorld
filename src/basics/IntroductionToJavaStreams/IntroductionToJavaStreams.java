package basics.IntroductionToJavaStreams;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.*;

public class IntroductionToJavaStreams {
    public static void main(String[] args) {

        /* Method Stream.empty() - used to create empty stream to avoid returning null for streams */
        Stream<String> streamEmpty = Stream.empty();
        // it's used at method streamOf
        streamOf(new ArrayList<>()); // returned Stream.empty()
        streamOf(List.of("1", "3", "7")); // returned list.stream()

        /* We can create Stream of any type of Collection */
        Collection<String> collection = Arrays.asList("d", "f", "y");
        Stream<String> streamOfCollection = collection.stream();

        /* Array also can be the source of Stream */
        Stream<Integer> streamOfArray = Stream.of(1, 3, 7, 5);

        /* Stream.builder() */
        Stream<String> streamBuilder = Stream.<String>builder()
                .add("a")
                .add("g")
                .add("d")
                .build();
        // desired type should be specified in the right part of the statement in <desired_type>
        // otherwise the build() method will create an instance of the Stream<Object>
        Stream<Object> streamBuilderObjects = Stream.builder()
                .add("this")
                .add("stream")
                .add("contains")
                .add("an")
                .add("instance")
                .add("of")
                .add("Object")
                .build();

        /* Stream.generate() - method accept a Supplier<T> for element generating */
        Stream<String> streamGenerated = Stream.generate(() -> "element")
                .limit(10); // resulting Stream is infinite, we should specify the desired size,
        // or generate() method will work until it reaches the memory limit

        /* Other way to create infinity Stream is used method iterate() */
        Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2)
                .limit(10); // will return 40, 42, 44, 46, 48, ... 58,
        // number of items at the result Stream are 10.
        // resulting Stream is infinite, we should specify the desired size,
        // or iterate() method will work until it reaches the memory limit

        /*
          Stream of primitives
          - Java 8 offers the possibility to create streams out of three primitive types:
          int, long and double.
          As Stream<T> is a generic interface
          three new special interfaces were created:
          IntStream, LongStream, DoubleStream
         */
        IntStream intStream = IntStream.range(1, 5); // returned 1, 2, 3, 4
        LongStream longStream = LongStream.rangeClosed(1L, 5L); // returned 1, 2, 3, 4, 5
        DoubleStream doubleStream = new Random().doubles(5); // returned DoubleStream consist of 5 elements

        /* Stream  of strings */
        IntStream streamOfChars = "abcsk".chars(); // returned IntStream
        Stream<String> streamOfString = Arrays.stream("abcsk"
                .split(""));
        // or we can create stream of String like that
        Stream<String> stringStream = Pattern.compile("")
                .splitAsStream("abcsk");

        /* Stream of file */
        Path path = Paths.get("F:\\IdeaProjects\\Learning\\src\\file.txt");

        try (Stream<String> stringStream1 = Files.lines(path)) {
            // returned all lines from a file as a Stream
            // do something
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        try (Stream<String> stringStream2 = Files.lines(path, StandardCharsets.UTF_8
                /* or Charset.forName("UTF-8") */)) {
            // do something
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

/*
          Some terminal operation which aggregate a stream to a type or to a primitive:
          count(), max(), min(), sum()
         */

        /*
          Method reduce()
          @param a accumulated amount
         * @param b next element of stream
         */
        OptionalInt reduced = IntStream.range(1, 4)
                .reduce((a, b) -> a + b); // reduced = 6 (1 + 2 + 3)
        OptionalInt reduced1 = IntStream.range(1, 4)
                .reduce(Integer::sum); // the same
        int reducedTwoParams = IntStream.range(1, 4)
                .reduce(10, (a, b) -> a + b); // reduced = 16 (10 + 1 + 2 + 3)

        /* Method collect() */
        List<Product> productList = Arrays.asList(new Product(23, "potatoes"),
                new Product(14, "orange"), new Product(13, "lemon"),
                new Product(23, "bread"), new Product(13, "sugar"));

        // Converting a stream to the Collection (Collection, List or Set)
        List<String> collectorCollection = productList.stream()
                .map(Product::name)
                .toList();

        // converting a stream to the String
        String listToString = productList.stream()
                .map(Product::name)
                .collect(Collectors.joining(",\n", "[", "]"));

        // average price
        double averagePrice = productList.stream()
                .collect(Collectors.averagingDouble(Product::price));

        // sum of prices
        int summingPrice = productList.stream()
                .mapToInt(Product::price)
                .sum();

        // collecting statistic information about elements of stream
        IntSummaryStatistics statistics = productList.stream()
                .collect(Collectors.summarizingInt(Product::price));

        // grouping of streams elements according to the specified function
        Map<Integer, List<Product>> collectorMapOfList = productList.stream()
                .collect(Collectors.groupingBy(Product::price));

        // Dividing stream’s elements into groups according to some predicate
        Map<Boolean, List<Product>> dividedMap = productList.stream()
                .collect(Collectors.partitioningBy(el -> el.price() > 15));

        // convert List to unmodifiable Set
        Set<Product> unmodifiableSet = productList.stream()
                .collect(Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet));

        // Custom collect() - some shit
        LinkedList<Product> productLinkedList = productList.stream()
                .collect(Collector.of(LinkedList::new, LinkedList::add,
                        (first, second) -> {
                            first.addAll(second);
                            return first;
                        }
                ));
        //teeing()
        /* int sumMaxMin = productList.stream()
                .collect(
                        Collectors.teeing(
                                Collectors.minBy((t1, t2) -> Integer.min(t1.getPrice(), t2.getPrice())),
                                Collectors.maxBy((t1, t2) -> Integer.max(t1.getPrice(), t2.getPrice())),
                                (min, max) -> ));
         */

        /* parallel Streams */
        Stream<Product> productParallelStream = productList.parallelStream();
        boolean isParallel = productParallelStream.isParallel(); // true
        boolean bigPrice = productParallelStream
                .map(prod -> prod.price() * 12)
                .anyMatch(price -> price > 200); // don't know without run
        // If the source of a stream is something other than a Collection or an array,
        // the parallel() method should be used
        IntStream intStreamParallel = IntStream.rangeClosed(1, 100).parallel();
        boolean isIntStreamParallel = intStreamParallel.isParallel(); // true
        // The stream in parallel mode can be converted back to the sequential mode
        // by using the sequential() method
        IntStream intStreamSequential = intStreamParallel.sequential();
        boolean isIntStreamSequentialParallel = intStreamSequential.isParallel(); // false
    }

    /* Used to learn Stream.empty() */
    private static Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }
}

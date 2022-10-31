package basics.optional.app;

import basics.optional.Headphones;
import basics.optional.Person;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalLearnApp {
    public static void main(String[] args) {
        // How to create instance of Optional

        // 1. Using the static method empty()
        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.isPresent());

        String name = null;
        /**
         * 2. Using static method of()
         * Optional<String> OptionalName = Optional.of(name);
         *  - trows a NullPointerException because we should use ofNullable() if assume that value will be null
         */
        Optional<String> optionalName = Optional.ofNullable(name);
        System.out.println(optionalName.isPresent());

        // isPresent(), isEmpty
        System.out.println(optionalName.isPresent());
        System.out.println(optionalName.isEmpty());

        // ifPresent() - позволяет сделать что-то с объектом который внутри Optional в случае если он существует
        name = "String";
        optionalName = Optional.of(name);
        optionalName.ifPresent(n -> System.out.println(n.length()));

        // orElse(default_value) - returns instance or else default_value
        String defaultName = "default name 1";
        String nullName = null;
        name = Optional.ofNullable(nullName).orElse(defaultName);
        System.out.println(name);

        // orElseGet()
        name = Optional.ofNullable(nullName).orElseGet(() -> "default name 2");
        System.out.println(name);

        // difference orElse() and orElseGet()
        // think that they are no difference ?
        System.out.print("orElseGet(): ");
        name = Optional.ofNullable(nullName).orElseGet(OptionalLearnApp::getMyDefault);
        System.out.print("\norElse(): ");
        name = Optional.ofNullable(nullName).orElse(getMyDefault());
        // you made mistake
        System.out.print("\norElseGet(): ");
        name = Optional.ofNullable(name).orElseGet(OptionalLearnApp::getMyDefault);
        System.out.print("\norElse(): ");
        name = Optional.ofNullable(name).orElse(getMyDefault());

        // orElseThrow()
        // name = Optional.ofNullable(nullName).orElseThrow(); - throws NonSuchElementException
        // name = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new); - throws IllegalArgumentException

        //get()
        Optional<String> opt = Optional.of("\nwine");
        Optional<String> optNull = Optional.ofNullable(null);
        name = opt.get();
        System.out.println(name);
        // name = optNull.get(); - throws NonSuchElementException

        //filter
        Optional<Integer> yearOptional = Optional.of(2022);
        System.out.println("filter return " + yearOptional.filter(y -> y == 2022));
        System.out.println("after filter " + yearOptional);
        System.out.println("filter return " + yearOptional.filter(y -> y == 2019));
        System.out.println("after filter " + yearOptional);

        // use Headphones
        Headphones buds = new Headphones(11.6);
        Headphones buds2 = new Headphones(17.3);
        System.out.println("price buds is range " + buds.priceIsRange1());
        System.out.println("price buds is range " + buds.priceIsRange2());
        System.out.println("price buds is range " + buds2.priceIsRange1());
        System.out.println("price buds is range " + buds2.priceIsRange2());

        // flatMap() - распаковывает Optional неявно (за нас)

        // use Person
        Person person = new Person("Kosta", "67859");
        Optional<Person> personOptional = Optional.of(person);

        Optional<Optional<String>> nameOptionalWrapper = personOptional.map(Person::getName);
        Optional<String> nameOptional = nameOptionalWrapper.orElseThrow(IllegalArgumentException::new);
        String name1 = nameOptional.orElse("unknown name");
        System.out.println(name1);

        String name2 = personOptional
                .flatMap(Person::getName)
                .orElse("unknown name");
        System.out.println(name2);

        // use findFirst()
        String find = Stream.of(getEmpty(), getHello(), getBye())
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst()
                .map(Object::toString)
                .orElse("not found");
        System.out.println(find);

        // method or()
        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.or(() -> Optional.of("Lol")).get());
    }

    static String getMyDefault() {
        System.out.print("puff");
        return "getting";
    }

    static Optional<String> getEmpty() {
        return Optional.empty();
    }

    static Optional<String> getHello() {
//        return Optional.of("hello");
        return Optional.empty();
    }

    static Optional<String> getBye() {
//        return Optional.of("bye");
        return Optional.empty();
    }
}


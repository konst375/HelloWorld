package basics.collections.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Map<String, Product> productsByName = new HashMap<>();

        Product eBike = new Product("E-Bike", "A bike with a battery");
        Product roadBike = new Product("Road Bike", "A bike for competition");

        productsByName.put(eBike.getName(), eBike);
        productsByName.put(roadBike.getName(), roadBike);

        Product nextPurchase = productsByName.get("E-Bike");
        System.out.println(nextPurchase.getDescription().compareTo("A bike with a battery"));

        Optional<Product> nextPurchase1 = Optional.ofNullable(productsByName.get("Car"));
        System.out.println(nextPurchase1.isPresent());

        productsByName.values()
                .stream()
                .toList()
                .forEach(System.out::println);

        Product defaultProduct = new Product("default", "used to return from getOrDefault()");
        productsByName.getOrDefault("Car", defaultProduct);

        Product eBike2 = new Product("E-Bike", "A bike with a battery");
        eBike2.getTags().add("#sport");
        productsByName.merge("E-Bike", eBike2, Product::addTagsOfOtherProduct);

        productsByName.compute("E-Bike", (k, v) -> {
            if (v != null)
                return v.addTagsOfOtherProduct(eBike2);
            return eBike2;
        });
    }
}

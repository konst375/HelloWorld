package basics.anonymous.app;

import basics.anonymous.Cat;
import basics.anonymous.Meowable;

public class appAnonymous {
    public static void main(String[] args) {
        Cat cat = new Cat() {
            @Override
            public void meow() {
                System.out.println("Anonymous say meow");
                System.out.println(getClass().getName());
            }
        };
        cat.meow();

        Meowable anyAnimal = new Meowable() {
            @Override
            public void meow() {
                System.out.println("Any animal say meow");
                System.out.println(getClass().getName());
            }
        };

        anyAnimal.meow();
    }
}

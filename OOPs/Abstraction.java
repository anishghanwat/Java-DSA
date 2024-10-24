public class Abstraction {
    public static void main(String[] args) {

        // Cannot create an instance (object) of an abstract class like Animal
        // Horse is a concrete class, so we can create an instance of it
        Horse h = new Horse();
        h.eat(); // Inherited from Animal
        h.walk(); // Overridden method in Horse

        // Chicken is also a concrete class, so we can create an instance
        Chicken c = new Chicken();
        c.eat(); // Inherited from Animal
        c.walk(); // Overridden method in Chicken

        // Abstract classes can have constructors
        Mustang myHorse = new Mustang();
        // Animal -> Horse -> Mustang (calls constructors in this order)
    }
}

abstract class Animal {
    Animal() {
        System.out.println("Animal is created");
    }

    void eat() {
        System.out.println("Animal Eating");
    }

    // Abstract class can have both abstract and non-abstract methods
    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Created");
    }

    @Override
    void walk() {
        System.out.println("Horse is walking on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang is created");
    }
}

class Chicken extends Animal {
    @Override
    void walk() {
        System.out.println("Chicken is walking on 2 legs");
    }
}

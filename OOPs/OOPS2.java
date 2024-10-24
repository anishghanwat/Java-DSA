public class OOPS2 {
    public static void main(String[] args) {
        // single level inheritance
        Mammals humans = new Mammals();
        humans.eat();

        // multi level inheritance
        Dogs lucy = new Dogs();
        lucy.eat();
        lucy.legs = 4;
        System.out.println(lucy.legs);
    }
}

//Complete: hybrid inheritance
// single level inheritance
class Animals {
    String color;

    void eat() {
        System.out.println("Eating");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

class Mammals extends Animals {
    int legs;

    void walk() {
        System.out.println("Walking");
    }
}

// multi level inheritance
class Dogs extends Mammals {
    String breed;
}

// hierarchial inheritance
class Fish extends Animals {
    void swim() {
        System.out.println("Swimming");
 

}
class Bird extends Animals {
    void fly() {
        System.out.println("flying");
    }
}
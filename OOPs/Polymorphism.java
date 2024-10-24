public class Polymorphism {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(1, 2));
        System.out.println(cal.sum((float) 1.5, (float) 2.5));
        System.out.println(cal.sum(1, 2, 3));

        Deer d = new Deer();
        d.eat();
    }
}

// Method OverLoading: Compile time polymorphism
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// Method OverRiding: Run time polymorphism
class Animal {
    void eat() {
        System.out.println("Eat anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eat grass");
    }
}

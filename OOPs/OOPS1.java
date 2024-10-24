public class OOPS1 {
    public static void main(String[] args) {

        // 1. class and objects
        // construction overloading
        Pen p1 = new Pen(); // created a pen object called p1
        Pen p2 = new Pen("Yellow");
        Pen p3 = new Pen(9);

        p1.setColor("blue");
        p1.setTip(5);

        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

        // 2. access modifiers
        BankAccount myAcc = new BankAccount();
        myAcc.username = "AnishGhanwat";
        // myAcc.password = "abnsgsdh"; // cannot access, throws error
        myAcc.setPassword("newPassword");

        System.out.println(myAcc.username);
        // System.out.println(myAcc.password);

        Student s1 = new Student();
        s1.name = "Anish";
        s1.roll = 51;
        s1.password = "Abc@123";

        Student s2 = new Student(s1);
        s2.password = "Xyz@123";

        // Deep copy constructor
        Student s3 = new Student();
        s3.name = "john";
        s3.roll = 52;
        s3.password = "Qwerty";

        s3.marks[0] = 100;
        s3.marks[1] = 90;
        s3.marks[2] = 80;

        Student s4 = new Student(s3); // Deep copy of s3
        s4.marks[2] = 100; // Modifying s4's marks to test deep copy

        System.out.println("s3 marks:");
        for (int i = 0; i < 3; i++) {
            System.out.println(s3.marks[i]); // Should print s3's marks
        }

        System.out.println("s4 marks:");
        for (int i = 0; i < 3; i++) {
            System.out.println(s4.marks[i]); // Should print s4's marks
        }
    }

    static class Pen {
        private String color;
        private int tip;

        // constructor
        Pen() { // non-parameterized constructor
            System.out.println("Constructor is called!");
        }

        // parameterized constructors
        Pen(String color) {
            this.color = color;
        }

        Pen(int tip) {
            this.tip = tip;
        }

        // getter
        String getColor() {
            return this.color; // 'this' is a keyword referring to the current object.
        }

        int getTip() {
            return this.tip;
        }

        // setter
        void setColor(String newColor) {
            color = newColor;
        }

        void setTip(int newTip) {
            tip = newTip;
        }
    }

    static class BankAccount {
        public String username;
        private String password;

        public void setPassword(String pwd) {
            password = pwd;
        }
    }

    static class Student {
        String name;
        int roll;
        String password;
        int marks[];

        // Default constructor
        Student() {
            marks = new int[3];
        }

        // Shallow copy constructor
        // Student(Student s1) {
        // marks = new int[3];
        // this.name = s1.name;
        // this.roll = s1.roll;
        // // Shallow copy of marks array
        // this.marks = s1.marks;
        // }

        // Deep copy constructor
        Student(Student s3) {
            marks = new int[3];
            this.name = s3.name;
            this.roll = s3.roll;
            // Deep copy of marks array
            for (int i = 0; i < 3; i++) {
                this.marks[i] = s3.marks[i];
            }
        }
    }
}

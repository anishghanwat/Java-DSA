public class StaticAndSuperKeywords {
    public static void main(String[] args) {
        // Accessing static variable using class name (preferred way)
        Student.SchoolName = "SFS";

        Student s1 = new Student();
        System.out.println("s1's school: " + s1.SchoolName);  // Outputs "SFS"

        Student s2 = new Student();
        System.out.println("s2's school: " + s2.SchoolName);  // Outputs "SFS"

        // Changing the static variable using one object
        s2.SchoolName = "SMS";  // or Student.SchoolName = "SMS";
        System.out.println("s1's school after change: " + s1.SchoolName);  // Outputs "SMS"
        System.out.println("s2's school after change: " + s2.SchoolName);  // Outputs "SMS"

        Student s3 = new Student();
        System.out.println("s3's school: " + s3.SchoolName);  // Outputs "SMS"
    }
}

class Student {
    String name;
    int roll;
    static String SchoolName;  // Static variable

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

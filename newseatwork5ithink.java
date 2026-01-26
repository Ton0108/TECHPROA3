class Student {
    String name;
    int age;
    String course;
}

public class Main {
    public static void main(String[] args) {

        // Create object
        Student s1 = new Student();

        try {
            // Assign values using object reference
            s1.name = "Ton";
            s1.age = 18;
            s1.course = "BSIT";

            // Basic error handling
            if (s1.age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }

            // Output
            System.out.println("Student Information");
            System.out.println("Name: " + s1.name);
            System.out.println("Age: " + s1.age);
            System.out.println("Course: " + s1.course);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
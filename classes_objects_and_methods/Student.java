public class Student {
    // Instance variables to store student details
    private String name;
    private String id;
    private double grades;
    private int credits;
    
    // Static variable to count the number of Student objects created
    private static int studentCount = 0;
    
    // Constructor to initialize a Student object
    public Student(String name, String id, double grades, int credits) {
        this.name = name;
        this.id = id;
        this.grades = grades;
        this.credits = credits;
        studentCount++; // Increment student count when a new student is created
    }
    
    // Accessor methods (getters) to retrieve values
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getGrades() {
        return grades;
    }

    public int getCredits() {
        return credits;
    }
    
    // Mutator methods (setters) to update values
    public void setName(String name) {
        this.name = name;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    // Method to determine if the student is on the honor roll
    // For general students, a GPA (grade) of 95 or higher is considered honor roll
    public boolean isOnHonorRoll() {
        return grades >= 95.0;
    }

    // Static method to get number of students created
    public static int getStudentCount() {
        return studentCount;
    }

     // Method to calculate the factorial of credits using recursion
    public int creditFactorial() {
        return factorial(credits);
    }
    
    // Helper method for recursive factorial calculation
    private int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}

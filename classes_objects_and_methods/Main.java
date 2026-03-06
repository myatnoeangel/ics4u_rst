public class Main {
    public static void main(String[] args) {
        // Create a regular student
        Student collegeStudent = new Student("Yan Naing", "YN0409", 97, 5);
        printStudentInfo(collegeStudent);

        // Create a high school student
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent("Myat Noe", "MN1304", 97, 4, "Grade 12");
        printHighSchoolStudentInfo(highSchoolStudent);

        // Display total students created
        printStudentCount();
    }

    // Helper method to print info for a Student
    public static void printStudentInfo(Student student) {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Honor Roll: " + student.isOnHonorRoll());
        System.out.println("Credit Factorial: " + student.creditFactorial());
        System.out.println();
    }

    // Helper method to print info for a HighSchoolStudent
    public static void printHighSchoolStudentInfo(HighSchoolStudent student) {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Grade Level: " + student.getGradeLevel());
        System.out.println("Honor Roll (High School): " + student.isOnHonorRoll());
        System.out.println("Credit Factorial: " + student.creditFactorial());
        System.out.println();
    }

    // Helper method to print total number of students
    public static void printStudentCount() {
        System.out.println("Total Students Created: " + Student.getStudentCount());
    }
}

// Subclass of Student representing a high school student
public class HighSchoolStudent extends Student {
    private String gradeLevel;

    // Constructor
    public HighSchoolStudent(String name, String id, double grades, int credits, String gradeLevel) {
        super(name, id, grades, credits);
        this.gradeLevel = gradeLevel;
    }

    // Override honor roll method
    @Override
    public boolean isOnHonorRoll() {
        return getGrades() >= 90;
    }

    // Accessor method for grade level
    public String getGradeLevel() {
        return gradeLevel;
    }

    // Mutator method for grade level
    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}

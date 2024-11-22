public class Student {
    private String name;
    private String group;
    private int course;
    private int[] grades;

    protected double calculateAvg() {
        double sum = 0;
        for(int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum/grades.length;
    }

    public Student(String name, String group, int course, int[] grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setGroup(String group) {
        this.group = group;
    }

    protected void setCourse(int course) {
        this.course = course;
    }

    protected void setGrades(int[] grades) {
        this.grades = grades;
    }

    protected String getName() {
        return name;
    }

    protected String getGroup() {
        return group;
    }

    protected int getCourse() {
        return course;
    }

    protected int[] getGrades() {
        return grades;
    }
}

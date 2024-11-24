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

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public int[] getGrades() {
        return grades;
    }
}

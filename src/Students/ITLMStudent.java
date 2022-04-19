package Students;

import java.util.Date;

public class ITLMStudent extends Student {
    private int idOfStudent;
    private String course;
    private int courseId;
    private int creditsOfCourse;

    public ITLMStudent() {
    }

    public ITLMStudent(String name, String lastName, Date birthDate, int age, int cellphone, int idOfStudent, String course, int courseId, int creditsOfCourse) {
        super(name, lastName, birthDate, age, cellphone);
        this.idOfStudent = idOfStudent;
        this.course = course;
        this.courseId = courseId;
        this.creditsOfCourse = creditsOfCourse;
    }

    public int getIdOfStudent() {
        return idOfStudent;
    }

    public void setIdOfStudent(int idOfStudent) {
        this.idOfStudent = idOfStudent;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCreditsOfCourse() {
        return creditsOfCourse;
    }

    public void setCreditsOfCourse(int creditsOfCourse) {
        this.creditsOfCourse = creditsOfCourse;
    }

    @Override
    public String toString(){
        return "Name: " + super.getName() + "\nLast Name: " + super.getLastName() +
        "\nDay of Birth: " + super.getBirthDate() + "\nAge: " + super.getAge() +
                "\nContact: " + super.getCellphone() + "\n" + "\nStudent ID: " +
                idOfStudent + "\nnCourse: " + course + "\nCourse ID: " + courseId +
                "\nCredits of course: " + creditsOfCourse;
    }
}

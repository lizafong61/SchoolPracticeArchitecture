package Students;

import java.util.Date;

public class ITSONStudent extends Student{
    private int studentId;
    private int gradeOfStudy;
    private String course;
    private int creditsOfCourse;

    public ITSONStudent(){
    }

    public ITSONStudent(String name, String lastName, Date birthDate, int age,
                        int cellphone, int studentId, int gradeOfStudy, String course,
                        int creditsOfCourse){
        super();
        this.studentId=studentId;
        this.gradeOfStudy=gradeOfStudy;
        this.course=course;
        this.creditsOfCourse=creditsOfCourse;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getGradeOfStudy() {
        return gradeOfStudy;
    }

    public void setGradeOfStudy(int gradeOfStudy) {
        this.gradeOfStudy = gradeOfStudy;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getCreditsOfCourse() {
        return creditsOfCourse;
    }

    public void setCreditsOfCourse(int creditsOfCourse) {
        this.creditsOfCourse = creditsOfCourse;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + "\nLast name: " + super.getLastName() +
                "\nDay of Birth: " + super.getBirthDate() + "\nAge: " + super.getAge() +
                "\nContact: " + super.getCellphone() + "\n" + "\nStudent ID: " + studentId +
                "\nGrade of Study: " + gradeOfStudy + "\nCourse: " + course +
                "\nCredits of course: " + creditsOfCourse;
    }
}

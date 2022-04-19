package Students;

import java.util.Date;

public class UDGStudent extends Student{
    private int studentId;
    private String bachelor;
    private String course;
    private int credits;

    public UDGStudent(){
    }

    public UDGStudent(String name, String lastName, Date birthDate, int age,
                      int cellphone, int studentId, String bachelor,
                      String course, int credits){
        super();
        this.studentId=studentId;
        this.bachelor=bachelor;
        this.course=course;
        this.credits=credits;
    }

    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int studentId){
        this.studentId=studentId;
    }

    public String getBachelor() {
        return bachelor;
    }

    public void setBachelor(String bachelor) {
        this.bachelor = bachelor;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString(){
        return "Name: " + super.getName() + "\nLast name: " + super.getLastName() +
                "\nDate of birth: " + super.getBirthDate() + "\nAge: " + super.getAge() +
                "\nContact: "+ super.getCellphone() + "\n" + "\nStudent ID: " + studentId +
                "\nBachelor: " + bachelor + "\nCourse" + course + "\nCredits of course: " +
                credits;
    }
}

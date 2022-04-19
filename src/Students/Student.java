package Students;

import java.util.Date;

public abstract class Student {
    private String name;
    private String lastName;
    private Date birthDate;
    private int age;
    private int cellphone;

    public Student(){
    }

    public Student(String name, String lastName, Date birthDate, int age, int cellphone){
        this.name=name;
        this.lastName=lastName;
        this.birthDate=birthDate;
        this.age=age;
        this.cellphone=cellphone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCellphone() {
        return cellphone;
    }

    public void setCellphone(int cellphone) {
        this.cellphone = cellphone;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\nLast name: " + lastName + "\nDay of Birth: " +
                birthDate + "\nage: " + age + "\nContact number: " + cellphone;
    }
}

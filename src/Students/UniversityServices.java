package Students;

import java.util.ArrayList;
import java.util.List;

public class UniversityServices implements IUniversity {

    List<Student> myStudents = new ArrayList<Student>();

    @Override
    public void addStudent(Student student){
        myStudents.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        myStudents.remove(student);
    }

    @Override
    public List<Student> studentLists() {
        return this.myStudents;
    }

}

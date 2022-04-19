package Students;

import java.util.List;

public interface IUniversity {
    public void addStudent(Student student);
    public void removeStudent(Student student);

    public List<Student> studentLists();
}

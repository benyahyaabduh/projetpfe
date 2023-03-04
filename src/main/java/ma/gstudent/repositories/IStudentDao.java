package ma.gstudent.repositories;
import ma.gstudent.models.Student;

import java.util.List;

public interface IStudentDao  {
    boolean create (Student s);
    boolean update (Student s);
    boolean delete (long id);
    List<Student> ReadAll();





}

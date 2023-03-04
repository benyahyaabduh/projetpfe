package ma.gstudent.services;

import ma.gstudent.models.Student;

import java.util.List;

public interface IStudentService {
    boolean create (Student s);
    boolean update (Student s);
    boolean delete (Long id);
    List<Student>ReadAll();

}

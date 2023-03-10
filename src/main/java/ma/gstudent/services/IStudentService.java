package ma.gstudent.services;

import ma.gstudent.dtos.Student;
import ma.gstudent.dtos.StudentDTO;

import java.util.List;

public interface IStudentService {
    StudentDTO save (StudentDTO dto);
    StudentDTO update (StudentDTO dto);
    boolean delete (Long id);
    List<StudentDTO>ReadAll();

}

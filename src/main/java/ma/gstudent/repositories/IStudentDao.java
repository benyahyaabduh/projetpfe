package ma.gstudent.repositories;

import ma.gstudent.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("repo1")
public interface IStudentDao extends JpaRepository <StudentEntity,Long> {

}

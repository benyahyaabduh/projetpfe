package ma.gstudent.services;

import ma.gstudent.models.Student;
import ma.gstudent.repositories.IStudentDao;
import ma.gstudent.repositories.StudentDaoImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class StudentServiceImpl implements IStudentService{

    private final static Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);

    private IStudentDao dao = new StudentDaoImpl();








    @Override
    public boolean create(Student s) {
        LOGGER.debug("start method Create");
        return dao.create(s);
    }

    @Override
    public boolean update(Student s) {
        LOGGER.debug("start method update");
        return dao.update(s);
    }

    @Override
    public boolean delete(Long id) {
        LOGGER.debug("start method delete");
        return dao.delete(id);
    }

    @Override
    public List<Student> ReadAll() {

        return dao.ReadAll();
    }
}

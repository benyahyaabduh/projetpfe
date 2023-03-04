package ma.gstudent.repositories;
import ma.gstudent.models.Student;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class StudentDaoImpl implements IStudentDao{
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentDaoImpl.class);


    @Override
    public boolean create(Student s) {
        LOGGER.debug("start method Create");
        return false;
    }

    @Override
    public boolean update(Student s) {
        LOGGER.debug("start method update");
        return false;
    }

    @Override
    public boolean delete(long id) {
        LOGGER.debug("start method delete");
        return false;
    }

    @Override
    public List<Student> ReadAll() {
        return null;
    }


}

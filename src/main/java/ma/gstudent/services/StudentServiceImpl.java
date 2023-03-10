package ma.gstudent.services;

import ma.gstudent.dtos.Student;
import ma.gstudent.dtos.StudentDTO;
import ma.gstudent.entities.StudentEntity;
import ma.gstudent.mappers.StudentMapper;
import ma.gstudent.repositories.IStudentDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImpl implements IStudentService {

    private final static Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);
    @Autowired
    private IStudentDao iStudentDao;
    @Autowired
   private StudentMapper mapper;

    @Override
    public StudentDTO save(StudentDTO dto) {
        LOGGER.debug("start method SAVE SERVICE");


        StudentEntity entity = mapper.converteDtoToEntity(dto);
        StudentEntity entityreponse = iStudentDao.save(entity);
        StudentDTO dtoreponse = mapper.convertEntitytoDto(entityreponse);
        return dtoreponse;
    }


    @Override
    public StudentDTO update(StudentDTO dto) {
        LOGGER.debug("start method UPDATE");
        StudentEntity entity = mapper.converteDtoToEntity(dto);
        StudentEntity entityreponse = iStudentDao.save(entity);
        StudentDTO dtoreponse = mapper.convertEntitytoDto(entityreponse);
        return dtoreponse;
    }

    @Override
    public boolean delete(Long id) {
        LOGGER.debug("start method DELETE");
        return false;
    }

    @Override
    public List<StudentDTO> ReadAll() {
        LOGGER.debug("start method SAVE");
        return null;
    }

}







package ma.gstudent.mappers;

import ma.gstudent.dtos.StudentDTO;
import ma.gstudent.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
   public StudentEntity converteDtoToEntity(StudentDTO dto){
        StudentEntity entity =new StudentEntity();
        entity.setName(dto.getName());
        entity.setId(dto.getId());
       return entity;
   }
  public  StudentDTO convertEntitytoDto (StudentEntity entity){
       StudentDTO dto = new StudentDTO();
       dto.setName(entity.getName());
       dto.setId(entity.getId());
       return dto;
   }
    public List<StudentEntity> convertToEntities(List<StudentDTO> dtos){
        return  dtos.stream().map(dt->converteDtoToEntity(dt)).collect(Collectors.toList());
    }

    public List<StudentDTO> convertToDtos(List<StudentEntity> entities){
        return  entities.stream().map(ent->convertEntitytoDto(ent)).collect(Collectors.toList());
    }
}

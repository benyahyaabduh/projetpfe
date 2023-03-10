package ma.gstudent.controllers;

import ma.gstudent.dtos.Student;
import ma.gstudent.dtos.StudentDTO;
import ma.gstudent.services.IStudentService;
import ma.gstudent.services.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/student")
public class StudentController {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentController.class);
    @Autowired //injection de depndc
    private IStudentService studentService;

@PostMapping
    public StudentDTO save(@RequestBody StudentDTO dto) {

    LOGGER.debug("start method SAVE CONTROLLER");
        return studentService.save(dto);

    }
@PutMapping
    public StudentDTO update(@RequestBody StudentDTO dto) {
    LOGGER.debug("start method UPDATE");
        return studentService.update(dto);
    }

@DeleteMapping
    public boolean delete(@PathVariable Long id) {
    LOGGER.debug("start method DELETE");
        return studentService.delete(id);
    }


@GetMapping
    public List<StudentDTO> ReadAll() {
    LOGGER.debug("start method ReadAll");
        return studentService.ReadAll();
    }
}

package controller;

import dto.StudentsCoursesReportDto;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.StudentsCoursesService;

@RequestMapping("/report")
public class ViewPageController {
    private StudentsCoursesService service;
    private final ModelMapper modelMapper;
    private final CSVFileWriter writer;

    public ViewPageController(StudentsCoursesService service, ModelMapper modelMapper, CSVFileWriter writer) {
        this.service = service;
        this.modelMapper = modelMapper;
        this.writer = writer;
    }

    @GetMapping
    @ResponseBody
    public List<StudentsCoursesReportDto> getAll() {
        // here I will receive a List of StudentCourses with all information about credits, courses and instructors
        // than using Stream Api I will filter all those who have enough credits
        // than I will convert with  ModelMapper List<StudentsCourses> in List<StudentsCoursesReportDto>
        // and sent it as response
        // also here I will write in file
        return null;
    }
}

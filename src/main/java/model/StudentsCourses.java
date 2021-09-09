package model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Data;

@Entity
@IdClass(StudentsCourses.class)
@Data
public class StudentsCourses implements Serializable {
    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_pin", referencedColumnName = "pin")
    private Student student;
    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;
    private LocalDate date;

    // here I should find out how to create an embedded class to save the composite id and to use it on dao layer
}

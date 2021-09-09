package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student implements Serializable {
    @Id
    private String pin;
    private String firstName;
    private String lastName;
    private LocalDateTime date;
}

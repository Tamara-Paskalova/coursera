package dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsCoursesRepository extends CrudRepository {
    // here I should create a method which will provide me all needed information about students, courses, instructors
    // and credits using join fetch
}

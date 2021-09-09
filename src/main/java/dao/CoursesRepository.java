package dao;

import model.Course;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends CrudRepository<Course, Long> {
    @Query("select c from Course c join fetch c.instructor where c.id=:id")
    Course getById(Long id);
}

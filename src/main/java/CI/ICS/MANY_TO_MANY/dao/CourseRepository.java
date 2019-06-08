package CI.ICS.MANY_TO_MANY.dao;

import CI.ICS.MANY_TO_MANY.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}

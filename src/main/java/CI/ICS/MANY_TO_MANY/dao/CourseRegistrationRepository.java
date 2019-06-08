package CI.ICS.MANY_TO_MANY.dao;

import CI.ICS.MANY_TO_MANY.entity.CourseRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRegistrationRepository extends JpaRepository<CourseRegistration, Long> {
}

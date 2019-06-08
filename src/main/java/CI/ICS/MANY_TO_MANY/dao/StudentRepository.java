package CI.ICS.MANY_TO_MANY.dao;

import CI.ICS.MANY_TO_MANY.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

package CI.ICS.MANY_TO_MANY;

import CI.ICS.MANY_TO_MANY.dao.CourseRegistrationRepository;
import CI.ICS.MANY_TO_MANY.dao.CourseRepository;
import CI.ICS.MANY_TO_MANY.dao.StudentRepository;
import CI.ICS.MANY_TO_MANY.entity.Course;
import CI.ICS.MANY_TO_MANY.entity.CourseRegistration;
import CI.ICS.MANY_TO_MANY.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDateTime;

@SpringBootApplication
public class ManyToManyApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ManyToManyApplication.class, args);

		CourseRepository courseRepository = ctx.getBean(CourseRepository.class);

		courseRepository.save(new Course("Histoire"));
		courseRepository.save(new Course("Francais"));

		Course course = courseRepository.getOne((long) 2);

		StudentRepository studentRepository = ctx.getBean(StudentRepository.class);
		studentRepository.save(new Student("Yasmine Irie"));
		studentRepository.save(new Student("Franck Yao"));


		Student student = studentRepository.getOne((long)1);



		int grade = 1000;

		CourseRegistrationRepository courseRegistrationRepository = ctx.getBean(CourseRegistrationRepository.class);
		courseRegistrationRepository.save(new CourseRegistration(student,course,grade));




	}


}

package CI.ICS.MANY_TO_MANY.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @OneToMany(mappedBy = "course")
    private Set<CourseRegistration> registrations;

    public Course() {
        super();
    }

    public Course(String nom) {
        this.nom = nom;
    }

    public Course(String nom, Set<CourseRegistration> registrations) {
        this.id = id;
        this.nom = nom;
        this.registrations = registrations;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<CourseRegistration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(Set<CourseRegistration> registrations) {
        this.registrations = registrations;
    }
}

package notebook.model;

import javax.persistence.*;

/**
 * Created by monju on 12-Dec-16.
 */
@Entity
@Table(name="subject")
public class Subject {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="subject_name")
    private String subjectName;

    public Subject() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}

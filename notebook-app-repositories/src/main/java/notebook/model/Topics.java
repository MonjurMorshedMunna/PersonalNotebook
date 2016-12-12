package notebook.model;

import javax.persistence.*;

/**
 * Created by monju on 12-Dec-16.
 */
@Entity
@Table(name="topics")
public class Topics {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name="topics_name")
    private String topicsName;

    @Column(name="answer")
    private String answer;

    public Topics() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopicsName() {
        return topicsName;
    }

    public void setTopicsName(String topicsName) {
        this.topicsName = topicsName;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

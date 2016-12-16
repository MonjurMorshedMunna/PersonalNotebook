package notebook.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by monju on 12-Dec-16.
 */
@Entity
@Table(name="revision_date")
public class RevisionDate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @OneToOne
    @JoinColumn(name="topics_id")
    private Topics topics;

    @Column(name="next_day")
    private Date nextDay;

    @Column(name="next_week")
    private Date nextWeek;

    @Column(name="next_month")
    private Date nextMonth;

    @Column(name="next_year")
    private Date nextYear;

    @Column(name="second_year")
    private Date secondYear;

    @Column(name="third_year")
    private Date thirdYear;

    @Column(name="fourth_year")
    private Date fourthYear;

    @Column(name="fifth_year")
    private Date fifthYear;

    @Column(name="sixth_year")
    private Date sixthYear;

    @Column(name="seventh_year")
    private Date seventhYear;

    public RevisionDate() {
    }

    public Date getSixthYear() {
        return sixthYear;
    }

    public void setSixthYear(Date sixthYear) {
        this.sixthYear = sixthYear;
    }

    public Date getSeventhYear() {
        return seventhYear;
    }

    public void setSeventhYear(Date seventhYear) {
        this.seventhYear = seventhYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Topics getTopics() {
        return topics;
    }

    public void setTopics(Topics topics) {
        this.topics = topics;
    }

    public Date getNextDay() {
        return nextDay;
    }

    public void setNextDay(Date nextDay) {
        this.nextDay = nextDay;
    }

    public Date getNextWeek() {
        return nextWeek;
    }

    public void setNextWeek(Date nextWeek) {
        this.nextWeek = nextWeek;
    }

    public Date getNextMonth() {
        return nextMonth;
    }

    public void setNextMonth(Date nextMonth) {
        this.nextMonth = nextMonth;
    }

    public Date getNextYear() {
        return nextYear;
    }

    public void setNextYear(Date nextYear) {
        this.nextYear = nextYear;
    }

    public Date getSecondYear() {
        return secondYear;
    }

    public void setSecondYear(Date secondYear) {
        this.secondYear = secondYear;
    }

    public Date getThirdYear() {
        return thirdYear;
    }

    public void setThirdYear(Date thirdYear) {
        this.thirdYear = thirdYear;
    }

    public Date getFourthYear() {
        return fourthYear;
    }

    public void setFourthYear(Date fourthYear) {
        this.fourthYear = fourthYear;
    }

    public Date getFifthYear() {
        return fifthYear;
    }

    public void setFifthYear(Date fifthYear) {
        this.fifthYear = fifthYear;
    }
}

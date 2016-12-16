package notebook.repositories;

import notebook.model.RevisionDate;
import notebook.model.Topics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by monju on 12-Dec-16.
 */
@Repository
public interface RevisionDateRepository extends JpaRepository<RevisionDate, Long> {

    @Query(" select d from RevisionDate d  " +
            "where d.topics.subjectId=?2 and  d.nextDay=?1 or " +
            "d.nextWeek=?1 or " +
            "d.nextMonth=?1 or " +
            "d.nextYear = ?1 or " +
            "d.secondYear = ?1 or " +
            "d.thirdYear = ?1 or " +
            "d.fourthYear=?1 or " +
            "d.fifthYear=?1 or " +
            "d.sixthYear=?1 or " +
            "d.seventhYear=?1" )
    List<RevisionDate> findTopics(Date date, Long subjectId);


    @Query("select d from RevisionDate d " +
            "where d.topics=?1")
    RevisionDate findByTopicsId(Topics pTopics);
}

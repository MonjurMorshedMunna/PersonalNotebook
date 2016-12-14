package notebook.repositories;

import notebook.model.RevisionDate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by monju on 12-Dec-16.
 */
@Repository
public interface RevisionDateRepository extends CrudRepository<RevisionDate, Long> {
    @Query(" select d.topicsId from RevisionDate d , Topics t" +
            "where d.nextDay=?1 or " +
            "d.nextWeek=?1 or " +
            "d.nextMonth=?1 or " +
            "d.nextYear = ?1 or " +
            "d.secondYear = ?1 or " +
            "d.thirdYear = ?1 or " +
            "d.fourthYear=?1 or " +
            "d.fifthYear=?1 or " +
            "d.sixthYear=?1 or " +
            "d.seventhYear=?1 and " +
            "t.topicsId=d.topicsId and " +
            "t.subjectId = ?2")
    List<Long> findByDateAndSubject(Date date, Long subjectId);

    RevisionDate findByTopicsId(Long pTopicsId);
}

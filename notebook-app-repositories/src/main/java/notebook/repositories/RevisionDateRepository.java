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
    @Query(" select d.topicsId from RivisionDate d " +
            "where d.nextDay=? or " +
            "d.nextWeek=? or " +
            "d.nextMonth=? or " +
            "d.nextYear = ? or " +
            "d.secondYear = ? or " +
            "d.thirdYear = ? or " +
            "d.fourthYear=? or " +
            "d.fifthYear=? or " +
            "d.sixthYear=? or " +
            "d.seventhYear=?")
    List<Long> findByDate(Date date);
}

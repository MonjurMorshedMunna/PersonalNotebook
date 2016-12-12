package notebook.repositories;

import notebook.model.RevisionDate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by monju on 12-Dec-16.
 */
@Repository
public interface RevisionDateRepository extends CrudRepository<RevisionDate, Long> {
}

package notebook.repositories;

import notebook.model.Topics;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by monju on 12-Dec-16.
 */
@Repository
public interface TopicsRepository extends CrudRepository<Topics, Long> {
}

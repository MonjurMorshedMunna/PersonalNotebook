package notebook.repositories;

import notebook.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by monju on 12-Dec-16.
 */
@Repository
public interface SubjectRepository extends JpaRepository<Subject,Long > {
    public List<Subject> findAllByOrderByIdAsc();
}

package notebook.Helper;

import notebook.model.Subject;
import notebook.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by monju on 12-Dec-16.
 */
@Component
public class SubjectResourceHelper {
    @Autowired
    SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects(){
        return subjectRepository.findAll();
    }

}

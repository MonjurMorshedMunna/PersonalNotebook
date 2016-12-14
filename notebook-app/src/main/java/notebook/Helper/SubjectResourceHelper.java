package notebook.Helper;

import notebook.model.Subject;
import notebook.repositories.SubjectRepository;
import org.hibernate.annotations.BatchSize;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Null;
import javax.xml.ws.Response;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by monju on 12-Dec-16.
 */
@Component
public class SubjectResourceHelper {

    private static final Logger log = LoggerFactory.getLogger(SubjectResourceHelper.class);

    SubjectRepository subjectRepository;

    @Autowired
    public SubjectResourceHelper(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<Subject> getAllSubjects(){
        return subjectRepository.findAllByOrderByIdAsc();
    }


    @BatchSize(size = 50)
    public ResponseEntity<?> saveSubjects(final List<Subject> subjects){
        /*List<Subject> refinedSubject= subjects.stream()
                .filter(s-> s.getId()==null)
                .collect(Collectors.toList());*/
        subjectRepository.save(subjects);
        return ResponseEntity.ok("Saved");
    }

    public ResponseEntity<?> deleteASubject(final Subject subject){
        subjectRepository.delete(subject);
        return ResponseEntity.ok("Deleted");
    }
}

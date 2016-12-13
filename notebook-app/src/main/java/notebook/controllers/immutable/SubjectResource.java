package notebook.controllers.immutable;

import notebook.controllers.mutable.MutableSubjectResource;
import notebook.model.Subject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by monju on 12-Dec-16.
 */
@CrossOrigin("http://localhost:4200")
@RestController()
public class SubjectResource extends MutableSubjectResource {

    @GetMapping("/subject/all")
    @ResponseBody
    public  List<Subject> getAllSubject(){
        List<Subject> subjects = mHelper.getAllSubjects();
        return mHelper.getAllSubjects();
    }


}

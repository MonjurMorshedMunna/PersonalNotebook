package notebook.controllers.immutable;

import notebook.controllers.mutable.MutableSubjectResource;
import notebook.model.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by monju on 12-Dec-16.
 */
public class SubjectResource extends MutableSubjectResource {

    @RequestMapping("/all")
    public @ResponseBody List<Subject> getAllSubject(){
        return mHelper.getAllSubjects();
    }
}

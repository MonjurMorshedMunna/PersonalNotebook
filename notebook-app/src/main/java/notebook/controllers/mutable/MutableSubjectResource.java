package notebook.controllers.mutable;

import notebook.Helper.SubjectResourceHelper;
import notebook.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by monju on 12-Dec-16.
 */
public class MutableSubjectResource {

    @Autowired
    public SubjectResourceHelper mHelper;


    @RequestMapping(path = "/subject/add",method= RequestMethod.POST)
    ResponseEntity<?> add(@RequestBody List<Subject> subjects){
        return mHelper.saveSubjects(subjects);
    }

    @RequestMapping(path="/subject/delete", method = RequestMethod.POST)
    ResponseEntity<?> delete(@RequestBody Subject subject){
        return mHelper.deleteASubject(subject);
    }
}

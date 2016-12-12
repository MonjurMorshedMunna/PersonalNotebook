package notebook.controllers.mutable;

import notebook.Helper.SubjectResourceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by monju on 12-Dec-16.
 */
@RestController("/subject")
public class MutableSubjectResource {

    @Autowired
    public SubjectResourceHelper mHelper;

}

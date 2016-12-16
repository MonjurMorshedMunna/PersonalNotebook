package notebook.controllers.immutable;

import notebook.controllers.mutable.MutableTopicsResource;
import notebook.model.Topics;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by monju on 16-Dec-16.
 */
@CrossOrigin("http://localhost:4200")
@RestController()
public class TopicsResource extends MutableTopicsResource{

    @GetMapping(value="/topics/today/subject/{subject}")
    public List<Topics> getTopics(@PathVariable("subject") Long subjectId){
        return mHelper.getTopicsOfToday(subjectId,false);
    }

    @GetMapping(value="/topics/revision/subject/{subject}")
    public List<Topics> getRevisionTopics(@PathVariable("subject") Long subjectId){
        return mHelper.getTopicsOfToday(subjectId,true);
    }


}

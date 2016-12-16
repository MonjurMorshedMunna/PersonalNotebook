package notebook.controllers.mutable;

import notebook.Helper.TopicsResourceHelper;
import notebook.model.Topics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by monju on 16-Dec-16.
 */
public class MutableTopicsResource {
    @Autowired
    public TopicsResourceHelper mHelper;

    @RequestMapping(path="/topics/add", method= RequestMethod.POST)
    ResponseEntity<?> add(@RequestBody Topics pTopics){
        return mHelper.saveTopics(pTopics);
    }
}

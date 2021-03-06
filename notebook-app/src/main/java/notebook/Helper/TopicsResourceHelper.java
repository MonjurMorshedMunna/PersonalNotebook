package notebook.Helper;

import notebook.model.RevisionDate;
import notebook.model.Topics;
import notebook.repositories.RevisionDateRepository;
import notebook.repositories.TopicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by monju on 14-Dec-16.
 */
@Component
public class TopicsResourceHelper {

    @Autowired
    TopicsRepository topicsRepository;

    @Autowired
    RevisionDateRepository revisionDateRepository;

    public ResponseEntity<?> saveTopics(final Topics pTopics){

        topicsRepository.save(pTopics);

        if(revisionDateRepository.findByTopicsId(pTopics)==null){
            saveToRevisionDate(pTopics);
        }

        return ResponseEntity.ok("created");
    }

    private void saveToRevisionDate(Topics pTopics){
        RevisionDate revisionDate = new RevisionDate();

        revisionDate.setTopics(pTopics);

        revisionDate.setNextDay(getFormatedDate(1));
        revisionDate.setNextWeek(getFormatedDate(7));
        revisionDate.setNextMonth(getFormatedDate(30));
        revisionDate.setNextYear(getFormatedDate(365));
        revisionDate.setSecondYear(getFormatedDate(730));
        revisionDate.setThirdYear(getFormatedDate(1095));
        revisionDate.setFourthYear(getFormatedDate(1460));
        revisionDate.setFifthYear(getFormatedDate(1825));
        revisionDate.setSixthYear(getFormatedDate(2190));
        revisionDate.setSeventhYear(getFormatedDate(2555));

        revisionDateRepository.save(revisionDate);
    }



    private Date getFormatedDate(int dateNumber){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE,dateNumber);
        return calendar.getTime();
    }

    public List<Topics> getTopicsOfToday(final Long subjectId, boolean revision){
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        if(revision==true){
            calendar.add(Calendar.DATE,1);
        }
        Date nextDate = calendar.getTime();
        List<RevisionDate> topicsOfRevisionDate = revisionDateRepository.findTopics(calendar.getTime(),subjectId);
        List<Topics> topics = new ArrayList<>();

        for(RevisionDate mTopics: topicsOfRevisionDate){
            Topics topic = mTopics.getTopics();
            topics.add(topic);
        }

        return topics;
    }
}

package actopic.data.entity

import com.mongodb.DBObject
import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/31
 */
@DBDocument(collectionClass = "")
class ACSurvey extends DataObject{
    public static final String FIELD_QUESTIONS = "qs"
    public static final String FIELD_TIME = "time"
    public static final String FIELD_RESERVED = "reserved"
    @DocumentField(key = "qs")
    private List<ACQuestion> questions
    @DocumentField(key = "time")
    private Long time
    @DocumentField(key = "reserved")
    private Document reserved
    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_QUESTIONS, questions)
                .append(FIELD_TIME, time)
                .append(FIELD_RESERVED, reserved)
        return document
    }

    List<ACQuestion> getQuestions() {
        return questions
    }

    void setQuestions(List<ACQuestion> questions) {
        this.questions = questions
    }

    Long getTime() {
        return time
    }

    void setTime(Long time) {
        this.time = time
    }

    Document getReserved() {
        return reserved
    }

    void setReserved(Document reserved) {
        this.reserved = reserved
    }
}

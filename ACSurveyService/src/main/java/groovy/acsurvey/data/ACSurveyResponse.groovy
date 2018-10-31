package acsurvey.data

import com.mongodb.BasicDBList
import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument(collectionClass = "")
class ACSurveyResponse extends DataObject{
    public static final String FIELD_SURVEYRESPONSE_ANSWERS = "as";
    public static final String FIELD_SURVEYRESPONSE_USERID = "uid";
    public static final String FIELD_SURVEYRESPONSE_USERNAME = "name";
    public static final String FIELD_SURVEYRESPONSE_SURVEYID = "sid";
    public static final String FIELD_SURVEYRESPONSE_TIME = "time";
    public static final String FIELD_SURVEYRESPONSE_TERMINAL = "ter";
    @DocumentField(key = "sid")
    private String surveyId;
    private Map<String, ACAnswer> answerMap;
    @DocumentField(key = "uid")
    private String userId;
    @DocumentField(key = "name")
    private String userName;
    @DocumentField(key = "time")
    private Long time;
    private String firmId;
    @DocumentField(key = "ter")
    private String terminal;
    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_SURVEYRESPONSE_SURVEYID, surveyId)
                .append(FIELD_SURVEYRESPONSE_USERID, userId)
                .append(FIELD_SURVEYRESPONSE_USERNAME, userName)
                .append(FIELD_SURVEYRESPONSE_TERMINAL, terminal)
                .append(FIELD_SURVEYRESPONSE_TIME, time)
        if(answerMap != null) {
            BasicDBList answerList = new BasicDBList();
            for(ACAnswer question : answerMap.values()) {
                answerList.add(question.toDocument());
            }
            document.append(FIELD_SURVEYRESPONSE_ANSWERS, answerList);
        }
        return document
    }

    String getSurveyId() {
        return surveyId
    }

    void setSurveyId(String surveyId) {
        this.surveyId = surveyId
    }

    Map<String, ACAnswer> getAnswerMap() {
        return answerMap
    }

    void setAnswerMap(Map<String, ACAnswer> answerMap) {
        this.answerMap = answerMap
    }

    String getUserId() {
        return userId
    }

    void setUserId(String userId) {
        this.userId = userId
    }

    String getUserName() {
        return userName
    }

    void setUserName(String userName) {
        this.userName = userName
    }

    Long getTime() {
        return time
    }

    void setTime(Long time) {
        this.time = time
    }

    String getFirmId() {
        return firmId
    }

    void setFirmId(String firmId) {
        this.firmId = firmId
    }

    String getTerminal() {
        return terminal
    }

    void setTerminal(String terminal) {
        this.terminal = terminal
    }
}

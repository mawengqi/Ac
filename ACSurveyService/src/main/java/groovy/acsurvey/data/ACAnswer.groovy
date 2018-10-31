package acsurvey.data

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.BaseObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument
class ACAnswer extends BaseObject{
    public static final String TYPE_MULTIPLE = "checkboxlist";
    public static final String TYPE_SINGLE = "radiolist";
    public static final String TYPE_INPUT = "input";
    public static final String FIELD_SURVEY_QUESTION_TYPE = "type";
    public static final String FIELD_SURVEY_QUESTION_INPUT = "inpt";
    public static final String FIELD_SURVEY_QUESTION_ID = "id";
    public static final String FIELD_SURVEY_QUESTION_ANSWERIDS = "aids"
    @DocumentField(key = "id")
    private String questionId;
    @DocumentField(key = "aids")
    private List<String> answerIds;
    @DocumentField(key = "inpt")
    private String input;
    @DocumentField(key = "type")
    private String type;

    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_SURVEY_QUESTION_ANSWERIDS, answerIds)
                .append(FIELD_SURVEY_QUESTION_ID, questionId)
                .append(FIELD_SURVEY_QUESTION_INPUT, input)
                .append(FIELD_SURVEY_QUESTION_TYPE, type)
        return document
    }

    String getQuestionId() {
        return questionId
    }

    void setQuestionId(String questionId) {
        this.questionId = questionId
    }

    List<String> getAnswerIds() {
        return answerIds
    }

    void setAnswerIds(List<String> answerIds) {
        this.answerIds = answerIds
    }

    String getInput() {
        return input
    }

    void setInput(String input) {
        this.input = input
    }

    String getType() {
        return type
    }

    void setType(String type) {
        this.type = type
    }
}

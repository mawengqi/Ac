package actopic.data.entity

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.BaseObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/31
 */
@DBDocument
class ACQuestion extends BaseObject{
    public static final String TYPE_MULTIPLE = "checkboxlist"
    public static final String TYPE_SINGLE = "radiolist"
    public static final String TYPE_INPUT = "input"

    public static final String FIELD_TYPE = "type"
    public static final String FIELD_ID = "id"
    public static final String FIELD_ANSWERIDS = "as"
    @DocumentField(key = "id")
    private String questionId
    @DocumentField(key = "as")
    private List<String> answerIds
    @DocumentField(key = "type")
    private String type

    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_TYPE, type)
                .append(FIELD_ID, questionId)
                .append(FIELD_ANSWERIDS, answerIds)
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

    String getType() {
        return type
    }

    void setType(String type) {
        this.type = type
    }
}

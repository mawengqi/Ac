package actopic.data.entity

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.BaseObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument
class ACJoinedUser extends BaseObject{
    public static final int TYPE_USER = 10
    public static final int TYPE_USERGROUP = 20
    public static final String FIELD_STARTSEQUENCE = "seq"
    public static final String FIELD_PARTICIPANTID = "pid"
    public static final String FIELD_TYPE = "type"
    public static final String FIELD_TIME = "time"
    @DocumentField(key = "pid")
    private String participantId
    @DocumentField(key = "type")
    private Integer type
    @DocumentField(key = "seq")
    private Long startSequence
    @DocumentField(key = "time")
    private Long time

    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_STARTSEQUENCE, startSequence)
                .append(FIELD_PARTICIPANTID, participantId)
                .append(FIELD_TYPE, type)
                .append(FIELD_TIME, time)
        return document
    }

    String getParticipantId() {
        return participantId
    }

    void setParticipantId(String participantId) {
        this.participantId = participantId
    }

    Integer getType() {
        return type
    }

    void setType(Integer type) {
        this.type = type
    }

    Long getStartSequence() {
        return startSequence
    }

    void setStartSequence(Long startSequence) {
        this.startSequence = startSequence
    }

    Long getTime() {
        return time
    }

    void setTime(Long time) {
        this.time = time
    }
}

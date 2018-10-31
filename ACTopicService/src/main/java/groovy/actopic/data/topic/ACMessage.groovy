package actopic.data.topic

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument
abstract class ACMessage extends DataObject{
    public static final String FIELD_SEQUENCE = "ts"
    public static final String FIELD_TYPE = "type"
    public static final String FIELD_SERVER = "s"
    public static final String FIELD_TARGETIDS = "tids"
    public static final int FILTERMATCH_TARGETID = 1
    public static final int FILTERMATCH_EVENTUSERID = 10
    public static final int FILTERMATCH_QUEUEID = 20
    public static final int[] FILTERMATCHS = [FILTERMATCH_EVENTUSERID, FILTERMATCH_TARGETID,FILTERMATCH_QUEUEID]
    @DocumentField(key = "tids")
    private List<String> targetIds
    @DocumentField(key = "ts")
    private Long sequence
    @DocumentField(key = "type")
    private String type
    @DocumentField(key = "s")
    private String server
    private Short dataType
    private boolean internal = false
    private String fromOfflineMessageId

    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_SEQUENCE, sequence)
                .append(FIELD_TYPE, type)
                .append(FIELD_SERVER, server)
                .append(FIELD_TARGETIDS, targetIds)
        return document
    }

    List<String> getTargetIds() {
        return targetIds
    }

    void setTargetIds(List<String> targetIds) {
        this.targetIds = targetIds
    }

    Long getSequence() {
        return sequence
    }

    void setSequence(Long sequence) {
        this.sequence = sequence
    }

    String getType() {
        return type
    }

    void setType(String type) {
        this.type = type
    }

    String getServer() {
        return server
    }

    void setServer(String server) {
        this.server = server
    }

    Short getDataType() {
        return dataType
    }

    void setDataType(Short dataType) {
        this.dataType = dataType
    }

    boolean getInternal() {
        return internal
    }

    void setInternal(boolean internal) {
        this.internal = internal
    }

    String getFromOfflineMessageId() {
        return fromOfflineMessageId
    }

    void setFromOfflineMessageId(String fromOfflineMessageId) {
        this.fromOfflineMessageId = fromOfflineMessageId
    }
}

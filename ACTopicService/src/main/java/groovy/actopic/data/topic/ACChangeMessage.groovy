package actopic.data.topic

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument
class ACChangeMessage extends ACMessage{
    public static final int ACTION_ADD = 100
    public static final int ACTION_UPDATE = 10
    public static final int ACTION_DELETE = 0
    public static final String FIELD_CHANGEDDOMAIN = "cdo"
    public static final String FIELD_CHANGEDBY = "cby"
    public static final String FIELD_UPDATETIME = "ut"
    public static final String FIELD_ACTION = "act"
    @DocumentField(key = "cdo")
    private String changedDomain
    @DocumentField(key = "cby")
    private String changedBy
    @DocumentField(key = "ut")
    private Long updateTime
    @DocumentField(key = "act")
    private Integer action

    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_CHANGEDDOMAIN, changedDomain)
                .append(FIELD_CHANGEDBY, changedBy)
                .append(FIELD_UPDATETIME, updateTime)
                .append(FIELD_ACTION, action)
        return document
    }

    String getChangedDomain() {
        return changedDomain
    }

    void setChangedDomain(String changedDomain) {
        this.changedDomain = changedDomain
    }

    String getChangedBy() {
        return changedBy
    }

    void setChangedBy(String changedBy) {
        this.changedBy = changedBy
    }

    Long getUpdateTime() {
        return updateTime
    }

    void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime
    }

    Integer getAction() {
        return action
    }

    void setAction(Integer action) {
        this.action = action
    }
}

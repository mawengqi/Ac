package actopic.data.topic

import com.mongodb.BasicDBList
import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument(collectionClass = "")
class ACWallboardCategoryChangedMessage extends ACChangedDomainMessage{
    public static final String TYPE = "wb.categoryChanged"
    public static final String FIELD_FIRMID = "fid"
    public static final String FIELD_CLIENTID = "cid"
    public static final String FIELD_ROBOTID = "rbid"
    public static final String FIELD_CATEGORIES = "cat"
    @DocumentField(key = "rbid")
    private String robotId
    @DocumentField(key = "fid")
    private String firmId
    @DocumentField(key = "cid")
    private String clientId
    @DocumentField(key = "cat")
    private BasicDBList categories
    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_FIRMID, firmId)
                .append(FIELD_CLIENTID, clientId)
                .append(FIELD_ROBOTID, robotId)
                .append(FIELD_CATEGORIES, categories)
        return document
    }

    String getRobotId() {
        return robotId
    }

    void setRobotId(String robotId) {
        this.robotId = robotId
    }

    String getFirmId() {
        return firmId
    }

    void setFirmId(String firmId) {
        this.firmId = firmId
    }

    String getClientId() {
        return clientId
    }

    void setClientId(String clientId) {
        this.clientId = clientId
    }

    BasicDBList getCategories() {
        return categories
    }

    void setCategories(BasicDBList categories) {
        this.categories = categories
    }
}

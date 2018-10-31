package actopic.data.topic

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import org.bson.Document


/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument(collectionClass = "")
class ACClientChangedMessage extends ACChangedDomainMessage{
    public static final String TYPE = "client.changed"
    public static final String FIELD_FIRMID = "fid"
    public static final String FIELD_CLIENTID = "cid"
    @DocumentField(key = "fid")
    private String firmId
    @DocumentField(key = "cid")
    private String clientId

    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_FIRMID, firmId)
                .append(FIELD_CLIENTID, clientId)
        return document
    }
    
}

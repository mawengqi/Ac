package actopic.data.topic

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument(collectionClass = "")
class ACUserChangedMessage extends ACChangedDomainMessage{
    public static final String TYPE = "user"
    public static final String FIELD_USERIDS = "us"
    @DocumentField(key = "us")
    private HashSet<String> userIds
    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_USERIDS, userIds)
        return document
    }

    HashSet<String> getUserIds() {
        return userIds
    }

    void setUserIds(HashSet<String> userIds) {
        this.userIds = userIds
    }
}

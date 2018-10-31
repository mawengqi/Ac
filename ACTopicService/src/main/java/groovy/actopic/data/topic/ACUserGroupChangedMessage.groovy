package actopic.data.topic

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument(collectionClass = "")
class ACUserGroupChangedMessage extends ACChangedDomainMessage{
    public static final String TYPE = "usergroup"
    public static final String FIELD_USERGROUPIDS = "ugs"
    @DocumentField(key = "ugs")
    private HashSet<String> userGroupIds

    Document toDocument(){
        Document document = new Document()  
        document.append(FIELD_USERGROUPIDS, userGroupIds)
        return document
    }

    HashSet<String> getUserGroupIds() {
        return userGroupIds
    }

    void setUserGroupIds(HashSet<String> userGroupIds) {
        this.userGroupIds = userGroupIds
    }
}

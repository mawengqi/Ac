package actopic.data.topic

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument(collectionClass = "")
class ACUserGroupIndexChangedMessage extends ACChangedDomainMessage{
    public static final String TYPE = "userGroupIndex"
    public static final String FIELD_GROUPUSERIDS = "gus"
    @DocumentField(key = "gus")
    private HashSet<String> groupUserIds
    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_GROUPUSERIDS, groupUserIds)
        return document
    }

    HashSet<String> getGroupUserIds() {
        return groupUserIds
    }

    void setGroupUserIds(HashSet<String> groupUserIds) {
        this.groupUserIds = groupUserIds
    }
}

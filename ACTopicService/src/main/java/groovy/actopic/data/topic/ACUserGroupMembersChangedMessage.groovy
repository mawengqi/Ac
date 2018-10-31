package actopic.data.topic

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument(collectionClass = "")
class ACUserGroupMembersChangedMessage extends ACChangedDomainMessage{
    public static final String TYPE = "userGroupMembers"
    public static final String FIELD_USERGROUPID = "ugid"
    public static final String FIELD_USERIDS = "us"
    @DocumentField(key = "ugid")
    private String userGroupId
    @DocumentField(key = "us")
    private HashSet<String> userIds
    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_USERGROUPID, userGroupId)
                .append(FIELD_USERIDS, userIds)
        return document
    }

    String getUserGroupId() {
        return userGroupId
    }

    void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId
    }

    HashSet<String> getUserIds() {
        return userIds
    }

    void setUserIds(HashSet<String> userIds) {
        this.userIds = userIds
    }
}

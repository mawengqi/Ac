package actopic.data.topic

import com.mongodb.DBObject
import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument(collectionClass = "")
class ACTfeduNotifiyMessage extends ACChangedDomainMessage{
    public static final String TYPE = "tfedu.Notifiy"
    public static final String FIELD_USERIDS = "us"
    public static final String FIELD_NOTIFY = "notify"
    @DocumentField(key = "us")
    private HashSet<String> userIds
    @DocumentField(key = "notify")
    private Document notify
    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_USERIDS, userIds)
                .append(FIELD_NOTIFY, notify)
        return document
    }

    HashSet<String> getUserIds() {
        return userIds
    }

    void setUserIds(HashSet<String> userIds) {
        this.userIds = userIds
    }

    Document getNotify() {
        return notify
    }

    void setNotify(Document notify) {
        this.notify = notify
    }
}

package actopic.data.topic

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument(collectionClass = "")
class ACUserPasswordChangedMessage extends ACChangedDomainMessage{
    public static final String TYPE = "passwd"
    public static final String FIELD_USERIDS = "us"
    public static final String FIELD_TERMINAL = "terminal"
    @DocumentField(key = "us")
    private HashSet<String> userIds
    @DocumentField(key = "terminal")
    private String terminal

    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_USERIDS, userIds)
                .append(FIELD_TERMINAL, terminal)
        return document
    }

    HashSet<String> getUserIds() {
        return userIds
    }

    void setUserIds(HashSet<String> userIds) {
        this.userIds = userIds
    }

    String getTerminal() {
        return terminal
    }

    void setTerminal(String terminal) {
        this.terminal = terminal
    }
}

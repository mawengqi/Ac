package acuser.test

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import org.bson.Document

/**
 * Created by wenqi on 2018/10/31
 */
@DBDocument(collectionClass = "acuser.test.ChinesePeopleCollection")
class ChinesePeople extends People{

    @DocumentField(key = "privince")
    private String privince

    Document toDocument(){
        Document document  = new Document()
        document.append("privince", privince)
        return document
    }

    String getPrivince() {
        return privince
    }

    void setPrivince(String privince) {
        this.privince = privince
    }
}

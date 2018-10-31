package acfirm.data

import com.mongodb.BasicDBObject
import com.mongodb.DBObject
import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.BaseObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument
class ACService extends BaseObject{
    public static final String FIELD_SERVICE_NAME = "name";
    public static final String FIELD_SERVICE_ID = "id";
    @DocumentField(key = "name")
    private String name;
    @DocumentField(key = "id")
    private String id;

    public Service(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public String getId() {
        return id;
    }

    public Document toDocument() {
        Document document = new Document()
        document.put(FIELD_SERVICE_ID, id);
        document.put(FIELD_SERVICE_NAME, name);
        return document;
    }

}

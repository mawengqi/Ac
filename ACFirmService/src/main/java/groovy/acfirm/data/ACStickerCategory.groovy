package acfirm.data

import com.mongodb.DBObject
import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.BaseObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument
class ACStickerCategory extends BaseObject{
    public static final ACStickerCategory DEFAULT_NIL_CATEGORY = new ACStickerCategory("nil", "53f32621d258716a9c9350a5");
    public static final ACStickerCategory DEFAULT_PUBLIC_CATEGORY = new ACStickerCategory("Default", "54c1d37ae36ed0d14e3a1c74");
    public static final String FIELD_NAME = "cn";
    public static final String FIELD_ID = "cid";
    @DocumentField(key = "cn")
    private String name;
    @DocumentField(key = "cid")
    private String id;

    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_NAME, name)
                .append(FIELD_ID, id)
        return document
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public StickerCategory() {}
    public StickerCategory(DBObject dbo) {
        fromDBObject(dbo);
    }
    public StickerCategory(String name, String id) {
        super();
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString() {
        return "StickerCategory [name=" + name + ", id=" + id + "]";
    }

}

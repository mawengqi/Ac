package acfirm.data

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.BaseObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument
class ACSticker extends BaseObject{
    public static final String FIELD_RESOURCE_ID = "rid"
    public static final String FIELD_NAME = "name"
    public static final String FIELD_DESC = "desc"
    public static final String FIELD_SMALL = "s"
    public static final String FIELD_BIG = "b"
    @DocumentField(key = "rid")
    private String resourceId
    @DocumentField(key = "name")
    private String name
    @DocumentField(key = "desc")
    private String desc
    @DocumentField(key = "s")
    private List<Integer> small
    @DocumentField(key = "b")
    private List<Integer> big

    public Document toDocument(){
        Document document = new Document()
        document.append(FIELD_NAME, name)
                .append(FIELD_RESOURCE_ID, resourceId)
                .append(FIELD_DESC, desc)
                .append(FIELD_SMALL, small)
                .append(FIELD_BIG, big)
        return document
    }

    String getResourceId() {
        return resourceId
    }

    void setResourceId(String resourceId) {
        this.resourceId = resourceId
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getDesc() {
        return desc
    }

    void setDesc(String desc) {
        this.desc = desc
    }

    List<Integer> getSmall() {
        return small
    }

    void setSmall(List<Integer> small) {
        this.small = small
    }

    List<Integer> getBig() {
        return big
    }

    void setBig(List<Integer> big) {
        this.big = big
    }
}

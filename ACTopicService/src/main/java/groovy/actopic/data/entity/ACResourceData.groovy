package actopic.data.entity

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.BaseObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/31
 */
@DBDocument
class ACResourceData extends BaseObject{
    public static final String FIELD_RESOURCEID = "rid"
    public static final String FIELD_CONTENTTYPE= "type"
    public static final String FIELD_NAME = "name"
    @DocumentField(key = "rid")
    private String resourceId
    @DocumentField(key = "type")
    private String contentType
    @DocumentField(key = "name")
    private String name
    private Long time

    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_RESOURCEID, resourceId)
                .append(FIELD_NAME, name)
                .append(FIELD_CONTENTTYPE, contentType)
        return document
    }

    String getResourceId() {
        return resourceId
    }

    void setResourceId(String resourceId) {
        this.resourceId = resourceId
    }

    String getContentType() {
        return contentType
    }

    void setContentType(String contentType) {
        this.contentType = contentType
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    Long getTime() {
        return time
    }

    void setTime(Long time) {
        this.time = time
    }
}

package actopic.data.entity

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/31
 */
@DBDocument(collectionClass = "")
class UrlEntity extends DataObject{
    public static final String TYPE_PAGE = "page";
    public static final String TYPE_WEBSITE = "web";
    public static final String TYPE_SURVEY = "survey";
    public static final String TYPE_EVENTURL = "eventurl";
    public static final String FIELD_URLENTITY_URL = "url";
    public static final String FIELD_URLENTITY_EVENTGROUPID = "egid";
    public static final String FIELD_URLENTITY_USERPERMISSION = "up";
    public static final String FIELD_URLENTITY_ADMINPERMISSION = "ap";
    public static final String FIELD_URLENTITY_RESOURCES = "res";
    public static final String FIELD_URLENTITY_LAUNCHTIME = "lt";
    public static final String FIELD_URLENTITY_DESCRIPTION = "desp";
    public static final String FIELD_URLENTITY_READ = "read";
    @DocumentField(key = "res")
    private Map<String, ACResourceData> resourceMap;
    @DocumentField(key = "url")
    private String url;
    @DocumentField(key = "desp")
    private String description;
    @DocumentField(key = "egid")
    private String eventGroupId;
    @DocumentField(key = "up")
    private ACPermission userPermission;
    @DocumentField(key = "ap")
    private ACPermission adminPermission;
    @DocumentField(key = "lt")
    private Long launchTime;
    @DocumentField(key = "read")
    private Boolean read = false;

    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_URLENTITY_URL, description)
                .append(FIELD_URLENTITY_DESCRIPTION, description)
                .append(FIELD_URLENTITY_EVENTGROUPID, eventGroupId)
                .append(FIELD_URLENTITY_USERPERMISSION, userPermission)
                .append(FIELD_URLENTITY_ADMINPERMISSION, adminPermission)
                .append(FIELD_URLENTITY_RESOURCES, resourceMap.values())
                .append(FIELD_URLENTITY_LAUNCHTIME, launchTime)
        return document
    }

    Map<String, ACResourceData> getResourceMap() {
        return resourceMap
    }

    void setResourceMap(Map<String, ACResourceData> resourceMap) {
        this.resourceMap = resourceMap
    }

    String getUrl() {
        return url
    }

    void setUrl(String url) {
        this.url = url
    }

    String getDescription() {
        return description
    }

    void setDescription(String description) {
        this.description = description
    }

    String getEventGroupId() {
        return eventGroupId
    }

    void setEventGroupId(String eventGroupId) {
        this.eventGroupId = eventGroupId
    }

    ACPermission getUserPermission() {
        return userPermission
    }

    void setUserPermission(ACPermission userPermission) {
        this.userPermission = userPermission
    }

    ACPermission getAdminPermission() {
        return adminPermission
    }

    void setAdminPermission(ACPermission adminPermission) {
        this.adminPermission = adminPermission
    }

    Long getLaunchTime() {
        return launchTime
    }

    void setLaunchTime(Long launchTime) {
        this.launchTime = launchTime
    }

    Boolean getRead() {
        return read
    }

    void setRead(Boolean read) {
        this.read = read
    }
}

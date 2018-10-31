package acfirm.data

import com.docker.storage.mongodb.CleanDocument
import com.mongodb.BasicDBList
import com.mongodb.DBObject
import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument(collectionClass = "")
class ACClient extends DataObject{
    public static final String ADMIN_DOMAIN = "admin"
    public static final String SERVICE_ACUCOM = "acucom"
    public static final String SERVICE_WALLBOARD = "wallboard"
    public static final ACService[] AVAILABLE_SERVICES = [new ACService("AcuCom", SERVICE_ACUCOM), new ACService("Wallboard", SERVICE_WALLBOARD)]
    public static final String SCOPE_ALL = "*"
    public static final String SCOPE_BASE = "base"
    public static final String FIELD_CREATETIME = "ctime"
    public static final String FIELD_CLIENTID = "cid"
    public static final String FIELD_NAME = "name"
    public static final String FIELD_FIRMID = "fid"
    public static final String FIELD_ADMINIDS = "aids"
    public static final String FIELD_SCOPES = "scop"
    public static final String FIELD_PARAMETERS = "para"
    public static final String FIELD_AUTHORISEDUSERIDS = "uids"
    public static final String FIELD_AUTHORISEDUSERGROUPIDS = "ugids"
    public static final String FIELD_PROFILEPERMISSIONMAP = "prof"    
    @DocumentField(key = "name")
    private String name
    @DocumentField(key = "ctime")
    private Long createTime
    @DocumentField(key = "cid")
    private String clientId
    @DocumentField(key = "uids")
    private List<String> authorizedUserIds
    @DocumentField(key = "ugids")
    private List<String> authorizedUserGroupIds
    @DocumentField(key = "fid")
    private String firmId
    @DocumentField(key = "aids")
    private List<String> adminIds
    @DocumentField(key = "scop")
    private List<String> scopes
    @DocumentField(key = "para")
    private Document parameters
    @DocumentField(key = "prof")
    private Map<String, ACClientPermission> profilePermissionMap

    public Document toDocument(){
        Document document = new CleanDocument()
        document.append(FIELD_CREATETIME, createTime)
                .append(FIELD_CLIENTID, clientId)
                .append(FIELD_FIRMID, firmId)
                .append(FIELD_NAME, name)
                .append(FIELD_AUTHORISEDUSERGROUPIDS, authorizedUserGroupIds)
                .append(FIELD_AUTHORISEDUSERIDS, authorizedUserIds)
                .append(FIELD_ADMINIDS, adminIds)
                .append(FIELD_SCOPES, scopes)
                .append(FIELD_PARAMETERS, parameters)
        if(profilePermissionMap != null) {
            BasicDBList permList = new BasicDBList();
            Collection<ACClientPermission> collection = profilePermissionMap.values();
            for(ACClientPermission perm : collection) {
                Document permObj = perm.toDocument();
                permList.add(permObj);
            }
            document.append(FIELD_PROFILEPERMISSIONMAP, permList);
        }
        return document
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    Long getCreateTime() {
        return createTime
    }

    void setCreateTime(Long createTime) {
        this.createTime = createTime
    }

    String getClientId() {
        return clientId
    }

    void setClientId(String clientId) {
        this.clientId = clientId
    }

    List<String> getAuthorizedUserIds() {
        return authorizedUserIds
    }

    void setAuthorizedUserIds(List<String> authorizedUserIds) {
        this.authorizedUserIds = authorizedUserIds
    }

    List<String> getAuthorizedUserGroupIds() {
        return authorizedUserGroupIds
    }

    void setAuthorizedUserGroupIds(List<String> authorizedUserGroupIds) {
        this.authorizedUserGroupIds = authorizedUserGroupIds
    }

    String getFirmId() {
        return firmId
    }

    void setFirmId(String firmId) {
        this.firmId = firmId
    }

    List<String> getAdminIds() {
        return adminIds
    }

    void setAdminIds(List<String> adminIds) {
        this.adminIds = adminIds
    }

    List<String> getScopes() {
        return scopes
    }

    void setScopes(List<String> scopes) {
        this.scopes = scopes
    }

    Document getParameters() {
        return parameters
    }

    void setParameters(Document parameters) {
        this.parameters = parameters
    }

    Map<String, ACClientPermission> getProfilePermissionMap() {
        return profilePermissionMap
    }

    void setProfilePermissionMap(Map<String, ACClientPermission> profilePermissionMap) {
        this.profilePermissionMap = profilePermissionMap
    }
}

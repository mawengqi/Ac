package actopic.data.status


import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.BaseObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/26
 */
@DBDocument
class ACCompany extends BaseObject{
    /**
     * id
     * userGroupIds
     * userIds
     * firmId
     * seeOtherCompanies
     */
    public static final String FIELD_ID = "id"
    public static final String FIELD_USERGROUPIDS = "ugids"
    public static final String FIELD_USERIDS = "uids"
    public static final String FIELD_FIRMID = "fid"
    public static final String FIELD_SEEOTHERCOMPANIES = "m"
    @DocumentField(key = "id")
    private String id
    @DocumentField(key = "ugids")
    private List<String> userGroupIds
    @DocumentField(key = "uids")
    private List<String> userIds
    @DocumentField(key = "fid")
    private String firmId
    @DocumentField(key = "m")
    private Boolean seeOtherCompanies
    
    public Document toDocument(){
        Document document = new Document()
        document.append(FIELD_ID, id)
                .append(FIELD_USERGROUPIDS, userGroupIds)
                .append(FIELD_USERIDS, userIds)
                .append(FIELD_FIRMID, firmId)
                .append(FIELD_SEEOTHERCOMPANIES, seeOtherCompanies)
        return document

    }
        
    String getId() {
        return id
    }

    void setId(String id) {
        this.id = id
    }

    List<String> getUserGroupIds() {
        return userGroupIds
    }

    void setUserGroupIds(List<String> userGroupIds) {
        this.userGroupIds = userGroupIds
    }

    List<String> getUserIds() {
        return userIds
    }

    void setUserIds(List<String> userIds) {
        this.userIds = userIds
    }

    String getFirmId() {
        return firmId
    }

    void setFirmId(String firmId) {
        this.firmId = firmId
    }

    Boolean getSeeOtherCompanies() {
        return seeOtherCompanies
    }

    void setSeeOtherCompanies(Boolean seeOtherCompanies) {
        this.seeOtherCompanies = seeOtherCompanies
    }
}

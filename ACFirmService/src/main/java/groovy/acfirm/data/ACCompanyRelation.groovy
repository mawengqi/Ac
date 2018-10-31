package acfirm.data

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/26
 */
@DBDocument(collectionClass = "acuser.db.ACCompanyRelationCollection")
class ACCompanyRelation extends DataObject{
    /**
     * companyMap
     * name
     * userId
     * createTime
     * updateTime
     * firmId
     */
    public static final String FIELD_COMPANYMAP = "coms";
    public static final String FIELD_NAME = "name";
    public static final String FIELD_USERID = "uid";
    public static final String FIELD_CREATETIME = "ct";
    public static final String FIELD_UPDATETIME = "ut";
    public static final String FIELD_FID = "fid";

    @DocumentField(key = "coms")
    private Map<String, ACCompany> companyMap;
    @DocumentField(key = "name")
    private String name;
    @DocumentField(key = "uid")
    private String userId;
    @DocumentField(key = "ctime")
    private Long createTime;
    @DocumentField(key = "utime")
    private Long updateTime;
    @DocumentField(key = "fid")
    private String firmId;
    public Document toDocument(){
        Document document = new Document()
        document.append(FIELD_COMPANYMAP, companyMap)
                .append(FIELD_NAME, name)
                .append(FIELD_USERID, userId)
                .append(FIELD_CREATETIME, createTime)
                .append(FIELD_UPDATETIME, updateTime)
                .append(FIELD_FID, firmId)
        return document
    }


    Map<String, ACCompany> getCompanyMap() {
        return companyMap
    }

    void setCompanyMap(Map<String, ACCompany> companyMap) {
        this.companyMap = companyMap
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getUserId() {
        return userId
    }

    void setUserId(String userId) {
        this.userId = userId
    }

    Long getCreateTime() {
        return createTime
    }

    void setCreateTime(Long createTime) {
        this.createTime = createTime
    }

    Long getUpdateTime() {
        return updateTime
    }

    void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime
    }

    String getFirmId() {
        return firmId
    }

    void setFirmId(String firmId) {
        this.firmId = firmId
    }
}

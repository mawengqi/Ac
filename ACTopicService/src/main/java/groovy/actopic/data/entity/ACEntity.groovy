package actopic.data.entity

import com.mongodb.BasicDBList
import com.mongodb.DBObject
import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument
abstract class ACEntity extends DataObject{
    public final static int USERIDS_MAX = 100
    public static final int ENTITYTYPE_URL = 10
    public static final int ENTITYTYPE_TOPIC = 20
    public static final String FIELD_DELETETIME = "dtime"
    public static final String FIELD_CREATETIME = "ctime"
    public static final String FIELD_UPDATETIME = "utime"
    public static final String FIELD_TITLE = "title"
    public static final String FIELD_USERID = "uid"
    public static final String FIELD_TYPE = "type"
    public static final String FIELD_SECONDTYPE = "stype"
    public static final String FIELD_PARENTENTITYID = "ptid"
    public static final String FIELD_FIRMID = "fid"
    public static final String FIELD_JOINEDUSERS = "jus"
    public static final String FIELD_JOINEDCOUNT = "jc"
    public static final String FIELD_ICON = "icon"
    public static final String FIELD_ENTITYTYPE = "et"
    public static final String FIELD_ADMINUSERIDS = "aids"
    public static final String FIELD_ADMINUSERGROUPIDS = "augs"
    public static final String FIELD_RESERVED = "obj"
    @DocumentField(key = "obj")
    private Document reserved
    @DocumentField(key = "ctime")
    private Long createTime
    @DocumentField(key = "utime")
    private Long updateTime
    @DocumentField(key = "dtime")
    private Long deleteTime
    @DocumentField(key = "title")
    private String title
    @DocumentField(key = "icon")
    private String icon
    @DocumentField(key = "jus")
    private Map<String, ACJoinedUser> joinedUserMap
    @DocumentField(key = "aids")
    private List<String> adminUserIds
    @DocumentField(key = "aids")
    private List<String> adminUserGroupIds
    @DocumentField(key = "jc")
    private Integer joinedCount
    @DocumentField(key = "uid")
    private String userId
    @DocumentField(key = "type")
    private String type
    @DocumentField(key = "stype")
    private String secondType = "common"
    @DocumentField(key = "et")
    private Integer entityType
    @DocumentField(key = "ptid")
    private String parentEntityId
    @DocumentField(key = "fid")
    private String firmId

    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_CREATETIME, createTime)
                .append(FIELD_UPDATETIME, updateTime)
                .append(FIELD_DELETETIME, deleteTime)
                .append(FIELD_TITLE, title)
                .append(FIELD_USERID, userId)
                .append(FIELD_TYPE, type)
                .append(FIELD_SECONDTYPE, secondType)
                .append(FIELD_PARENTENTITYID, parentEntityId)
                .append(FIELD_FIRMID, firmId)
                .append(FIELD_ENTITYTYPE, entityType)

        if(joinedUserMap != null) {
            BasicDBList joinedUserList = new BasicDBList()
            Collection<ACJoinedUser> collection = joinedUserMap.values()
            for(ACJoinedUser user : collection) {
                joinedUserList.add(user.toDocument())
            }
            document.append(FIELD_JOINEDUSERS, joinedUserList)
        }
        document.append(FIELD_JOINEDCOUNT, joinedCount)
                .append(FIELD_ICON, icon)
                .append(FIELD_ADMINUSERIDS, adminUserIds)
                .append(FIELD_RESERVED, reserved)
        return document
    }

    Document getReserved() {
        return reserved
    }

    void setReserved(Document reserved) {
        this.reserved = reserved
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

    Long getDeleteTime() {
        return deleteTime
    }

    void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime
    }

    String getTitle() {
        return title
    }

    void setTitle(String title) {
        this.title = title
    }

    String getIcon() {
        return icon
    }

    void setIcon(String icon) {
        this.icon = icon
    }

    Map<String, ACJoinedUser> getJoinedUserMap() {
        return joinedUserMap
    }

    void setJoinedUserMap(Map<String, ACJoinedUser> joinedUserMap) {
        this.joinedUserMap = joinedUserMap
    }

    List<String> getAdminUserIds() {
        return adminUserIds
    }

    void setAdminUserIds(List<String> adminUserIds) {
        this.adminUserIds = adminUserIds
    }

    List<String> getAdminUserGroupIds() {
        return adminUserGroupIds
    }

    void setAdminUserGroupIds(List<String> adminUserGroupIds) {
        this.adminUserGroupIds = adminUserGroupIds
    }

    Integer getJoinedCount() {
        return joinedCount
    }

    void setJoinedCount(Integer joinedCount) {
        this.joinedCount = joinedCount
    }

    String getUserId() {
        return userId
    }

    void setUserId(String userId) {
        this.userId = userId
    }

    String getType() {
        return type
    }

    void setType(String type) {
        this.type = type
    }

    String getSecondType() {
        return secondType
    }

    void setSecondType(String secondType) {
        this.secondType = secondType
    }

    Integer getEntityType() {
        return entityType
    }

    void setEntityType(Integer entityType) {
        this.entityType = entityType
    }

    String getParentEntityId() {
        return parentEntityId
    }

    void setParentEntityId(String parentEntityId) {
        this.parentEntityId = parentEntityId
    }

    String getFirmId() {
        return firmId
    }

    void setFirmId(String firmId) {
        this.firmId = firmId
    }
}

package actopic.data.status


import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/26
 */
@DBDocument
class ACUserGroup extends DataObject{
    /**
     * name
     * userId
     * type
     * serviceType
     * joinPassword
     * parentIds
     * parentNum
     * groupIcon
     * website
     * description
     * createTime
     * updateTime
     * attributes
     * viewableUserGroup
     * firmId
     * sname
     */
    public static final int TYPE_PRIVATE = 0;
    public static final int TYPE_PUBLIC = 1;
    public static final int TYPE_AUTOCREATED = 10;

    public static final String FIELD_NAME = "name";
    public static final String FIELD_USERID = "uid";
    public static final String FIELD_TYPE = "type";
    public static final String FIELD_TYPE_SERVICE = "ts";
    public static final String FIELD_JOINPASSWORD = "pwd";
    public static final String FIELD_PARENTUSERGROUPIDS = "pids";
    public static final String FIELD_PARENTUSERGROUPNUM = "pnum";
    public static final String FIELD_GROUPICON = "icon";
    public static final String FIELD_WEBSITE = "site";
    public static final String FIELD_DESCRIPTION = "desp";
    public static final String FIELD_CREATETIME = "ctime";
    public static final String FIELD_UPDATETIME = "utime";
    public static final String FIELD_ATTRIBUTES = "attrs"
    public static final String FIELD_VIEWABLEUSERGROUP = "vug";
    public static final String FIELD_FIRMID = "fid";
    public static final String FIELD_NAMEFORSORT = "sname";
    @DocumentField(key = "name")
    private String name;
    @DocumentField(key = "uid")
    private String userId;
    @DocumentField(key = "type")
    private Integer type;
    @DocumentField(key = "ts")
    private Integer serviceType;
    @DocumentField(key = "pwd")
    private String joinPassword;
    @DocumentField(key = "pids")
    private String[] parentIds;
    @DocumentField(key = "pnum")
    private Integer parentNum;
    @DocumentField(key = "icon")
    private String groupIcon;
    @DocumentField(key = "site")
    private String website;
    @DocumentField(key = "desp")
    private String description;
    @DocumentField(key = "ctime")
    private Long createTime;
    @DocumentField(key = "utime")
    private Long updateTime;
    @DocumentField(key = "attrs")
    private Document attributes;
    @DocumentField(key = "vug")
    private ACViewableUserGroup[] viewableUserGroup;
    @DocumentField(key = "fid")
    private String firmId;
    @DocumentField(key = "sname")
    private String sname;
    public Document toDocument(){
        Document document = new Document()
        document.append(FIELD_NAME, name)
                .append(FIELD_USERID, userId)
                .append(FIELD_TYPE, type)
                .append(FIELD_TYPE_SERVICE, serviceType)
                .append(FIELD_JOINPASSWORD, joinPassword)
                .append(FIELD_PARENTUSERGROUPIDS, parentIds)
                .append(FIELD_PARENTUSERGROUPNUM, parentNum)
                .append(FIELD_GROUPICON, groupIcon)
                .append(FIELD_WEBSITE, website)
                .append(FIELD_DESCRIPTION, description)
                .append(FIELD_CREATETIME, createTime)
                .append(FIELD_UPDATETIME, updateTime)
                .append(FIELD_ATTRIBUTES, attributes)
                .append(FIELD_VIEWABLEUSERGROUP, viewableUserGroup)
                .append(FIELD_FIRMID, firmId)
                .append(FIELD_NAMEFORSORT, sname)
        return document
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

    Integer getType() {
        return type
    }

    void setType(Integer type) {
        this.type = type
    }

    Integer getServiceType() {
        return serviceType
    }

    void setServiceType(Integer serviceType) {
        this.serviceType = serviceType
    }

    String getJoinPassword() {
        return joinPassword
    }

    void setJoinPassword(String joinPassword) {
        this.joinPassword = joinPassword
    }

    String[] getParentIds() {
        return parentIds
    }

    void setParentIds(String[] parentIds) {
        this.parentIds = parentIds
    }

    Integer getParentNum() {
        return parentNum
    }

    void setParentNum(Integer parentNum) {
        this.parentNum = parentNum
    }

    String getGroupIcon() {
        return groupIcon
    }

    void setGroupIcon(String groupIcon) {
        this.groupIcon = groupIcon
    }

    String getWebsite() {
        return website
    }

    void setWebsite(String website) {
        this.website = website
    }

    String getDescription() {
        return description
    }

    void setDescription(String description) {
        this.description = description
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

    Document getAttributes() {
        return attributes
    }

    void setAttributes(Document attributes) {
        this.attributes = attributes
    }

    ACViewableUserGroup[] getViewableUserGroup() {
        return viewableUserGroup
    }

    void setViewableUserGroup(ACViewableUserGroup[] viewableUserGroup) {
        this.viewableUserGroup = viewableUserGroup
    }

    String getFirmId() {
        return firmId
    }

    void setFirmId(String firmId) {
        this.firmId = firmId
    }

    String getSname() {
        return sname
    }

    void setSname(String sname) {
        this.sname = sname
    }
}

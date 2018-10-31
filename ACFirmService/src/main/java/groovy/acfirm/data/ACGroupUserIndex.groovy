package acfirm.data

import com.mongodb.DBObject
import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/26
 */
@DBDocument(collectionClass = "acuser.db.ACGroupUserIndexCollection")
class ACGroupUserIndex extends DataObject{
    /**
     * userGroupIds
     * userGroupNum
     * userId
     * userName
     * accounts
     * manageClients
     * attributes
     * createTime
     * notLogin
     * sname
     */
    public static final int SEARCHTYPE_DISPLAYNAME = 1;
    public static final int SEARCHTYPE_ACCOUNT = 2;
    public static final String FIELD_USERGROUPIDS = "ugid";
    public static final String FIELD_USERGROUPNUM = "ugnm";
    public static final String FIELD_USERID = "uid";
    public static final String FIELD_USERNAME = "uname";
    public static final String FIELD_ACCOUNTS = "acts";
    public static final String FIELD_MANAGECLIENTS = "mcs";
    public static final String FIELD_ATTRIBUTES = "attrs"
    public static final String FIELD_CREATETIME = "ctime";
    public static final String FIELD_NOTLOGIN = "nl";
    public static final String FIELD_USERNAMEFORSORT = "sname";
    @DocumentField(key = "ugid")
    private List<String> userGroupIds;
    @DocumentField(key = "ugnm")
    private Integer userGroupNum;
    @DocumentField(key = "uid")
    private String userId;
    @DocumentField(key = "uname")
    private String userName;
    @DocumentField(key = "acts")
    private String[] accounts;
    @DocumentField(key = "mcs")
    private Set<String> manageClients;
    @DocumentField(key = "attrs")
    private DBObject attributes;
    @DocumentField(key = "ctime")
    private Long createTime;
    @DocumentField(key = "nl")
    private Boolean notLogin;
    @DocumentField(key = "sname")
    private String sname;
    public Document toDocument(){
        Document document = new Document()
        document.append(FIELD_USERGROUPIDS, userGroupIds)
                .append(FIELD_USERGROUPNUM, userGroupNum)
                .append(FIELD_USERID, userId)
                .append(FIELD_USERNAME, userName)
                .append(FIELD_ACCOUNTS, accounts)
                .append(FIELD_MANAGECLIENTS, manageClients)
                .append(FIELD_ATTRIBUTES, attributes)
                .append(FIELD_CREATETIME, createTime)
                .append(FIELD_NOTLOGIN, notLogin)
                .append(FIELD_USERNAMEFORSORT, sname)
        return document
    }

    List<String> getUserGroupIds() {
        return userGroupIds
    }

    void setUserGroupIds(List<String> userGroupIds) {
        this.userGroupIds = userGroupIds
    }

    Integer getUserGroupNum() {
        return userGroupNum
    }

    void setUserGroupNum(Integer userGroupNum) {
        this.userGroupNum = userGroupNum
    }

    String getUserId() {
        return userId
    }

    void setUserId(String userId) {
        this.userId = userId
    }

    String getUserName() {
        return userName
    }

    void setUserName(String userName) {
        this.userName = userName
    }

    String[] getAccounts() {
        return accounts
    }

    void setAccounts(String[] accounts) {
        this.accounts = accounts
    }

    Set<String> getManageClients() {
        return manageClients
    }

    void setManageClients(Set<String> manageClients) {
        this.manageClients = manageClients
    }

    DBObject getAttributes() {
        return attributes
    }

    void setAttributes(DBObject attributes) {
        this.attributes = attributes
    }

    Long getCreateTime() {
        return createTime
    }

    void setCreateTime(Long createTime) {
        this.createTime = createTime
    }

    Boolean getNotLogin() {
        return notLogin
    }

    void setNotLogin(Boolean notLogin) {
        this.notLogin = notLogin
    }

    String getSname() {
        return sname
    }

    void setSname(String sname) {
        this.sname = sname
    }
}

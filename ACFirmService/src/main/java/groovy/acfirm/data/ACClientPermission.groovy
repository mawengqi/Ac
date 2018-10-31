package acfirm.data

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.codec.BaseObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument
class ACClientPermission extends BaseObject{
    public static final String ROLE_SERVICEADMINISTRATOR = "sadm"
    public static final String ROLE_USERGROUPADMINISTRATOR = "ugadm"
    public static final String ROLE_USER = "user"
    private String roleId

    private Integer serviceUsersAndUserGroups
    public static final int SERVICEUSERSANDUSERGROUPS_DENNY = 0
    public static final int SERVICEUSERSANDUSERGROUPS_VIEW = 1
    public static final int SERVICEUSERSANDUSERGROUPS_EDIT = 2

    private Integer serviceUserGroupAdmins
    public static final int SERVICEUSERGROUPADMINS_DENNY = 0
    public static final int SERVICEUSERGROUPADMINS_VIEW = 1
    public static final int SERVICEUSERGROUPADMINS_EDIT = 2

    public static final String FIELD_SERVICEUSERSANDUSERGROUPS = "suug"
    public static final String FIELD_SERVICEUSERGROUPADMINS = "suga"
    public static final String FIELD_ROLEID = "rid"

    public Document toDocument(){
        Document document = new Document()
        document.append(FIELD_SERVICEUSERGROUPADMINS, serviceUserGroupAdmins)
                .append(FIELD_SERVICEUSERSANDUSERGROUPS, serviceUsersAndUserGroups)
                .append(FIELD_ROLEID, roleId)
        return document
    }

    String getRoleId() {
        return roleId
    }

    void setRoleId(String roleId) {
        this.roleId = roleId
    }

    Integer getServiceUsersAndUserGroups() {
        return serviceUsersAndUserGroups
    }

    void setServiceUsersAndUserGroups(Integer serviceUsersAndUserGroups) {
        this.serviceUsersAndUserGroups = serviceUsersAndUserGroups
    }

    Integer getServiceUserGroupAdmins() {
        return serviceUserGroupAdmins
    }

    void setServiceUserGroupAdmins(Integer serviceUserGroupAdmins) {
        this.serviceUserGroupAdmins = serviceUserGroupAdmins
    }

    private static ACClientPermission userClientPerm;
    static ACClientPermission getUserClientPermission() {
        if(userClientPerm == null) {
            userClientPerm = new ACClientPermission();
            userClientPerm.setRoleId(ACClientPermission.ROLE_USER);
            userClientPerm.setServiceUserGroupAdmins(ACClientPermission.SERVICEUSERGROUPADMINS_DENNY);
            userClientPerm.setServiceUsersAndUserGroups(ACClientPermission.SERVICEUSERSANDUSERGROUPS_DENNY);
        }
        return userClientPerm;
    }

}

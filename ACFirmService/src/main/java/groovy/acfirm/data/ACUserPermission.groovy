package acfirm.data

import com.docker.storage.mongodb.CleanDocument
import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.BaseObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument
class ACUserPermission extends BaseObject{
    @DocumentField(key = "rid")
    private String roleId
    @DocumentField(key = "rn")
    private String roleName
    @DocumentField(key = "v")
    private Integer value
    public static final int SAMPLE_CONDITION = 0
    @DocumentField(key = "man")
    private Integer manage
    public static final int MANAGE_DENNY = 0
    public static final int MANAGE_USER = ACViewableUserGroup.VIEWTYPE_USER
    public static final int MANAGE_USER_USERGROUP = ACViewableUserGroup.VIEWTYPE_USER_USERGROUP
    @DocumentField(key = "view")
    private Integer view
    public static final int VIEW_DENNY = 0
    public static final int VIEW_USER = ACViewableUserGroup.VIEWTYPE_USER
    public static final int VIEW_USER_USERGROUP = ACViewableUserGroup.VIEWTYPE_USER_USERGROUP
    @DocumentField(key = "free")
    private Integer freeChat
    public static final int FREECHAT_DENNY = 0
    public static final int FREECHAT_SELECT_USER = ACViewableUserGroup.VIEWTYPE_USER
    public static final int FREECHAT_SELECT_USER_USERGROUP = ACViewableUserGroup.VIEWTYPE_USER_USERGROUP
    @DocumentField(key = "adm")
    private Integer adminChat
    public static final int ADMINCHAT_DENNY = 0
    public static final int ADMINCHAT_SELECT_USER = ACViewableUserGroup.VIEWTYPE_USER
    public static final int ADMINCHAT_SELECT_USER_USERGROUP = ACViewableUserGroup.VIEWTYPE_USER_USERGROUP
    @DocumentField(key = "url")
    private Integer url
    public static final int URL_DENNY = 0
    public static final int URL_SELECT_USER = ACViewableUserGroup.VIEWTYPE_USER
    public static final int URL_SELECT_USER_USERGROUP = ACViewableUserGroup.VIEWTYPE_USER_USERGROUP
    @DocumentField(key = "sv")
    private Integer survey
    public static final int SURVEY_DENNY = 0
    public static final int SURVEY_SELECT_USER = ACViewableUserGroup.VIEWTYPE_USER
    public static final int SURVEY_SELECT_USER_USERGROUP = ACViewableUserGroup.VIEWTYPE_USER_USERGROUP
    @DocumentField(key = "ev")
    private Integer event
    public static final int EVENT_DENNY = 0
    public static final int EVENT_SELECT_USER = ACViewableUserGroup.VIEWTYPE_USER
    public static final int EVENT_SELECT_USER_USERGROUP = ACViewableUserGroup.VIEWTYPE_USER_USERGROUP
    @DocumentField(key = "vd")
    private Integer video
    public static final int VIDEO_DENNY = 0
    public static final int VIDEO_SELECT_USER = ACViewableUserGroup.VIEWTYPE_USER
    public static final int VIDEO_SELECT_USER_USERGROUP = ACViewableUserGroup.VIEWTYPE_USER_USERGROUP
    @DocumentField(key = "ck")
    private Integer clicker
    public static final int CLICKER_DENNY = 0
    public static final int CLICKER_SELECT_USER = ACViewableUserGroup.VIEWTYPE_USER
    public static final int CLICKER_SELECT_USER_USERGROUP = ACViewableUserGroup.VIEWTYPE_USER_USERGROUP
    @DocumentField(key = "la")
    private Integer locationAlert
    public static final int LOCATIONALERT_DENNY = 0
    public static final int LOCATIONALERT_SELECT_USER = ACViewableUserGroup.VIEWTYPE_USER
    public static final int LOCATIONALERT_SELECT_USER_USERGROUP = ACViewableUserGroup.VIEWTYPE_USER_USERGROUP
    @DocumentField(key = "page")
    private Integer pageLink
    public static final int PAGELINK_DENNY = 0
    public static final int PAGELINK_SELECT_USER = ACViewableUserGroup.VIEWTYPE_USER
    public static final int PAGELINK_SELECT_USER_USERGROUP = ACViewableUserGroup.VIEWTYPE_USER_USERGROUP
    @DocumentField(key = "wb")
    private Integer wallboard
    public static final int WALLBOARD_DENNY = 0
    public static final int WALLBOARD_ALLOW = 1
    @DocumentField(key = "defla")
    private Integer locationAlertUserDefine
    public static final int LOCATIONALERTUSERDEFINE_DENNY = 0
    public static final int LOCATIONALERTUSERDEFINE_ALLOW = 1
    @DocumentField(key = "sa")
    private Integer stickerAdmin
    public static final int STICKERADMIN_DENNY = 0
    public static final int STICKERADMIN_ALLOW = 1
    @DocumentField(key = "scr")
    private Integer searchInCompanyRelation
    public static final int SEARCHINCOMPANYRELATION_DENNY = 0
    public static final int SEARCHINCOMPANYRELATION_ALLOW = 1

    public static final String FIELD_SEARCHINCOMPANYRELATION = "scr"
    public static final String FIELD_MANAGE = "man"
    public static final String FIELD_VIEW = "view"
    public static final String FIELD_FREECHAT = "free"
    public static final String FIELD_ADMINCHAT = "adm"
    public static final String FIELD_URL = "url"
    public static final String FIELD_PAGELINK = "page"
    public static final String FIELD_EVENT = "ev"
    public static final String FIELD_SURVEY = "sv"
    public static final String FIELD_VIDEO = "vd"
    public static final String FIELD_CLICKER = "ck"
    public static final String FIELD_LOCATIONALERT = "la"
    public static final String FIELD_WALLBOARD = "wb"
    public static final String FIELD_LOCATIONALERTUSERDEFINE = "defla"
    public static final String FIELD_ROLEID = "rid"
    public static final String FIELD_ROLENAME = "rn"
    public static final String FIELD_VALUE = "v"
    public static final String FIELD_STICKERADMIN = "sa"

    Document toDocument(){
        Document document = new CleanDocument()
        document.append(FIELD_ADMINCHAT, adminChat)
                .append(FIELD_EVENT, event)
                .append(FIELD_FREECHAT, freeChat)
                .append(FIELD_MANAGE, manage)
                .append(FIELD_URL, url)
                .append(FIELD_VIEW, view)
                .append(FIELD_SURVEY, survey)
                .append(FIELD_VIDEO, video)
                .append(FIELD_CLICKER, clicker)
                .append(FIELD_LOCATIONALERT, locationAlert)
                .append(FIELD_STICKERADMIN, stickerAdmin)
                .append(FIELD_PAGELINK, pageLink)
                .append(FIELD_WALLBOARD, wallboard)
                .append(FIELD_SEARCHINCOMPANYRELATION, searchInCompanyRelation)
                .append(FIELD_LOCATIONALERTUSERDEFINE, locationAlertUserDefine)
                .append(FIELD_ROLEID, roleId)
                .append(FIELD_ROLENAME, roleName)
                .append(FIELD_VALUE, value)
        return document
    }

    public boolean verifyPermission(ACUserPermission samplePermission) {
        if(samplePermission == null)
            return false
        boolean bool = false
        if(samplePermission.manage != null && samplePermission.manage <= manage)
            bool |= true
        else
            return false
        if(samplePermission.adminChat != null && samplePermission.adminChat <= adminChat)
            bool |= true
        else
            return false
        if(samplePermission.event != null && samplePermission.event <= event)
            bool |= true
        else
            return false
        if(samplePermission.freeChat != null && samplePermission.freeChat <= freeChat)
            bool |= true
        else
            return false
        if(samplePermission.survey != null && samplePermission.survey <= survey)
            bool |= true
        else
            return false
        if(samplePermission.video != null && samplePermission.video <= video)
            bool |= true
        else
            return false
        if(samplePermission.clicker != null && samplePermission.clicker <= clicker)
            bool |= true
        else
            return false
        if(samplePermission.url != null && samplePermission.url <= url)
            bool |= true
        else
            return false
        if(samplePermission.pageLink != null && samplePermission.pageLink <= pageLink)
            bool |= true
        else
            return false
        if(samplePermission.view != null && samplePermission.view <= view)
            bool |= true
        else
            return false
        if(samplePermission.locationAlert != null && samplePermission.locationAlert <= locationAlert)
            bool |= true
        else
            return false
        if(samplePermission.stickerAdmin != null && samplePermission.stickerAdmin <= stickerAdmin)
            bool |= true
        else
            return false
        return bool
    }

    public Integer getManage() {
        return manage
    }

    public void setManage(Integer manage) {
        this.manage = manage
    }

    public ACUserPermission configManage(Integer manage) {
        this.manage = manage
        return this
    }

    public Integer getView() {
        return view
    }

    public void setView(Integer view) {
        this.view = view
    }

    public ACUserPermission configView(Integer view) {
        this.view = view
        return this
    }

    public Integer getFreeChat() {
        return freeChat
    }

    public void setFreeChat(Integer freeChat) {
        this.freeChat = freeChat
    }

    public ACUserPermission configFreeChat(Integer freeChat) {
        this.freeChat = freeChat
        return this
    }

    public Integer getAdminChat() {
        return adminChat
    }

    public void setAdminChat(Integer adminChat) {
        this.adminChat = adminChat
    }

    public ACUserPermission configAdminChat(Integer adminChat) {
        this.adminChat = adminChat
        return this
    }

    public Integer getUrl() {
        return url
    }

    public void setUrl(Integer url) {
        this.url = url
    }

    public ACUserPermission configUrl(Integer url) {
        this.url = url
        return this
    }

    public Integer getEvent() {
        return event
    }

    public void setEvent(Integer event) {
        this.event = event
    }

    public ACUserPermission configEvent(Integer event) {
        this.event = event
        return this
    }

    public String getRoleId() {
        return roleId
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId
    }

    public Integer getSurvey() {
        return survey
    }

    public void setSurvey(Integer survey) {
        this.survey = survey
    }

    public ACUserPermission configSurvey(Integer survey) {
        this.survey = survey
        return this
    }

    public Integer getVideo() {
        return video
    }

    public void setVideo(Integer video) {
        this.video = video
    }

    public ACUserPermission configVideo(Integer video) {
        this.video = video
        return this
    }

    public Integer getClicker() {
        return clicker
    }

    public void setClicker(Integer clicker) {
        this.clicker = clicker
    }

    public ACUserPermission configClicker(Integer clicker) {
        this.clicker = clicker
        return this
    }

    public String getRoleName() {
        return roleName
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName
    }

    public Integer getLocationAlert() {
        return locationAlert
    }

    public void setLocationAlert(Integer locationAlert) {
        this.locationAlert = locationAlert
    }

    public Integer getPageLink() {
        return pageLink
    }

    public void setPageLink(Integer pageLink) {
        this.pageLink = pageLink
    }

    public Integer getValue() {
        return value
    }

    public void setValue(Integer value) {
        this.value = value
    }

    public Integer getWallboard() {
        return wallboard
    }

    public void setWallboard(Integer wallboard) {
        this.wallboard = wallboard
    }

    public Integer getLocationAlertUserDefine() {
        return locationAlertUserDefine
    }

    public void setLocationAlertUserDefine(Integer locationAlertUserDefine) {
        this.locationAlertUserDefine = locationAlertUserDefine
    }

    public Integer getStickerAdmin() {
        return stickerAdmin
    }

    public void setStickerAdmin(Integer stickerAdmin) {
        this.stickerAdmin = stickerAdmin
    }

    public Integer getSearchInCompanyRelation() {
        return searchInCompanyRelation
    }

    public void setSearchInCompanyRelation(Integer searchInCompanyRelation) {
        this.searchInCompanyRelation = searchInCompanyRelation
    }

}

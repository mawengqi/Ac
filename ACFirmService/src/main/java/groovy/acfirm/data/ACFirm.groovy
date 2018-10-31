package acfirm.data

import acfirm.language.ACLanguage
import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/26
 */
@DBDocument(collectionClass = "acuser.db.ACFirmCollection")
class ACFirm extends DataObject{
    /**
     * domain
     * firmName
     * logo
     * website
     * description
     * createTime
     * suspendTime
     * contactEmail
     * numberOfFirmUser
     * currentUserNumber
     * voicecallMaxParticipants
     * presenterMaxParticipants
     * ldapEnable
     * ldapType
     * ldapLmsUrl
     * amServer
     * videoServer
     * language
     * adminIds
     * firmLdapInfo
     */
    public static final String FIELD_DOMAIN = "fid"
    public static final String FIELD_FIRMNAME = "name"
    public static final String FIELD_LOGO = "logo"
    public static final String FIELD_WEBSITE = "site"
    public static final String FIELD_DESCRIPTION = "desp"
    public static final String FIELD_CREATETIME = "ctime"
    public static final String FIELD_SUSPENDTIME = "stime"
    public static final String FIELD_CONTACTEMAIL = "cmail"
    public static final String FIELD_CONTACTADDRESS = "cadd"
    public static final String FIELD_NUMBEROFFIRMUSER = "nfu"
    public static final String FIELD_CURRENTUSERNUMBER = "cnum"
    public static final String FIELD_VOICECALLMAXPARTICIPANTS = "vcmp"
    public static final String FIELD_PRESENTERMAXPARTICIPANTS = "pmp"
    public static final String FIELD_LDAPENABLE = "lenable"
    public static final String FIELD_LDAPTYPE = "ltype"
    public static final String FIELD_LDAPLMSURL = "lmsurl"
    public static final String FIELD_AMSERVER = "am"
    public static final String FIELD_VIDEOSERVER = "vserver"
    public static final String FIELD_LANGUAGE = "la"
    public static final String FIELD_ADMINIDS = "admn"
    public static final String FIELD_FIRMLDAPINFO = "flinfo"

//    public static final String FIELD_TYPE = "type"
//    public static final String FIELD_ACCOUNT_LDAP = "ac_" + Account.TYPE_LDAP
    
    @DocumentField(key = "fid")
    private String domain
    @DocumentField(key = "name")
    private String firmName
    @DocumentField(key = "logo")
    private String logo
    @DocumentField(key = "site")
    private String website
    @DocumentField(key = "desp")
    private String description
    @DocumentField(key = "ctime")
    private Long createTime
    @DocumentField(key = "stime")
    private Long suspendTime
    @DocumentField(key = "cmail")
    private String contactEmail
    @DocumentField(key = "cadd")
    private String contactAddress
    @DocumentField(key = "nfu")
    private Integer numberOfFirmUser
    @DocumentField(key = "cnum")
    private Integer currentUserNumber
    @DocumentField(key = "vcmp")
    private Integer voicecallMaxParticipants
    @DocumentField(key = "pmp")
    private Integer presenterMaxParticipants
    @DocumentField(key = "lenable")
    private Boolean ldapEnable
    @DocumentField(key = "ltype")
    private String ldapType
    @DocumentField(key = "lmsurl")
    private String ldapLmsUrl
    @DocumentField(key = "am")
    private String amServer
    @DocumentField(key = "vserver")
    private String videoServer
    @DocumentField(key = "la")
    private ACLanguage language
    @DocumentField(key = "admn")
    private List<String> adminIds
    @DocumentField(key = "flinfo")
    private ACFirmLdapInfo firmLdapInfo

    public Document toDocument(){
        Document document = new Document()
        document.append(FIELD_DOMAIN, domain)
                .append(FIELD_FIRMNAME, firmName)
                .append(FIELD_LOGO, logo)
                .append(FIELD_WEBSITE, website)
                .append(FIELD_DESCRIPTION, description)
                .append(FIELD_CREATETIME, createTime)
                .append(FIELD_SUSPENDTIME, suspendTime)
                .append(FIELD_CONTACTEMAIL, contactEmail)
                .append(FIELD_CONTACTADDRESS, contactAddress)
                .append(FIELD_NUMBEROFFIRMUSER, numberOfFirmUser)
                .append(FIELD_CURRENTUSERNUMBER, currentUserNumber)
                .append(FIELD_VOICECALLMAXPARTICIPANTS, voicecallMaxParticipants)
                .append(FIELD_PRESENTERMAXPARTICIPANTS, presenterMaxParticipants)
                .append(FIELD_LDAPENABLE, ldapEnable)
                .append(FIELD_LDAPTYPE, ldapType)
                .append(FIELD_LDAPLMSURL, ldapLmsUrl)
                .append(FIELD_AMSERVER, amServer)
                .append(FIELD_VIDEOSERVER, videoServer)
                .append(FIELD_LANGUAGE, language)
                .append(FIELD_ADMINIDS, adminIds)
                .append(FIELD_FIRMLDAPINFO,firmLdapInfo)
        return document
    }

    String getDomain() {
        return domain
    }

    void setDomain(String domain) {
        this.domain = domain
    }

    String getFirmName() {
        return firmName
    }

    void setFirmName(String firmName) {
        this.firmName = firmName
    }

    String getLogo() {
        return logo
    }

    void setLogo(String logo) {
        this.logo = logo
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

    Long getSuspendTime() {
        return suspendTime
    }

    void setSuspendTime(Long suspendTime) {
        this.suspendTime = suspendTime
    }

    String getContactEmail() {
        return contactEmail
    }

    void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail
    }

    String getContactAddress() {
        return contactAddress
    }

    void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress
    }

    Integer getNumberOfFirmUser() {
        return numberOfFirmUser
    }

    void setNumberOfFirmUser(Integer numberOfFirmUser) {
        this.numberOfFirmUser = numberOfFirmUser
    }

    Integer getCurrentUserNumber() {
        return currentUserNumber
    }

    void setCurrentUserNumber(Integer currentUserNumber) {
        this.currentUserNumber = currentUserNumber
    }

    Integer getVoicecallMaxParticipants() {
        return voicecallMaxParticipants
    }

    void setVoicecallMaxParticipants(Integer voicecallMaxParticipants) {
        this.voicecallMaxParticipants = voicecallMaxParticipants
    }

    Integer getPresenterMaxParticipants() {
        return presenterMaxParticipants
    }

    void setPresenterMaxParticipants(Integer presenterMaxParticipants) {
        this.presenterMaxParticipants = presenterMaxParticipants
    }

    Boolean getLdapEnable() {
        return ldapEnable
    }

    void setLdapEnable(Boolean ldapEnable) {
        this.ldapEnable = ldapEnable
    }

    String getLdapType() {
        return ldapType
    }

    void setLdapType(String ldapType) {
        this.ldapType = ldapType
    }

    String getLdapLmsUrl() {
        return ldapLmsUrl
    }

    void setLdapLmsUrl(String ldapLmsUrl) {
        this.ldapLmsUrl = ldapLmsUrl
    }

    String getAmServer() {
        return amServer
    }

    void setAmServer(String amServer) {
        this.amServer = amServer
    }

    String getVideoServer() {
        return videoServer
    }

    void setVideoServer(String videoServer) {
        this.videoServer = videoServer
    }

    ACLanguage getLanguage() {
        return language
    }

    void setLanguage(ACLanguage language) {
        this.language = language
    }

    List<String> getAdminIds() {
        return adminIds
    }

    void setAdminIds(List<String> adminIds) {
        this.adminIds = adminIds
    }

    ACFirmLdapInfo getFirmLdapInfo() {
        return firmLdapInfo
    }

    void setFirmLdapInfo(ACFirmLdapInfo firmLdapInfo) {
        this.firmLdapInfo = firmLdapInfo
    }
}

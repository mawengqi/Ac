package acuser.data

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument(collectionClass = "")
class ACUserSession extends DataObject{
    public static final String FIELD_TERMINAL = "ter"
    public static final String FIELD_USERAGENT = "ua"
    public static final String FIELD_IP = "ip"
    public static final String FIELD_DEVICETOKEN = "did"
    public static final String FIELD_USERID = "uid"
    public static final String FIELD_AUTHORIZATIONCODE = "code"
    public static final String FIELD_AUTHORIZATIONEXPIRETIME = "aexp"
    public static final String FIELD_ACCESSTOKEN = "at"
    public static final String FIELD_REFRESHTOKEN = "rt"
    public static final String FIELD_CLIENTID = "cid"
    public static final String FIELD_REDIRECTURI = "uri"
    public static final String FIELD_TOKENEXPIRETIME = "expr"
    public static final String FIELD_TIME = "time"
    public static final String FIELD_AUTHORIZED = "used"
    public static final String FIELD_FIRMID = "fid"
    public static final String FIELD_LOGINACCOUNT = "acc"
    public static final String FIELD_SUBDOMAIN = "do"

    public static final String FIELD_BRAND = "brand"
    public static final String FIELD_MODEL = "model"
    public static final String FIELD_VERSION = "version"
    
    @DocumentField(key = "acc")
    private String loginAccount
    @DocumentField(key = "uid")
    private String userId
    @DocumentField(key = "fid")
    private String firmId
    @DocumentField(key = "code")
    private String authorizationCode
    @DocumentField(key = "aexp")
    private Long authorizationExpireTime
    @DocumentField(key = "at")
    private String accessToken
    @DocumentField(key = "rt")
    private String refreshToken
    @DocumentField(key = "cid")
    private String clientId
    @DocumentField(key = "uri")
    private String redirectUri
    @DocumentField(key = "expr")
    private Long tokenExpireTime
    @DocumentField(key = "time")
    private Long time
    @DocumentField(key = "did")
    private String deviceToken
    @DocumentField(key = "ua")
    private String userAgent
    @DocumentField(key = "ip")
    private String ip
    @DocumentField(key = "ter")
    private String terminal
    @DocumentField(key = "brand")
    private String brand
    @DocumentField(key = "model")
    private String model
    @DocumentField(key = "version")
    private String version
    @DocumentField(key = "do")
    private String subDomain
    @DocumentField(key = "used")
    private Boolean authorized

    public Document toDocument(){
        Document document = new Document()
        document.append(FIELD_TERMINAL, terminal)
                .append(FIELD_USERAGENT, userAgent)
                .append(FIELD_IP,ip)
                .append(FIELD_DEVICETOKEN, deviceToken)
                .append(FIELD_USERID, userId)
                .append(FIELD_AUTHORIZATIONCODE, authorizationCode)
                .append(FIELD_AUTHORIZATIONEXPIRETIME, authorizationExpireTime)
                .append(FIELD_ACCESSTOKEN, accessToken)
                .append(FIELD_REFRESHTOKEN, refreshToken)
                .append(FIELD_CLIENTID, clientId)
                .append(FIELD_REDIRECTURI, redirectUri)
                .append(FIELD_TOKENEXPIRETIME, tokenExpireTime)
                .append(FIELD_TIME, time)
                .append(FIELD_AUTHORIZED,authorized)
                .append(FIELD_FIRMID, firmId)
                .append(FIELD_LOGINACCOUNT, loginAccount)
                .append(FIELD_SUBDOMAIN, subDomain)
                .append(FIELD_BRAND, brand)
                .append(FIELD_MODEL, model)
                .append(FIELD_VERSION)
    }
    String getLoginAccount() {
        return loginAccount
    }

    void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount
    }

    String getUserId() {
        return userId
    }

    void setUserId(String userId) {
        this.userId = userId
    }

    String getFirmId() {
        return firmId
    }

    void setFirmId(String firmId) {
        this.firmId = firmId
    }

    String getAuthorizationCode() {
        return authorizationCode
    }

    void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode
    }

    Long getAuthorizationExpireTime() {
        return authorizationExpireTime
    }

    void setAuthorizationExpireTime(Long authorizationExpireTime) {
        this.authorizationExpireTime = authorizationExpireTime
    }

    String getAccessToken() {
        return accessToken
    }

    void setAccessToken(String accessToken) {
        this.accessToken = accessToken
    }

    String getRefreshToken() {
        return refreshToken
    }

    void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken
    }

    String getClientId() {
        return clientId
    }

    void setClientId(String clientId) {
        this.clientId = clientId
    }

    String getRedirectUri() {
        return redirectUri
    }

    void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri
    }

    Long getTokenExpireTime() {
        return tokenExpireTime
    }

    void setTokenExpireTime(Long tokenExpireTime) {
        this.tokenExpireTime = tokenExpireTime
    }

    Long getTime() {
        return time
    }

    void setTime(Long time) {
        this.time = time
    }

    String getDeviceToken() {
        return deviceToken
    }

    void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken
    }

    String getUserAgent() {
        return userAgent
    }

    void setUserAgent(String userAgent) {
        this.userAgent = userAgent
    }

    String getIp() {
        return ip
    }

    void setIp(String ip) {
        this.ip = ip
    }

    String getTerminal() {
        return terminal
    }

    void setTerminal(String terminal) {
        this.terminal = terminal
    }

    String getBrand() {
        return brand
    }

    void setBrand(String brand) {
        this.brand = brand
    }

    String getModel() {
        return model
    }

    void setModel(String model) {
        this.model = model
    }

    String getVersion() {
        return version
    }

    void setVersion(String version) {
        this.version = version
    }

    String getSubDomain() {
        return subDomain
    }

    void setSubDomain(String subDomain) {
        this.subDomain = subDomain
    }

    Boolean getAuthorized() {
        return authorized
    }

    void setAuthorized(Boolean authorized) {
        this.authorized = authorized
    }
}

package actopic.data.status

import com.mongodb.DBObject
import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject
import org.bson.Document

import java.util.concurrent.ConcurrentHashMap

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument(collectionClass = "")
class ACUserStatus extends DataObject{
    public static final String FIELD_USERID = "uid"
    public static final String FIELD_FIRMID = "fid"
    public static final String FIELD_CHATSTATUSMAP = "chat"
    public static final String FIELD_READTIMESTATUSMAP = "rt"
    public static final String FIELD_MUTECHATMAP = "mutechat"
    public static final String FIELD_URLSTATUSMAP = "url"
    public static final String FIELD_DEVICETOKENMAP = "dt"
    public static final String FIELD_TIME = "time"
    public static final String FIELD_VIEWABLEUSERGROUP = "vug"
    public static final String FIELD_LONGITUDELATITUDE = "loc"
    public static final String FIELD_LOCATIONTERMINAL = "lter"
    public static final String FIELD_LOCATIONTIME = "ltim"
    public static final String FIELD_KEEPONLINE = "on"
    public static final String FIELD_NOTIFICATION = "noty"
    public static final String FIELD_STICKERS = "st"
    public static final String FIELD_READNOTETIME = "rnt"
    @DocumentField(key = "uid")
    private String userId
    @DocumentField(key = "fid")
    private String firmId
    @DocumentField(key = "time")
    private Long time
    @DocumentField(key = "st")
    private List<String> stickers
    @DocumentField(key = "mutechat")
    private List<String> muteChatIds
    @DocumentField(key = "chat")
    private Document chatStatus
    @DocumentField(key = "rt")
    private Document readTimeStatus
    @DocumentField(key = "url")
    private Document urlStatus
    @DocumentField(key = "dt")
    private ConcurrentHashMap<String, ACDeviceToken> deviceTokenMap
    @DocumentField(key = "vug")
    private List<ACViewableUserGroup> viewableUserGroups
    @DocumentField(key = "loc")
    private List<Double> longitudeLatitude
    @DocumentField(key = "ltim")
    private Long locationTime
    @DocumentField(key = "lter")
    private String locationTerminal
    @DocumentField(key = "on")
    private Boolean keepOnline
    @DocumentField(key = "noty")
    private DBObject notification
    @DocumentField(key = "rnt")
    private Long readNoteTime

    public  Document toDocument(){
        Document document = new Document()
        document.append(FIELD_USERID, userId)
                .append(FIELD_LONGITUDELATITUDE, longitudeLatitude)
                .append(FIELD_LOCATIONTERMINAL, locationTerminal)
                .append(FIELD_LOCATIONTIME, locationTime)
                .append(FIELD_FIRMID, firmId)
                .append(FIELD_TIME, time)
                .append(FIELD_CHATSTATUSMAP, chatStatus)
                .append(FIELD_READTIMESTATUSMAP, readTimeStatus)
                .append(FIELD_URLSTATUSMAP, urlStatus)
                .append(FIELD_STICKERS, stickers)
                .append(FIELD_KEEPONLINE, keepOnline)
                .append(FIELD_NOTIFICATION, notification)
                .append(FIELD_NOTIFICATION, readNoteTime)
        return document
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

    Long getTime() {
        return time
    }

    void setTime(Long time) {
        this.time = time
    }

    List<String> getStickers() {
        return stickers
    }

    void setStickers(List<String> stickers) {
        this.stickers = stickers
    }

    List<String> getMuteChatIds() {
        return muteChatIds
    }

    void setMuteChatIds(List<String> muteChatIds) {
        this.muteChatIds = muteChatIds
    }

    Document getChatStatus() {
        return chatStatus
    }

    void setChatStatus(Document chatStatus) {
        this.chatStatus = chatStatus
    }

    Document getReadTimeStatus() {
        return readTimeStatus
    }

    void setReadTimeStatus(Document readTimeStatus) {
        this.readTimeStatus = readTimeStatus
    }

    Document getUrlStatus() {
        return urlStatus
    }

    void setUrlStatus(Document urlStatus) {
        this.urlStatus = urlStatus
    }

    ConcurrentHashMap<String, ACDeviceToken> getDeviceTokenMap() {
        return deviceTokenMap
    }

    void setDeviceTokenMap(ConcurrentHashMap<String, ACDeviceToken> deviceTokenMap) {
        this.deviceTokenMap = deviceTokenMap
    }

    List<ACViewableUserGroup> getViewableUserGroups() {
        return viewableUserGroups
    }

    void setViewableUserGroups(List<ACViewableUserGroup> viewableUserGroups) {
        this.viewableUserGroups = viewableUserGroups
    }

    List<Double> getLongitudeLatitude() {
        return longitudeLatitude
    }

    void setLongitudeLatitude(List<Double> longitudeLatitude) {
        this.longitudeLatitude = longitudeLatitude
    }

    Long getLocationTime() {
        return locationTime
    }

    void setLocationTime(Long locationTime) {
        this.locationTime = locationTime
    }

    String getLocationTerminal() {
        return locationTerminal
    }

    void setLocationTerminal(String locationTerminal) {
        this.locationTerminal = locationTerminal
    }

    Boolean getKeepOnline() {
        return keepOnline
    }

    void setKeepOnline(Boolean keepOnline) {
        this.keepOnline = keepOnline
    }

    DBObject getNotification() {
        return notification
    }

    void setNotification(DBObject notification) {
        this.notification = notification
    }

    Long getReadNoteTime() {
        return readNoteTime
    }

    void setReadNoteTime(Long readNoteTime) {
        this.readNoteTime = readNoteTime
    }
}

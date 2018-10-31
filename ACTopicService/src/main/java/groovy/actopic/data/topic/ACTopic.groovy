package actopic.data.topic

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/31
 */
@DBDocument(collectionClass = "")
class ACTopic extends DataObject{
    public static final String TAG = ACTopic.class.getSimpleName()

    public static final String IDNEX_TYPE = "topic"
    public static final String CONTENTTYPE_TEXT = "text"
    public static final String CONTENTTYPE_VIDEOCALL = "videocall"
    public static final String CONTENTTYPE_VIDEOCHAT = "videochat"
    public static final String CONTENTTYPE_AUDIOCALL = "audiocall"
    public static final String CONTENTTYPE_VOICECALL = "voicecall" //free rtc call
    public static final String CONTENTTYPE_PTTCALL = "pttcall" //charged rtc call
    public static final String CONTENTTYPE_HTML = "html"  //html is the html contect that no need to download.
    public static final String CONTENTTYPE_LINK = "link"  //link is the html link that need to downlad.
    public static final String CONTENTTYPE_IMAGE = "image"
    public static final String CONTENTTYPE_AUDIO = "audio"
    public static final String CONTENTTYPE_VIDEO = "video"
    public static final String CONTENTTYPE_CONTACT = "contact"
    public static final String CONTENTTYPE_LOCATION = "location"
    public static final String CONTENTTYPE_FILE = "file"
    public static final String CONTENTTYPE_RICHTEXT = "rich" // AcuLearn defined mobile friendly json content. it can describe text, image, button, checkbox, radiobox, link in vertical layout.   
    public static final String CONTENTTYPE_STICKER = "sticker"
    public static final String CONTENTTYPE_SYSTEM = "system"
    public static final String CONTENTTYPE_SHARELOCATION = "sharelocation"

    public static final String FIELD_CREATETIME = "ctime"
    public static final String FIELD_UPDATETIME = "utime"
    public static final String FIELD_USERID = "uid"
    public static final String FIELD_CONTENTTYPE = "ctp"
    public static final String FIELD_CONTENT = "c"
    public static final String FIELD_COMEFROM = "from"
    public static final String FIELD_PARENTTOPICID = "ptid"
    public static final String FIELD_FIRMID = "fid"
    public static final String FIELD_SEQUENCE = "seq"
    public static final String FIELD_LONGITUDELATITUDE = "loc"
    public static final String FIELD_CLIENTID = "cid"
    public static final String FIELD_ATUSERS = "at"
    public static final String FIELD_RECALLED = "recall"
    @DocumentField(key = "loc")
	private List<Double> longitudeLatitude
    @DocumentField(key = "ctime")
	private Long createTime
    @DocumentField(key = "utime")
	private Long updateTime
    @DocumentField(key = "uid")
	private String userId
    @DocumentField(key = "ctp")
	private String contentType
    @DocumentField(key = "c")
	private Object content
    @DocumentField(key = "from")
	private String comeFrom
    @DocumentField(key = "ptid")
	private String parentTopicId
	@DocumentField(key = "fid")
	private String firmId
    @DocumentField(key = "seq")
	private Long sequence
    @DocumentField(key = "cid")
	private String clientId
    @DocumentField(key = "at")
	private String[] atUsers
    @DocumentField(key = "recall")
	private Boolean recalled = false

    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_CREATETIME, createTime)
                .append(FIELD_UPDATETIME, updateTime)
                .append(FIELD_USERID, userId)
                .append(FIELD_CONTENTTYPE, contentType)
                .append(FIELD_COMEFROM, comeFrom)
                .append(FIELD_PARENTTOPICID, parentTopicId)
                .append(FIELD_FIRMID, firmId)
                .append(FIELD_SEQUENCE, sequence)
                .append(FIELD_RECALLED, recalled)
                .append(FIELD_ATUSERS, atUsers)
                .append(FIELD_CONTENT, content)
                .append(FIELD_LONGITUDELATITUDE, longitudeLatitude)
                .append(FIELD_CLIENTID, clientId)
        return document
    }

    List<Double> getLongitudeLatitude() {
        return longitudeLatitude
    }

    void setLongitudeLatitude(List<Double> longitudeLatitude) {
        this.longitudeLatitude = longitudeLatitude
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

    String getUserId() {
        return userId
    }

    void setUserId(String userId) {
        this.userId = userId
    }

    String getContentType() {
        return contentType
    }

    void setContentType(String contentType) {
        this.contentType = contentType
    }

    Object getContent() {
        return content
    }

    void setContent(Object content) {
        this.content = content
    }

    String getComeFrom() {
        return comeFrom
    }

    void setComeFrom(String comeFrom) {
        this.comeFrom = comeFrom
    }

    String getParentTopicId() {
        return parentTopicId
    }

    void setParentTopicId(String parentTopicId) {
        this.parentTopicId = parentTopicId
    }

    String getFirmId() {
        return firmId
    }

    void setFirmId(String firmId) {
        this.firmId = firmId
    }

    Long getSequence() {
        return sequence
    }

    void setSequence(Long sequence) {
        this.sequence = sequence
    }

    String getClientId() {
        return clientId
    }

    void setClientId(String clientId) {
        this.clientId = clientId
    }

    String[] getAtUsers() {
        return atUsers
    }

    void setAtUsers(String[] atUsers) {
        this.atUsers = atUsers
    }

    Boolean getRecalled() {
        return recalled
    }

    void setRecalled(Boolean recalled) {
        this.recalled = recalled
    }
}

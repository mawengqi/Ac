package acfirm.data

import com.mongodb.BasicDBList
import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument(collectionClass = "")
class ACStickerSuit extends DataObject{
    public static final String FIELD_CATEGORY_ID = "cid"
    public static final String FIELD_CREATE_TIME = "ct"
    public static final String FIELD_DESC = "desc"
    public static final String FIELD_EXPIRED_DATE = "ed"
    public static final String FIELD_FIRM_ID = "fid"
    public static final String FIELD_NAME = "sn"
    public static final String FIELD_OVERVIEW_RES_IDS = "oids"
    public static final String FIELD_STICKERS = "sts"
    public static final String FIELD_THUMBNAIL = "thn"
    public static final String FIELD_UPDATE_TIME = "ut"
    public static final String FIELD_UPLOADER = "uu"
    public static final String FIELD_ZIP_FILE_RES_ID = "zid"
    private static final String FIELD_ZIP_SIZE = "zsize"
    @DocumentField(key = "cid")
    private String categoryId
    @DocumentField(key = "ct")
    private Long createTime
    @DocumentField(key = "desc")
    private String desc
    @DocumentField(key = "ed")
    private Long expiredDate
    @DocumentField(key = "fid")
    private String firmId
    @DocumentField(key = "sn")
    private String name
    @DocumentField(key = "oids")
    private BasicDBList overviewResIds
    @DocumentField(key = "sts")
    private List<ACSticker> stickers
    @DocumentField(key = "thn")
    private String thumbnailId
    @DocumentField(key = "ut")
    private Long updateTime
    @DocumentField(key = "uu")
    private String uploaderId
    @DocumentField(key = "zip")
    private String zipId
    @DocumentField(key = "zsize")
    private Long zipSize

    public Document toDocument(){
        Document document = new Document()
        document.append(FIELD_EXPIRED_DATE, expiredDate)
                .append(FIELD_NAME, name)
                .append(FIELD_CATEGORY_ID, categoryId)
                .append(FIELD_FIRM_ID, firmId)
                .append(FIELD_STICKERS, stickers)
                .append(FIELD_OVERVIEW_RES_IDS, overviewResIds)
                .append(FIELD_DESC, desc)
                .append(FIELD_CREATE_TIME, createTime)
                .append(FIELD_UPDATE_TIME, updateTime)
                .append(FIELD_THUMBNAIL, thumbnailId)
                .append(FIELD_ZIP_FILE_RES_ID, zipId)
                .append(FIELD_ZIP_SIZE, zipSize)
                .append(FIELD_UPLOADER, uploaderId)
        return document
    }

    String getCategoryId() {
        return categoryId
    }

    void setCategoryId(String categoryId) {
        this.categoryId = categoryId
    }

    Long getCreateTime() {
        return createTime
    }

    void setCreateTime(Long createTime) {
        this.createTime = createTime
    }

    String getDesc() {
        return desc
    }

    void setDesc(String desc) {
        this.desc = desc
    }

    Long getExpiredDate() {
        return expiredDate
    }

    void setExpiredDate(Long expiredDate) {
        this.expiredDate = expiredDate
    }

    String getFirmId() {
        return firmId
    }

    void setFirmId(String firmId) {
        this.firmId = firmId
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    BasicDBList getOverviewResIds() {
        return overviewResIds
    }

    void setOverviewResIds(BasicDBList overviewResIds) {
        this.overviewResIds = overviewResIds
    }

    List<ACSticker> getStickers() {
        return stickers
    }

    void setStickers(List<ACSticker> stickers) {
        this.stickers = stickers
    }

    String getThumbnailId() {
        return thumbnailId
    }

    void setThumbnailId(String thumbnailId) {
        this.thumbnailId = thumbnailId
    }

    Long getUpdateTime() {
        return updateTime
    }

    void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime
    }

    String getUploaderId() {
        return uploaderId
    }

    void setUploaderId(String uploaderId) {
        this.uploaderId = uploaderId
    }

    String getZipId() {
        return zipId
    }

    void setZipId(String zipId) {
        this.zipId = zipId
    }

    Long getZipSize() {
        return zipSize
    }

    void setZipSize(Long zipSize) {
        this.zipSize = zipSize
    }
}

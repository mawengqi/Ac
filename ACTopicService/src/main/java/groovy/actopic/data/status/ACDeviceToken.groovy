package actopic.data.status

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument(collectionClass = "")
class ACDeviceToken extends DataObject{
    public static final String TOKENFORSIMULATOR = "TOKENFORSIMULATOR"
    public static final String TERMINAL_ANDROID = "android"
    public static final String TERMINAL_IOS = "ios"
    public static final String TERMINAL_WINDOWSPHONE = "wp"
    public static final String TERMINAL_WEB = "web"
    public static final String TERMINAL_PCWEB = "pcweb"
    public static final String TERMINAL_MACWEB = "macweb"
    public static final String TERMINAL_PCCLIENT = "pc"
    public static final String TERMINAL_SYSTEM = "system"

    public static final String FIELD_TERMINAL = "type"
    public static final String FIELD_TOKEN = "token"
    public static final String FIELD_TIME = "time"
    public static final String FIELD_LOCALE = "locale"

    public static final String FIELD_BRAND = "brand"
    public static final String FIELD_MODEL = "model"
    public static final String FIELD_VERSION = "version"
    @DocumentField(key = "type")
    private String terminal
    @DocumentField(key = "token")
    private String deviceToken
    @DocumentField(key = "time")
    private Long time
    @DocumentField(key = "locale")
    private String locale
    @DocumentField(key = "brand")
    private String brand
    @DocumentField(key = "model")
    private String model
    @DocumentField(key = "version")
    private String version

    public Document toDocument(){
        Document document = new Document()
        document.append(FIELD_TERMINAL, terminal)
                .append(FIELD_TOKEN, deviceToken)
                .append(FIELD_TIME, time)
                .append(FIELD_LOCALE, locale)
                .append(FIELD_BRAND, brand)
                .append(FIELD_MODEL, model)
                .append(FIELD_VERSION, version)
        return document
    }

    String getTerminal() {
        return terminal
    }

    void setTerminal(String terminal) {
        this.terminal = terminal
    }

    String getDeviceToken() {
        return deviceToken
    }

    void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken
    }

    Long getTime() {
        return time
    }

    void setTime(Long time) {
        this.time = time
    }

    String getLocale() {
        return locale
    }

    void setLocale(String locale) {
        this.locale = locale
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
}

package acfirm.data

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.codec.BaseObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/26
 */
@DBDocument
class ACFirmLdapInfo extends BaseObject{
    /**
     * connStr
     */
    public static final String FIELD_CONNECTION_STRING = "constr";
    private String connStr;

    public Document toDocument(){
        Document document = new Document()
        document.append(FIELD_CONNECTION_STRING, connStr)
        return document
    }
    public String getConnStr() {
        return connStr
    }

    public void setConnStr(String connStr) {
        this.connStr = connStr
    }
}

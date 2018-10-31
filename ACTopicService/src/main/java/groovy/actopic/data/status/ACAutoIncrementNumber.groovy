package actopic.data.status

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument(collectionClass = "")
class ACAutoIncrementNumber extends DataObject{
    public static final String FIELD_AUTOINCREMENTNUMBER_NUMBER = "num"
    @DocumentField(key = "num")
    private Long number;
    public Document toDocument(){
        Document document = new Document()
        document.append(FIELD_AUTOINCREMENTNUMBER_NUMBER, number)
        return document
    }
    Long getNumber() {
        return number
    }

    void setNumber(Long number) {
        this.number = number
    }
}

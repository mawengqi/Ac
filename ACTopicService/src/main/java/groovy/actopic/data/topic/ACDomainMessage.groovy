package actopic.data.topic

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument
abstract class ACDomainMessage extends ACMessage{
    public static final String SEPERATOR = "_"
    public static final String FIELD_DOMAIN = "domain"
    @DocumentField(key = "domain")
    private String domain

    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_DOMAIN, domain)
        return document
    }

    public String getFilterMatch(Integer match) {
        if(match != null) {
            switch(match) {
                case FILTERMATCH_QUEUEID:
                    return domain;
            }
        }
        return null;
    }

    String getDomain() {
        return domain
    }

    void setDomain(String domain) {
        this.domain = domain
    }
}

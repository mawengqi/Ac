package actopic.data.entity

import com.mongodb.BasicDBList
import com.mongodb.BasicDBObject
import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject
import org.bson.Document

import java.util.concurrent.ConcurrentSkipListMap

/**
 * Created by wenqi on 2018/10/30
 */
@DBDocument(collectionClass = "")
class ACShareLocationStatus extends DataObject{
    public static final String SERVER_NONE = "na";
    public static final String FIELD_SHARELOCATIONSTATUS_TOPICENTITYID = "teid";
    public static final String FIELD_SHARELOCATIONSTATUS_SERVER = "s";
    public static final String FIELD_SHARELOCATIONSTATUS_LOCATIONUSERIDSMAP = "map";
    public static final String FIELD_SHARELOCATIONSTATUS_SENDERIDS = "sids";
    public static final String FIELD_SHARELOCATIONSTATUS_LOCATIONUSERIDSMAP_USERID = "uid";
    public static final String FIELD_SHARELOCATIONSTATUS_LOCATIONUSERIDSMAP_LOCATION = "loc";
    public static final String FIELD_SHARELOCATIONSTATUS_LOCATIONUSERIDSMAP_SERVER = "s";
    public static final String FIELD_SHARELOCATIONSTATUS_LOCATIONUSERIDSMAP_UPDATETIME = "ut";
    @DocumentField(key = "teid")
    private String topicEntityId;
    @DocumentField(key = "s")
    private String server;
    @DocumentField(key = "loc")
    private ConcurrentSkipListMap<String, ACUserLocation> userIdLocationMap = new ConcurrentSkipListMap<>();;
    @DocumentField(key = "sids")
    private HashSet<String> senderIds;
    private Object lock = new int[0];

    Document toDocument(){
        Document document = new Document()
        if(userIdLocationMap != null) {
            BasicDBList locUserIdList = new BasicDBList();
            for(String userId : userIdLocationMap.keySet()) {
                BasicDBObject userObj = new BasicDBObject();
                ACUserLocation ul = userIdLocationMap.get(userId);
                userObj.put(FIELD_SHARELOCATIONSTATUS_LOCATIONUSERIDSMAP_LOCATION, [ul.getLongitude(), ul.getLatitude()] as Double[]);
                userObj.put(FIELD_SHARELOCATIONSTATUS_LOCATIONUSERIDSMAP_USERID, userId);
                userObj.put(FIELD_SHARELOCATIONSTATUS_LOCATIONUSERIDSMAP_SERVER, ul.getServer());
                userObj.put(FIELD_SHARELOCATIONSTATUS_LOCATIONUSERIDSMAP_UPDATETIME, ul.getLastUpateTime());
                locUserIdList.add(userObj);

            }
            dbObj.put(FIELD_SHARELOCATIONSTATUS_LOCATIONUSERIDSMAP, locUserIdList);
        }
        document.append(FIELD_SHARELOCATIONSTATUS_SENDERIDS, senderIds)
                .append(FIELD_SHARELOCATIONSTATUS_SERVER, server)
                .append(FIELD_SHARELOCATIONSTATUS_TOPICENTITYID, topicEntityId)

    }

    String getTopicEntityId() {
        return topicEntityId
    }

    void setTopicEntityId(String topicEntityId) {
        this.topicEntityId = topicEntityId
    }

    String getServer() {
        return server
    }

    void setServer(String server) {
        this.server = server
    }

    ConcurrentSkipListMap<String, ACUserLocation> getUserIdLocationMap() {
        return userIdLocationMap
    }

    void setUserIdLocationMap(ConcurrentSkipListMap<String, ACUserLocation> userIdLocationMap) {
        this.userIdLocationMap = userIdLocationMap
    }

    HashSet<String> getSenderIds() {
        return senderIds
    }

    void setSenderIds(HashSet<String> senderIds) {
        this.senderIds = senderIds
    }

}

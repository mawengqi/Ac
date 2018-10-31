package actopic.data.entity

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.annotations.DocumentField
import connectors.mongodb.codec.DataObject

import java.util.concurrent.ConcurrentSkipListMap

/**
 * Created by wenqi on 2018/10/31
 */
@DBDocument(collectionClass = "")
class ACTopicEntityReadStatus extends DataObject{\
    /**
     * This is only for memory opitimization.
     */
    public static final String SERVER_NONE = "na";
    public static final String FIELD_TOPICENTITYSTATUS_TOPICENTITYID = "teid";
    public static final String FIELD_TOPICENTITYSTATUS_SERVER = "s";
    public static final String FIELD_TOPICENTITYSTATUS_SEQUENCEUSERIDSMAP = "map";
    public static final String FIELD_TOPICENTITYSTATUS_SENDERIDS = "sids";
    public static final String FIELD_TOPICENTITYSTATUS_SEQUENCEUSERIDSMAP_USERID = "uid";
    public static final String FIELD_TOPICENTITYSTATUS_SEQUENCEUSERIDSMAP_SEQUENCEREAD = "seq";
    public static final String FIELD_TOPICENTITYSTATUS_SEQUENCEUSERIDSMAP_SEQUENCESEND = "msg";
    private static SequenceComparator comparator = new SequenceComparator()

    private ConcurrentSkipListMap<String, HashSet<String>> userIdMap;
    private ConcurrentSkipListMap<String, Long> userIdSeqMap;
    @DocumentField(key = "sids")
    private HashSet<String> senderIds;
    @DocumentField(key = "teid")
    private String topicEntityId;
    @DocumentField(key = "s")
    private String server;
    @DocumentField(key = "map")
    private ConcurrentSkipListMap<Long, HashSet<String>> sequenceUserIdsMap;


}

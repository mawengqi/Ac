package acfirm.data

import com.mongodb.BasicDBList
import com.mongodb.BasicDBObject
import com.mongodb.DBObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/30
 */
class ACAcuComClient extends ACClient{
    public static final String SCOPE_LOCATIONALERT = "alert";
    public static final String SCOPE_EVENT = "event";
    public static final String SCOPE_SURVEY = "survey";
    public static final String SCOPE_VIDEO = "video";
    public static final String SCOPE_CLICKER = "clicker";
    public static final String SCOPE_LINK = "link";
    public static final String SCOPE_PAGELINK = "page";
    public static final String SCOPE_WALLBOARD = "wallboard";
    public static final String SCOPE_WALLBOARDROBOT = "wallboardrobot";
    public static final String FIELD_FIRM_USERPERMISSIONMAP = "perm";
    public static final String FIELD_FIRM_STICKER_CATEGORY = "stca";

    private Map<String, ACUserPermission> userPermissionMap;
    private List<ACStickerCategory> stickerCategories;

    Document toDocument(){
        Document document = new Document()
        if(userPermissionMap != null) {
            BasicDBList permList = new BasicDBList();
            Collection<ACUserPermission> collection = userPermissionMap.values();
            for(ACUserPermission perm : collection) {
                DBObject permObj = perm.toDocument();
                permList.add(permObj);
            }
            document.append(FIELD_FIRM_USERPERMISSIONMAP, permList);
        }
        if (stickerCategories != null) {
            BasicDBList catList = new BasicDBList();
            for (ACStickerCategory cat : stickerCategories) {
                catList.add(cat.toDocument());
            }
            document.put(FIELD_FIRM_STICKER_CATEGORY, catList);
        }
        return document;
    }
    public static String checkScope(String scope) {
        if(scope == null)
            return null;
        String lowerCaseScope = scope.toLowerCase();
        switch (lowerCaseScope) {
            case SCOPE_ALL:
            case SCOPE_BASE:
            case SCOPE_EVENT:
            case SCOPE_LINK:
            case SCOPE_LOCATIONALERT:
            case SCOPE_PAGELINK:
            case SCOPE_SURVEY:
            case SCOPE_VIDEO:
            case SCOPE_CLICKER:
            case SCOPE_WALLBOARD:
            case SCOPE_WALLBOARDROBOT:
                return lowerCaseScope;
            default:
                return null;
        }
    }
    public Map<String, ACUserPermission> getUserPermissionMap() {
        return userPermissionMap;
    }
    public void setUserPermissionMap(Map<String, ACUserPermission> userPermissionMap) {
        this.userPermissionMap = userPermissionMap;
    }

    public List<ACStickerCategory> getStickerCategories() {
        return stickerCategories;
    }

    public void setStickerCategories(List<ACStickerCategory> stickerCategories) {
        this.stickerCategories = stickerCategories;
    }

}

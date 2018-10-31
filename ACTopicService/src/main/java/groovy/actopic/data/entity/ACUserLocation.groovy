package actopic.data.entity

import com.mongodb.BasicDBObject
import com.mongodb.DBObject

/**
 * Created by wenqi on 2018/10/30
 */
class ACUserLocation {
    enum UserLocationAction {
        NoChanges,
        Update
    }

    public final static int EVENT_ACTION_START = 0;
    public final static int EVENT_ACTION_JOIN = 1;
    public final static int EVENT_ACTION_UPDATE = 2;
    public final static int EVENT_ACTION_EXIT =3;


    private String id;
    private String name;
    private String icon;
    private Double la;
    private Double lo;

    private Integer act = EVENT_ACTION_START;
    private String server;

    private Long lastUpateTime;
    private UserLocationAction locationAction = UserLocationAction.NoChanges;

    public void locationActionSaved(){
        locationAction = UserLocationAction.NoChanges;
    }

    public boolean hasUpdated(){
        return locationAction == UserLocationAction.Update;
    }

    public boolean hasExpired(){
        if(lastUpateTime==null)
            return false;
        long diff = System.currentTimeMillis() - lastUpateTime;
        if(diff>10 * 60 * 1000)
            return true;

        return false;
    }

    public DBObject outputDBObject() {
        DBObject dbObj = new BasicDBObject();
        dbObj.put("id", id);
        dbObj.put("name", name);

        if(icon!=null)
            dbObj.put("icon", icon);

        dbObj.put("la", la);
        dbObj.put("lo", lo);
        dbObj.put("s", server);
        return dbObj;
    }

    public DBObject eventDBObject() {
        DBObject dbObj = new BasicDBObject();
        dbObj.put("id", id);
        dbObj.put("name", name);

        if(icon!=null)
            dbObj.put("icon", icon);

        dbObj.put("la", la);
        dbObj.put("lo", lo);
        dbObj.put("s", server);
        dbObj.put("act", act);
        return dbObj;
    }

    public void fromDBObject(DBObject obj) {
        id = (String)obj.get("id");
        server = (String)obj.get("s");
        name = (String)obj.get("name");
        icon = (String)obj.get("icon");
        la = Double.parseDouble(obj.get("la").toString());
        lo = Double.parseDouble(obj.get("lo").toString());
        act = Integer.parseInt(obj.get("act").toString());
    }

    public Integer getAct(){
        return act;
    }

    public void setAct(Integer act){
        this.act = act;
    }

    public String getServer(){
        return server;
    }

    public void setServer(String server){
        this.server = server;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getIcon(){
        return icon;
    }

    public void setIcon(String icon){
        this.icon = icon;
    }

    public Long getLastUpateTime(){
        return lastUpateTime;
    }

    public void SetLastUpateTime(Long lastUpateTime){
        this.lastUpateTime = lastUpateTime;
    }

    public UserLocationAction getLocationAction(){
        return locationAction;
    }
    //longitude and latitude;
    public Double getLatitude(){
        return la;
    }

    public void setLatitude(Double la){

        if(la==null) return;

        if(!la.equals(this.la))
            locationAction = UserLocationAction.Update;

        lastUpateTime = System.currentTimeMillis();

        this.la = la;
    }

    public Double getLongitude(){
        return lo;
    }

    public void setLongitude(Double lo){

        if(lo==null) return;

        if(!lo.equals(this.lo))
            locationAction = UserLocationAction.Update;

        lastUpateTime = System.currentTimeMillis();

        this.lo = lo;
    }
}

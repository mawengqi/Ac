package actopic.data.entity

import connectors.mongodb.annotations.DBDocument
import connectors.mongodb.codec.BaseObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/31
 */
@DBDocument
class ACPermission extends BaseObject{
    private Integer delete = DELETE_ALLOW;
    public static final int DELETE_DENNY = 0;
    public static final int DELETE_ALLOW = 1;
    public static final int DELETE_TERMINATE = 3;

    private Integer update = UPDATE_DENY;
    public static final int UPDATE_DENY = 0;
    public static final int UPDATE_ALLOW = 1;

    private Integer viewSurveyReport = VIEWSURVEYREPORT_DENY;
    public static final int VIEWSURVEYREPORT_DENY = 0;
    public static final int VIEWSURVEYREPORT_ALLOW = 1;
    //preview的意思是只能看，不能做join和submit的操作；availble是不光可以看，还能join或submit;surveyreport的意思是打开survey,是不是直接显示report页面
    private Integer view = VIEW_AVAILABLE;
    public static final int VIEW_PREVIEW = 0;
    public static final int VIEW_AVAILABLE = 1;
    public static final int VIEW_SURVEYREPORT = 2;

    private int addAdmins = ADDADMINS_DENNY;
    public static final int ADDADMINS_DENNY = 0;
    public static final int ADDADMINS_ALLOW = 1;

    private int editParticipants = EDITPARTICIPANTS_DENNY;
    public static final int EDITPARTICIPANTS_DENNY = 0;
    public static final int EDITPARTICIPANTS_ALLOW = 1;

    private int viewParticipants = VIEWPARTICIPANTS_ALLOW;
    public static final int VIEWPARTICIPANTS_DENNY = 0;
    public static final int VIEWPARTICIPANTS_ALLOW = 1;

    public static final String FIELD_URLENTITY_PERMISSION_CANDELETE = "del";
    public static final String FIELD_URLENTITY_PERMISSION_CANUPDATE = "upd";
    public static final String FIELD_URLENTITY_PERMISSION_CANVIEWSURVEYREPORT = "svy";
    public static final String FIELD_URLENTITY_PERMISSION_VIEW = "view";
    public static final String FIELD_URLENTITY_PERMISSION_ADDADMINS = "adm";
    public static final String FIELD_URLENTITY_PERMISSION_EDITPARTICIPANTS = "par";
    public static final String FIELD_URLENTITY_PERMISSION_VIEWPARTICIPANTS = "vpar";

    Document toDocument(){
        Document document = new Document()
        document.append(FIELD_URLENTITY_PERMISSION_CANDELETE, delete)
                .append(FIELD_URLENTITY_PERMISSION_CANUPDATE, update)
                .append(FIELD_URLENTITY_PERMISSION_CANVIEWSURVEYREPORT, viewSurveyReport)
                .append(FIELD_URLENTITY_PERMISSION_VIEW, view)
                .append(FIELD_URLENTITY_PERMISSION_ADDADMINS, addAdmins)
                .append(FIELD_URLENTITY_PERMISSION_EDITPARTICIPANTS, editParticipants)
                .append(FIELD_URLENTITY_PERMISSION_VIEWPARTICIPANTS, viewParticipants)
        return document
    }

    Integer getDelete() {
        return delete
    }

    void setDelete(Integer delete) {
        this.delete = delete
    }

    Integer getUpdate() {
        return update
    }

    void setUpdate(Integer update) {
        this.update = update
    }

    Integer getViewSurveyReport() {
        return viewSurveyReport
    }

    void setViewSurveyReport(Integer viewSurveyReport) {
        this.viewSurveyReport = viewSurveyReport
    }

    Integer getView() {
        return view
    }

    void setView(Integer view) {
        this.view = view
    }

    int getAddAdmins() {
        return addAdmins
    }

    void setAddAdmins(int addAdmins) {
        this.addAdmins = addAdmins
    }

    int getEditParticipants() {
        return editParticipants
    }

    void setEditParticipants(int editParticipants) {
        this.editParticipants = editParticipants
    }

    int getViewParticipants() {
        return viewParticipants
    }

    void setViewParticipants(int viewParticipants) {
        this.viewParticipants = viewParticipants
    }
}

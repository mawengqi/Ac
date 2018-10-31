package acuser.userService.stub

import com.docker.storage.mongodb.CleanDocument
import connectors.mongodb.codec.DataObject
import org.bson.Document

/**
 * Created by wenqi on 2018/10/24
 */
class ACUser extends DataObject{

    public static final String FIELD_FIRSTNAME = "fname"
    public static final String FIELD_INITIALS = "iname"
    public static final String FIELD_LASTNAME = "lname"
    public static final String FIELD_REGISTERTIME = "rtime"
    public static final String FIELD_UPDATETIMNE = "utime"
    public static final String FIELD_DESCRIPTION = "desp"
    public static final String FIELD_COUNTRY = "country"
    public static final String FIELD_TYPE = "type"
    public static final String FIELD_ROLES = "roles"
    public static final String FIELD_IDENTITY = "identity"
    public static final String FIELD_CHILD = "child"
    public static final String FIELD_EXPERTIES = "expertise"
    public static final String FIELD_INTERESTS = "interests"
    public static final String FIELD_PHONES = "phones"
    public static final String FIELD_EMAILS = "emails"
    public static final String FIELD_DELETETIME = "dtime"
    public static final String FIELD_ACTIVATIONTIME = "atime"
    public static final String FIELD_LASTACCESSTIME = "latime"
    public static final String FIELD_LASTLOGINTIME = "llntine"
    public static final String FIELD_LASTLOGOUTTIME = "llttime"
    public static final String FIELD_JOBTITLE = "job"
    public static final String FIELD_DEPARTMENT = "dept"
    public static final String FIELD_PHONENUMBER = "phone"
    public static final String FIELD_EMAIL = "email"
    public static final String FIELD_ADDRESS = "address"
    public static final String FIELD_IMPORTINFO = "import"

    private String firstName
    private String initials
    private String lastName
    private Long registerTime
    private Long updateTime
    private String description
    private String country
    private Integer type
    private List<Integer> role
    private Integer identity
    private String child
    private String expertise
    private String interests
    private List<String> phones
    private List<String> emails
    private Long deleteTime
    private Long activationTime
    private Long lastAccessTime
    private Long lastLoginTime
    private Long lastLogoutTime
    private String jobTitle
    private String department
    private String phoneNumber
    private String email
    private String address
    private Document importInfo

    public Document toDocument() {
        //TODO 这里需要手动生成Document对象， 用于update
        Document document = new CleanDocument()
        document.append(FIELD_ID, id)
                .append(FIELD_FIRSTNAME, firstName)
                .append(FIELD_INITIALS, initials)
                .append(FIELD_LASTNAME, lastName)
                .append(FIELD_REGISTERTIME, registerTime)
                .append(FIELD_UPDATETIMNE, updateTime)
                .append(FIELD_DESCRIPTION, description)
                .append(FIELD_COUNTRY, country)
                .append(FIELD_TYPE, type)
                .append(FIELD_ROLES, role)
                .append(FIELD_IDENTITY, identity)
                .append(FIELD_CHILD, child)
                .append(FIELD_EXPERTIES, expertise)
                .append(FIELD_INTERESTS, interests)
                .append(FIELD_PHONES, phones)
                .append(FIELD_EMAILS, emails)
                .append(FIELD_DELETETIME, deleteTime)
                .append(FIELD_ACTIVATIONTIME, activationTime)
                .append(FIELD_LASTACCESSTIME, lastAccessTime)
                .append(FIELD_LASTLOGINTIME, lastLoginTime)
                .append(FIELD_LASTLOGOUTTIME, lastLogoutTime)
                .append(FIELD_JOBTITLE, jobTitle)
                .append(FIELD_DEPARTMENT, department)
                .append(FIELD_PHONENUMBER, phoneNumber)
                .append(FIELD_EMAIL, email)
                .append(FIELD_ADDRESS, address)
                .append(FIELD_IMPORTINFO, importInfo)
        return document
    }

    String getFirstName() {
        return firstName
    }

    void setFirstName(String firstName) {
        this.firstName = firstName
    }

    String getInitials() {
        return initials
    }

    void setInitials(String initials) {
        this.initials = initials
    }

    String getLastName() {
        return lastName
    }

    void setLastName(String lastName) {
        this.lastName = lastName
    }

    Long getRegisterTime() {
        return registerTime
    }

    void setRegisterTime(Long registerTime) {
        this.registerTime = registerTime
    }

    Long getUpdateTime() {
        return updateTime
    }

    void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime
    }

    String getDescription() {
        return description
    }

    void setDescription(String description) {
        this.description = description
    }

    String getCountry() {
        return country
    }

    void setCountry(String country) {
        this.country = country
    }

    Integer getType() {
        return type
    }

    void setType(Integer type) {
        this.type = type
    }

    List<Integer> getRole() {
        return role
    }

    void setRole(List<Integer> role) {
        this.role = role
    }

    Integer getIdentity() {
        return identity
    }

    void setIdentity(Integer identity) {
        this.identity = identity
    }

    String getChild() {
        return child
    }

    void setChild(String child) {
        this.child = child
    }

    String getExpertise() {
        return expertise
    }

    void setExpertise(String expertise) {
        this.expertise = expertise
    }

    String getInterests() {
        return interests
    }

    void setInterests(String interests) {
        this.interests = interests
    }

    List<String> getPhones() {
        return phones
    }

    void setPhones(List<String> phones) {
        this.phones = phones
    }

    List<String> getEmails() {
        return emails
    }

    void setEmails(List<String> emails) {
        this.emails = emails
    }

    Long getDeleteTime() {
        return deleteTime
    }

    void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime
    }

    Long getActivationTime() {
        return activationTime
    }

    void setActivationTime(Long activationTime) {
        this.activationTime = activationTime
    }

    Long getLastAccessTime() {
        return lastAccessTime
    }

    void setLastAccessTime(Long lastAccessTime) {
        this.lastAccessTime = lastAccessTime
    }

    Long getLastLoginTime() {
        return lastLoginTime
    }

    void setLastLoginTime(Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime
    }

    Long getLastLogoutTime() {
        return lastLogoutTime
    }

    void setLastLogoutTime(Long lastLogoutTime) {
        this.lastLogoutTime = lastLogoutTime
    }

    String getJobTitle() {
        return jobTitle
    }

    void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle
    }

    String getDepartment() {
        return department
    }

    void setDepartment(String department) {
        this.department = department
    }

    String getPhoneNumber() {
        return phoneNumber
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber
    }

    String getEmail() {
        return email
    }

    void setEmail(String email) {
        this.email = email
    }

    String getAddress() {
        return address
    }

    void setAddress(String address) {
        this.address = address
    }

    Document getImportInfo() {
        return importInfo
    }

    void setImportInfo(Document importInfo) {
        this.importInfo = importInfo
    }
}

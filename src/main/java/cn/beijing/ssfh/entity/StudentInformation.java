package cn.beijing.ssfh.entity;

import java.util.Date;

public class StudentInformation {
    private Integer studentId;

    private Integer addressId;

    private String studentName;

    private String studentNum;

    private Integer gender;

    private String nativePlace;

    private String homeAddress;

    private String telephone;

    private String email;

    private Integer documentType;

    private String documentNumber;

    private String nation;

    private Date birthDate;

    private Integer age;

    private String education;

    private String profession;

    private Date graduationDate;

    private String parentsName;

    private String parentsTel;

    private String emergencyContact;

    private String emergencyContactTel;

    private String householdRegistrationCode;

    private Integer studentState;

    @Override
    public String toString() {
        return "StudentInformation{" +
                "studentId=" + studentId +
                ", addressId=" + addressId +
                ", studentName='" + studentName + '\'' +
                ", studentNum='" + studentNum + '\'' +
                ", gender=" + gender +
                ", nativePlace='" + nativePlace + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", documentType=" + documentType +
                ", documentNumber='" + documentNumber + '\'' +
                ", nation='" + nation + '\'' +
                ", birthDate=" + birthDate +
                ", age=" + age +
                ", education='" + education + '\'' +
                ", profession='" + profession + '\'' +
                ", graduationDate=" + graduationDate +
                ", parentsName='" + parentsName + '\'' +
                ", parentsTel='" + parentsTel + '\'' +
                ", emergencyContact='" + emergencyContact + '\'' +
                ", emergencyContactTel='" + emergencyContactTel + '\'' +
                ", householdRegistrationCode='" + householdRegistrationCode + '\'' +
                ", studentState=" + studentState +
                '}';
    }

    public Integer getStudentState() {
        return studentState;
    }

    public void setStudentState(Integer studentState) {
        this.studentState = studentState;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDocumentType() {
        return documentType;
    }

    public void setDocumentType(Integer documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getParentsName() {
        return parentsName;
    }

    public void setParentsName(String parentsName) {
        this.parentsName = parentsName;
    }

    public String getParentsTel() {
        return parentsTel;
    }

    public void setParentsTel(String parentsTel) {
        this.parentsTel = parentsTel;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyContactTel() {
        return emergencyContactTel;
    }

    public void setEmergencyContactTel(String emergencyContactTel) {
        this.emergencyContactTel = emergencyContactTel;
    }

    public String getHouseholdRegistrationCode() {
        return householdRegistrationCode;
    }

    public void setHouseholdRegistrationCode(String householdRegistrationCode) {
        this.householdRegistrationCode = householdRegistrationCode;
    }


    public StudentInformation(Integer studentId, Integer addressId, String studentName, String studentNum, Integer gender, String nativePlace, String homeAddress, String telephone, String email, Integer documentType, String documentNumber, String nation, Date birthDate, Integer age, String education, String profession, Date graduationDate, String parentsName, String parentsTel, String emergencyContact, String emergencyContactTel, String householdRegistrationCode, Integer studentState) {
        this.studentId = studentId;
        this.addressId = addressId;
        this.studentName = studentName;
        this.studentNum = studentNum;
        this.gender = gender;
        this.nativePlace = nativePlace;
        this.homeAddress = homeAddress;
        this.telephone = telephone;
        this.email = email;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.nation = nation;
        this.birthDate = birthDate;
        this.age = age;
        this.education = education;
        this.profession = profession;
        this.graduationDate = graduationDate;
        this.parentsName = parentsName;
        this.parentsTel = parentsTel;
        this.emergencyContact = emergencyContact;
        this.emergencyContactTel = emergencyContactTel;
        this.householdRegistrationCode = householdRegistrationCode;
        this.studentState = studentState;
    }

    public StudentInformation() {

    }
}
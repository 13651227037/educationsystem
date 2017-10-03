package cn.beijing.ssfh.entity;

import org.springframework.format.annotation.DateTimeFormat;

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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;

    private Integer age;

    private String education;

    private String profession;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date graduationDate;

    private String parentsName;

    private String parentsTel;

    private String emergencyContact;

    private String emergencyContactTel;

    private String householdRegistrationCode;

    private Integer studentState;

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
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum == null ? null : studentNum.trim();
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
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress == null ? null : homeAddress.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
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
        this.documentNumber = documentNumber == null ? null : documentNumber.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
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
        this.education = education == null ? null : education.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
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
        this.parentsName = parentsName == null ? null : parentsName.trim();
    }

    public String getParentsTel() {
        return parentsTel;
    }

    public void setParentsTel(String parentsTel) {
        this.parentsTel = parentsTel == null ? null : parentsTel.trim();
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact == null ? null : emergencyContact.trim();
    }

    public String getEmergencyContactTel() {
        return emergencyContactTel;
    }

    public void setEmergencyContactTel(String emergencyContactTel) {
        this.emergencyContactTel = emergencyContactTel == null ? null : emergencyContactTel.trim();
    }

    public String getHouseholdRegistrationCode() {
        return householdRegistrationCode;
    }

    public void setHouseholdRegistrationCode(String householdRegistrationCode) {
        this.householdRegistrationCode = householdRegistrationCode == null ? null : householdRegistrationCode.trim();
    }

    public Integer getStudentState() {
        return studentState;
    }

    public void setStudentState(Integer studentState) {
        this.studentState = studentState;
    }

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
}
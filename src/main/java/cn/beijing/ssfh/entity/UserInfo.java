package cn.beijing.ssfh.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UserInfo {
    private Integer userInfoId;

    private Integer addressId;

    private String name;

    private String employeeNum;

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

    private String professiona;

    private String emergencyContact;

    private String emergencyContactPhone;

    private String homeAddressCode;

    private String householdRegistrationCode;

    public Integer getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Integer userInfoId) {
        this.userInfoId = userInfoId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum == null ? null : employeeNum.trim();
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

    public String getProfessiona() {
        return professiona;
    }

    public void setProfessiona(String professiona) {
        this.professiona = professiona == null ? null : professiona.trim();
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact == null ? null : emergencyContact.trim();
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone == null ? null : emergencyContactPhone.trim();
    }

    public String getHomeAddressCode() {
        return homeAddressCode;
    }

    public void setHomeAddressCode(String homeAddressCode) {
        this.homeAddressCode = homeAddressCode == null ? null : homeAddressCode.trim();
    }

    public String getHouseholdRegistrationCode() {
        return householdRegistrationCode;
    }

    public void setHouseholdRegistrationCode(String householdRegistrationCode) {
        this.householdRegistrationCode = householdRegistrationCode == null ? null : householdRegistrationCode.trim();
    }
}
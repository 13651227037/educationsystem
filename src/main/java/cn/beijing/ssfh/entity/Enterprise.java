package cn.beijing.ssfh.entity;

public class Enterprise {
    private Integer enterpriseId;

    private Integer addressId;

    private String enterpriseName;

    private String enterpriseScale;

    private String enterpriseNature;

    private String enterpriseIndustry;

    @Override
    public String toString() {
        return "Enterprise{" +
                "enterpriseId=" + enterpriseId +
                ", addressId=" + addressId +
                ", enterpriseName='" + enterpriseName + '\'' +
                ", enterpriseScale='" + enterpriseScale + '\'' +
                ", enterpriseNature='" + enterpriseNature + '\'' +
                ", enterpriseIndustry='" + enterpriseIndustry + '\'' +
                '}';
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public String getEnterpriseScale() {
        return enterpriseScale;
    }

    public void setEnterpriseScale(String enterpriseScale) {
        this.enterpriseScale = enterpriseScale == null ? null : enterpriseScale.trim();
    }

    public String getEnterpriseNature() {
        return enterpriseNature;
    }

    public void setEnterpriseNature(String enterpriseNature) {
        this.enterpriseNature = enterpriseNature == null ? null : enterpriseNature.trim();
    }

    public String getEnterpriseIndustry() {
        return enterpriseIndustry;
    }

    public void setEnterpriseIndustry(String enterpriseIndustry) {
        this.enterpriseIndustry = enterpriseIndustry == null ? null : enterpriseIndustry.trim();
    }
}
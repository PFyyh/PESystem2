package com.pesystem.po;

public class AdministrativeClass {
    private String acId;

    private String testerId;

    private Integer majorId;

    private String acName;

    private Integer acYear;

    public String getAcId() {
        return acId;
    }

    public void setAcId(String acId) {
        this.acId = acId == null ? null : acId.trim();
    }

    public String getTesterId() {
        return testerId;
    }

    public void setTesterId(String testerId) {
        this.testerId = testerId == null ? null : testerId.trim();
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName == null ? null : acName.trim();
    }

    public Integer getAcYear() {
        return acYear;
    }

    public void setAcYear(Integer acYear) {
        this.acYear = acYear;
    }
}
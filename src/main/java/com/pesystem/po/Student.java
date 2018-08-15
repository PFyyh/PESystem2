package com.pesystem.po;

import java.util.Date;

public class Student {
    private String stdntId;

    private String acId;

    private String stdntName;

    private Date stdntBirthday;

    private String stdntIc;

    private String stuHome;

    private String stdntGenderId;

    private String stdntNationId;

    private String stdntOriginId;

    public String getStdntId() {
        return stdntId;
    }

    public void setStdntId(String stdntId) {
        this.stdntId = stdntId == null ? null : stdntId.trim();
    }

    public String getAcId() {
        return acId;
    }

    public void setAcId(String acId) {
        this.acId = acId == null ? null : acId.trim();
    }

    public String getStdntName() {
        return stdntName;
    }

    public void setStdntName(String stdntName) {
        this.stdntName = stdntName == null ? null : stdntName.trim();
    }

    public Date getStdntBirthday() {
        return stdntBirthday;
    }

    public void setStdntBirthday(Date stdntBirthday) {
        this.stdntBirthday = stdntBirthday;
    }

    public String getStdntIc() {
        return stdntIc;
    }

    public void setStdntIc(String stdntIc) {
        this.stdntIc = stdntIc == null ? null : stdntIc.trim();
    }

    public String getStuHome() {
        return stuHome;
    }

    public void setStuHome(String stuHome) {
        this.stuHome = stuHome == null ? null : stuHome.trim();
    }

    public String getStdntGenderId() {
        return stdntGenderId;
    }

    public void setStdntGenderId(String stdntGenderId) {
        this.stdntGenderId = stdntGenderId == null ? null : stdntGenderId.trim();
    }

    public String getStdntNationId() {
        return stdntNationId;
    }

    public void setStdntNationId(String stdntNationId) {
        this.stdntNationId = stdntNationId == null ? null : stdntNationId.trim();
    }

    public String getStdntOriginId() {
        return stdntOriginId;
    }

    public void setStdntOriginId(String stdntOriginId) {
        this.stdntOriginId = stdntOriginId == null ? null : stdntOriginId.trim();
    }
}
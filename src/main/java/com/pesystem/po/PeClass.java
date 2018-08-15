package com.pesystem.po;

import java.util.Date;

public class PeClass {
    private String peClassId;

    private String tchId;

    private String peClassName;

    private Date peClassCreatetime;

    public String getPeClassId() {
        return peClassId;
    }

    public void setPeClassId(String peClassId) {
        this.peClassId = peClassId == null ? null : peClassId.trim();
    }

    public String getTchId() {
        return tchId;
    }

    public void setTchId(String tchId) {
        this.tchId = tchId == null ? null : tchId.trim();
    }

    public String getPeClassName() {
        return peClassName;
    }

    public void setPeClassName(String peClassName) {
        this.peClassName = peClassName == null ? null : peClassName.trim();
    }

    public Date getPeClassCreatetime() {
        return peClassCreatetime;
    }

    public void setPeClassCreatetime(Date peClassCreatetime) {
        this.peClassCreatetime = peClassCreatetime;
    }
}
package com.pesystem.po;

public class Study {
    private String stdntId;

    private String peClassId;

    public String getStdntId() {
        return stdntId;
    }

    public void setStdntId(String stdntId) {
        this.stdntId = stdntId == null ? null : stdntId.trim();
    }

    public String getPeClassId() {
        return peClassId;
    }

    public void setPeClassId(String peClassId) {
        this.peClassId = peClassId == null ? null : peClassId.trim();
    }
}
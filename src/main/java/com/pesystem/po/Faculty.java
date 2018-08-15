package com.pesystem.po;

public class Faculty {
    private Integer facultyId;

    private String facultyName;

    public Integer getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(Integer facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName == null ? null : facultyName.trim();
    }
}
package com.pesystem.po;

public class Tester {
    private String testerId;

    public String getTesterId() {
        return testerId;
    }

    public void setTesterId(String testerId) {
        this.testerId = testerId == null ? null : testerId.trim();
    }
}
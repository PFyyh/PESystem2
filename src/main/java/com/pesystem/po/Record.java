package com.pesystem.po;

import java.math.BigDecimal;
import java.util.Date;

public class Record {
    private Date recYear;

    private String stdntId;

    private BigDecimal recHeight;

    private BigDecimal recEight;

    private Integer recVtalCapacity;

    private BigDecimal recBeginToBend;

    private BigDecimal recStandingBroadJump;

    private Integer recSitUp;

    private Integer recChinning;

    private Integer recFivetyRrun;

    private String recThousandRun;

    private String recEightHandredRun;

    public Date getRecYear() {
        return recYear;
    }

    public void setRecYear(Date recYear) {
        this.recYear = recYear;
    }

    public String getStdntId() {
        return stdntId;
    }

    public void setStdntId(String stdntId) {
        this.stdntId = stdntId == null ? null : stdntId.trim();
    }

    public BigDecimal getRecHeight() {
        return recHeight;
    }

    public void setRecHeight(BigDecimal recHeight) {
        this.recHeight = recHeight;
    }

    public BigDecimal getRecEight() {
        return recEight;
    }

    public void setRecEight(BigDecimal recEight) {
        this.recEight = recEight;
    }

    public Integer getRecVtalCapacity() {
        return recVtalCapacity;
    }

    public void setRecVtalCapacity(Integer recVtalCapacity) {
        this.recVtalCapacity = recVtalCapacity;
    }

    public BigDecimal getRecBeginToBend() {
        return recBeginToBend;
    }

    public void setRecBeginToBend(BigDecimal recBeginToBend) {
        this.recBeginToBend = recBeginToBend;
    }

    public BigDecimal getRecStandingBroadJump() {
        return recStandingBroadJump;
    }

    public void setRecStandingBroadJump(BigDecimal recStandingBroadJump) {
        this.recStandingBroadJump = recStandingBroadJump;
    }

    public Integer getRecSitUp() {
        return recSitUp;
    }

    public void setRecSitUp(Integer recSitUp) {
        this.recSitUp = recSitUp;
    }

    public Integer getRecChinning() {
        return recChinning;
    }

    public void setRecChinning(Integer recChinning) {
        this.recChinning = recChinning;
    }

    public Integer getRecFivetyRrun() {
        return recFivetyRrun;
    }

    public void setRecFivetyRrun(Integer recFivetyRrun) {
        this.recFivetyRrun = recFivetyRrun;
    }

    public String getRecThousandRun() {
        return recThousandRun;
    }

    public void setRecThousandRun(String recThousandRun) {
        this.recThousandRun = recThousandRun == null ? null : recThousandRun.trim();
    }

    public String getRecEightHandredRun() {
        return recEightHandredRun;
    }

    public void setRecEightHandredRun(String recEightHandredRun) {
        this.recEightHandredRun = recEightHandredRun == null ? null : recEightHandredRun.trim();
    }
}
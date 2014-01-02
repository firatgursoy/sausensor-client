package edu.sau.sausensor.client.domain;

import java.util.Calendar;

public class Mts400ResultsL {

    private Integer taosch1;

    private Integer taosch0;

    private Calendar resultTime;

    private Integer prtemp;

    private Integer press;

    private Integer parent;

    private Integer nodeid;

    private Integer humtemp;

    private Integer humid;

    private Integer epoch;

    private Integer accelY;

    private Integer accelX;

    private Integer voltage;

    public void setVoltage(Integer voltage) {
        this.voltage = voltage;
    }

    public Integer getVoltage() {
        return voltage;
    }

    public void setTaosch1(Integer taosch1) {
        this.taosch1 = taosch1;
    }

    public Integer getTaosch1() {
        return taosch1;
    }

    public void setTaosch0(Integer taosch0) {
        this.taosch0 = taosch0;
    }

    public Integer getTaosch0() {
        return taosch0;
    }

    public void setResultTime(Calendar resultTime) {
        this.resultTime = resultTime;
    }

    public Calendar getResultTime() {
        return resultTime;
    }

    public void setPrtemp(Integer prtemp) {
        this.prtemp = prtemp;
    }

    public Integer getPrtemp() {
        return prtemp;
    }

    public void setPress(Integer press) {
        this.press = press;
    }

    public Integer getPress() {
        return press;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public Integer getParent() {
        return parent;
    }

    public void setNodeid(Integer nodeid) {
        this.nodeid = nodeid;
    }

    public Integer getAccelX() {
        return accelX;
    }

    public void setAccelX(Integer accelX) {
        this.accelX = accelX;
    }

    public Integer getAccelY() {
        return accelY;
    }

    public void setAccelY(Integer accelY) {
        this.accelY = accelY;
    }

    public Integer getEpoch() {
        return epoch;
    }

    public void setEpoch(Integer epoch) {
        this.epoch = epoch;
    }

    public Integer getHumid() {
        return humid;
    }

    public void setHumid(Integer humid) {
        this.humid = humid;
    }

    public Integer getHumtemp() {
        return humtemp;
    }

    public void setHumtemp(Integer humtemp) {
        this.humtemp = humtemp;
    }

    public Integer getNodeid() {
        return nodeid;
    }
}

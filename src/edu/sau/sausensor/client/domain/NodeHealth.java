package edu.sau.sausensor.client.domain;

import java.util.Calendar;

public class NodeHealth {

    private Integer powerSum;

    private Integer pathCost;

    private Integer parentRssi;

    private Integer parent;

    private Integer nodeid;

    private Integer nodePkts;

    private Integer healthPkts;

    private Integer forwarded;

    private Integer epoch;

    private Integer dropped;

    private Integer boardId;

    private Integer battery;

    private Integer qualityRx;

    private Integer qualityTx;

    private Calendar resultTime;

    private Integer retries;

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public Integer getRetries() {
        return retries;
    }

    public void setResultTime(Calendar resultTime) {
        this.resultTime = resultTime;
    }

    public Calendar getResultTime() {
        return resultTime;
    }

    public void setQualityTx(Integer qualityTx) {
        this.qualityTx = qualityTx;
    }

    public Integer getQualityTx() {
        return qualityTx;
    }

    public void setQualityRx(Integer qualityRx) {
        this.qualityRx = qualityRx;
    }

    public Integer getQualityRx() {
        return qualityRx;
    }

    public void setPowerSum(Integer powerSum) {
        this.powerSum = powerSum;
    }

    public Integer getPowerSum() {
        return powerSum;
    }

    public void setPathCost(Integer pathCost) {
        this.pathCost = pathCost;
    }

    public Integer getPathCost() {
        return pathCost;
    }

    public void setParentRssi(Integer parentRssi) {
        this.parentRssi = parentRssi;
    }

    public Integer getParentRssi() {
        return parentRssi;
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

    public Integer getNodeid() {
        return nodeid;
    }

    public void setNodePkts(Integer nodePkts) {
        this.nodePkts = nodePkts;
    }

    public Integer getNodePkts() {
        return nodePkts;
    }

    public void setHealthPkts(Integer healthPkts) {
        this.healthPkts = healthPkts;
    }

    public Integer getHealthPkts() {
        return healthPkts;
    }

    public void setForwarded(Integer forwarded) {
        this.forwarded = forwarded;
    }

    public Integer getForwarded() {
        return forwarded;
    }

    public Integer getBattery() {
        return battery;
    }

    public void setBattery(Integer battery) {
        this.battery = battery;
    }

    public Integer getBoardId() {
        return boardId;
    }

    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    public Integer getDropped() {
        return dropped;
    }

    public void setDropped(Integer dropped) {
        this.dropped = dropped;
    }

    public Integer getEpoch() {
        return epoch;
    }

    public void setEpoch(Integer epoch) {
        this.epoch = epoch;
    }
}

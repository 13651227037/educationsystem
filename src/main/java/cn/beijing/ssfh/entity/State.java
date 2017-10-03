package cn.beijing.ssfh.entity;

public class State {
    private Integer stateId;

    private Integer stateType;

    private String stateName;

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getStateType() {
        return stateType;
    }

    public void setStateType(Integer stateType) {
        this.stateType = stateType;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {

        this.stateName = stateName == null ? null : stateName.trim();
    }

    @Override
    public String toString() {
        return "State{" +
                "stateId=" + stateId +
                ", stateType=" + stateType +
                ", stateName='" + stateName + '\'' +
                '}';
    }
}
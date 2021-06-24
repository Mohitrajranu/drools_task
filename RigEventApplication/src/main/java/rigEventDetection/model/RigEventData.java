package rigEventDetection.model;

import java.util.List;

public class RigEventData {

    private RigEventData prevRigEventData;

    private int wellId = -1;
    private int appId;
    private int logId;
    private String receivedTime;
    private String processedTime;
    private String receivedTimeString;
    private String processedTimeString;
    private String trackingId;
    //tags
    //private Tags tags;
    private double flowIn = -1.0;
    private double hookLoad;
    private double blockPosition = -1.0;
    private double depthBit;
    private double topDriveRPM;
    private double slipSet;
    private double topdriveTorque;
    private double totalDepth;
    private double onBottom;
    private double rockitOnOff;
    private double weightOnBit;
    //tagIdslist
    //assignedapps
    private List<String> assignedApps;
    private long eventId;
    private String eventValue;
    private String startTime;
    private String endTime;
    private long startDepth;
    private long endDepth;
    private long primaryIndex;
    private String logLevel;
    private String SBProcessedTime;
    private String stateValue;
    private int stateId;
    private String stateIdLookupValue;
    private String event;
    private String activity;
    private String operation;
    private String eventStartTime;
    private String eventEndTime;
    private String activityStartTime;
    private String activityEndTime;
    private String stateIdStartTime;
    //statedIdList
    private List<Integer> stateIdList;
    //ActivityList
    //slipSetcalc
    private int drillingListLength;
    private int statesListLength;
    private int reamingListCount;
    private int washingListCount;
    private int onBottomListCount;
    private int rotaryDrillingListCount;
    private int slideDrillingListCount;
    private Boolean rockItEnabled;
    private Boolean distanceTableCheck;

    public List<Integer> getStateIdList() {
        return stateIdList;
    }

    public void setStateIdList(List<Integer> statedIdList) {
        this.stateIdList = statedIdList;
    }

    public RigEventData getPrevRigEventData() {
        return prevRigEventData;
    }

    public void setPrevRigEventData(RigEventData prevRigEventData) {
        this.prevRigEventData = prevRigEventData;
    }

    public int getWellId() {
        return wellId;
    }

    public void setWellId(int wellId) {
        this.wellId = wellId;
    }

    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public String getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(String receivedTime) {
        this.receivedTime = receivedTime;
    }

    public String getProcessedTime() {
        return processedTime;
    }

    public void setProcessedTime(String processedTime) {
        this.processedTime = processedTime;
    }

    public String getReceivedTimeString() {
        return receivedTimeString;
    }

    public void setReceivedTimeString(String receivedTimeString) {
        this.receivedTimeString = receivedTimeString;
    }

    public String getProcessedTimeString() {
        return processedTimeString;
    }

    public void setProcessedTimeString(String processedTimeString) {
        this.processedTimeString = processedTimeString;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public double getFlowIn() {
        return flowIn;
    }

    public void setFlowIn(double flowIn) {
        this.flowIn = flowIn;
    }

    public double getHookLoad() {
        return hookLoad;
    }

    public void setHookLoad(double hookLoad) {
        this.hookLoad = hookLoad;
    }

    public double getBlockPosition() {
        return blockPosition;
    }

    public void setBlockPosition(double blockPosition) {
        this.blockPosition = blockPosition;
    }

    public double getDepthBit() {
        return depthBit;
    }

    public void setDepthBit(double depthBit) {
        this.depthBit = depthBit;
    }

    public double getTopDriveRPM() {
        return topDriveRPM;
    }

    public void setTopDriveRPM(double topDriveRPM) {
        this.topDriveRPM = topDriveRPM;
    }

    public double getSlipSet() {
        return slipSet;
    }

    public void setSlipSet(double slipSet) {
        this.slipSet = slipSet;
    }

    public double getTopdriveTorque() {
        return topdriveTorque;
    }

    public void setTopdriveTorque(double topdriveTorque) {
        this.topdriveTorque = topdriveTorque;
    }

    public double getTotalDepth() {
        return totalDepth;
    }

    public void setTotalDepth(double totalDepth) {
        this.totalDepth = totalDepth;
    }

    public double getOnBottom() {
        return onBottom;
    }

    public void setOnBottom(double onBottom) {
        this.onBottom = onBottom;
    }

    public double getRockitOnOff() {
        return rockitOnOff;
    }

    public void setRockitOnOff(double rockitOnOff) {
        this.rockitOnOff = rockitOnOff;
    }

    public double getWeightOnBit() {
        return weightOnBit;
    }

    public void setWeightOnBit(double weightOnBit) {
        this.weightOnBit = weightOnBit;
    }

    public List<String> getAssignedApps() {
        return assignedApps;
    }

    public void setAssignedApps(List<String> assignedApps) {
        this.assignedApps = assignedApps;
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public String getEventValue() {
        return eventValue;
    }

    public void setEventValue(String eventValue) {
        this.eventValue = eventValue;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public long getStartDepth() {
        return startDepth;
    }

    public void setStartDepth(long startDepth) {
        this.startDepth = startDepth;
    }

    public long getEndDepth() {
        return endDepth;
    }

    public void setEndDepth(long endDepth) {
        this.endDepth = endDepth;
    }

    public long getPrimaryIndex() {
        return primaryIndex;
    }

    public void setPrimaryIndex(long primaryIndex) {
        this.primaryIndex = primaryIndex;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public String getSBProcessedTime() {
        return SBProcessedTime;
    }

    public void setSBProcessedTime(String SBProcessedTime) {
        this.SBProcessedTime = SBProcessedTime;
    }

    public String getStateValue() {
        return stateValue;
    }

    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getStateIdLookupValue() {
        return stateIdLookupValue;
    }

    public void setStateIdLookupValue(String stateIdLookupValue) {
        this.stateIdLookupValue = stateIdLookupValue;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(String eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public String getEventEndTime() {
        return eventEndTime;
    }

    public void setEventEndTime(String eventEndTime) {
        this.eventEndTime = eventEndTime;
    }

    public String getActivityStartTime() {
        return activityStartTime;
    }

    public void setActivityStartTime(String activityStartTime) {
        this.activityStartTime = activityStartTime;
    }

    public String getActivityEndTime() {
        return activityEndTime;
    }

    public void setActivityEndTime(String activityEndTime) {
        this.activityEndTime = activityEndTime;
    }

    public String getStateIdStartTime() {
        return stateIdStartTime;
    }

    public void setStateIdStartTime(String stateIdStartTime) {
        this.stateIdStartTime = stateIdStartTime;
    }

    public int getDrillingListLength() {
        return drillingListLength;
    }

    public void setDrillingListLength(int drillingListLength) {
        this.drillingListLength = drillingListLength;
    }

    public int getStatesListLength() {
        return statesListLength;
    }

    public void setStatesListLength(int statesListLength) {
        this.statesListLength = statesListLength;
    }

    public int getReamingListCount() {
        return reamingListCount;
    }

    public void setReamingListCount(int reamingListCount) {
        this.reamingListCount = reamingListCount;
    }

    public int getWashingListCount() {
        return washingListCount;
    }

    public void setWashingListCount(int washingListCount) {
        this.washingListCount = washingListCount;
    }

    public int getOnBottomListCount() {
        return onBottomListCount;
    }

    public void setOnBottomListCount(int onBottomListCount) {
        this.onBottomListCount = onBottomListCount;
    }

    public int getRotaryDrillingListCount() {
        return rotaryDrillingListCount;
    }

    public void setRotaryDrillingListCount(int rotaryDrillingListCount) {
        this.rotaryDrillingListCount = rotaryDrillingListCount;
    }

    public int getSlideDrillingListCount() {
        return slideDrillingListCount;
    }

    public void setSlideDrillingListCount(int slideDrillingListCount) {
        this.slideDrillingListCount = slideDrillingListCount;
    }

    public Boolean isRockItEnabled() {
        return rockItEnabled;
    }

    public void setRockItEnabled(Boolean rockItEnabled) {
        this.rockItEnabled = rockItEnabled;
    }

    public Boolean isDistanceTableCheck() {
        return distanceTableCheck;
    }

    public void setDistanceTableCheck(Boolean distanceTableCheck) {
        this.distanceTableCheck = distanceTableCheck;
    }
}

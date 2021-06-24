package rigEventDetection.parser;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import rigEventDetection.model.RigEventData;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RigEventParser {

    public static RigEventData rigdataParser(JSONObject jsonObj) {

        int wellId = ((Long) jsonObj.get("wellId")).intValue();
        int appId = ((Long) jsonObj.get("appId")).intValue();
        int logId = ((Long) jsonObj.get("logId")).intValue();
        String receivedTime = (String) jsonObj.get("receivedTime");
        String processedTime = (String) jsonObj.get("processedTime");
        String receivedTimeString = (String) jsonObj.get("receivedTimeString");
        String processedTimeString = (String) jsonObj.get("processedTimeString");
        String trackingId = (String) jsonObj.get("trackingId");

        //tags
        Map tags = ((Map)jsonObj.get("tags"));
        Double flowIn = 0.0;
        Double hookLoad = 0.0;
        Double blockPosition = 0.0;
        Double depthBit = 0.0;
        Double topDriveRPM = 0.0;
        Double slipSet = 0.0;
        Double topdriveTorque = 0.0;
        Double totalDepth = 0.0;
        Double onBottom = 0.0;
        Double rockitOnOff = 0.0;
        Double weightOnBit = 0.0;

        // iterating address Map
        Iterator<Map.Entry> itr1 = tags.entrySet().iterator();
        while (itr1.hasNext()) {
            Map.Entry pair = itr1.next();
            //System.out.println(pair.getKey() + " : " + pair.getValue());
            flowIn = 0.0;
            hookLoad = 0.0;
            blockPosition = 0.00;
            depthBit = 00.00;
            topDriveRPM = 0.0;
            slipSet = 0.0;
            topdriveTorque = 0.0;
            totalDepth = 0.0;
            onBottom = 0.0;
            rockitOnOff = 0.0;
            weightOnBit = 0.0;

        }

        Long primaryIndex = 0L;
        if(null != jsonObj.get("primaryIndex")) {
            primaryIndex = (Long) jsonObj.get("primaryIndex");
        }
        String logLevel = (String) jsonObj.get("loglevel");
        String SBProcessedTime = (String) jsonObj.get("sbProcessedTime");
        int stateId = ((Long) jsonObj.get("stateId")).intValue();
        String stateIdLookupValue = (String) jsonObj.get("stateIdLookupValue");
        String event = (String) jsonObj.get("event");
        String activity = (String) jsonObj.get("activity");
        String operation = (String) jsonObj.get("Operation");
        Boolean rockItEnabled = (Boolean) jsonObj.get("rockItEnabled");
        Boolean distanceTableCheck = (Boolean) jsonObj.get("distanceTableCheck");

        int rotaryDrillingListCount = 0;
        if(null != (jsonObj.get("rotaryDrillingListCount") )) {
            rotaryDrillingListCount = ((Long) jsonObj.get("rotaryDrillingListCount")).intValue();
        }
        int slideDrillingListCount = 0;
        if(null != (jsonObj.get("slideDrillingListCount") )) {
            slideDrillingListCount = ((Long) jsonObj.get("slideDrillingListCount")).intValue();
        }
        int drillingListLength = 0;
        if(null != (jsonObj.get("drillingListLength") )) {
            drillingListLength = ((Long) jsonObj.get("drillingListLength")).intValue();
        }
         int statesListLength = 0;
         if(null != (jsonObj.get("statesListLength") )) {
             statesListLength = ((Long) jsonObj.get("statesListLength")).intValue();
         }
        int onBottomListCount = 0;
        if(null != (jsonObj.get("onBottomListCount") )) {
            onBottomListCount = ((Long) jsonObj.get("onBottomListCount")).intValue();
        }

        int reamingListCount = 0;
        if(null != (jsonObj.get("reamingListCount") )) {
            reamingListCount = ((Long) jsonObj.get("reamingListCount")).intValue();
        }
        int washingListCount = 0;
        if(null != (jsonObj.get("washingListCount") )) {
            washingListCount = ((Long) jsonObj.get("washingListCount")).intValue();
        }

        List<Integer> stateIdList = new ArrayList<>();
        stateIdList = (List<Integer>) jsonObj.get("stateIdList");



        RigEventData eventData = new RigEventData();
        //Tags dataTags = new Tags();

        eventData.setWellId(wellId);
        eventData.setAppId(appId);
        eventData.setLogId(logId);
        eventData.setReceivedTime(receivedTime);
        eventData.setProcessedTime(processedTime);
        eventData.setReceivedTimeString(receivedTimeString);
        eventData.setProcessedTimeString(processedTimeString);
        eventData.setTrackingId(trackingId);
        eventData.setFlowIn(flowIn);
        eventData.setHookLoad(hookLoad);
        eventData.setBlockPosition(blockPosition);
        eventData.setDepthBit(depthBit);
        eventData.setTopDriveRPM(topDriveRPM);
        eventData.setSlipSet(slipSet);
        eventData.setTopdriveTorque(topdriveTorque);
        eventData.setTotalDepth(totalDepth);
        eventData.setOnBottom(onBottom);
        eventData.setRockitOnOff(rockitOnOff);
        eventData.setWeightOnBit(weightOnBit);
        eventData.setPrimaryIndex(primaryIndex);
        eventData.setLogLevel(logLevel);
        eventData.setSBProcessedTime(SBProcessedTime);
        eventData.setStateId(stateId);
        eventData.setStateIdLookupValue(stateIdLookupValue);
        eventData.setEvent(event);
        eventData.setActivity(activity);
        eventData.setOperation(operation);
        eventData.setRockItEnabled(rockItEnabled);
        eventData.setDistanceTableCheck(distanceTableCheck);
        eventData.setStatesListLength(statesListLength);
        eventData.setOnBottomListCount(onBottomListCount);
        eventData.setDrillingListLength(drillingListLength);
        eventData.setSlideDrillingListCount(slideDrillingListCount);
        eventData.setReamingListCount(reamingListCount);
        eventData.setWashingListCount(washingListCount);
        eventData.setRotaryDrillingListCount(rotaryDrillingListCount);
        eventData.setStateIdList(stateIdList);

        //eventData.setTags(dataTags);
        return eventData;

    }



}

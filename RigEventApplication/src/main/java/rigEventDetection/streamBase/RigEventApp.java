package rigEventDetection.streamBase;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.kie.api.runtime.KieSession;
import rigEventDetection.config.DroolsBeanFactory;
import rigEventDetection.model.RigEventData;
import rigEventDetection.parser.RigEventParser;

import java.io.FileReader;

public class RigEventApp {

    public static void main(String[] args) throws Exception {

        JSONParser jsonParser = new JSONParser();
        FileReader readerFile = new FileReader("D:\\MohitProject\\drools_task\\drools_task\\RigEventApplication\\src\\main\\resources\\sampleJson.json");

        Object obj = jsonParser.parse(readerFile);
        JSONObject jsonObject = (JSONObject) obj;

        JSONParser parser = new JSONParser();
        RigEventData rigData = RigEventParser.rigdataParser(jsonObject);

        FileReader readerFile_prev = new FileReader("D:\\MohitProject\\drools_task\\drools_task\\RigEventApplication\\src\\main\\resources\\prevJson.json");

        Object prevObj = jsonParser.parse(readerFile_prev);
        JSONObject prevJsonObj = (JSONObject) prevObj;

        RigEventData prevData = RigEventParser.rigdataParser(prevJsonObj);
        rigData.setPrevRigEventData(prevData);

        RigEventData result = new RigEventApp().backwardChaining(rigData);
        System.out.println("Result from the rule file is : " + "If state id is " + result.getStateId() + " If PrevStateId is " + result.getPrevRigEventData().getStateId()
                 + " then event is " + result.getEvent() + " and rockIt is "+ result.isRockItEnabled() + " and distance table check is " + result.isDistanceTableCheck());
        System.out.println(result.getStateIdList().get(0));
    }

        public RigEventData backwardChaining(RigEventData rigData) {
            //RigEventData result = new RigEventData();
            KieSession ksession = new DroolsBeanFactory().getKieSession();
            ksession.insert(rigData);
            ksession.fireAllRules();
            return rigData;
        }

    }





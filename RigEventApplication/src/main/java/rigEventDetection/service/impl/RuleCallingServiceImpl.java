package rigEventDetection.service.impl;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.kie.api.KieServices;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.io.Resource;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import rigEventDetection.model.RigEventData;
import rigEventDetection.parser.RigEventParser;
import rigEventDetection.service.RuleCallingService;
import rigEventDetection.streamBase.RigEventApp;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
@Service
public class RuleCallingServiceImpl implements RuleCallingService {
    private static Logger log = LoggerFactory.getLogger(RuleCallingServiceImpl.class);
    @Value("${drools.drlFilePath}")
    private String drlPath;
    @Override
    public void callRules(String drlName) throws IOException, ParseException {

        KieServices kieServices = KieServices.Factory.get();
        File file = new File(drlPath.concat(drlName));
        Resource resource = kieServices.getResources().newFileSystemResource(file).setResourceType(ResourceType.DRL);
        KieFileSystem kFileSystem = kieServices.newKieFileSystem().write(resource);
        kieServices.newKieBuilder(kFileSystem).buildAll();

        KieContainer kc = kieServices.newKieContainer(kieServices.getRepository().getDefaultReleaseId());

        KieSession kSession = kc.newKieSession();
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

        //RigEventData result = new RigEventApp().backwardChaining(rigData);


       /* RigEventData rigEventData = new RigEventData();
        rigEventData.setStateId(1);

*/
        //FactHandle fact1;

        //fact1 = kSession.insert(rigEventData);
        kSession.insert(rigData);
        kSession.fireAllRules();


       Integer cond1 = 3;
        long ipInt;
        Object o = rigData.getStateIdList().get(0);
        if (o instanceof Integer) {
            ipInt = ((Integer) o).intValue();
        } else if (o instanceof Long) {
            log.info("Long");
            ipInt = ((Long) o).longValue();
            if(ipInt >= 1l){
                log.info("true");
            }
        }


log.info("stateid list is "+String.valueOf(rigData.getStateIdList().size())+" first element is "+  String.valueOf(rigData.getStateIdList().get(0)));

        log.info("Result from the rule file is : " + "If state id is " + rigData.getStateId() + " If PrevStateId is " + rigData.getPrevRigEventData().getStateId()
                + " then event is " + rigData.getEvent() + " and rockIt is " + rigData.isRockItEnabled() + " and distance table check is " + rigData.isDistanceTableCheck());
/*
if((((rigData.getStateIdList().size()))) >= 3 && rigData.getStateIdList().get(0)>=1  ) {
    log.info("Result from the rule file is : " + "If state id is " + rigData.getStateId() + " If PrevStateId is " + rigData.getPrevRigEventData().getStateId()
            + " then event is " + rigData.getEvent() + " and rockIt is " + rigData.isRockItEnabled() + " and distance table check is " + rigData.isDistanceTableCheck());
}else{
    log.info("else");
}
        log.info(String.valueOf(rigData.getStateIdList().get(0)));
*/

        log.info("fired all rules");
        kSession.dispose();
    }
}

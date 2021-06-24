package rigEventDetection.streamBase;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import rigEventDetection.model.RigEventData;

public class eventRules {
    public static final void main(String[] args) {
//		try {
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession("ksession-rule");

        RigEventData rigEventData = new RigEventData();
        rigEventData.setStateId(1);


        FactHandle fact1;

        fact1 = kSession.insert(rigEventData);
        kSession.fireAllRules();

        System.out.println("Result from the rule file is : " + "If state id is "
                + rigEventData.getStateId() + " then event is " + rigEventData.getEvent() + " and rockIt is "+ rigEventData.isRockItEnabled() + " and distance table check is " + rigEventData.isDistanceTableCheck());
//
//		} catch (Throwable t) {
//			t.printStackTrace();
//		}
    }

}



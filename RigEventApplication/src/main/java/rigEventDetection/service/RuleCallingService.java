package rigEventDetection.service;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Map;

public interface RuleCallingService {

    void callRules(String drlName) throws IOException, ParseException;
}

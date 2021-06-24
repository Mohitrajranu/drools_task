package rigEventDetection.controller;

import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rigEventDetection.service.*;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/xlsxrules")
public class RuleProcessingController {

    public static Logger log = LoggerFactory.getLogger(RuleProcessingController.class);
    @Autowired
    private
    GenerateDrl drlGeneratorService;
    @Autowired
    private
    RuleCallingService ruleCallingService;


    @GetMapping("/generaterulesxlsx")
    public ResponseEntity<String> processRuleXlsx(@RequestParam String inputFileName) throws IOException {
        drlGeneratorService.generateDrlXlsx(inputFileName);
        log.info("inputJson    ::{}",inputFileName);
        log.info("method calling processRuleJson");
        ResponseEntity<String> responseEntity = new ResponseEntity<>("drl generated",
                HttpStatus.OK);
        return responseEntity;

    }

    @GetMapping("/eventRules")
    public ResponseEntity<String> eventRules(@RequestParam String drlName) throws IOException, ParseException {
        ruleCallingService.callRules(drlName);
        log.info("inputJson    ::{}",drlName);
        log.info("method calling processRuleJson");
        ResponseEntity<String> responseEntity = new ResponseEntity<>("Rules Processed Successfully",
                HttpStatus.OK);
        return responseEntity;

    }


}

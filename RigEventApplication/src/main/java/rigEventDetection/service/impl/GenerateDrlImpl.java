package rigEventDetection.service.impl;

import org.drools.decisiontable.InputType;
import org.drools.decisiontable.SpreadsheetCompiler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import rigEventDetection.service.GenerateDrl;
import rigEventDetection.util.WriteContentToFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Service
public class GenerateDrlImpl implements GenerateDrl {
    private static Logger log = LoggerFactory.getLogger(GenerateDrlImpl.class);
    //private final String drlPath = System.getProperty("com.bizlem.appDir") + File.separator;

    @Value("${drools.drlFilePath}")
    private String drlPath;
    @Override
    public void generateDrlXlsx(String inputFilename) throws IOException {
        File dtf = new File(drlPath.concat(inputFilename));
        InputStream is;
        try {
            is = new FileInputStream(dtf);
            SpreadsheetCompiler ssComp = new SpreadsheetCompiler();
            String resultContent = ssComp.compile(is, InputType.XLS);
            WriteContentToFile.write(drlPath, "rules.drl", resultContent);
            System.out.println("=== Begin generated DRL ===");
             System.out.println(resultContent);
            // System.out.println("=== End generated DRL ===");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            log.error(e.getClass().getSimpleName(), e);
            e.printStackTrace();
        }
    }
}

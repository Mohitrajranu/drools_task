package rigEventDetection.streamBase;

import org.drools.decisiontable.InputType;
import org.drools.decisiontable.SpreadsheetCompiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class event
{
    public static void main(String[] args) {
    // TODO Auto-generated method stub

    File dtf = new File("D:\\MohitProject\\drools_task\\drools_task\\RigEventApplication\\src\\main\\resources\\rules\\RigEventRules.xlsx");
    InputStream is;
    try {
        is = new FileInputStream(dtf);
        SpreadsheetCompiler ssComp = new SpreadsheetCompiler();
        String s = ssComp.compile(is, InputType.XLS);
        System.out.println("=== Begin generated DRL ===");
        System.out.println(s);
        System.out.println("=== End generated DRL ===");
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}}






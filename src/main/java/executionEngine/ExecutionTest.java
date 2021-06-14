package executionEngine;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
//import excelUtility.ReadExcelSheet;
import excelUtility.*;
import keywordDriven.*;

public class ExecutionTest
{
    public static void main(String[] args) throws IOException, Exception, IllegalArgumentException, InvocationTargetException
    {
        ReadExcelSheet rs = new ReadExcelSheet();
        rs.DemoFile(4);
        Action_keyword k = new Action_keyword();
        k.openBrowser();
        k.navigate();
        k.enterEmail();
        k.enterPassword();
        k.clickSignIn();
        k.logout();
        k.closeBrowser();
        System.out.println("Test executed successfully");
    }
}
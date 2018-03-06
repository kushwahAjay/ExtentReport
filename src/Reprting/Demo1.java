package Reprting;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo1 {

	public static void main(String[] args) {
		String path="./Result/MyReport.html";
		ExtentReports reports=new ExtentReports(path);
		ExtentTest test1 = reports.startTest("test1");
		test1.log(LogStatus.PASS, "pass");
		reports.endTest(test1);
		reports.flush();
		ExtentTest test2 = reports.startTest("test2");
		test1.log(LogStatus.FAIL, "fail");
		reports.endTest(test2);
		reports.flush();
	}

}

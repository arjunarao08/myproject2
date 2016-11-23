package Strings;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class String2 {

	public static void main(String[] args) 
	{
		ExtentReports report=ExtentReports.get(String2.class);
		report.init("D:\\report.html", true);
		
		report.startTest("String demo 1");
		report.log(LogStatus.INFO, "String concept practice");
		String name="Arjuna Rao";
		report.log(LogStatus.PASS, "taking string in a variable");
		String arry[]=name.split(" ");
		report.log(LogStatus.PASS, "string is splited and taking in a array variable");
		System.out.println("length is"+arry.length);
		report.log(LogStatus.INFO, "observing the array length");
		for(int i=0;i<arry.length;i++)
		{
			report.log(LogStatus.PASS, "splited string is printed");
			System.out.println(arry[i]);

		}
		report.endTest();
		report.startTest("applying conditions");
		report.log(LogStatus.INFO, "Condtion checking for operations started");
		for(int i=0;i<arry.length;i++)
		{
			if(arry[i].equals("Arjuna"))
			{
				System.out.println("doing the operation on"+ arry[i]);
			report.log(LogStatus.PASS, "doing operation 1");
			}
			else if(arry[i].equals("Rao"))
			{
				System.out.println("doing the operation on"+ arry[i]);
				report.log(LogStatus.PASS, "doing operation 2");
			}
			else
			{
				System.out.println("System Error");
				report.log(LogStatus.FAIL, "doing operation on fail conditions");
			}
			
		}
		report.endTest();
		
		

	}

}


package mID1222.fID1405;
import pom.VitalDXObjects;
import pom.VitalDXObjectsNew;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.Date;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import reuseablePackage.feature.AllActions;
import reuseablePackage.feature.CustomizedReport2;
import reuseablePackage.feature.JavaMethods;
import java.net.MalformedURLException;
import java.lang.management.ManagementFactory;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
public class sID2602 extends  AllActions {
	AllActions actions=new AllActions();  
	JavaMethods javamethod =  new JavaMethods();  
    String fileName=this.getClass().getSimpleName();    //common
	String packageName=this.getClass().getPackage().getName();   
    String methodName;                                  //common
    // String path=new AllActions().folderCreation(fileName);   //common
    String reportRuncount = actions.getJsonValue(packageName,fileName, "ExecutionCount", "reportCount");//common added 27/03/19
    String suiteName = actions.getJsonValue(packageName,fileName,"SuiteName","suiteName");//common added 27/03/19
	String projectName=actions.getJsonValue(packageName,fileName, "ProjectName", "projectName"); 
    String type=actions.getJsonValue(packageName,fileName, "ExecutionType", "type"); 
    String path = actions.folderCreation(reportRuncount,suiteName,fileName,projectName,type);   //common
	String path1 = actions.folderCreation1(reportRuncount,suiteName,fileName,projectName,type);
    String browserName=new AllActions().getJsonValue(packageName,fileName, "BrowserDetails", "Browser");   //common
    String  browserVersion=new AllActions().getJsonValue(packageName,fileName, "BrowserDetails", "Version");  //common
    String ipAddress=new AllActions().getJsonValue(packageName,fileName, "IpAddress", "IP"); //common
    //String packageName=this.getClass().getPackage().getName();   
    int implicitTimeOut=Integer.parseInt(new AllActions().getJsonValue(packageName,fileName, "Timeout", "ImplicitWait"));  //common
	String screenshotOption=new AllActions().getJsonValue(packageName,fileName, "ScreenshotOption", "CaptureOnEveryStep");  //c  //c
    String failScreenshotoption = new AllActions().getJsonValue(packageName,fileName, "ScreenshotOption", "CaptureOnFailure");//channged
	String vmName = ManagementFactory.getRuntimeMXBean().getName();
        int p = vmName.indexOf("@");
        String pid = vmName.substring(0, p);
String ph="PROSTATE HISTOLOGY";
String RequistionNum;
String requistionnum;
String reqnumasp;
int i;
String reqnum;
boolean reqnumber1;
String ranfn;
String var2;
String result;
	
	@Test(priority=0)
	public void step_0() throws Exception                                              //------------Method auto creation ------------//
	{
	try
	{ 
	actions.OpenNewBrowser(browserName, browserVersion,ipAddress,implicitTimeOut);
	// String videoPath=actions.startVideoRecord(reportRuncount,suiteName,fileName);
	String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();       
	actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);

	Reporter.log(browserName);
    Reporter.log(browserVersion);
    Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
    // Reporter.log(videoPath);


	}
	catch(Exception e)
	{
		String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
        actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
        Reporter.log(browserName);
        Reporter.log(browserVersion);
        Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
		//actions.CaptureOnFailure(reportRuncount,suiteName,fileName,failScreenshotoption);
		e.printStackTrace();
		// actions.captureDOM(path,fileName);
		// actions.stopVideoRecord();
		actions.CloseCurrentTab();
		throw e;
	}
	}
		@Test(priority=1)
        @Parameters({"iterations"})
          public void step_1(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.EnterApplicationURL("https://titansprintmylis.vitalaxis.com/");

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=2)
        @Parameters({"iterations"})
          public void step_2(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.EnterData(new VitalDXObjects(driver).UserName,actions.getData("./Excel/VitalNewDX.xlsx","Sheet1",1,0));

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=3)
        @Parameters({"iterations"})
          public void step_3(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.EnterData(new VitalDXObjects(driver).Password,actions.getData("./Excel/VitalNewDX.xlsx","Sheet1",1,1));

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=4)
        @Parameters({"iterations"})
          public void step_4(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).LoginButton);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=5)
        @Parameters({"iterations"})
          public void step_5(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.ThreadSleep("5000");

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=6)
        @Parameters({"iterations"})
          public void step_6(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).skipOFuser);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=7)
        @Parameters({"iterations"})
          public void step_7(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.SwitchToFrame(new VitalDXObjects(driver).topIFrame);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=8)
        @Parameters({"iterations"})
          public void step_8(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.SwitchToFrame(new VitalDXObjectsNew(driver).ChildFrame1);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=9)
        @Parameters({"iterations"})
          public void step_9(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).NewRequisition);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=10)
        @Parameters({"iterations"})
          public void step_10(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).CTDropdown);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=11)
        @Parameters({"iterations"})
          public void step_11(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.SelectDropDownByText(new VitalDXObjects(driver).CTDropdown,"PROSTATE HISTOLOGY");

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=12)
        @Parameters({"iterations"})
          public void step_12(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).CollectionMethod);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=13)
        @Parameters({"iterations"})
          public void step_13(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.SelectDropDownByText(new VitalDXObjects(driver).CollectionMethod,"Needle Biopsy");

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=14)
        @Parameters({"iterations"})
          public void step_14(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.EnterData(new VitalDXObjects(driver).NoOfJars,"1");

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=15)
        @Parameters({"iterations"})
          public void step_15(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).CIServices);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=16)
        @Parameters({"iterations"})
          public void step_16(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.SelectDropDownByText(new VitalDXObjects(driver).CIServices,"Global");

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=17)
        @Parameters({"iterations"})
          public void step_17(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.EnterData(new VitalDXObjects(driver).ICD,"111");

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=18)
        @Parameters({"iterations"})
          public void step_18(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).OrderPhysician);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=19)
        @Parameters({"iterations"})
          public void step_19(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.SelectDropDownByText(new VitalDXObjects(driver).OrderPhysician,"Mr VitalAxis, Physician");

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=20)
        @Parameters({"iterations"})
          public void step_20(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.scrollWindowToElement(new VitalDXObjects(driver).FirstNameLabel);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=21)
        @Parameters({"iterations"})
          public void step_21(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              ranfn=javamethod.generateRandomAlphabetic(5);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=22)
        @Parameters({"iterations"})
          public void step_22(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              result=javamethod.Concat("Joy",ranfn);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=23)
        @Parameters({"iterations"})
          public void step_23(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.setData("/Excel/VitalDXData.xlsx","Sheet1",2,2,result);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=24)
        @Parameters({"iterations"})
          public void step_24(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.EnterData(new VitalDXObjectsNew(driver).FNtextfield,actions.getData("./Excel/VitalDXData.xlsx","Sheet1",2,2));

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=25)
        @Parameters({"iterations"})
          public void step_25(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.EnterData(new VitalDXObjectsNew(driver).LastNameTextffield,actions.getData("./Excel/VitalDXData.xlsx","Sheet1",2,2));

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=26)
        @Parameters({"iterations"})
          public void step_26(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).Gender);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=27)
        @Parameters({"iterations"})
          public void step_27(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.SelectDropDownByText(new VitalDXObjects(driver).Gender,"Male");

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=28)
        @Parameters({"iterations"})
          public void step_28(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.EnterData(new VitalDXObjects(driver).Date,"05/11/1995");

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=29)
        @Parameters({"iterations"})
          public void step_29(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).SaveBtnFacilityUSer);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=30)
        @Parameters({"iterations"})
          public void step_30(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.ThreadSleep("3000");

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=31)
        @Parameters({"iterations"})
          public void step_31(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.SwitchToMainPage();

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=32)
        @Parameters({"iterations"})
          public void step_32(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.SwitchToFrame(new VitalDXObjects(driver).topIFrame);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=33)
        @Parameters({"iterations"})
          public void step_33(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              reqnum=actions.GetObjectText(new VitalDXObjects(driver).RequistionNumber);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=34)
        @Parameters({"iterations"})
          public void step_34(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.PrintVariable(reqnum, "reqnum", varMethodName);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=35)
        @Parameters({"iterations"})
          public void step_35(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              reqnumber1=actions.CheckObjectIsDisplayed(new VitalDXObjects(driver).RequistionNumber);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=36)
        @Parameters({"iterations"})
          public void step_36(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.SwitchToFrame(new VitalDXObjectsNew(driver).ChildFrame1);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=37)
        @Parameters({"iterations"})
          public void step_37(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.scrollWindowToEnd();

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=38)
        @Parameters({"iterations"})
          public void step_38(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).SaveANDCloseFU);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=39)
        @Parameters({"iterations"})
          public void step_39(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.ThreadSleep("3000");

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=40)
        @Parameters({"iterations"})
          public void step_40(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.SwitchToMainPage();

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=41)
        @Parameters({"iterations"})
          public void step_41(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.SwitchToFrame(new VitalDXObjects(driver).topIFrame);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=42)
        @Parameters({"iterations"})
          public void step_42(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).Requistion);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=43)
        @Parameters({"iterations"})
          public void step_43(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.SwitchToFrame(new VitalDXObjectsNew(driver).ChildFrame1);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=44)
        @Parameters({"iterations"})
          public void step_44(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).RequistionASP25);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=45)
        @Parameters({"iterations"})
          public void step_45(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.scrollWindowToEnd();

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=46)
        @Parameters({"iterations"})
          public void step_46(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.ThreadSleep("3000");

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=47)
        @Parameters({"iterations"})
          public void step_47(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).Order);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=48)
        @Parameters({"iterations"})
          public void step_48(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.ThreadSleep("3000");

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=49)
        @Parameters({"iterations"})
          public void step_49(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              for(i=0;i<1;i++){
actions.AcceptAlert();
actions.ThreadSleep("3000");
actions.AcceptAlert();
}//For-End

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=50)
        @Parameters({"iterations"})
          public void step_50(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.ThreadSleep("3000");

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=51)
        @Parameters({"iterations"})
          public void step_51(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.SwitchToMainPage();

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=52)
        @Parameters({"iterations"})
          public void step_52(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.SwitchToFrame(new VitalDXObjects(driver).topIFrame);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=53)
        @Parameters({"iterations"})
          public void step_53(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).OrdersIcon);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=54)
        @Parameters({"iterations"})
          public void step_54(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.ThreadSleep("3000");

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

              @Test(priority=55)
        @Parameters({"iterations"})
          public void step_55(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).Logout);

              try{
              driver.get().switchTo().alert();
          }
          catch(NoAlertPresentException e){
              String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
      actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption);
      Reporter.log(browserName);
      Reporter.log(browserVersion);
      Reporter.log(actions.CaptureScreenShotAtEachStep(path,methodName,screenshotOption));
          }
              
          String status="PASS";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);  
          actions.AssertAll();
          driver.get().quit();
              }
          catch(Exception e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 

          catch(Throwable e)
          {
          String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();     
          actions.CaptureOnFailure(path1,methodName,failScreenshotoption);
          Reporter.log(browserName);
          Reporter.log(browserVersion);
          Reporter.log(actions.CaptureOnFailure(path1,methodName,failScreenshotoption));
          e.printStackTrace();
          actions.captureDOM(path,fileName);
          String status="FAIL";
          javamethod.MongoDBUpdate(status,reportRuncount,fileName,pid);
          actions.CloseCurrentTab();
          driver.get().quit();
          throw e;
          } 
          };

             
}
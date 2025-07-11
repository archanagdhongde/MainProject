
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
public class sID2621 extends  AllActions {
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
boolean accessnumber;
	
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
              actions.EnterData(new VitalDXObjects(driver).UserName,"Labuser");

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
              actions.EnterData(new VitalDXObjects(driver).Password,"P@ssword@123");

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
              actions.ThreadSleep("2000");

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

              @Test(priority=7)
        @Parameters({"iterations"})
          public void step_7(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).LabOrders);

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

              @Test(priority=9)
        @Parameters({"iterations"})
          public void step_9(@Optional("1") int iterations) throws Exception
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

              @Test(priority=10)
        @Parameters({"iterations"})
          public void step_10(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).LabAllCases);

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

              @Test(priority=12)
        @Parameters({"iterations"})
          public void step_12(@Optional("1") int iterations) throws Exception
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

              @Test(priority=13)
        @Parameters({"iterations"})
          public void step_13(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.VisibilityOfElement(new VitalDXObjects(driver).Accession,"30");

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
              actions.Click(new VitalDXObjects(driver).Accession);

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
              actions.AcceptAlert();

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

              @Test(priority=17)
        @Parameters({"iterations"})
          public void step_17(@Optional("1") int iterations) throws Exception
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

              @Test(priority=18)
        @Parameters({"iterations"})
          public void step_18(@Optional("1") int iterations) throws Exception
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

              @Test(priority=19)
        @Parameters({"iterations"})
          public void step_19(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              accessnumber=actions.CheckObjectIsDisplayed(new VitalDXObjects(driver).AccessionNumber);

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
              actions.PrintVariable(accessnumber, "accessnumber", varMethodName);

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

              @Test(priority=22)
        @Parameters({"iterations"})
          public void step_22(@Optional("1") int iterations) throws Exception
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

              @Test(priority=23)
        @Parameters({"iterations"})
          public void step_23(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).SaveNProceedSI);

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
              actions.Click(new VitalDXObjects(driver).BodySite);

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
              actions.MoveToObject(new VitalDXObjects(driver).LeftApex);

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
              actions.Click(new VitalDXObjects(driver).LeftApex);

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
              actions.Click(new VitalDXObjects(driver).SIInformatnNextStep);

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

              @Test(priority=29)
        @Parameters({"iterations"})
          public void step_29(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).GrossingNextStep);

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
              actions.Click(new VitalDXObjects(driver).FinishProcess);

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
              actions.Click(new VitalDXObjects(driver).Cases);

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
              actions.Click(new VitalDXObjects(driver).Assignments);

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

              @Test(priority=36)
        @Parameters({"iterations"})
          public void step_36(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).AssignmentCases);

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
              actions.Click(new VitalDXObjects(driver).AccessionTOS25);

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
              actions.Click(new VitalDXObjects(driver).Assign);

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
              actions.Click(new VitalDXObjects(driver).Pathologist);

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
              actions.SelectDropDownByText(new VitalDXObjects(driver).Pathologist,"Path User");

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
              actions.Click(new VitalDXObjects(driver).CaseAssign);

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
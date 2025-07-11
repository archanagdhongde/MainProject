
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
public class sID2635 extends  AllActions {
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
              actions.EnterData(new VitalDXObjects(driver).UserName,"Pathuser");

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

              @Test(priority=8)
        @Parameters({"iterations"})
          public void step_8(@Optional("1") int iterations) throws Exception
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

              @Test(priority=9)
        @Parameters({"iterations"})
          public void step_9(@Optional("1") int iterations) throws Exception
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

              @Test(priority=10)
        @Parameters({"iterations"})
          public void step_10(@Optional("1") int iterations) throws Exception
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

              @Test(priority=11)
        @Parameters({"iterations"})
          public void step_11(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).BENIGN);

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
              actions.EnterData(new VitalDXObjects(driver).Micronote,"Test");

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
              actions.Click(new VitalDXObjects(driver).AddTestIcon);

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

              @Test(priority=15)
        @Parameters({"iterations"})
          public void step_15(@Optional("1") int iterations) throws Exception
          {
          try
          {
              String varMethodName=Thread.currentThread().getStackTrace()[1].getMethodName();
              actions.Click(new VitalDXObjects(driver).HAndE);

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
              actions.Click(new VitalDXObjects(driver).HAndESave);

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
              actions.Click(new VitalDXObjects(driver).TestStrains);

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
              actions.Click(new VitalDXObjects(driver).FulfillTests);

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
              actions.Click(new VitalDXObjects(driver).Save);

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
              actions.Click(new VitalDXObjects(driver).SignOutKebab);

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
              actions.Click(new VitalDXObjects(driver).SignoutAndViewReport);

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
              actions.VisibilityOfElement(new VitalDXObjects(driver).GeneratedReport,"30");

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
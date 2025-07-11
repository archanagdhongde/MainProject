
package reuseablePackage.feature;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
//import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.FindsById;
import org.openqa.selenium.Dimension;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import org.openqa.selenium.JavascriptExecutor;

import java.net.MalformedURLException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
//////////////////////

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.sun.jna.NativeLibrary;
import uk.co.caprica.vlcj.player.MediaPlayer;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.runtime.RuntimeUtil;
///////////////////

import atu.testrecorder.ATUTestRecorder;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
//import io.qameta.allure.Allure;

import org.openqa.selenium.JavascriptExecutor;		

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.ElementNotInteractableException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

//////////////////////////////////Visual Testing///////////////////////////////////////
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

/////////////////////////////////////////////////////////Zap Library///////////////////
import java.io.*;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Proxy;
import org.zaproxy.clientapi.core.*;
/////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////Performance Library///////////////////
import javax.net.ssl.SSLContext;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import java.util.*;
import org.testng.annotations.*;
import org.testng.annotations.Optional;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AllActions

{

    //////////////////////////////////Visual Test//////////////////////////////////////////
	ExtentReports report;
    ExtentTest test;
	//////////////////////////////////Visual Test//////////////////////////////////////////
	
	//////////////////////////////////zap Test//////////////////////////////////////////
	public static int progress;
    private static ClientApi api;
    public static Proxy proxy;
    private static ApiResponse apiResponse;
	private static final String apiKey = "123456789";
   //////////////////////////////////zap Test//////////////////////////////////////////

   //////////////////////////////////Performance//////////////////////////////////////////
	private static final ReentrantLock logLock = new ReentrantLock();
	 private static final ConcurrentHashMap<Long, Integer> userIdMap = new ConcurrentHashMap<>();
	 private static final AtomicInteger userCounter = new AtomicInteger(1);
    private static final String LOG_FILE = "./Reports/performance_results.txt";
    private static final SimpleDateFormat TIMESTAMP_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static final Map<String, List<Long>> responseTimeMap = new HashMap<>();
	private static final Map<Long, Map<String, List<Double>>> stepResponseTimesMap = new ConcurrentHashMap<>();
	private static final AtomicInteger runningTests = new AtomicInteger(0);
	private static final Map<String, Map<Long, Map<String, List<Double>>>> testCaseResponseTimesMap = new ConcurrentHashMap<>();

  
	// public static WebDriver driver;
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public  ATUTestRecorder recorder;

	public String Option="Yes";

	SoftAssert soft=new SoftAssert();

	/////////////////newly addded as per the testing team/////////////


	private final Logger logger =  LoggerFactory.getLogger(AllActions.class);
	private static final String[] OPTIONS = {
			"--quiet",
			"--quiet-synchro",
			"--intf",
			"dummy"
	};

	private static final String RECORDINGFORMAT = ".mp4";
	private static final String SOUT    = ":sout=#transcode{vcodec=h264,vb=%d,scale=%f}:duplicate{dst=file{dst=%s}}";
	private static final String MRL     = "screen://";
	private static final String FPS     = ":screen-fps=%d";
	private static final String CACHING = ":screen-caching=%d";

	private static final int    fps     = 24;//80
	private static final int    caching = 500;
	private static final int    bits    = 1024;
	private static final float  scale   = 1.5f;

	private MediaPlayerFactory mediaPlayerFactory;
	private MediaPlayer mediaPlayer;
	public String address;
	

	//--------------------------------------------Browser specific Actions -------------------------------------------------------//



public void OpenNewBrowserforMobile(String browserName, String Version,String hubIPAddress,int timeout, int width,int height,double pixelRatio, String orientation) throws MalformedURLException {
		report = new ExtentReports(System.getProperty("user.dir") + "\\Reports\\Visualtestreport.html");
		
        if(browserName.equals("Chrome"))///Chrome
		{
		System.out.println("Launching Google browser");

        if (orientation.equals("landscape")) {
            int temp = width;
            width = height;
            height = temp;
        }

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--no-sandbox");
		option.addArguments("--disable-dev-shm-usage");
	    // option.add_argument('--ignore-ssl-errors=yes');
        // option.add_argument('--ignore-certificate-errors');
		// option.addArguments("--headless");
		option.addArguments("disable-infobars");
		option.addArguments("disable-gpu");
        String userAgent = browserName + "/" + Version;
		System.out.println(userAgent);
		Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("width", width);
        deviceMetrics.put("height", height);
        deviceMetrics.put("pixelRatio", pixelRatio);

		Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);
        mobileEmulation.put("userAgent", userAgent);

        option.setExperimentalOption("mobileEmulation", mobileEmulation);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("version",Version);
		capabilities.setCapability(ChromeOptions.CAPABILITY, option);
		// capabilities.setPlatform(Platform.LINUX);

		String hubNewAddress=hubIPAddress+"/wd/hub";
		// driver = new RemoteWebDriver(new URL(hubNewAddress), capabilities);
		driver.set(new RemoteWebDriver(new URL(hubNewAddress),capabilities));
		//System.setProperty("webdriver.get().chrome.driver","F:/20_09_18_Checking/TestNGProject/Drivers/chromedriver.get().exe");
		//driver = new ChromeDriver();
		driver.get().manage().window().maximize();
		driver.get().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		System.out.println("Successfully Navigated to the URL");
		}
		else
		{
		System.out.println("Launching Firefox browser");

		DesiredCapabilities cap = DesiredCapabilities.firefox();
		// cap.setPlatform(Platform.LINUX);
		cap.setCapability("version", Version);

		String hubNewAddress=hubIPAddress+"/wd/hub";

		//driver = new RemoteWebDriver(new URL(hubNewAddress), cap);
		driver.set(new RemoteWebDriver(new URL(hubNewAddress), cap));
		driver.get().manage().window().maximize();
		driver.get().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		System.out.println("Successfully Navigated to the URL");
		}
		}

        public void OpenNewBrowserForJmxGeneration(String browserName, String Version,String hubIPAddress,int timeout) throws MalformedURLException {
		report = new ExtentReports(System.getProperty("user.dir") + "\\Reports\\Visualtestreport.html");
		if(browserName.equals("Chrome"))///Chrome
		{
			System.out.println(browserName);
			System.out.println(Version);
			System.out.println(hubIPAddress);
			System.out.println(timeout);
			//String downloadFilepath = "D:/Data/new_code/backend/uploads/opal/smallProj/small01/projectToRun";
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			chromePrefs.put("profile.default_content_settings.popups", 0);
			//chromePrefs.put("download.default_directory", downloadFilepath);

			ChromeOptions opt= new ChromeOptions();

			opt.setExperimentalOption("prefs", chromePrefs); 
			opt.addExtensions(new File("./BlazeMeter01.crx"));

			System.out.println("Launching Google browser");

			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("browser", "Chrome");
			capabilities.setCapability("browser_version",Version);
			capabilities.setCapability(ChromeOptions.CAPABILITY, opt);
			System.out.println(capabilities);
			// capabilities.setPlatform(Platform.LINUX);

			String hubNewAddress=hubIPAddress+"/wd/hub";
			// driver = new RemoteWebDriver(new URL(hubNewAddress), capabilities);
			driver.set(new RemoteWebDriver(new URL(hubNewAddress),capabilities));
			

			//System.setProperty("webdriver.get().chrome.driver","F:/20_09_18_Checking/TestNGProject/Drivers/chromedriver.get().exe");
			//driver = new ChromeDriver();
			driver.get().manage().window().maximize();
			driver.get().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
			System.out.println("Successfully Navigated to the URL");
		}
		else
		{
			System.out.println("Launching Firefox browser");

			DesiredCapabilities cap = DesiredCapabilities.firefox();
			// cap.setPlatform(Platform.LINUX);
			cap.setCapability("version", Version);

			String hubNewAddress=hubIPAddress+"/wd/hub";
			//driver = new RemoteWebDriver(new URL(hubNewAddress), cap);
			driver.set(new RemoteWebDriver(new URL(hubNewAddress), cap));
			driver.get().manage().window().maximize();
			driver.get().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
			System.out.println("Successfully Navigated to the URL");
		}
	}
   
    
	public void OpenNewBrowser(String browserName, String Version,String hubIPAddress,int timeout) throws MalformedURLException {
		report = new ExtentReports(System.getProperty("user.dir") + "\\Reports\\Visualtestreport.html");
		if(browserName.equals("Chrome"))///Chrome
		{
		System.out.println("Launching Google browser");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--no-sandbox");
		option.addArguments("--disable-dev-shm-usage");
		option.addArguments("--headless");
		option.addArguments("disable-infobars");
		option.addArguments("disable-gpu");

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("version",Version);
		// capabilities.setPlatform(Platform.LINUX);

		String hubNewAddress=hubIPAddress+"/wd/hub";
		// driver = new RemoteWebDriver(new URL(hubNewAddress), capabilities);
		driver.set(new RemoteWebDriver(new URL(hubNewAddress),capabilities));
		//System.setProperty("webdriver.get().chrome.driver","F:/20_09_18_Checking/TestNGProject/Drivers/chromedriver.get().exe");
		//driver = new ChromeDriver();
		driver.get().manage().window().maximize();
		driver.get().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		System.out.println("Successfully Navigated to the URL");
		}
		else
		{
		System.out.println("Launching Firefox browser");

		DesiredCapabilities cap = DesiredCapabilities.firefox();
		// cap.setPlatform(Platform.LINUX);
		cap.setCapability("version", Version);

		String hubNewAddress=hubIPAddress+"/wd/hub";
		//driver = new RemoteWebDriver(new URL(hubNewAddress), cap);
		driver.set(new RemoteWebDriver(new URL(hubNewAddress), cap));
		driver.get().manage().window().maximize();
		driver.get().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		System.out.println("Successfully Navigated to the URL");
		}
		}
	public void OpenNewBrowserzap(String browserName, String Version,String hubIPAddress,int timeout) throws MalformedURLException {
		report = new ExtentReports(System.getProperty("user.dir") + "\\Reports\\Visualtestreport.html");
		if(browserName.equals("Chrome"))///Chrome
		{
		System.out.println("Launching Google browser");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--no-sandbox");
		option.addArguments("--disable-dev-shm-usage");
		System.out.println("Before setProxy"+proxy);
		option.setProxy(proxy);
        option.setAcceptInsecureCerts(true);
        System.out.println("Before setProxy");
		    DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("browser", "Chrome");
			capabilities.setCapability("browser_version",Version);
			capabilities.setCapability(ChromeOptions.CAPABILITY, option);
			System.out.println(capabilities);
        
		String hubNewAddress=hubIPAddress+"/wd/hub";
		// driver = new RemoteWebDriver(new URL(hubNewAddress), capabilities);
		System.out.println("Before RemoteWebDriver");
		driver.set(new RemoteWebDriver(new URL(hubNewAddress),capabilities));
		System.out.println("After RemoteWebDriver");
		//System.setProperty("webdriver.get().chrome.driver","F:/20_09_18_Checking/TestNGProject/Drivers/chromedriver.get().exe");
		//driver = new ChromeDriver();
		driver.get().manage().window().maximize();
		driver.get().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		System.out.println("Successfully Navigated to the URL");
		}
		else
		{
		System.out.println("Launching Firefox browser");

		DesiredCapabilities cap = DesiredCapabilities.firefox();
		// cap.setPlatform(Platform.LINUX);
		cap.setCapability("version", Version);

		String hubNewAddress=hubIPAddress+"/wd/hub";
		//driver = new RemoteWebDriver(new URL(hubNewAddress), cap);
		driver.set(new RemoteWebDriver(new URL(hubNewAddress), cap));
		driver.get().manage().window().maximize();
		driver.get().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		System.out.println("Successfully Navigated to the URL");
		}
		}

		//.............................................................abd zap Test method starts.......................................
	
	 public void setUp(String zapAddress, String zapIP, String zapPort){
        api= new ClientApi(zapIP,Integer.parseInt(zapPort), apiKey);
        System.out.println(api);
        System.out.println("///////////////////////////////////////////Proxy///////////////////////////////////////////////////////");
        proxy = new Proxy().setSslProxy(zapAddress).setHttpProxy(zapAddress);
        }


	public void passiveScan() {
		driver.get().manage().timeouts().implicitlyWait(3600, TimeUnit.SECONDS);
        try {
            api.pscan.enableAllScanners();
            api.pscan.setEnabled("True");
            System.out.println("///////////////////////////starting passive scan//////////////////////////");
            apiResponse = api.pscan.recordsToScan();
            String tempVal = ((ApiResponseElement) apiResponse).getValue();
            while (!tempVal.equals("0")) {
                System.out.println("passive scan is in progress");
                apiResponse = api.pscan.recordsToScan();
                tempVal = ((ApiResponseElement) apiResponse).getValue();
            }
            System.out.println("passive scan is completed");
        } catch (ClientApiException e) {
            e.printStackTrace();
        }
		driver.get().manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        }


	 public void testSpider() {
		driver.get().manage().timeouts().implicitlyWait(3600, TimeUnit.SECONDS);
        try {
            // Start spidering the target
			String TARGET = driver.get().getCurrentUrl();
            System.out.println("Spidering target : " + TARGET);
            ApiResponse resp = api.spider.scan(TARGET, null, null, null, null);
            String scanID;
            int progress;

            // The scan returns a scan id to support concurrent scanning
            scanID = ((ApiResponseElement) resp).getValue();
            // Poll the status until it completes
            while (true) {
                Thread.sleep(1000);
                progress = Integer.parseInt(((ApiResponseElement) api.spider.status(scanID)).getValue());
                System.out.println("Spider progress : " + progress + "%");
                if (progress >= 100) {
                    break;
                }
            }
            System.out.println("Spider completed");
            
            List<ApiResponse> spiderResults = ((ApiResponseList) api.spider.results(scanID)).getItems();
            // Print out the spider results
            for (ApiResponse result : spiderResults) {
                System.out.println("Spider Result URL: " + ((ApiResponseElement) result).getValue());
            }

        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
            e.printStackTrace();
        }
		driver.get().manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }
	

	 public void testAjaxSpider() {
		driver.get().manage().timeouts().implicitlyWait(3600, TimeUnit.SECONDS);
    	// Create the ZAP Client
        try {
            // Start spidering the target
			String TARGET = driver.get().getCurrentUrl();
            System.out.println("Ajax Spider target : " + TARGET);
            ApiResponse resp = api.ajaxSpider.scan(TARGET, null, null, null);
            System.out.println("Ajax Spider response : " + resp);

            String status;

            long startTime = System.currentTimeMillis();
            long timeout = TimeUnit.MINUTES.toMillis(2); // Two minutes in milli seconds
            // Loop until the ajax spider has finished or the timeout has exceeded
            while (true) {
                Thread.sleep(2000);
                status = (((ApiResponseElement) api.ajaxSpider.status()).getValue());
                System.out.println("Spider status : " + status);
                if (!("stopped".equals(status)) || (System.currentTimeMillis() - startTime) < timeout) {
                    break;
                }
            }
            System.out.println("Ajax Spider completed");
            // Perform additional operations with the Ajax Spider results
            List<ApiResponse> ajaxSpiderResponse = ((ApiResponseList) api.ajaxSpider.results("0", "10")).getItems();
            System.out.println("Ajax Spider results : " + ajaxSpiderResponse);


            // Use Selenium to navigate through the website
            
            

        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
            e.printStackTrace();
        }
		driver.get().manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }
	
	
	public void testActiveScan() {
		driver.get().manage().timeouts().implicitlyWait(3600, TimeUnit.SECONDS);
        try {
            String TARGET = driver.get().getCurrentUrl();
            System.out.println("Active Scanning target : " + TARGET);
            ApiResponse resp = api.ascan.scan(TARGET, "True", "False", null, null, null);
            String scanid;
            int progress;

            // The scan now returns a scan id to support concurrent scanning
            scanid = ((ApiResponseElement) resp).getValue();
            // Poll the status until it completes
            while (true) {
                Thread.sleep(5000);
                progress =
                        Integer.parseInt(
                                ((ApiResponseElement) api.ascan.status(scanid)).getValue());
                System.out.println("Active Scan progress : " + progress + "%");
                if (progress >= 100) {
                    break;
                }
            }

            System.out.println("Active Scan complete");
            // Print vulnerabilities found by the scanning
            System.out.println("Alerts:");
            ApiResponseList alerts = (ApiResponseList) api.core.alerts("", "", "");
            for (ApiResponse alert : alerts.getItems()) {
            	System.out.println("Alert: " + alert);
            
        }
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
            e.printStackTrace();
        }
		driver.get().manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }
	public void generateZapReport(String zapIpAddress) throws InterruptedException {
	 JavascriptExecutor executor = (JavascriptExecutor) driver.get();

	 executor.executeScript("window.open();");
     ArrayList<String> tabs = new ArrayList<String> (driver.get().getWindowHandles());
	
    driver.get().switchTo().window(tabs.get(1));
	driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get().get(zapIpAddress+"/UI/core/other/htmlreport"); 
	driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	((RemoteWebDriver)driver.get()).findElementById("apikey").sendKeys("123456789");
	((RemoteWebDriver)driver.get()).findElementById("button").click();

	SimpleDateFormat dateFormatForFoldername = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
             Date currentDate = new Date();
             dateFormatForFoldername.format(currentDate);
         try {
             URL oracle = new URL(driver.get().getCurrentUrl());
             BufferedReader in = new BufferedReader(
             new InputStreamReader(oracle.openStream()));

			BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir")+"/Reports/owaspzap.html"));

             String inputLine;
             while ((inputLine = in.readLine()) != null){
                 try{
                     writer.write(inputLine);
                 }
                 catch(IOException e){
                     e.printStackTrace();
                     return;
                 }
             }
             in.close();
             writer.close();
         }
         catch(Exception ex) {
             System.out.println(ex.getMessage());
             ex.printStackTrace();
         } 

    driver.get().close();
    driver.get().switchTo().window(tabs.get(0));
}
// 	public void generateZapReport(String zapIpAddress) throws InterruptedException {
// 	 JavascriptExecutor executor = (JavascriptExecutor) driver.get();

// 	 executor.executeScript("window.open();");
//      ArrayList<String> tabs = new ArrayList<String> (driver.get().getWindowHandles());
	
//      driver.get().switchTo().window(tabs.get(1));
// 	 driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
// 	 driver.get().get(zapIpAddress+"/UI/core/other/htmlreport"); 
// 	 driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
// 	 ((RemoteWebDriver)driver.get()).findElementById("apikey").sendKeys("123456789");
// 	 ((RemoteWebDriver)driver.get()).findElementById("button").click();

// 	SimpleDateFormat dateFormatForFoldername = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
//              Date currentDate = new Date();
//              String folderDateFormat = dateFormatForFoldername.format(currentDate);
//          try {
//              URL oracle = new URL(driver.get().getCurrentUrl());
//              BufferedReader in = new BufferedReader(
//              new InputStreamReader(oracle.openStream()));

// 			BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir")+"/Reports/owaspzap.html"));

//              String inputLine;
//              while ((inputLine = in.readLine()) != null){
//                  try{
//                      writer.write(inputLine);
//                  }
//                  catch(IOException e){
//                      e.printStackTrace();
//                      return;
//                  }
//              }
//              in.close();
//              writer.close();
//          }
//          catch(Exception ex) {
//              System.out.println(ex.getMessage());
//              ex.printStackTrace();
//          } 

//     driver.get().close();
//     driver.get().switchTo().window(tabs.get(0));
// }
		//.............................................................abd zap ends.......................................

		//.............................................................abd visual testing starts.....................................//
		 public void PreparePageBaseline(){
			String cururl = driver.get().getCurrentUrl();
			String[] str = cururl.split("/|-|:|\\.");
	        String name = str[3]+str[str.length-1];
			File folder1 = new File("../../images/"+str[3]);
			if (!folder1.exists()){
   				 folder1.mkdirs();
			}
			File folder2 = new File("../../images/"+str[3]+"/baseline");
			if (!folder2.exists()){
   				 folder2.mkdirs();
			}
        	Screenshot screen = new AShot().takeScreenshot(driver.get());
        	BufferedImage bi = screen.getImage();
        	File file = new File("../../images/"+str[3]+"/baseline/" + name + ".png");
        	try {
           	 ImageIO.write(bi, "png", file);
        	} catch (IOException e) {
            	e.printStackTrace();
       	     }
    	}
		 public void TakePageScreenshot(){
			String cururl = driver.get().getCurrentUrl();
			String[] str = cururl.split("/|-|:|\\.");
	        String name = str[3]+str[str.length-1];
			File folder1 = new File("../../images/"+str[3]);
			if (!folder1.exists()){
   				 folder1.mkdirs();
			}
			File folder2 = new File("../../images/"+str[3]+"/screenshots");
			if (!folder2.exists()){
   				 folder2.mkdirs();
			}
        	Screenshot screen = new AShot().takeScreenshot(driver.get());
        	BufferedImage bi = screen.getImage();
        	File file = new File("../../images/"+str[3]+"/screenshots/" + name + ".png");
        	try {
           	 ImageIO.write(bi, "png", file);
        	} catch (IOException e) {
            	e.printStackTrace();
       	     }
    	}

		public void PrepareFullpageBaseline(){
			String cururl = driver.get().getCurrentUrl();
			String[] str = cururl.split("/|-|:|\\.");
	        String name = str[3]+str[str.length-1];
			System.out.println("../../images/"+str[3]);
			File folder1 = new File("../../images/"+str[3]);
			if (!folder1.exists()){
   				 folder1.mkdirs();
			}
			File folder2 = new File("../../images/"+str[3]+"/baseline");
			if (!folder2.exists()){
   				 folder2.mkdirs();
			}
        	Screenshot screen = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver.get());
        	BufferedImage bi = screen.getImage();
        	File file = new File("../../images/"+str[3]+"/baseline/full" + name + ".png");
        	try {
           	 ImageIO.write(bi, "png", file);
        	} catch (IOException e) {
            	e.printStackTrace();
       	     }
    	}

		public void TakeFullpageScreenshot(){
			String cururl = driver.get().getCurrentUrl();
			String[] str = cururl.split("/|-|:|\\.");
	        String name = str[3]+str[str.length-1];
			System.out.println("../../images/"+str[3]);
			File folder1 = new File("../../images/"+str[3]);
			if (!folder1.exists()){
   				 folder1.mkdirs();
			}
			File folder2 = new File("../../images/"+str[3]+"/screenshots");
			if (!folder2.exists()){
   				 folder2.mkdirs();
			}
        	Screenshot screen = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver.get());
        	BufferedImage bi = screen.getImage();
        	File file = new File("../../images/"+str[3]+"/screenshots/full" + name + ".png");
        	try {
           	 ImageIO.write(bi, "png", file);
        	} catch (IOException e) {
            	e.printStackTrace();
       	     }
    	}

		public void PrepareUIElementBaseline(WebElement element, String name){
		String cururl = driver.get().getCurrentUrl();
		String[] str = cururl.split("/|-|:|\\.");
		System.out.println("../../images/"+str[3]);
		File folder1 = new File("../../images/"+str[3]);
			if (!folder1.exists()){
   				 folder1.mkdirs();
			}
			File folder2 = new File("../../images/"+str[3]+"/baseline");
			if (!folder2.exists()){
   				 folder2.mkdirs();
			}
        Screenshot screen = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver.get(), element);
        BufferedImage bi = screen.getImage();
        File file = new File("../../images/"+str[3]+"/baseline/" + name + ".png");
        try {
            ImageIO.write(bi, "png", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public void TakeUIElementScreenshot(WebElement element, String name){
		String cururl = driver.get().getCurrentUrl();
		String[] str = cururl.split("/|-|:|\\.");
		System.out.println("../../images/"+str[3]);
		File folder1 = new File("../../images/"+str[3]);
			if (!folder1.exists()){
   				 folder1.mkdirs();
			}
			File folder2 = new File("../../images/"+str[3]+"/screenshots");
			if (!folder2.exists()){
   				 folder2.mkdirs();
			}
        Screenshot screen = new AShot().coordsProvider(new WebDriverCoordsProvider()).takeScreenshot(driver.get(), element);
        BufferedImage bi = screen.getImage();
        File file = new File("../../images/"+str[3]+"/screenshots/" + name + ".png");
        try {
            ImageIO.write(bi, "png", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	 public void PageVisualtest(){
		String cururl = driver.get().getCurrentUrl();
		test = report.startTest("Visual test report for :" + cururl);
		System.out.println(test);
		String[] str = cururl.split("/|-|:|\\.");
	    String name = str[3]+str[str.length-1];
        BufferedImage imgBaseline = null;
        BufferedImage imgScreenshot = null;
        try {
            imgBaseline = ImageIO.read(new File("../../images/"+str[3]+"/baseline/" + name + ".png"));
            imgScreenshot = ImageIO.read(new File("../../images/"+str[3]+"/screenshots/" + name + ".png"));
        } catch (IOException e) { }

        ImageDiff diffimg = new ImageDiffer().makeDiff(imgBaseline, imgScreenshot);
        boolean isDifferent = diffimg.hasDiff();
		System.out.println(isDifferent);
        if(isDifferent)
        {
			File folderdiff = new File("../../images/"+str[3]+"/diffImages");
			if (!folderdiff.exists()){
   				 folderdiff.mkdirs();
			}
            BufferedImage diffImage = diffimg.getMarkedImage();
            try {
                ImageIO.write(diffImage,
                        "png",
                        new File("../../images/"+str[3]+"/diffImages/" + name + ".png"));
            } catch (IOException e) { }
        }
		File imagePath = new File("../../images/"+str[3]+"/diffImages/full" + name + ".png");
		if(!isDifferent)
	    {
	            test.log(LogStatus.PASS, "Test passed");
				System.out.println("Test passed");
	    }
		else
	    {
	            String diff1 = test.addScreenCapture(imagePath.getAbsolutePath());
	            test.log(LogStatus.FAIL, "Test failed", "screenshot: \n" + diff1);
				System.out.println("Test failed");
	    }
		report.endTest(test);
	    report.flush();
		Assert.assertTrue(!isDifferent);
    }
	 public void FullPageVisualtest(){
		String cururl = driver.get().getCurrentUrl();
		test = report.startTest("Visual test report for :" + cururl);
		String[] str = cururl.split("/|-|:|\\.");
	    String name = str[3]+str[str.length-1];
        BufferedImage imgBaseline = null;
        BufferedImage imgScreenshot = null;
        try {
            imgBaseline = ImageIO.read(new File("../../images/"+str[3]+"/baseline/full" + name + ".png"));
            imgScreenshot = ImageIO.read(new File("../../images/"+str[3]+"/screenshots/full" + name + ".png"));
        } catch (IOException e) { }

        ImageDiff diffimg = new ImageDiffer().makeDiff(imgBaseline, imgScreenshot);
        boolean isDifferent = diffimg.hasDiff();
        System.out.println(isDifferent);
        if(isDifferent)
        {
			File folderdiff = new File("../../images/"+str[3]+"/diffImages");
			if (!folderdiff.exists()){
   				 folderdiff.mkdirs();
			}
            BufferedImage diffImage = diffimg.getMarkedImage();
            try {
                ImageIO.write(diffImage,
                        "png",
                        new File("../../images/"+str[3]+"/diffImages/full" + name + ".png"));
            } catch (IOException e) { }
        }
		File imagePath = new File("../../images/"+str[3]+"/diffImages/full" + name + ".png");
		if(!isDifferent)
	    {
	            test.log(LogStatus.PASS, "Test passed");
				System.out.println("Test passed");
	    }
		else
	    {
	            String diff1 = test.addScreenCapture(imagePath.getAbsolutePath());
	            test.log(LogStatus.FAIL, "Test failed", "screenshot: \n" + diff1);
				System.out.println("Test failed");
	    }
		report.endTest(test);
	    report.flush();
		Assert.assertTrue(!isDifferent);
    }
//.............................................................abd visual testing ends.....................................//

/////////////////////////////////////////////////Performance Testing Starts//////////////////////////////////////////////////////

public void FrontendPerformance(String stepName, String testcaseName, int iterations) throws InterruptedException {
long threadId = Thread.currentThread().getId();
userIdMap.putIfAbsent(threadId, userCounter.getAndIncrement());
int userId = userIdMap.get(threadId);
int activeTests = runningTests.incrementAndGet();
System.out.println("🚀 Test Started | " + testcaseName + " | User " + userId + " | Active Tests: " + activeTests);
// Ensure the test case map exists
testCaseResponseTimesMap.putIfAbsent(testcaseName, new ConcurrentHashMap<>());
Map<Long, Map<String, List<Double>>> threadMap = testCaseResponseTimesMap.get(testcaseName);
// Ensure the thread map exists
threadMap.putIfAbsent(threadId, new ConcurrentHashMap<>());
Map<String, List<Double>> stepMap = threadMap.get(threadId);
// Ensure the step list exists
stepMap.putIfAbsent(stepName, new ArrayList<>());
List<Double> responseTimesList = stepMap.get(stepName);
try {
WebDriver currentDriver = driver.get();
JavascriptExecutor js = (JavascriptExecutor) currentDriver;
for (int i = 1; i <= iterations; i++) {
System.out.printf("🔄 User %d | Iteration %d/%d - Step: %s%n", userId, i, iterations, stepName);
js.executeScript("window.performance.clearResourceTimings();");
long navigationStart = (Long) js.executeScript("return window.performance.timing.navigationStart;");
//currentDriver.navigate().refresh();
String url = currentDriver.getCurrentUrl();
currentDriver.get(url + "?t=" + System.currentTimeMillis());
long loadEventEnd;
long timeout = System.currentTimeMillis() + 60000;
do {
loadEventEnd = (Long) js.executeScript("return window.performance.timing.loadEventEnd;");
if (System.currentTimeMillis() > timeout) {
throw new RuntimeException("⏱️ Page load timeout exceeded");
}
} while (loadEventEnd == 0);
double responseTimeInSeconds = (loadEventEnd - navigationStart) / 1000.0;
responseTimesList.add(responseTimeInSeconds);
System.out.printf("⏱️ User %d | Response Time for %s (Iteration %d): %.2fs%n", userId, stepName, i, responseTimeInSeconds);
}
} finally {
int remainingTests = runningTests.decrementAndGet();
System.out.println("✅ Test Completed | " + testcaseName + " | User " + userId + " | Remaining Tests: " + remainingTests);
if (remainingTests == 0) {
System.out.println("📊 All Tests Completed. Logging Final Averages...");
logFinalAverages();
}
}
}
private static void logFinalAverages() {
if (testCaseResponseTimesMap.isEmpty()) {
System.out.println("⚠️ No response times recorded, skipping log.");
return;
}

try (FileWriter writer = new FileWriter(LOG_FILE, false)) { // Overwrite existing report

// Step 1: Process each test case
for (String testCase : testCaseResponseTimesMap.keySet()) {
    writer.write("NEW<strong>Test Case:</strong> " + testCase + "<br>");
    writer.write("-------------------------------------------<br>");
Map<Long, Map<String, List<Double>>> threadMap = testCaseResponseTimesMap.get(testCase);
Map<String, List<Double>> consolidatedResults = new HashMap<>();
int totalUsers = threadMap.size();
int totalIterations = 0;
// Aggregate step response times
for (Map<String, List<Double>> stepMap : threadMap.values()) {
for (Map.Entry<String, List<Double>> stepEntry : stepMap.entrySet()) {
String step = stepEntry.getKey();
consolidatedResults.putIfAbsent(step, new ArrayList<>());
consolidatedResults.get(step).addAll(stepEntry.getValue());
totalIterations = stepEntry.getValue().size(); // All users run the same iterations
}
}
writer.write(String.format("<strong>Users:</strong> %d | <strong>Iterations per User:</strong> %d<br><br>NEW", totalUsers, totalIterations));
// Step 2: Sort steps based on their average response time
List<Map.Entry<String, List<Double>>> sortedSteps = new ArrayList<>(consolidatedResults.entrySet());
sortedSteps.sort(Comparator.comparingDouble(entry ->
entry.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(Double.MAX_VALUE)
));
// Step 3: Print sorted steps
for (Map.Entry<String, List<Double>> stepEntry : sortedSteps) {
String stepName = stepEntry.getKey();
List<Double> responseTimes = stepEntry.getValue();
double avgTime = responseTimes.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
writer.write(String.format("<tr><td>%s</td><td>%s</td><td>%.2f</td><td>%d</td></tr>", testCase, stepName, avgTime, responseTimes.size()));
}
}
writer.flush();
System.out.println("✅ Performance report written to: " + LOG_FILE);
} catch (IOException e) {
e.printStackTrace();
}
}
	  
	public static void BackendPerformance(String stepName) {
    	String urlbe = driver.get().getCurrentUrl();
        try (CloseableHttpClient httpClient = createHttpClient()) {
            long startTime = System.nanoTime();
            HttpGet request = new HttpGet(urlbe);
            request.setHeader("User-Agent", "Apache-HttpClient/4.5.13 (Java/17)");
            request.setHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
            request.setHeader("Accept-Language", "en-US,en;q=0.5");
            request.setHeader("Referer", urlbe);

            try (CloseableHttpResponse response = httpClient.execute(request)) {
                long endTime = System.nanoTime();
                long responseTime = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
                int statusCode = response.getStatusLine().getStatusCode();
                
                responseTimeMap.computeIfAbsent(stepName, k -> new ArrayList<>()).add(responseTime);
                System.out.printf("| %-30s | %-10d ms | %-10d |\n", urlbe, responseTime, statusCode);
                //successCount.incrementAndGet();
            } catch (IOException e) {
                System.err.printf("❌ [ERROR] Request failed: %s\n", e.getMessage());
                //failureCount.incrementAndGet();
            }

          //  logPerformanceMetrics(step);
            //Logging the responses
            try {
                String timestamp = TIMESTAMP_FORMAT.format(new Date());
                List<Long> responseTimes = responseTimeMap.getOrDefault(stepName, Collections.<Long>emptyList());
                if (responseTimes.isEmpty()) {
                    return;
                }

                long minTime = responseTimes.stream().mapToLong(Long::longValue).min().orElse(-1);
                long maxTime = responseTimes.stream().mapToLong(Long::longValue).max().orElse(-1);
                double avgTime = responseTimes.stream().mapToLong(Long::longValue).average().orElse(-1);

                String logEntry = String.format(
                    "\n━━━━━━━━━━━━━━━━━━━━━━━━━━━\n" +
                    "📌 Performance Metrics - Step: %s\n" +
                    "🕒 Timestamp: %s\n" +
                    "✅ Total Requests: %d\n" +
                    "⏳ Min Response Time: %d ms\n" +
                    "⏳ Max Response Time: %d ms\n" +
                    "⏳ Avg Response Time: %.2f ms\n" +
                    "━━━━━━━━━━━━━━━━━━━━━━━━━━━\n",
                    stepName, timestamp, responseTimes.size(), minTime, maxTime, avgTime
                );

                System.out.println(logEntry);
                
                //WRITING THE LOGS
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(LOG_FILE, true))) {
                    writer.write("<tr><td>Backend Response</td><td>"+stepName+"</td><td>"+avgTime / 1000.0+" sec</td></tr>");
                }
                
            } catch (Exception e) {
                System.err.println("❌ [ERROR] Failed to log response times: " + e.getMessage());
            }
            
        } catch (Exception e) {
            System.err.println("❌ [ERROR] Backend response check failed: " + e.getMessage());
        }
    }

	private static CloseableHttpClient createHttpClient() throws Exception {
        SSLContext sslContext = SSLContexts.custom()
                .loadTrustMaterial(new TrustSelfSignedStrategy())
                .build();

        return HttpClients.custom()
                .setSSLContext(sslContext)
                .setSSLHostnameVerifier(NoopHostnameVerifier.INSTANCE)
                .build();
    }

/////////////////////////////////////////////////Performance Testing Ends//////////////////////////////////////////////////////

public void startRecording(String scriptName) throws InterruptedException {
		
		  driver.get().get("https://auth.blazemeter.com/auth/realms/blazect/protocol/saml/clients/blazemeter"); 
		  ((RemoteWebDriver)driver.get()).findElementById("username").sendKeys("cmkulkarni987@gmail.com");
		  ((RemoteWebDriver)driver.get()).findElementById("password").sendKeys("Chidu@05");
		  
		  ((RemoteWebDriver) driver.get()).findElementById("kc-login").click();
		 

		driver.get().get("chrome-extension://mbopgmdnpcbohhpnfglgohlbhfongabi/main.html");
		driver.get().switchTo().frame("iframe");
		((RemoteWebDriver) driver.get()).findElementById("name").sendKeys(scriptName);
		((RemoteWebDriver) driver.get()).findElementById("record").click();
		System.out.println("done");
		 
	}

	public void stopRecording() throws InterruptedException {
		Thread.sleep((5000));
		driver.get().get("chrome-extension://mbopgmdnpcbohhpnfglgohlbhfongabi/main.html");
		//driver.get().switchTo().window(address);
		address = driver.get().getWindowHandle();
		driver.get().switchTo().frame("iframe");
		((RemoteWebDriver) driver.get()).findElementById("stop").click();
		((RemoteWebDriver) driver.get()).findElementById("button-edit-jmeter").click();
		//Thread.sleep((10000));
		Set<String>s=driver.get().getWindowHandles();
		for(String i: s) {
			driver.get().switchTo().window(i);
		}
		((RemoteWebDriver) driver.get()).findElementById("upload-jmx").click();
		Thread.sleep(3000);
		driver.get().switchTo().window(address);
		driver.get().switchTo().frame("iframe");
		List<WebElement> list=((RemoteWebDriver) driver.get()).findElementsByName("domains");
		System.out.println("rakesh\n"+list+"manu");
		for(WebElement e : list) { 
		e.click();
		}
		
		list=((RemoteWebDriver) driver.get()).findElementsByClassName("button");
		for(WebElement e : list) { 
			if (e.isDisplayed()) {
		e.click();
			}
		}
		
		//logout
		Thread.sleep(8000);
		driver.get().get("https://a.blazemeter.com/app/logout");
		driver.get().quit();
	}


	public void Refresh()    
	{
		driver.get().navigate().refresh();
	}


	@SuppressWarnings("static-access")
	public void CloseCurrentTab()
	{
		this.driver.get().close();
	}


	public void CloseAllTabs()
	{
		driver.get().quit();
	}


	public void AcceptAlert() throws Exception 

	{

		driver.get().switchTo().alert().accept();

	}//method Updated on 12/08/2019 by testing team


	public void DismissAlert() throws Exception
	{
		driver.get().switchTo().alert().dismiss();
	}////method Updated on 12/08/2019 by testing team

	public String GetAlertText()
	{
		String output=driver.get().switchTo().alert().getText();
		return output;
	}

	public void NavigateForward()   
	{
		driver.get().navigate().forward();
	}


	public void NavigateBack()  
	{
		driver.get().navigate().back();
	}
     //----------------------------------------------------------Scroll methods Starts-----------------------------------------//
	    // public void scrollWindowToPixels(String pixels) {
        //     JavascriptExecutor js = (JavascriptExecutor) driver.get();
        //     js.executeScript("window.scrollBy(0, " + pixels + ")");
        // }
		public void scrollWindowToXPixels(int pixels) {
            JavascriptExecutor js = (JavascriptExecutor) driver.get();
            js.executeScript("window.scrollBy(" + pixels + ", 0)");
        }

		public void scrollWindowToYPixels(int pixels) {
            JavascriptExecutor js = (JavascriptExecutor) driver.get();
            js.executeScript("window.scrollBy(0, " + pixels + ")");
        }

		public void scrollWindowWithXYPixels(String x, String y){
            JavascriptExecutor js = (JavascriptExecutor) driver.get();
            js.executeScript("window.scrollBy(" + x + "," + y +")");
        }

        public void scrollWindowToElement(WebElement element) {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver.get();
            jsExecutor.executeScript("arguments[0].scrollIntoView();", element);
        }

        public void scrollWindowToEnd() {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver.get();
            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        }
	//----------------------------------------------------------Scroll methods ends-----------------------------------------//
	
	//----------------------------------------------------------Print Variable Starts-----------------------------------------//
	
	public void PrintVariable(int varValue, String varName, String methName)throws Exception
	{
       System.out.println("Print Statement------------------------------------------------------------");
	   System.out.println("Method Name : "+methName);
	   System.out.println("Variable Name : "+varName+", Variable Value : "+varValue);
	}

	public void PrintVariable(String varValue,String varName, String methName)throws Exception
	{
       System.out.println("Print Statement------------------------------------------------------------");
	   System.out.println("Method Name : "+methName);
	   System.out.println("Variable Name : "+varName+", Variable Value : "+varValue);
	}

	public void PrintVariable(boolean varValue,String varName, String methName)throws Exception
	{
       System.out.println("Print Statement------------------------------------------------------------");
	   System.out.println("Method Name : "+methName);
	   System.out.println("Variable Name : "+varName+", Variable Value : "+varValue);
	}

	public void PrintVariable(double varValue,String varName, String methName)throws Exception
	{
       System.out.println("Print Statement------------------------------------------------------------");
	   System.out.println("Method Name : "+methName);
	   System.out.println("Variable Name : "+varName+", Variable Value : "+varValue);
	}

	public void PrintVariable(Date varValue,String varName, String methName)throws Exception
	{
       System.out.println("Print Statement------------------------------------------------------------");
	   System.out.println("Method Name : "+methName);
	   System.out.println("Variable Name : "+varName+", Variable Value : "+varValue);
	}

	public void PrintVariable(Cookie varValue,String varName, String methName)throws Exception
	{
       System.out.println("Print Statement------------------------------------------------------------");
	   System.out.println("Method Name : "+methName);
	   System.out.println("Variable Name : "+varName+", Variable Value : "+varValue);
	}

	public void PrintVariable(Set varValue,String varName, String methName)throws Exception
	{
       System.out.println("Print Statement------------------------------------------------------------");
	   System.out.println("Method Name : "+methName);
	   System.out.println("Variable Name : "+varName+", Variable Value : "+varValue);
	}

	public void PrintVariable(Dimension varValue,String varName, String methName)throws Exception
	{
       System.out.println("Print Statement------------------------------------------------------------");
	   System.out.println("Method Name : "+methName);
	   System.out.println("Variable Name : "+varName+", Variable Value : "+varValue);
	}

	//----------------------------------------------------------Print Variable Ends-----------------------------------------//


	public void EnterApplicationURL(String input) throws Exception   
	{
		driver.get().get(input);
	}


	public String GetPageTitle() throws Exception    
	{
		String output =driver.get().getTitle();
		return output;
	}


	public void MaximizeBrowserWindow() throws Exception   
	{
		driver.get().manage().window().maximize();
	}//method Updated on 12/08/2019 by testing team


	public Set<String> GetMultipleWindowHandles()
	{

		Set<String> output = driver.get().getWindowHandles();
		return output;
	}

	public String GetCurrentBrowserWindowHandle()
	{
		String output=driver.get().getWindowHandle();
		return output;
	}////method Updated on 12/08/2019 by testing team

	public void SwitchToWindowTab(String input)
	{
		int count =1;
		int data = Integer.parseInt(input);
		Set<String> tabs = driver.get().getWindowHandles();
		for(String id:tabs){
			if(count == data){
				driver.get().switchTo().window(id);
				break;
			}
			count++;
		}
	}

	////////////////////Switching to iFrame///////////////////////////////////////////

	public static boolean SwitchToFrameWhereUIElementLocatedByIndex(WebElement targetElement, int depth) {
        List<WebElement> iframes = driver.get().findElements(By.tagName("iframe"));
        System.out.println("Depth " + depth + ": Found " + iframes.size() + " iframe(s).");

        new WebDriverWait(driver.get(), 5);
        for (WebElement iframe : iframes) {
            try {
                // Print the frame ID or name (if available)
                String frameName = iframe.getAttribute("name");
                String frameId = iframe.getAttribute("id");
                System.out.println("Entering Frame: " + (frameName != null ? frameName : "Unnamed") + " | ID: " + (frameId != null ? frameId : "No ID"));

                // Switch to the current iframe
                driver.get().switchTo().frame(iframe);

                // Wait until the target element is visible and interactable
                
                try {
                   //WebElement targetElement = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
                    if (targetElement != null && targetElement.isDisplayed() && targetElement.isEnabled()) {
                        System.out.println("Target element found in Frame: " + (frameName != null ? frameName : "Unnamed") + " | ID: " + (frameId != null ? frameId : "No ID"));

                        // If the standard interaction fails, use JavaScriptExecutor as a fallback
                        // JavascriptExecutor jsExecutor = (JavascriptExecutor) driver.get();
                        // jsExecutor.executeScript("arguments[0].value='" + input + "';", targetElement);
                        return true; // Stop searching as the interaction is complete
                    }
                } catch (Exception e) {
                    // Element not found in the current frame, continue
                    System.out.println("Target element not interactable in this frame.");
                }

                // Recursively search in nested frames
                boolean foundInChildFrame = SwitchToFrameWhereUIElementLocatedByIndex(targetElement, depth + 1);
                if (foundInChildFrame) {
                    return true; // Stop searching if found in child frames
                }

                // Switch back to the parent frame
                driver.get().switchTo().parentFrame();

            } catch (Exception e) {
                System.out.println("Error accessing frame: " + e.getMessage());
            }
        }

        return false; // Element not found in this frame or its child frames
     }
	

	public void SwitchToFrame(WebElement Object)
	{
		driver.get().switchTo().frame(Object);
	}

	public void SwitchToMainPage() {
		driver.get().switchTo().defaultContent();
	}

	public void OpenNewTab() throws AWTException
	{
		//driver.get().findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("window.open();");
		System.out.println("tab created");
	}



	public void waitToNavigate() throws Exception
	{
		driver.get().navigate().wait();
	}


	//		List<Cookie >cook= .....load the stuff
	//		Iterator<Cookie> it =cook.iterator();
	//		while (it.hasNext()) {
	//		  String output=it.next();
	//		  System.out.println(string);
	//		}
	public String GetCookieName()
	{
		String output = null;
		for(Cookie ck : driver.get().manage().getCookies())							
		{	
			output=ck.getName();
		}
		return output;
	}

	public String GetCookieValue()
	{

		String output = null;
		for(Cookie ck : driver.get().manage().getCookies())							
		{	
			output=ck.getValue();
		}
		return output;

	}//updated on 27-08-2019


	public String GetCookieDomain()
	{
		String output = null;
		for(Cookie ck : driver.get().manage().getCookies())							
		{	
			output=ck.getDomain();
		}
		return output;
	}


	public String GetCookiePath()
	{
		String output = null;
		for(Cookie ck : driver.get().manage().getCookies())							
		{	
			output=ck.getPath();
		}
		return output;
	}


	public Date GetCookieExpiryDate()
	{
		Date output = null;
		for(Cookie ck : driver.get().manage().getCookies())							
		{	
			output=ck.getExpiry();
		}
		return output;

	}


	public boolean CheckCookieIsSecured()
	{
		boolean  output = false;
		for(Cookie ck : driver.get().manage().getCookies())							
		{	
			output=ck.isSecure();
		}
		return output ;

	}//Updated on 27-08-2019


	public void DeleteAllCookieDetails()
	{
		driver.get().manage().deleteAllCookies();
	}  ///Updated on 27-08-2019


	public void DeleteCookies(Cookie input)
	{
		driver.get().manage().deleteCookie(input);
	}


	public void DeleteCookieName(String input)
	{
		driver.get().manage().deleteCookieNamed(input);
	}/////Updated on 27-08-2019


	public void AddCookies(String cookie,String cookieValue)
	{
		Cookie cook=new Cookie(cookie,cookieValue);
		driver.get().manage().addCookie(cook);
	}


	public Set<Cookie>  GetAllCookiesDetails()
	{
		// Cookie output = null;
		Set<Cookie> cookies =driver.get().manage().getCookies();
		// for(Cookie cook:cookies)
		// {
		// 	output=cook;
		// }
		return cookies;
	}//method Updated on 12/08/2019 by testing team


	//------------------------------------------------------Object Specific-------------------------------------------------------//

	public void ClearData(WebElement Object)
	{
		Object.clear();
	}////method Updated on 12/08/2019 by testing team



	public int GetSizeOfList(List<WebElement> Object)
	{	
		int var=Object.size()-1;
		return var;
	}

	public String GetOneObjectFromListByIndex(List<WebElement> Object,int i) throws Exception
	{
		String output=Object.get(i).getText();
		return output;
	}


	public String Equals(WebElement Object, String input)
	{
		String output=Object.getText();
		output.equals(input);
		return output;
	}

	public String GetAttribute(WebElement Object, String input)
	{
		String output = Object.getAttribute(input);
		return output;
	}

	@SuppressWarnings("unchecked")
	public Dimension GetSizeOfObject(WebElement Object)   //Updatedd 27/08/19
	{

		Dimension output = Object.getSize();
		return output;
	}//updated on 27-08-2019

	public String GetTagName(WebElement Object)
	{
		String output = Object.getTagName();
		return output;
	}////method Updated on 12/08/2019 by testing team

	public boolean CheckObjectIsSelected(WebElement Object) throws Exception
	{
		boolean output;
		output = Object.isSelected();
		return output;
		

	}

	public boolean CheckObjectIsDisplayed(WebElement Object) throws Exception
	{
		boolean output;
		try{
			output = Object.isDisplayed();
			return output;
		}
		catch(Exception e){
			output = false;
			return output;
		}

	}

	public void IsElementDisplayed(WebElement Object) throws Exception
	{
		try{
			Object.isDisplayed();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

	public void IsElementEnabled(WebElement Object) throws Exception
	{
		try{
			Object.isEnabled();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

	// public void CheckObjectIsDisplayed(WebElement Object) throws Exception
	// {
	// 	try{
	// 	     Object.isDisplayed();	
	// 	}
	// 	catch(Exception e){
	// 		throw e;
	// 	}

	// }

	public void CheckObjectIsNotDisplayed(WebElement Object) throws Exception
	{
		try{
		     if(Object.isDisplayed())
			  throw new ObjectPresentException("Element is present!");  	
		}
		catch(Exception e){
			throw e;
		}

	}

	public boolean CheckObjectIsEnabled(WebElement Object) throws Exception
	{
		boolean output;
		output = Object.isEnabled();
		return output;
		

	}
	public void ClickOnSubmitButton(WebElement Object)
	{
		Object.submit();
	}

	/*public Rectangle GetRect(WebElement Object)
			{
				Rectangle output = Object.getRect();
				return output;

			}*/

	public Point GetLocationOfObject(WebElement Object)
	{
		Point output = Object.getLocation();
		return output;

	}

	public String GetCssValue(WebElement Object,String input)
	{
		String output = Object.getCssValue(input);
		return output;
	}

	public int GetHashcodeOfObject(WebElement Object)
	{
		int output = Object.hashCode();
		return output;
	}

	public String ConvertToString(WebElement Object)
	{
		String output = Object.toString();
		return output;

	}

	public String GetObjectText(WebElement Object)
	{
		String output = Object.getText();
		return output;

	}

	//--------------------------------------------Drop Down selction -----------------------------------------------------//

	public void SelectDropDownByText(WebElement Object,String input) throws Exception
	{
		try
		{
			Select selectDropdown = new Select(Object);
			selectDropdown.selectByVisibleText(input);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}

	}

	public void SelectDropDownByValue(WebElement Object,String input) throws Exception
	{
		try
		{
			Select selectDropdown = new Select(Object);                        //driver.get().findElement(By.xpath(object)));
			selectDropdown.selectByValue(input);

		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}

	}

	public void SelectDropDownByIndex(WebElement object,int input) throws Exception
	{
		try
		{
			Select selectDropdown = new Select(object);
			selectDropdown.selectByIndex(input);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}

	public void DeselectDropDownByText(WebElement Object,String input) throws Exception
	{
		try
		{
			Select selectDropdown = new Select(Object);
			selectDropdown.deselectByVisibleText(input);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}

	}

	public void DeselectDropDownByValue(WebElement Object,String input) throws Exception
	{
		try
		{
			Select selectDropdown = new Select(Object);
			selectDropdown.deselectByValue(input);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}

	}

	public void DeselectDropDownByIndex(WebElement Object,int input) throws Exception
	{
		try
		{
			Select selectDropdown = new Select(Object);
			selectDropdown.deselectByIndex(input);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}

	public boolean CheckForMultipleDropDown(WebElement Object) throws Exception
	{
		try
		{
			boolean output=false;
			Select selectDropdown = new Select(Object);
			output= selectDropdown.isMultiple();
			return output;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}////method Updated on 12/08/2019 by testing team


	public void DeselectAllDropDown(WebElement Object) throws Exception
	{
		try
		{
			Select selectDropdown = new Select(Object);
			selectDropdown.deselectAll();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}


	public String  GetFirstSelectedDropDownText(WebElement Object) throws Exception
	{
		try
		{
			Select drpElement =new Select(Object);
			String firstOption=drpElement.getFirstSelectedOption().getText();
			return firstOption;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}

	public int  GetAllDropDownOptionLength(WebElement Object) throws Exception
	{
		try
		{
			int output = 0;
			Select drpElement = new Select(Object);
			List<WebElement> allOptions=drpElement.getOptions();
			output = allOptions.size();
			System.out.println(output);
			// for (WebElement webElement : allOptions){
			// 	output=webElement.getText();
			// 	System.out.println(webElement.getText());
			// }
			return output;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}////method Updated on 12/08/2019 by testing team


	/**********************Validations**************************/

	public void ValidateObjectText(WebElement Object,String input) throws Exception
	{
		try
		{
			String ele=Object.getText();
			if(ele.equals(input))
			{
				System.out.println("Successful - Text "+ input +" are successfully validated");
			}
			else 
			{
				System.out.println("Fail - Text "+ input + "doesnt exist");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}////updated on 27-08-2019


	public void ValidateObjectContainText(WebElement Object,String input) throws Exception  //Updated 27/08/19
	{
		try
		{
			String ele=Object.getText();
			if(ele.contains(input))
			{
				System.out.println(" Pass - Object contains  "+ input +" text ");
			}
			else
			{
				System.out.println(" Fail - Object doesnt contains  "+ input +" text ");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}////updated on 27-08-2019

	public void AssertEqualsForDouble(double actual, double expected)  //New Added
	{
		soft.assertEquals(actual, expected);
	}

	public void AssertNotEqualsForDouble(double actual, double expected)  //New Added
	{
		soft.assertNotEquals(actual, expected);   
	}


	//--------------------------------------KeyBoard and Mouse ----------------------------------------------------------------//


	public void RightClickOnObject(WebElement Object)
	{
		Actions act=new Actions(driver.get());
		act.contextClick(Object).perform(); 
	}////method Updated on 12/08/2019 by testing team

	public void ClickObjectFromListByIndex(List<WebElement> Object , int var) throws Exception 
	{
		Object.get(var).click();
	}

	public void DoubleClick(WebElement Object)
	{
		Actions act = new Actions(driver.get());
		act.doubleClick(Object).build().perform();
	}

	public void ClickAndHold(WebElement Object)
	{

		Actions act = new Actions(driver.get());
		act.clickAndHold(Object).build().perform();

	}
	//			public void Release()
	//			{
	//				Actions act = new Actions(driver);
	//				act.release();
	//			}

	public void Wait() throws InterruptedException
	{
		Actions act = new Actions(driver.get());
		act.wait();
	}

	public void Wait(int time) throws InterruptedException
	{
		Actions act = new Actions(driver.get());
		act.wait(5000);
	}
	public void Release(WebElement Object)
	{
		Actions act = new Actions(driver.get());
		act.release(Object).perform();

	}

	public void Perform()
	{
		Actions act = new Actions(driver.get());
		act.perform();

	}
	public void RightClick()
	{
		Actions act = new Actions(driver.get());
		act.contextClick();
	}

	public void DragAndDrop(WebElement Object,WebElement Object1)
	{
		Actions act = new Actions(driver.get());
		act.dragAndDrop(Object, Object1).perform();

	}

	public void MoveToObject(WebElement Object)
	{
		Actions act = new Actions(driver.get());
		act.moveToElement(Object).perform();
	}////method Updated on 12/08/2019 by testing team


	public void moveByOffset(int xOffset,int yOffset)
	{
		Actions act = new Actions(driver.get());
		act.moveByOffset(xOffset, yOffset);

	}

	public void moveElementWithOffsetValue(WebElement Object,int xOffset,int yOffset)
	{
		Actions act = new Actions(driver.get());
		act.moveToElement(Object, xOffset, yOffset);
	}

	public void dragAndDropElementWithOffsetValue(WebElement Object,int xOffset,int yOffset)
	{
		Actions act = new Actions(driver.get());
		act.dragAndDropBy(Object, xOffset, yOffset);

	}

	public void EnterData(WebElement Object,String input) throws Exception
	{

		Object.sendKeys(input);
	}	  

	public void Click(WebElement Object) throws Exception
	{
		Object.click();
	}

	public void ClickusingJSExec(WebElement Object) throws Exception
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver.get();
		executor.executeScript("arguments[0].click();", Object);
	}

  public void UploadFile(WebElement Object,String input) throws Exception
	{
		((RemoteWebDriver) driver.get()).setFileDetector(new LocalFileDetector());
		File uploadFile = new File(input);

		Object.sendKeys(uploadFile.getAbsolutePath());
	}
	//------------------------------------JsonFile-------------------------------------------------------------------------------//

	public String getJsonValue(String packageName,String className,String JsonMainKeyWord,String jsonSubKeyword) 

	{

		try
		{

			String []parts =packageName.split("\\.");
			String part1=parts[0];
			String part2=parts[1];
			System.out.println("./src/test/java/"+part1+"/"+part2+"/");
			String fileName="./src/test/java/"+part1+"/"+part2+"/"+className+"Config"+".json"; //onhold 
			File file=new File(fileName); 

			JSONParser parser=new JSONParser();

			FileReader reader=new FileReader(file.getAbsolutePath());
			Object obj=parser.parse(reader);

			JSONObject jsonObject = (JSONObject) obj;

			JSONObject jsonObject1 = (JSONObject) jsonObject.get(JsonMainKeyWord);

			String output=(String) jsonObject1.get(jsonSubKeyword); 

			return output;

		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}


	}

	// domCapture starte////////////


	@SuppressWarnings("resource")
	public String captureDOM(String folderPath,String fileName) throws IOException
	{
		String source=driver.get().getPageSource();
		System.out.println(folderPath);
		System.out.println(fileName);
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-H-m-s");  
		Date date = new Date();
        File domfolder = new File("./src/main/java/dom");
        if(!domfolder.isDirectory()){
			boolean success = domfolder.mkdirs();
			System.out.println("type is " +success);
		}
		new File("./src/main/java/dom/"+fileName+dateFormat.format(date)+".html");

		//PrintWriter out= new PrintWriter("./"+"DOM/"+fileName+dateFormat.format(date)+".html");
		PrintWriter out= new PrintWriter("./src/main/java/dom/"+fileName+".html");
		out.println(source);
		out.close();
		return source;

	}

	// domCapturend

	//------------------------------------Video recording --------------------------------------------------------------//

	public String startVideoRecord(String executionCount,String suiteName,String fileName) throws Exception {
		File file=null;
		try
		{
			NativeLibrary.addSearchPath(RuntimeUtil.getLibVlcLibraryName(), System.getProperty("user.dir")+"/lib");//
			System.setProperty("VLC_PLUGIN_PATH",  System.getProperty("user.dir")+"/lib/plugins");
			mediaPlayerFactory = new MediaPlayerFactory(OPTIONS);
			mediaPlayer = mediaPlayerFactory.newHeadlessMediaPlayer();

			String mp4FileName = getFile(executionCount+"_"+suiteName+"_"+fileName);
			System.out.println("Video recording started successfully, "+ mp4FileName);
			mediaPlayer.playMedia(MRL, getMediaOptions(mp4FileName));
			file=new File("./Videos/"+executionCount+"_"+suiteName+"_"+fileName+ RECORDINGFORMAT);
		}
		catch(Exception e)
		{
			//startVideoRecord();
			//driver.get().close();
			e.printStackTrace();
			throw e;
		}
		return file.getAbsolutePath();
	}

	public void stopVideoRecord() throws Exception {
		mediaPlayer.stop();
		System.out.println("Video recording stoppped successfully");

	}


	private String getFile(String fileName) {				 
		try
		{
			File dir = new File(System.getProperty("user.dir"), "Videos");
			return dir.getAbsolutePath() + "/" + fileName+".mp4";
		}
		catch(Exception e)
		{
			//startVideoRecord();
			//driver.get().close();
			e.printStackTrace();
			throw e;
		}
		//return file.getAbsolutePath();
	}


	private String[] getMediaOptions(String destination) {
		return new String[] {
				String.format(SOUT, bits, scale, destination),
				String.format(FPS, fps),
				String.format(CACHING, caching)
		};
	}

	//-----------------------------------get Method name------------------------------------------------------//	


	public String getmethodName()
	{
		String fileName=Thread.currentThread().getStackTrace()[1].getMethodName();
		return fileName;
	}


	//-----------------------------------Screenshot folder creation ------------------------------------------------------------//


	public String folderCreation(String executionCount,String suiteName,String fileName,String projectName,String type)
					{
						//File path=file.getAbsoluteFile();
						File file=null;
						new SimpleDateFormat("dd-MM-yyyy H-m-s");
						new Date();
						System.out.println(type.equals("execution"));
						System.out.println(type=="execution");
						// File file=new File("./Screenshot/EachStepScreenshot/"+executionCount+"_"+suiteName+"/"+fileName);
						if(type.equals("execution")){
							file=new File("../../../../../../../UI/uploads/images/"+projectName+"/"+suiteName+"/Screenshot/EachStepScreenshot/"+executionCount+"_"+suiteName+"/"+fileName);
						}else if(type.equals("schedule")||type.equals("ReSchedule")){
							file=new File("../../../../../../../../UI/uploads/images/"+projectName+"/"+suiteName+"/Screenshot/EachStepScreenshot/"+executionCount+"_"+suiteName+"/"+fileName);
						}else if(type.equals("jenkins")){
							file=new File("../../../../../../../../UI/uploads/images/"+projectName+"/"+suiteName+"/Screenshot/FailedScreenshot/"+executionCount+"_"+suiteName+"/"+fileName);
						}else if(type.equals("NormalException")){
							file=new File("../../../../../../../../UI/uploads/images/"+projectName+"/"+suiteName+"/Screenshot/EachStepScreenshot/"+executionCount+"_"+suiteName+"/"+fileName);
						}else if(type.equals("SchedulerException")){
							file=new File("../../../../../../../../../UI/uploads/images/"+projectName+"/"+suiteName+"/Screenshot/EachStepScreenshot/"+executionCount+"_"+suiteName+"/"+fileName);
						} else if(type.equals("Main")){
							file=new File("./Screenshot/EachStepScreenshot/"+executionCount+"_"+suiteName+"/"+fileName);
						}
						System.out.println("File is " +type);
						
						 
						if (!file.isDirectory()) {
						boolean success = file.mkdirs();
						System.out.println("type is " +success);
						}
						System.out.println("path is " + file.getAbsolutePath());
						return file.getAbsolutePath();
					}




						public String folderCreation1(String executionCount,String suiteName,String fileName,String projectName,String type)
					{
						File file=null;
						new SimpleDateFormat("dd-MM-yyyy H-m-s");
						new Date();
						
					if(type.equals("execution")){
							file=new File("../../../../../../../UI/uploads/images/"+projectName+"/"+suiteName+"/Screenshot/FailedScreenshot/"+executionCount+"_"+suiteName+"/"+fileName);
						}else if(type.equals("schedule")||type.equals("ReSchedule")){
							file=new File("../../../../../../../../UI/uploads/images/"+projectName+"/"+suiteName+"/Screenshot/FailedScreenshot/"+executionCount+"_"+suiteName+"/"+fileName);
						}
						else if(type.equals("jenkins")){
							file=new File("../../../../../../../../UI/uploads/images/"+projectName+"/"+suiteName+"/Screenshot/FailedScreenshot/"+executionCount+"_"+suiteName+"/"+fileName);
						}else if(type.equals("NormalException")){
							file=new File("../../../../../../../../UI/uploads/images/"+projectName+"/"+suiteName+"/Screenshot/FailedScreenshot/"+executionCount+"_"+suiteName+"/"+fileName);
						}else if(type.equals("SchedulerException")){
							file=new File("../../../../../../../../../UI/uploads/images/"+projectName+"/"+suiteName+"/Screenshot/FailedScreenshot/"+executionCount+"_"+suiteName+"/"+fileName);
						} else if(type.equals("Main")){
							file=new File("./Screenshot/FailedScreenshot/"+executionCount+"_"+suiteName+"/"+fileName);
						}
						System.out.println("File is " +type);
						if (!file.isDirectory()) {
						boolean success = file.mkdirs();
						System.out.println("type is " +success);
						}
						System.out.println("path1 is " + file.getAbsolutePath());
						return file.getAbsolutePath();
					}


	//-------------------------------------Capture Screenshot on Failure-----------------------------------------------------------------//
	///Changed on 20-03-19 suggested by testing team (Abhilash,Srikanth)				
	// public String CaptureOnFailure(int executionCount,String suiteName,String fileName,String option) throws IOException {
	// File f = null;
	// if(option.equals("Yes"))
	// {
	// DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy H-m-s"); //yy-MM-dd HH-mm-ss
	// Date date = new Date();
	// File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// try {

	// FileUtils.copyFile(scrFile, new File("./ScreenShot/FailedScreenshot/"+ fileName + "-"+dateFormat.format(date) + ".png"));
	// f =new File("./ScreenShot/FailedScreenshot/"+executionCount+"-"+suiteName+"/"+fileName+".png");
	// } 
	// catch (IOException e) {
	// System.out.println(e.getMessage());
	// }
	// catch (Exception e) {
	// e.printStackTrace();
	// }
	// return f.getAbsolutePath();
	// }
	// else
	// {
	// return null;
	// }
	// }

	// public String CaptureOnFailure(String executionCount,String suiteName,String fileName,String option) throws IOException, AWTException {
	// File f = null;
	// if(option.equals("Yes"))
	// {
	// try
	// {
	// //Rectangle screenRectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());	
	// BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
	// f=new File("./Screenshot/FailedScreenshot/"+executionCount+"_"+suiteName+"_"+fileName+".png");
	// ImageIO.write(image, "png", f);
	// }
	// catch (IOException e) {
	// System.out.println(e.getMessage());
	// e.printStackTrace();//
	// throw e;//
	// }
	// catch (Exception e) {
	// e.printStackTrace();
	// }
	// return f.getAbsolutePath();
	// }

	// else
	// {
	// return null;
	// }
	// }


	//----------------------------------------- Capture ScreenShot for EveryStep ------------------------------------------------//
	///Changed on 20-03-19 suggested by testing team (Abhilash,Srikanth)
	// public String CaptureScreenShotAtEachStep(String folderPath,String fileName,String option) throws IOException 
	// {
	// File f = null;
	// if(option.equals("Yes"))
	// {
	// DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-H-m-s"); 
	// Date date = new Date();
	// File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// try 
	// {

	// FileUtils.copyFile(scrFile, new File(folderPath+"/"+fileName+".png"));
	// f =new File(folderPath+"/"+fileName+".png");


	// } 
	// catch (IOException e) 
	// {
	// System.out.println();
	// }

	// }
	// if(option.equals("Yes"))
	// {
	// return f.getAbsolutePath();
	// }
	// else
	// {
	// return null;
	// }
	// }

	// public String CaptureOnFailure(String executionCount,String suiteName,String fileName,String option) throws IOException {
	// 						File f = null;
	// 						if(option.equals("Yes"))
	// 						{
	// 						File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// 						try {

	// 							FileUtils.copyFile(scrFile, new File("./Screenshot/FailedScreenshot/"+executionCount+"_"+suiteName+"_"+fileName+".png"));
	// 							f=new File("./Screenshot/FailedScreenshot/"+executionCount+"_"+suiteName+"_"+fileName+".png");
	// 							 } 
	// 						catch (IOException e) {
	// 							System.out.println(e.getMessage());
	// 						}
	// 						catch (Exception e) {
	// 							e.printStackTrace();
	// 						}
	// 						}
	// 						return f.getAbsolutePath();
	// 					}

	public String CaptureOnFailure(String folderPath,String fileName,String option) throws IOException {
		File f = null;
		if(option.equals("Yes"))
		{
			File scrFile = ((TakesScreenshot)driver.get()).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(scrFile, new File(folderPath+"/"+fileName+".png"));
				f =new File(folderPath+"/"+fileName+".png");//add
			} 
			catch (IOException e) {
				System.out.println(e.getMessage());
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return f.getAbsolutePath();
	}




	// public String CaptureScreenShotAtEachStep(String folderPath,String fileName,String option) throws IOException, HeadlessException, AWTException 

	// {
	// File f = null;
	// if(option.equals("Yes"))
	// {	
	// try
	// {
	// BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));//get dimesion of the screen and create a image 
	// f=new File(folderPath+"/"+fileName+".png");
	// ImageIO.write(image, "png", f);
	// }
	// catch (IOException e) 
	// {
	// System.out.println();
	// }

	// }
	// if(option.equals("Yes"))
	// {
	// return f.getAbsolutePath();
	// }
	// else
	// {
	// return null;
	// }
	// }	

	public String CaptureScreenShotAtEachStep(String folderPath,String fileName,String option) throws IOException{//original method

		File f = null;
		if(option.equals("Yes"))
		{
			File scrFile = ((TakesScreenshot)driver.get()).getScreenshotAs(OutputType.FILE);	
			FileUtils.copyFile(scrFile, new File(folderPath+"/"+fileName+".png"));
			f =new File(folderPath+"/"+fileName+".png");//add
		}
		return f.getAbsolutePath();
	}	


	////////////keyBoard Methods///////////////////////////////

	public void KeyEnter(WebElement Object) throws Exception
	{
		//   WebDriverWait wait=new WebDriverWait (driver,ExplicitWait);
		//   wait.until(ExpectedConditions.elementToBeClickable(Object));
		Object.sendKeys(Keys.ENTER);
	}	

     public void MultipleKeyOperation(WebElement Object) throws Exception
	{
		Actions act = new Actions(driver.get());
        act.keyDown(Keys.SHIFT)
                .sendKeys(Object, Keys.HOME)
                .sendKeys(Keys.DELETE)
                .keyUp(Keys.SHIFT)
                .build()
                .perform();
	}

	
	public void ArrowDown() throws Exception
	{
		Actions act = new Actions(driver.get());
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
	}

	public void ArrowUp() throws Exception
	{
		Actions act = new Actions(driver.get());
		act.sendKeys(Keys.ARROW_UP).build().perform();
	}

	public void ArrowLeft() throws Exception
	{
		Actions act = new Actions(driver.get());
		act.sendKeys(Keys.ARROW_LEFT).build().perform();
	}

	public void ArrowRight() throws Exception
	{
		Actions act = new Actions(driver.get());
		act.sendKeys(Keys.ARROW_RIGHT).build().perform();
	}


	public void BackSpace(WebElement Object) throws Exception
	{
		Object.sendKeys(Keys.BACK_SPACE);
	}

	public void SpaceBar(WebElement Object) throws Exception
	{
		Object.sendKeys(Keys.SPACE);
	}

	public void Tab(WebElement Object) throws Exception
	{
		Object.sendKeys(Keys.TAB);
	}



	////////////////end/////////////////////////


	///////////////////// scrol//////////////////////

	public  void Scroll(int x,int y)
	{
		System.out.println("Calling Scrollllllllllllllllllllllll");
		List<Integer> args = new ArrayList<>();
		args.add(x);
		args.add(y);
		JavascriptExecutor js =  (JavascriptExecutor)driver.get();

		js.executeScript(String.format("window.scrollBy(x=%d,y=%d)", args.toArray()));
	}


	// scroll end/////////////////////////////////



	//////////////////////////// Waits method///////////////////////////////



	public void SimpleWait(int Timeout) throws InterruptedException
	{

		Thread.sleep(Timeout);
	}

	public void AlertIsPresent(int ExplicitWait) throws Exception
	{
		try
		{
			
            long seconds = Duration.ofSeconds(ExplicitWait).getSeconds();
			WebDriverWait wait=new WebDriverWait (driver.get(), seconds);
			if(wait.until(ExpectedConditions.alertIsPresent()) != null){
			System.out.println("Alert is present!");
			}else{
				throw new NoAlertPresentException("Alert not found");
			}
		
		}
		catch(Exception e) {
			System.out.println(e);
  			throw new NoAlertPresentException("Alert not found", e);
 		}

	}


	public void ElementSelectionStateToBe(WebElement Object,String ExplicitWait) throws Exception
	{
		try{
			long t = Integer.parseInt(ExplicitWait);
			long seconds = Duration.ofSeconds(t).getSeconds();
			WebDriverWait wait=new WebDriverWait (driver.get(), seconds);
			System.out.println(wait.until(ExpectedConditions.elementSelectionStateToBe(Object,true)));
			if(wait.until(ExpectedConditions.elementSelectionStateToBe(Object,true)) != false){
				System.out.println("Element Selection State To Be True!");
			}else{
				System.out.println("Element Selection State To Be False!");
				throw new ElementNotInteractableException("Element Selection State To Be False!");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Element Selection State To Be False! in catch");
			throw new ElementNotInteractableException("Element Selection State To Be False!", e);
		}
	}


	public void ElementToBeClickable(WebElement Object,String ExplicitWait) throws Exception
	{
		try
		{
			long t = Integer.parseInt(ExplicitWait);
			long seconds = Duration.ofSeconds(t).getSeconds();
			WebDriverWait wait=new WebDriverWait (driver.get(), seconds);
			if(wait.until(ExpectedConditions.elementToBeClickable(Object))!=null){
				System.out.println("Element To Be Clickable!");
			}else{
				System.out.println("Element To Be Not Clickable!");
				throw new ElementNotInteractableException("Element To Be Not Clickable!");
			}
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Element To Be Not Clickable! in catch");
  			throw new ElementNotInteractableException("Element To Be Not Clickable!");
 		}	

	}						

	public void ElementToBeSelected(WebElement Object,String ExplicitWait) throws Exception
	{
		try{
		long t = Integer.parseInt(ExplicitWait);
			long seconds = Duration.ofSeconds(t).getSeconds();
			WebDriverWait wait=new WebDriverWait (driver.get(), seconds);
		wait.until(ExpectedConditions.elementToBeSelected(Object));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void FrameToBeAvailableAndSwitchToIt(WebElement Object,String ExplicitWait) throws Exception
	{
		try{
		long t = Integer.parseInt(ExplicitWait);
			long seconds = Duration.ofSeconds(t).getSeconds();
			WebDriverWait wait=new WebDriverWait (driver.get(), seconds);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(Object));
     	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	public void TextToBePresentInElement(WebElement Object,String ExplicitWait,String input) throws Exception
	{
		try{
		long t = Integer.parseInt(ExplicitWait);
			long seconds = Duration.ofSeconds(t).getSeconds();
			WebDriverWait wait=new WebDriverWait (driver.get(), seconds);
	    wait.until(ExpectedConditions.textToBePresentInElement(Object, input));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void TextToBePresentInElementValue(WebElement Object,String ExplicitWait,String input) throws Exception
	{
		try{
		long t = Integer.parseInt(ExplicitWait);
			long seconds = Duration.ofSeconds(t).getSeconds();
			WebDriverWait wait=new WebDriverWait (driver.get(), seconds);
	    wait.until(ExpectedConditions.textToBePresentInElementValue(Object, input));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void IsTitels(String ExplicitWait,String title) throws Exception
	{
		try
		{
			long t = Integer.parseInt(ExplicitWait);
			long seconds = Duration.ofSeconds(t).getSeconds();
			WebDriverWait wait=new WebDriverWait (driver.get(), seconds);
			wait.until(ExpectedConditions.titleIs(title));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void IsTitleContains(String ExplicitWait,String title) throws Exception
	{
		try
		{
			long t = Integer.parseInt(ExplicitWait);
			long seconds = Duration.ofSeconds(t).getSeconds();
			WebDriverWait wait=new WebDriverWait (driver.get(), seconds);
			wait.until(ExpectedConditions.titleContains(title));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void VisibilityOfElement(WebElement Object,String ExplicitWait) throws Exception
	{
		try
		{
			long t = Integer.parseInt(ExplicitWait);
			long seconds = Duration.ofSeconds(t).getSeconds();
			WebDriverWait wait=new WebDriverWait (driver.get(), seconds);
			wait.until(ExpectedConditions.visibilityOf(Object));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}




	///////////////////////// waits method ends///////////////////////////////////////////

		///////////////////////// waits method ends///////////////////////////////////////////

	public void HardAssertEqualsForDouble(double actual, double expected) throws Exception {
	        try {
	            Assert.assertEquals(actual, expected);
	            System.out.println("Actual: " + actual + ", Expected: " + expected);
	        } catch (AssertionError e) {
	            System.out.println("Assertion Error: Expected and actual are different.");
	            System.out.println("Actual: " + actual + ", Expected: " + expected);
	            e.printStackTrace();
	            throw new Exception("Assertion failed.");
	        }
	}

   public void HardAssertNotEqualsForDouble(double actual, double expected) throws Exception {
	        try {
	            Assert.assertNotEquals(actual, expected);
	            System.out.println("Actual: " + actual + ", Expected: " + expected);
	        } catch (AssertionError e) {
	            System.out.println("Assertion Error: Expected and actual are different.");
	            System.out.println("Actual: " + actual + ", Expected: " + expected);
	            e.printStackTrace();
	            throw new Exception("Assertion failed.");
	        }
	}

	public void HardAssertEqualsForInt(int actual, int expected) throws Exception {
		try {

			Assert.assertEquals(actual, expected);
			System.out.println("Actual: " + actual + ", Expected: " + expected);
		} catch (AssertionError e) {
			System.out.println("Assertion Error: Expected and actual are different.");
			System.out.println("Actual: " + actual + ", Expected: " + expected);
			e.printStackTrace();
			throw new Exception("Assertion failed.");
		}

	}

    public void HardAssertNotEqualsForInt(int actual, int expected) throws Exception {
		try {

			Assert.assertNotEquals(actual, expected);
			System.out.println("Actual: " + actual + ", Expected: " + expected);
		} catch (AssertionError e) {
			System.out.println("Assertion Error: Expected and actual are different.");
			System.out.println("Actual: " + actual + ", Expected: " + expected);
			e.printStackTrace();
			throw new Exception("Assertion failed.");
		}

	}

	public void HardAssertEqualsForString(String actual, String expected) throws Exception {
		try {

			Assert.assertEquals(actual, expected);
			System.out.println("Actual: " + actual + ", Expected: " + expected);
		} catch (AssertionError e) {
			System.out.println("Assertion Error: Expected and actual are different.");
			System.out.println("Actual: " + actual + ", Expected: " + expected);
			e.printStackTrace();
			throw new Exception("Assertion failed.");
		}
	}

    public void HardAssertNotEqualsForString(String actual, String expected) throws Exception {
		try {

			Assert.assertNotEquals(actual, expected);
			System.out.println("Actual: " + actual + ", Expected: " + expected);
		} catch (AssertionError e) {
			System.out.println("Assertion Error: Expected and actual are different.");
			System.out.println("Actual: " + actual + ", Expected: " + expected);
			e.printStackTrace();
			throw new Exception("Assertion failed.");
		}
	}

     public void HardAssertEqualsForBoolean(boolean actual, boolean expected) throws Exception {
		
			try {

			Assert.assertEquals(actual, expected);
			System.out.println("Actual: " + actual + ", Expected: " + expected);
		} catch (AssertionError e) {
			System.out.println("Assertion Error: Expected and actual are different.");
			System.out.println("Actual: " + actual + ", Expected: " + expected);
			e.printStackTrace();
			throw new Exception("Assertion failed.");
		}
	}
    

    public void HardAssertNotEqualsForBoolean(boolean actual, boolean expected) throws Exception {
		
			try {

			Assert.assertNotEquals(actual, expected);
			System.out.println("Actual: " + actual + ", Expected: " + expected);
		} catch (AssertionError e) {
			System.out.println("Assertion Error: Expected and actual are different.");
			System.out.println("Actual: " + actual + ", Expected: " + expected);
			e.printStackTrace();
			throw new Exception("Assertion failed.");
		}
	}




	//------------------------------------Soft Assertions --------------------------------------------------------------------//


	public void AssertEqualsForBoolean(boolean actual, boolean expected)
	{
		soft.assertEquals(actual, expected);
	}

	public void AssertEqualsForSingleCharacter(char actual, char expected)
	{
		soft.assertEquals(actual, expected);
	}

	public void AssertEqualsForLong(long actual, long expected)
	{
		soft.assertEquals(actual, expected);
	}



	public void AssertEqualsForInteger(int actual, int expected)

	{
		soft.assertEquals(actual, expected);
	}////method Updated on 12/08/2019 by testing team

	public void AssertEqualsForString(String actual, String expected)
	{
		soft.assertEquals(actual, expected);
		System.out.println("comparing this assertions");
	}


	public void AssertEqualsForObject(WebElement actual,WebElement expected)
	{
		soft.assertEquals(actual, expected);
	}




	public void AssertTrueConditionWithMessage(boolean input,String message)
	{
		soft.assertTrue(input, message);
	}


	public void AssertFalseCondtionWithMessage(boolean input,String message)
	{
		soft.assertFalse(input, message);

	}

	public void AssertFalseConditionForObject(boolean input)
	{
		soft.assertFalse(input);
	}


	public void AssertNotEqualsForBoolean(boolean actual, boolean expected)
	{
		soft.assertNotEquals(actual, expected);
	}

	public void AssertNotEqualsForSingleCharacter(char actual, char expected)
	{
		soft.assertNotEquals(actual, expected);
	}

	public void AssertNotEqualsForLong(long actual, long expected)
	{
		soft.assertNotEquals(actual, expected);
	}

	public void AssertNotEqualsForInteger(int actual, int expected)
	{
		soft.assertNotEquals(actual, expected);
	}////method Updated on 12/08/2019 by testing team

	public void AssertNotEqualsForString(String actual, String expected)
	{
		soft.assertNotEquals(actual, expected);
	}


	public void AssertNotEqualsForObject(WebElement actual,WebElement expected)
	{
		soft.assertNotEquals(actual, expected);
	}


	//				public void AssertNotEquals(long actual, long expected)
	//				{
	//					soft.assertNotEquals(actual, expected);
	//				}



	public void AssertNullForObject(WebElement Object)
	{
		soft.assertNull(Object);
	}

	public void AssertNullForObjectWithMessage(WebElement Object, String Message)
	{
		soft.assertNull(Object, Message);
	}

	public void AssertNotNullForObject(WebElement Object)
	{
		soft.assertNotNull(Object);
	}

	public void AssertNotNullForObjectWithMessage(WebElement Object, String Message)
	{
		soft.assertNotNull(Object, Message);
	}


	public void AssertNull(WebElement Object, String Message)
	{
		soft.assertNull(Object);
	}

	public void AssertSameObject(WebElement actualObject,WebElement expectedObject)
	{
		soft.assertSame(actualObject, expectedObject);
	}


	public void AssertSameObjectWithMessage(WebElement actualObject,WebElement expectedObject, String Message)
	{
		soft.assertSame(actualObject, expectedObject, Message);
	}


	public void AssertNotSameObject(WebElement actualObject,WebElement expectedObject)
	{
		soft.assertNotSame(actualObject, expectedObject);
	}


	public void AssertNotSameObjectWithMessage(WebElement actualObject,WebElement expectedObject, String Message)
	{
		soft.assertNotSame(actualObject, expectedObject, Message);
	}



	//---------------------------Three Inputs ------------------------------------------------------------------//


	public void AssertNotEqualsForObjectWithMessage(WebElement actualObject,WebElement expectedObject,String Message)
	{

		soft.assertNotEquals(actualObject,expectedObject,Message);

	} //

	public void AssertNotEqualsWithFloatData(float actual,float expected,float delta)
	{
		soft.assertNotEquals(actual, expected, delta);
	}//


	public void AssertNotEqualsWithDoubleData(double actual,double expected,double delta)
	{
		soft.assertNotEquals(actual, expected, delta);
	}//


	public void AssertAll()
	{
		try{
			soft.assertAll();
		}
		catch(Throwable e){
			throw e;
		}
	}





	//				public void assertNotSameWithMessage(WebElement actualObject,WebElement expectedObject,String Message)
	//				{
	//					soft.assertNotSame(actualObject,expectedObject,Message);
	//				}


	public void AsserEqualsForIntegerWithMessage(int actual,int expected,String message)
	{                                                             	
		soft.assertEquals(actual, expected, message);
	}//




	public void AssertEqualsForObjectWithMessage(WebElement actual,WebElement expected,String message)
	{
		soft.assertSame(actual,expected,"two reference objects are point to the same object");
	} //



	//				public void assertEqualsWithFloatTypeData(float actual,float expected,float delta)
	//				{
	//					soft.assertEquals(actual, expected, delta);
	//				}

	//				public void assertEqualsWithDoubleTypeData(double actual,double expected,double delta)
	//				{
	//					softAssert.assertEquals(actual, expected, delta);
	//				}

	public void AssertEqualsForLongTypeWithMessage(long actual,long expected,String message)
	{
		soft.assertEquals(actual, expected, message);
	}



	//------------------------------------Excel data ----------------------------------------------------------------------------//






	// public String getData(String xlPath,String sheetName,int rowNum,int cellNum)
	// {
	// 	String data="";
	// 	 try
	// 	 {
	// 		FileInputStream fis=new FileInputStream(xlPath);
	// 		Workbook w1= WorkbookFactory.create(fis);
	// 		Sheet s1=w1.getSheet(sheetName);
	// 		 Row r1=s1.getRow(rowNum);
	// 		  Cell c1=r1.getCell(cellNum);
	// 		  data=c1.getStringCellValue();
	// 		  return data;
	// 		 }
	// 	  catch(Exception e)
	// 	   {
	// 		  e.printStackTrace();
	// 		  return "";
	// 	   }


	// } 



	public  String getData(String xlpath,String sheetName,int rowNum,int cellNum) throws Exception
	{

		try
		{

			FileInputStream fis = new FileInputStream(xlpath);     
			Workbook wb = WorkbookFactory.create(fis);	
			int type = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getCellType();
			System.out.println("The TYPE = " + type);
			String value = "";

			if(type==Cell.CELL_TYPE_STRING)
			{
				value = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
				System.out.println("The Val1 " + value);
			}

			else if(type==Cell.CELL_TYPE_NUMERIC)
			{
				int nuMvalue = (int)wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getNumericCellValue();
				value = ""+ nuMvalue;
				System.out.println("The Val2 " + value);

			}
			else if(type==Cell.CELL_TYPE_BOOLEAN)
			{
				boolean boolValue =  wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
				value = ""+boolValue;
				System.out.println("The Val3 " + value);
			}
			return value;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "";
		}
	}


	public void setData(String xlPath,String sheetName,int rowNum,int cellNum,int data)
	{
		try
		{
			FileInputStream fis=new FileInputStream("."+xlPath);
			Workbook w1=WorkbookFactory.create(fis);
			Sheet s1=w1.getSheet(sheetName);
			Row r1=s1.createRow(rowNum);
			Cell c1=r1.createCell(cellNum);
			c1.setCellValue(data);

			FileOutputStream fos=new FileOutputStream("."+xlPath);
			w1.write(fos);

             File f = new File("../../MainProject"+xlPath);
			 if(f.isFile() && f.canRead()){
			 fis=new FileInputStream(f);
			 w1=WorkbookFactory.create(fis);
			 s1=w1.getSheet(sheetName);
			 r1=s1.createRow(rowNum);
			 c1=r1.createCell(cellNum);
			 c1.setCellValue(data);

			fos=new FileOutputStream(f);
			w1.write(fos);
			}else{
				System.out.println("Permission not there xlPath");
			}

			f = new File("../.."+xlPath);
			 if(f.isFile() && f.canRead()){
			 fis=new FileInputStream(f);
			 w1=WorkbookFactory.create(fis);
			 s1=w1.getSheet(sheetName);
			 r1=s1.createRow(rowNum);
			 c1=r1.createCell(cellNum);
			 c1.setCellValue(data);

			fos=new FileOutputStream(f);
			w1.write(fos);
			}else{
				System.out.println("Permission not there../..+xlPath");
			}

		}

		catch(Exception e)
		{
			e.printStackTrace();
		}



	}

	public void setData(String xlPath,String sheetName,int rowNum,int cellNum,String data)
	{
		try
		{
			FileInputStream fis=new FileInputStream("."+xlPath);
			Workbook w1=WorkbookFactory.create(fis);
			Sheet s1=w1.getSheet(sheetName);
			Row r1=s1.createRow(rowNum);
			Cell c1=r1.createCell(cellNum);
			c1.setCellValue(data);

			FileOutputStream fos=new FileOutputStream("."+xlPath);
			w1.write(fos);

             File f = new File("../../MainProject"+xlPath);
			 if(f.isFile() && f.canRead()){
			 fis=new FileInputStream(f);
			 w1=WorkbookFactory.create(fis);
			 s1=w1.getSheet(sheetName);
			 r1=s1.createRow(rowNum);
			 c1=r1.createCell(cellNum);
			 c1.setCellValue(data);

			fos=new FileOutputStream(f);
			w1.write(fos);
			}else{
				System.out.println("Permission not there xlPath");
			}

			f = new File("../.."+xlPath);
			 if(f.isFile() && f.canRead()){
			 fis=new FileInputStream(f);
			 w1=WorkbookFactory.create(fis);
			 s1=w1.getSheet(sheetName);
			 r1=s1.createRow(rowNum);
			 c1=r1.createCell(cellNum);
			 c1.setCellValue(data);

			fos=new FileOutputStream(f);
			w1.write(fos);
			}else{
				System.out.println("Permission not there../..+xlPath");
			}

		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	public int getNumberData(String xlPath,String sheetName,int rowNum,int cellNum)
	{
		int data=-1;
		try
		{
			FileInputStream fis=new FileInputStream(xlPath);
			Workbook w1= WorkbookFactory.create(fis);
			Sheet s1=w1.getSheet(sheetName);
			Row r1=s1.getRow(rowNum);
			Cell c1=r1.getCell(cellNum);
			data=(int)(c1.getNumericCellValue());
			return data;
		}

		catch(Exception e)
		{
			e.printStackTrace();
			return data;
		}



	} 


	public String  getData1(String xlPath,String sheetName,int rowNum,int cellNum) throws Exception
	{


		FileInputStream fis=new FileInputStream(xlPath);
		Workbook w1= WorkbookFactory.create(fis);
		Sheet s1=w1.getSheet(sheetName);
		Row r1=s1.getRow(rowNum);
		Cell c1=r1.getCell(cellNum);
		String data=c1.getStringCellValue(); 
		return data;

	}	

	public boolean handleWindowAlert()
	{
		try
		{
			driver.get().switchTo().alert().accept();
		}
		catch (NoAlertPresentException e) 
		{ 
			System.out.println("No Alert Present");
			return false;
		} 
		return true;
	}


	public void OpenApplication(String deviceName,String platform,String UDID,String platformVersion, int timeout,String appPackage , String appActivity, String appiumAddress) throws Exception 

	{         
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);   //"Abilash"
		caps.setCapability(MobileCapabilityType.PLATFORM, platform);   //"Android"
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
		caps.setCapability(MobileCapabilityType.UDID,UDID);  //"ZY3228SRS5"


		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, appPackage);    //application appPackage name
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, appActivity);   
		caps.setCapability("unicodeKeyboard", true);
		caps.setCapability("resetKeyboard", true);

		//driver = new AndroidDriver<MobileElement>(new URL("http://"+appiumAddress+"/wd/hub"),caps);
		driver.set(new AndroidDriver<MobileElement>(new URL("http://"+appiumAddress+"/wd/hub"),caps));
		//driver.get().hideKeyboard();
		//driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),caps);     //"http://127.0.0.1:4723/wd/hub"  //"+appiumAddress+
		System.out.println("2 - testing");
		driver.get().manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		//	driver.get().switchTo().defaultContent();
	}

	public void ThreadSleep(String data) throws InterruptedException {
		int t = Integer.parseInt(data);
		Thread.sleep(t);
	}













































}

















































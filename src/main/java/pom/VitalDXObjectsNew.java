
package pom;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindAll;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import java.util.List;

import reuseablePackage.feature.AllActions;


public class VitalDXObjectsNew {

// public WebDriver driver=null;
// public VitalDXObjectsNew (WebDriver driver)
// 	{
// 		this.driver = driver;
// 		PageFactory.initElements(AllActions.driver, this);        // Reusable is a Reusable class where we initalize Web Driver ( public static WebDriver driver =null)
//     }
    
ThreadLocal<WebDriver> driver;
	 	public VitalDXObjectsNew (ThreadLocal<WebDriver> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver.get(), this);    
	}	


@FindBy(xpath="//input[@id='txtLoginID']	")public WebElement UserName;

@FindBy(xpath="//input[@id='txtPassword']")public WebElement Password;

@FindBy(xpath="//input[@id='btnLogin']")public WebElement LoginButton;

@FindBy(xpath="//span[@id='New<br></span>Requisition_0']")public WebElement NewRequisition;

@FindBy(xpath="//table/tbody/tr[1]/td[2]/select[@id='ddlCaseType']")public WebElement CaseTypeDropdown;

@FindBy(xpath="//table/tbody/tr[1]/td[2]/div/iframe[@id='workAreaFrame']")public WebElement childIFrame;

@FindBy(xpath="//iframe[@id='topFrame']")public WebElement topIframe;

@FindBy(xpath="//select[@id='ddlprocedure']")public WebElement CollectionMethod;

@FindBy(xpath="//input[@id='txtNoJars']")public WebElement NoOfJars;

@FindBy(xpath="//select[@id='ddlServices']")public WebElement CIServices;

@FindBy(xpath="//input[@id='txtICD1']")public WebElement ICD;

@FindBy(xpath="//table[@id='PatientsSearch']//tr[1]//td[3]	")public WebElement FirstNameLabel;

@FindBy(xpath="//input[@id='txtNewFirstName']")public WebElement FirstNameTextField;

@FindBy(xpath="//input[@id='txtNewLastName']	")public WebElement LastNameTextffield;

@FindBy(xpath="//input[@id='txtNewDOB']")public WebElement Date;

@FindBy(xpath="//select[@id='ddlGender']")public WebElement Gender;

@FindBy(xpath="//input[@id='lnkSaveOnly']")public WebElement SaveBtnFacilityUser;

@FindBy(xpath="//table/tbody/tr[3]/td[contains(text(),'Requisition #-')]	")public WebElement RequistionNumber;

@FindBy(xpath="//input[@id='btnsaveonly']")public WebElement SaveANDCloseFU;

@FindBy(xpath="//img[@class='req icons icons_32']")public WebElement Requistion;

@FindBy(xpath="//table/tbody/tr[1]/td[4]/input[@class='formStylebutton OrderRuleEngine']	")public WebElement Order;

@FindBy(xpath="//a[starts-with(text(),'ASP25')]")public WebElement RequistionASP25;

@FindBy(xpath="//img[@class='orders icons icons_32']")public WebElement OrdersIcon;

@FindBy(xpath="//td[6]//div[1]//img[1]	")public WebElement Logout;

@FindBy(xpath="//span[contains(text(),'Skip')]")public WebElement skipOfuser;

@FindBy(xpath="//select[@id='ddlPhysician']")public WebElement OrderPhysician;

@FindBy(xpath="//a[contains(text(),'ASP25')]")public WebElement reqNumASP;

@FindBy(xpath="//a[contains(text(),'Orders')]	")public WebElement LabOrders;

@FindBy(xpath="//a[contains(text(),' All Cases ')]	")public WebElement LabAllCases;

@FindBy(xpath="//iframe[@id='MenuGetVL']	")public WebElement FootIframe;

@FindBy(xpath="//table/tbody/tr[1]/td[4]/input[@class='formStylebutton OnAccessionRuleEngine']")public WebElement Accession;

@FindBy(xpath="(//table/tbody/tr[1]/td[4]/input[@class='formStylebutton SaveRuleEngine'])[3]	")public WebElement SaveNProceedSI;

@FindBy(xpath="//table/tbody/tr[2]/td[3]/span[@class='AutocompleteDownarrow spanLocPos']")public WebElement BodySite;

@FindBy(xpath="//span[@id='AddTest_1']")public WebElement AddTests;

@FindBy(xpath="//p[@id='qtest_8']")public WebElement HENocharge;

@FindBy(xpath="(//table/tbody/tr[1]/td[5]/button[contains(text(),'Next Step')])[1]	")public WebElement SIInformatnNextStep;

@FindBy(xpath="(//table/tbody/tr[1]/td[4]/button[@class='GrossCompleteRuleEngine'])[2]	")public WebElement FinishGrossing;

@FindBy(xpath="(//table/tbody/tr[1]/td[4]/button[@class='GrossCompleteRuleEngine'])[1]	")public WebElement GrossingNextStep;

@FindBy(xpath="(//table/tbody/tr[1]/td[5]/button[@class='ProcessingCompleteRuleEngine'])[1]")public WebElement FinishProcessing;

@FindBy(xpath="//img[@class='activeCases icons icons_32']	")public WebElement ActiveCases;

@FindBy(xpath="(//table/tbody/tr[1]/td[3]/input[@class='formStylebutton newbtnheight'])[6]	")public WebElement Assign;

@FindBy(xpath="//select[@id='ddlPathologist']	")public WebElement Pathologist;

@FindBy(xpath="//button[@id='btnAssignSave']//span[@class='ui-button-text'][contains(text(),'Assign')]")public WebElement CaseAssign;

@FindBy(xpath="//a[starts-with(text(),'TOS25')]")public WebElement AccessionTOS25;

@FindBy(xpath="//a[contains(text(),'LEFT APEX')]")public WebElement LeftApex;

@FindBy(xpath="//table/tbody/tr[1]/td[1]/a[starts-with(text(),'Cases')]	")public WebElement Cases;

@FindBy(xpath="//img[@class='assignments icons icons_32']	")public WebElement Assignments;

@FindBy(xpath="//table[@id='tblWorkList']//a[contains(text(),' All Cases ')]")public WebElement AssignmentCases;

@FindBy(xpath="//button[@id='ResetTo_ORGD676342']")public WebElement BENIGN;

@FindBy(xpath="//textarea[@id='txtMicroNotes_1']")public WebElement Micronotes;

@FindBy(xpath="//table/tbody/tr[1]/td[17]/button[@id='btnSave']")public WebElement Save;

@FindBy(xpath="//table/tbody/tr[1]/td[17]/button[@id='btnPreviewReport']")public WebElement PreviewReport;

@FindBy(xpath="//table/tbody/tr[1]/td[13]/button[@id='signOutFlyout']	")public WebElement SignOutKebab;

@FindBy(xpath="//div/p[@id='SignoutViewReport']")public WebElement SignoutAndViewReport;

@FindBy(xpath="//table/tbody/tr[1]/td[1]/div[contains(text(),' ')]")public WebElement VerifyName;

@FindBy(xpath="//table/tbody/tr[3]/td[contains(text(),'TOS25')]")public WebElement AccessionNumber;

@FindBy(xpath="//table/tbody/tr[1]/td[5]/a[@id='AddTestMain']")public WebElement AddTestIcon;

@FindBy(xpath="//p[contains(text(),'H&E (No Charge)')]")public WebElement HAndE;

@FindBy(xpath="//span[contains(text(),'Save')]	")public WebElement HAndESave;

@FindBy(xpath="(//div/ul/li[@class='TabbedPanelsTab tooltip ui-state-default ui-corner-top'])[2]	")public WebElement Testsorstrains;

@FindBy(xpath="//table/tbody/tr[2]/td[1]/span[contains(text(),'Fulfill all Tests/Stains')]")public WebElement FulfillTests;

@FindBy(xpath="//div[@id='sizer']")public WebElement GeneratedReport;

@FindBy(xpath="//a[contains(text(),'Finalized')]	")public WebElement Finalized;

@FindBy(xpath="//input[@id='PatientName_']")public WebElement PatientName;

@FindBy(xpath="//input[@id='txtNewSearch']")public WebElement SearchBox;

@FindBy(xpath="//table/tbody/tr[1]/td[2]/div/iframe[@id='workAreaFrame']")public WebElement ChildFrame1;

@FindBy(xpath="//input[@id='txtNewFirstName']")public WebElement FNtextfield;

@FindBy(xpath="//table/tbody/tr[1]/td[2]/select[@id='ddlCaseType']")public WebElement CTDropdown;
//pomStart
	


}

















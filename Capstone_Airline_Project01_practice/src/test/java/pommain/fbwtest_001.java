package pommain;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.ExtentReports;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import jdbc_001.jdbcbookings;
import jdbc_001.jdbcuser_001;
import pompages.completeBooking;
import pompages.loginUser;
import pompages.userReg;

public class fbwtest_001 {
	
	WebDriver driver;
	
	loginUser lu = new loginUser();
	
	userReg ur = new userReg();
	
	completeBooking cb = new completeBooking();
	
	jdbcuser_001 ju= new jdbcuser_001();
	
	jdbcbookings jb=new jdbcbookings();
	
	ExtentReports extent = new ExtentReports();
  @Test
  public void flightticketbooking() 
  {
	    driver = new ChromeDriver();
	    
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8080/FlyAway/login"); 
		
		System.out.println("----------------------------------------------------");
	
		ur.userregistrationmethod(driver);
		
	
	ExtentTest test1 = extent.createTest("registrationpage","Testing the user registration");
	
	test1.log(Status.PASS, "registration done");
	
    System.out.println("registration successfull");
    
    System.out.println("----------------------------------------------------");
    
    lu.loginusermethod(driver);
	
	
	ExtentTest test2 = extent.createTest("userlogin","Testing Login");
	
	test2.log(Status.PASS, "login done");
  
	System.out.println("Login successfull");
  
	System.out.println("----------------------------------------------------");
	
	ju.jdbcusermethod();  
	
    ExtentTest test4 = extent.createTest("userdetails","from database");
	
	test4.log(Status.PASS, "done");
  
	System.out.println("database done");
	
	System.out.println("----------------------------------------------------");
	
	cb.completebookingmethod(driver);
	
	ExtentTest test3 = extent.createTest("booking page","checking booking");
	
	test3.log(Status.PASS, "ticket booking done");
	
    System.out.println("flight booking successfull");
    
    System.out.println("----------------------------------------------------");
    
    jb.jdbcbookingsmethod();  
    
    ExtentTest test5 = extent.createTest("userbookingdetails","from database");
	
	test5.log(Status.PASS, "done");
  
	System.out.println("database done");
	
	System.out.println("----------------------------------------------------");
	
  }
	
	

	  @BeforeClass
	  public void beforeClass() {
		  String ptReport = System.getProperty("user.dir")+"/Reports/";

			String rName = "flightbookingtests.html";
			String fname = ptReport+rName;
			System.out.println(fname);
			
			
			ExtentHtmlReporter html = new ExtentHtmlReporter(fname);
			extent.attachReporter(html);
			
		  System.out.println("beforeClass");
	  }

	  @AfterClass
	  public void afterClass() {
		  extent.flush();
		  
		  System.out.println("afterClass");
	  }	  
	  
	  
	  
	  
	  
  
}

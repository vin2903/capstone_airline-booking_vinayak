package pompages;


	

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class userReg {
	
		
		
		public void userregistrationmethod(WebDriver driver) {
		
		
		
		
		driver.findElement(By.xpath("//*[@href='signup']")).click();
		driver.findElement(By.xpath("//input[@name='email_id']")).sendKeys("satinew@gmail.com");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("satinew@143");
		driver.findElement(By.xpath("//input[@name='pwd2']")).sendKeys("satinew@143");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("satinew");
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("mpladdress");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("mplcity");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[7]/td/button")).click();
		System.out.println("-------------details from Eclipse------------------");
		System.out.println( "satinew@gmail.com"+" "+"satinew@143"+" "+"satinew"+" "+"mpladdress"+" "+"mplcity");

	}
	}




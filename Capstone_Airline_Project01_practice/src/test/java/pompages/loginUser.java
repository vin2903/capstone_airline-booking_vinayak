package pompages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginUser {
		
		
		public void loginusermethod(WebDriver driver) {
		
		
		
		driver.findElement(By.xpath("//*[@href='login']")).click();
		driver.findElement(By.xpath("//input[@name='email_id']")).sendKeys("sati@gmail.com");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("sati@143");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/button")).click();

	}
	}




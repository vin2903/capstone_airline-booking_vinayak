
	package pompages;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class completeBooking  {
		
		
		
		public void completebookingmethod(WebDriver driver) {
		
		
		driver.findElement(By.xpath("//*[@href='home']")).click();
		driver.findElement(By.xpath("//select[@name='source']")).click();
		driver.findElement(By.xpath("//select[@name='source']//option[@value='1']")).click();
		driver.findElement(By.xpath("//select[@name='destination']")).click();
		driver.findElement(By.xpath("//select[@name='destination']//option[@value='11']")).click();
		 WebElement table1 = driver.findElement(By.xpath("/html/body/table"));
		    
	     List<WebElement> rowsList = table1.findElements(By.tagName("tr"));

	     List<WebElement> columnsList = null;

	    for (WebElement row : rowsList) {
	            System.out.println();
	            columnsList = row.findElements(By.tagName("td"));

	             for (WebElement column : columnsList) {
	                    System.out.print(column.getText() + "  ");
	            }
	    }

		driver.findElement(By.xpath("//html/body/form/table/tbody/tr/td[3]/button")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Book Flight')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Your Bookings')]")).click();
	    WebElement table2 = driver.findElement(By.xpath("//table"));
	    
	            List<WebElement> rowsList1 = table2.findElements(By.tagName("tr"));

	            List<WebElement> columnsList1 = null;

	           for (WebElement row : rowsList1) {
	                   System.out.println();
	                   columnsList1 = row.findElements(By.tagName("td"));

	                    for (WebElement column : columnsList1) {
	                           System.out.print(column.getText() + "  ");
	                   }
	           }
		}
	}





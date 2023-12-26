package revision;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class endtoend {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdrive.chrome.driver", "C:\\Users\\Sandeep\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//opening Website 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//dynamic autosuggest 
		driver.findElement(By.id("autosuggest")).sendKeys("IND");
		
		//sleep for 1 sec 
		try {
		Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			
		}
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class = 'ui-menu-item']"));
		for(WebElement option:options ) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
			}
			
		}
		
		//selecting one way
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		//departure 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		driver.findElement(By.cssSelector("a[value='BHO']")).click();
		
		try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		//selecting currency using Select webelement
				WebElement staticdrop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
				Select dropdown = new Select(staticdrop);
				dropdown.selectByIndex(2);
		
		//selecting destination
		driver.findElement(By.cssSelector("div[id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='TIR']")).click();
		
		try {
			Thread.sleep(500);
			}
			catch(InterruptedException e) {
				
			}
		
		//selecting date
	
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
	
		driver.findElement(By.id("divpaxinfo")).click();
		try {
			Thread.sleep(500);
			}
			catch(InterruptedException e) {
				
			}
		driver.findElement(By.id("divpaxinfo")).getText();
		for(int i=1; i<9; i++) {
			if(	driver.findElement(By.id("divpaxinfo")).getText().equalsIgnoreCase("6 Adult")) {
				break;
			}
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		
			
		//selecting family
		
		//driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	}

}

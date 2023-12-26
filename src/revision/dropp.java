package revision;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class dropp {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("websdriver.chrome.driver", "C:\\Users\\Sandeep\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//start here
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.cssSelector("a[value='AIP']")).click();
		try {
		Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			
		}
				//departure box
		driver.findElement(By.cssSelector("div[id='ctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='BHO']")).click();
		driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).isSelected());
		
		driver.findElement(By.id("autosuggest")).sendKeys("IND");
		try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				
			}
		List<WebElement> options = driver.findElements(By.cssSelector("li[class ='ui-menu-item'] a"));
		
		for(WebElement option : options) {
			
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				
			}
		}
		
		
		
		
	}

}

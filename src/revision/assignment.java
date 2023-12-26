package revision;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class assignment {

	public static void main(String[] args) throws InterruptedException {
		// setting up the browser tab
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Sandeep\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//URL
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		
		try {
		Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			
		}
		
		//deslecting 
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		
		try {
			Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				
			}
		//selecting again
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[value='option1']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	}

}

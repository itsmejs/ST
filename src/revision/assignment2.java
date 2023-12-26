package revision;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class assignment2 {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\Sandeep\\\\Documents\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Name
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Abhay");
		
		
		//Email
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abc@gmail.com");
		
		//Password
		driver.findElement(By.cssSelector("input[id='exampleInputPassword1']")).sendKeys("abujaan");
		
		//checkbox   exampleCheck1
		driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();
				
		//Gender
		WebElement staticdrop = driver.findElement(By.id("exampleFormControlSelect1"));
		Select droop = new Select(staticdrop);
		droop.selectByIndex(1);
				
		//employment
		driver.findElement(By.cssSelector("input[id='inlineRadio2']")).click();
				
		//DOB
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("25081996");
				
		//Submit
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}

}

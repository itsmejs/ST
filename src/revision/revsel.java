package revision;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class revsel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","C:\\Users\\Sandeep\\Documents\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Anoop");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("password");
		driver.findElement(By.cssSelector("input[id='chkboxOne']")).click();
		driver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
		driver.findElement(By.className("submit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			
		Thread.sleep(1000);
		} catch (InterruptedException e){
			
		}
		
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Anoop");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("p@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("8877778855");
		driver.findElement(By.cssSelector("button[class = 'reset-pwd-btn']")).click();
		try {
			
			Thread.sleep(1000);
			} catch (InterruptedException e){
				
			}
		System.out.println(driver.findElement(By.cssSelector("p[class = 'infoMsg']")).getText());
		String pass = driver.findElement(By.cssSelector("p[class = 'infoMsg']")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passArray = pass.split("'");
		String password = passArray[1].split("'")[0];
		System.out.println(password);
		
		driver.findElement(By.cssSelector("button[class = 'go-to-login-btn']")).click();
		try {
			
			Thread.sleep(1000);
			} catch (InterruptedException e){
				
			}
		
		//login-with password
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Anoop");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);
		driver.findElement(By.cssSelector("input[id='chkboxOne']")).click();
		driver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
		driver.findElement(By.className("submit")).click();

		
		//driver.close();
	}

}

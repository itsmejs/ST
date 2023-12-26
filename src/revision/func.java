package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","C:\\Users\\Sandeep\\Documents\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		String pass = functt(driver);
		driver.findElement(By.cssSelector("button[class = 'go-to-login-btn']")).click();
		try {
			
			Thread.sleep(1000);
			} catch (InterruptedException e){
				
			}
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Anoop");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(pass);
		//driver.findElement(By.cssSelector("input[id='chkboxOne']")).click();
		//driver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
		driver.findElement(By.className("submit")).click();
		
	}

	public static String functt(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e){
		}
		driver.findElement(By.cssSelector("button[class = 'reset-pwd-btn']")).click();
		try {
			Thread.sleep(1000);
			} catch (InterruptedException e){
		}
		String pass = driver.findElement(By.cssSelector("p[class = 'infoMsg']")).getText();
		String[] passArray = pass.split("'");
		String password = passArray[1].split("'")[0];
		return password;
		
	}
	
}

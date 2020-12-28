package gitprojectinterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gitclsjava {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","C:\\Users\\ARCHANA\\eclipse\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
      driver.get("https://github.com/login");
      driver.findElement(By.id("login_field")).sendKeys("123archanabs");
		driver.findElement(By.id("password")).sendKeys("archanabs@123");
	}

}

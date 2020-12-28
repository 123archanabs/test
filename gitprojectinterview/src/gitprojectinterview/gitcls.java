package gitprojectinterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gitcls {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ARCHANA\\eclipse\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
      driver.get("https://github.com/login");
      driver.findElement(By.id("login_field")).sendKeys("archanarchu700@gmail.com");
		driver.findElement(By.id("password")).sendKeys("archanabs@123");
		
		
              driver.findElement(By.className("btn btn-primary btn-block")).click();

              driver.findElement(By.linkText("/new")).click();
              driver.findElement(By.id("repository_name")). sendKeys("newrepos");
             driver.findElement(By.className("btn btn-primary first-in-line")).click();
	}

}

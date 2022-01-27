import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserNameExtraction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tuhin\\Selenium\\Broswers\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement up = driver.findElement(By.xpath("//div[@id='content']/div[2]/span[1]"));
		String s = up.getText();
		String arr[] = s.split(" ");
		
		String username = arr[3];
		String password = arr[7];
		
		System.out.print(username+" "+password);
		

	}

}

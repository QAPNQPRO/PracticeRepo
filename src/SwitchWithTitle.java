import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWithTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tuhin\\Selenium\\Broswers\\chrome_driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Open Tab']")).click();		
		String parent=driver.getWindowHandle(); //Parent window [1]
		Set<String> s =driver.getWindowHandles(); //child window(s) (2,3,4,5,6,7) - Unique
		
		
		for (String k : s ) {
			
			if(!parent.equals(k)) {
				driver.switchTo().window(k);
				
				if(driver.getTitle().equals("Rahul Shetty Academy")) {
					break;
				}
			}
		}

	}

}

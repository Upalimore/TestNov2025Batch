package javaPackage;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebDriverManager {

	@Test
	public void a() {
		WebDriverManager.chromedriver().setup(); // .edgedriver().setup()
		WebDriver driver = new ChromeDriver(); //edgedriver()
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://paytm.com/");
	}
}

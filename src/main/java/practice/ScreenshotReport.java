package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotReport {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("Amazon Website is launched");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshot/test.png");
		FileHandler.copy(src, dst);
//		System.out.println("Screenshot Taken");

		driver.close();
	}

}

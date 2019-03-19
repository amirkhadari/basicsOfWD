package mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWD {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/innoraft/Amir/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hcltech.com/");
		String expectedTitle = driver.getTitle();
		if(expectedTitle.equals("HCL Technologies: IT Services, Digital Solutions, Technology Consulting"))
		{
			System.out.println("Test Passed");
		}else
		{
			System.out.println("Test Failed");
		}
		driver.close();

	}

}

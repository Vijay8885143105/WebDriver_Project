package august23;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Primusbank_Scrnsht {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(3000);
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\VIDYASAGAR.SHERI\\Pictures\\Screenshots\\scr.jpg"));
		System.out.println("Done");

		// Reverse a string1
		String s="data of the selenium";
		StringBuffer srr= new StringBuffer(s);
		System.out.println(srr.reverse());
		// Reverse a string2
		String a= "program ";
		StringBuffer bb=new StringBuffer(a);
		System.out.println("reverse string is "+bb.reverse());



	}


}

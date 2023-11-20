package webdriver_Project_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CptreGoogle_Telugu_txt_Url {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://google.com");
		Thread.sleep(3000);
		//print  webelemet text
		String str =dr.findElement(By.linkText("తెలుగు")).getText();
		System.out.println(str);
		//print webelement text url
		String str1 =dr.findElement(By.linkText("తెలుగు")).getAttribute("href");
		System.out.println(str1);
		dr.close();

		
		

	}

}

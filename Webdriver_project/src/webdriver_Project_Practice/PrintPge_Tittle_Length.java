package webdriver_Project_Practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPge_Tittle_Length {

	public static void main(String[] args) throws Throwable {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("http://tatacliq.com");
		Thread.sleep(3000);
		String str = "Expected";
		String actl=dr.getTitle();
		System.out.println(actl);
		System.out.println(actl.length());
		Thread.sleep(3000);
		String str1=dr.getCurrentUrl();	
		System.out.println(str1);
		System.out.println(str1.length());
		dr.close();

	}

}

package webdriver_project_practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tittle_Legth {

	public static void main(String[] args) throws Throwable {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://www.google.co.in/"); 
		Thread.sleep(3000);
		String expctd="Google";
		String actual=dr.getTitle();
		System.out.println("Tittle Length::::::::"+actual.length());
		if (expctd.equalsIgnoreCase(actual)) {
			System.out.println("Tittle is matching:::::::::"+expctd+"      "+actual);
		}
		else
		{
			System.out.println("Tittle is Not matching:::::::::"+expctd+"      "+actual);
			dr.close();

		}

	}

}

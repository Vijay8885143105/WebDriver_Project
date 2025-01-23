package webdriver_Project_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_size_gettext {

	public static void main(String[] args) throws Throwable {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("https://uidai.gov.in/en/contact-support.html");
		Thread.sleep(3000);
		//Store the list box in to select class 
		Select Listbox=new Select(dr.findElement(By.xpath("//div[@id='tjmod-334']//select[@title='select a language']")));
		List<WebElement>All_items=Listbox.getOptions();
		System.out.println(All_items.size());
		for (WebElement each : All_items) {
			System.out.println(each);
		}

	

}
}

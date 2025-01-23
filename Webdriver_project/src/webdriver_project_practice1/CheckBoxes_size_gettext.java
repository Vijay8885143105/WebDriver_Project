package webdriver_project_practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes_size_gettext {

	public static void main(String[] args) throws Throwable {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		List<WebElement>All_CheckBoxes=dr.findElements(By.xpath("//label[@class='css-label_c t_c']"));
		System.out.println(All_CheckBoxes.size());
		for (WebElement each : All_CheckBoxes) {
			System.out.println(each.getText());
			
		}
		

	}

}

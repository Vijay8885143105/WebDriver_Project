package july1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Commands_title_titlelength {

	public static void main(String[] args) throws Throwable {
		// create instance object
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.get("http://tatacliq.com");
		Thread.sleep(5000);
		//print page title and title length
		String pagetitle =dr.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print page url and title length
		String strurl =dr.getCurrentUrl();
	    System.out.println(strurl);
	    System.out.println(strurl.length());
	    dr.close();
	}

}

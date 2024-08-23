package august23;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reverese_string {

	public static void main(String[] args) throws Throwable {
		//Reverse String1
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String s="data of the selenium";
		StringBuffer srr= new StringBuffer(s);
		System.out.println("Reverse string is:::::::"+srr.reverse());
        //Reverse string2
		String a= "program ";
		StringBuffer bb=new StringBuffer(a);
		System.out.println("Reverse string is:::::::"+bb.reverse());
	}

}

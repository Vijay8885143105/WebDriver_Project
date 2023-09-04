package july20;
import java.io.BufferedReader;
import java.io.FileReader;
public class ReadData {

	public static void main(String[] args) throws Throwable {
		FileReader fr = new FileReader("");
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while ((str = br.readLine())!=null) {
			Thread.sleep(1000);
			System.out.println(str);
			
		}
			
		}
		

	}



package july20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteText {

	public static void main(String[] args) throws Throwable {
		//Create new file
		File f = new File("D:/sample.text");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("iam learning java");
		bw.newLine();
		bw.write("Iam learning selenium");
		bw.newLine();
		bw.write("Iam learning manual testing");
		bw.flush();
		bw.close();

	}

}

package august23;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_Text {

	public static void main(String[] args) throws Throwable {
		//Create new File
		File f = new File("D:/VIJAY.WRITETEXT");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("I am going to Write Exam Today");
		bw.newLine();
		bw.write("Today date is august24");
		bw.newLine();
		bw.write("My Exam will Starts From 2:30pm");
		bw.flush();
		bw.close();


	}

}

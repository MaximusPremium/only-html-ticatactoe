package onlyhtmltictactoegenerator;

import java.io.FileWriter;
import java.io.File;

public class TictactoeGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = new File("test1.html");
			f.createNewFile();
		} catch(Exception e) {
			System.out.print("aaaaaaaaaa");
		}
		try {
			String x = "<h1><center>ahahhaha</center></h1>";
			FileWriter fw = new FileWriter("test1.html");
			for(int i = 0;i<10;i++) {
				fw.write(x +"\n");
			}
			
			System.out.print("afatto");
			fw.close();
		} catch (Exception e) {
			System.out.print("aaaaaaaaaa x2");
		}
	}

}

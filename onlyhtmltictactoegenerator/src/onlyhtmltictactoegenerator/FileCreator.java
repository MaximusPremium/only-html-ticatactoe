package onlyhtmltictactoegenerator;
import java.io.File;
import java.io.FileWriter;

public class FileCreator {
	public FileCreator() {
		
	}
	public void createFile(String mainS, int [] numeroFile,int idFile) {
		try {
			File f = new File("test1.html");
			f.createNewFile();
		} catch(Exception e) {
			System.out.println("aaaaaaaaaa");
		}
		try {
			String x = mainS;
			FileWriter fw = new FileWriter("case%d.html".formatted(idFile));
			fw.write(x +"\n");
			System.out.println("afatto file n:"+numeroFile[0]);
			fw.close();
			numeroFile[0]++;
		} catch (Exception e) {
			System.out.println("aaaaaaaaaa x2");
		}
	}
}

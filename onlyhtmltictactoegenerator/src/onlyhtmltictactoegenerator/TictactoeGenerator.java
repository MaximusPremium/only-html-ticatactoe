package onlyhtmltictactoegenerator;

public class TictactoeGenerator {

	public static void main(String[] args) {
		int griglia[]= {0,0,0,0,0,0,0,0,0};
		String mainS = "<html>\r\n"
				+ "<body>\r\n"
				+ "    <center>\r\n"
				+ "        <table border=\"solid 1px\">\r\n"
				+ "            <tr>\r\n"
				+ "                <td><a href=\"case%d.html\">&nbsp;%d&nbsp;</a></td>\r\n"
				+ "                <td><a href=\"case%d.html\">&nbsp;%d&nbsp;</a></td>\r\n"
				+ "                <td><a href=\"case%d.html\">&nbsp;%d&nbsp;</a></td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr>\r\n"
				+ "                <td><a href=\"case%d.html\">&nbsp;%d&nbsp;</a></td>\r\n"
				+ "                <td><a href=\"case%d.html\">&nbsp;%d&nbsp;</a></td>\r\n"
				+ "                <td><a href=\"case%d.html\">&nbsp;%d&nbsp;</a></td>\r\n"
				+ "            </tr>\r\n"
				+ "            <tr>\r\n"
				+ "                <td><a href=\"case%d.html\">&nbsp;%d&nbsp;</a></td>\r\n"
				+ "                <td><a href=\"case%d.html\">&nbsp;%d&nbsp;</a></td>\r\n"
				+ "                <td><a href=\"case%d.html\">&nbsp;%d&nbsp;</a></td>\r\n"
				+ "            </tr>\r\n"
				+ "        </table>\r\n"
				+ "    </center>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		int fileCounter[] = {0};
		FileCreator fc = new FileCreator();
		int fileId = 0; // all cells are empty
		//create files
		//1 sis x 
		//2 is o 
		//0 is empty
		String tmp = mainS.formatted(100000000,griglia[0],10000000,griglia[1],1000000,griglia[2],100000,griglia[3],10000,griglia[4],1000,griglia[5],100,griglia[6],10,griglia[7],1,griglia[8]);
		//0 filled 1 file
		fc.createFile(tmp,fileCounter,fileId);
		//1 filled 9 files
		for(int i=0;i<9;i++) {
			griglia[i] = 1;
			
			fileId = 1*(int)Math.pow(10, i);
			tmp = mainS.formatted(100000000,griglia[0],10000000,griglia[1],1000000,griglia[2],100000,griglia[3],10000,griglia[4],1000,griglia[5],100,griglia[6],10,griglia[7],1,griglia[8]);
			fc.createFile(tmp,fileCounter,fileId);
			griglia[i] = 0;
		}
		//2 filled 81 files
		for(int j=0;j<9;j++) {
			griglia[j] = 1;
			for(int i=0;i<9;i++) {
				if(i!=j) {
					griglia[i] = 2;
					tmp = mainS.formatted(100000000,griglia[0],10000000,griglia[1],1000000,griglia[2],100000,griglia[3],10000,griglia[4],1000,griglia[5],100,griglia[6],10,griglia[7],1,griglia[8]);
					fc.createFile(tmp,fileCounter,fileId);
					griglia[i] = 0;
				}
			}
			griglia[j] = 0;
		}
		
		

		
	}
	

}

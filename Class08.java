import java.io.*;
public class Class08 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fl=new FileReader("C:\\Users\\lukan\\eclipse-workspace\\Java14\\class08\\aaa.txt");
		FileReader fr=new FileReader("C:\\Users\\lukan\\eclipse-workspace\\Java14\\class08\\bbb.txt");
		FileWriter fw=new FileWriter("C:\\Users\\lukan\\eclipse-workspace\\Java14\\class08\\ccc.txt");
		BufferedReader bfl=new BufferedReader(fl);
		BufferedReader bfr=new BufferedReader(fr);
		BufferedWriter bfw=new BufferedWriter(fw);
		String str;
		while((str=bfl.readLine())!=null) {
			bfw.write(str);
			bfw.newLine();
		}
		while((str=bfr.readLine())!=null) {
			bfw.write(str);
		}

		bfw.flush();
		fw.close();
		fl.close();
		fr.close();
	}

}

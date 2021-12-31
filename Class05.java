
import java.io.*;

public class Class05 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	      char data[]=new char[128]; 
	      FileReader fl=new FileReader("C:\\Users\\lukan\\eclipse-workspace\\Java14\\src\\class04\\donkey.txt");
	      fl.skip(9);
	      int num=fl.read(data);
	      
	      System.out.println(num);
	      System.out.println(data);
	      fl.close();
	}

}
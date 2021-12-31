import java.io.FileReader;
import java.io.IOException;
public class Class06
{
   public static void main(String args[]) 
   {
	   try {
		   char data[]=new char[128]; 
		   FileReader fr=new FileReader("C:\\Users\\lukan\\eclipse-workspace\\CH11\\ch14\\app14_1\\train.txt");  
		   int num=fr.read(data);     
		   String str=new String(data,0,num);     
		   System.out.println("Characters read= "+num);
		   System.out.println(str);
		   fr.close();
	   }
	   catch(IOException e) {
		   System.out.println(e);
	   }

      
   }
}

import java.util.Scanner;
public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=0;
		for(int i=1;i<=n;i++) {
			num+=i;
		}
		System.out.println(num);
	}

}

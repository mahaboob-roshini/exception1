package myproject5;
import java.util.Scanner;
public class Arraywi {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter index");
	int n=sc.nextInt();
	int a[]=new int[n];
	try {
		System.out.println("exception"+a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}
		finally {
		
		System.out.println("after exception");
	}

}


}





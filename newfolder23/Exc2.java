package myproject5;
import java.util.Scanner;
public class Exc2 {
	public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int a=sc.nextInt();
		System.out.println("enter b value");
		int b=sc.nextInt();
			try {
				int c=a/b;
			}
			catch(ArithmeticException e) {
				System.out.println(e);
				
			}
			finally {
			
			System.out.println("after exception");
		}

	}


	}




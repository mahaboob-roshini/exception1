package myproject5;
import java.util.Scanner;
public class Stringwi {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String n=sc.nextLine();
	
	try {
		System.out.println("exception"+n.charAt(25));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}
		finally {
		
		System.out.println("after exception");
	}

}


}



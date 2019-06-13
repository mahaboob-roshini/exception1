package myproject8;
import java.util.Scanner;
class StringException extends Exception{
	StringException(String s){
		super();
	}
}
class String1{
	 static void put()throws StringException{
		//System.out.println("the names is");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
	String	n1=sc.nextLine();
	if(n1.length()>15) {
	
		throw new StringException("exception");
	}
	else
	{
		System.out.println("no exception");
		
	}
		}
	}

	
public class Character {
	public static void main(String[]args){
		try {
			String1.put();
		}
		catch(StringException e) {
			System.out.println(e);
		}
	}
}

package myproject8;
import java.util.Scanner;
class NumberException extends Exception{
	NumberException(String s){
		super();
	}
}
class Number1{
	 static int num=0,count=100;
	static void put()throws NumberException{
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 value");
		int n1=sc.nextInt();
	System.out.println("enter 2 value");
	int n2=sc.nextInt();
	System.out.println("enter 3 value");
	int n3=sc.nextInt();
	
		 int num=n1+n2+n3;
			System.out.println("sum"+num);
	if(count<num) {
	
		throw new NumberException("exception");
	}
		
	}
	}

	
public class numbers {
	public static void main(String[]args){
		try {
			Number1.put();
		}
		catch(NumberException e) {
			System.out.println(e);
		}
	}
	
}



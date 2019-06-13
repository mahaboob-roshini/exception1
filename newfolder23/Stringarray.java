package myproject8;
import java.util.*;
import java.util.Scanner;
class InvalidException extends Exception{
	InvalidException(String s){
		super();
	}
	
}
class copy{
	static void put()throws InvalidException{
		int count=0;
		
		String s1[]=new String[3];
		s1[0]="word";
		s1[1]="uni";
		s1[2]="you";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		  String str=sc.nextLine();
		  for(int i=0;i<s1.length;i++) {
				
				if(s1[i].equals(str)) {
					
		
					count++;
						System.out.println("your name is");
						break;
					}
		  }
		  if(count==0)
		  {
			 throw new InvalidException("not  name in this ");
	      }
		 
		 
				
	}
	}
public class Stringarray {
	public static void main(String args[]) {
	
	try {
			copy.put();
      }			
		catch(InvalidException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("after");
		}
		
	}
}

	
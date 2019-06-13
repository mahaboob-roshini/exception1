package myproject5;
public class Multiplecatch {
	public static void main(String[] args) {
		int a=10; int b=0;
		try {
			int c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception "+e);
		}
		
		System.out.println("after exception");
	}

}




package myproject5;

public class Exception {
	public static void main(String[] args) {
		int a=10; int b=5;
		try {
			int c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			
		}
		
		System.out.println("after exception");
	}

}

package myproject7;
public class Tryexample {
	public static void main(String[]args) {
		try {
			try {
				int a=10;int b=0;
				int c=a/b;
				System.out.println(c);
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
			
		}finally {
			System.out.println("after complete");
		}
		
	}

}

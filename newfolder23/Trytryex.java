package myproject7;
public class Trytryex {
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
			try {
				int a[]= {0,1,2,3};
				System.out.println("array"+a[10]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
			catch(StringIndexOutOfBoundsException e) {
				System.out.println(e);
				}
		}finally {
			System.out.println("after complete");
		}
		
	}

}




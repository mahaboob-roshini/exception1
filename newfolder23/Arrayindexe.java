package myproject5;
public class Arrayindexe {
	public static void main(String[] args) {
		try {	
		int a[]=new int[5];
		a[10]=20;
		System.out.println("enter value at"+a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}
}

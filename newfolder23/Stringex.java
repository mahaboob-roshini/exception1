package myproject5;
public class Stringex {
	public static void main(String[] args) {
		try {	
		String s="word";
		System.out.println("string is"+s.charAt(5));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}
}



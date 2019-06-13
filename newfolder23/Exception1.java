package myproject6;
class InvalidException extends Exception{
		InvalidException(String s){
			super(s);
		}
	}
	class Userdefined
	{
		 static int valid(int age)throws InvalidException{
			if(age>18) {
				throw new InvalidException("welcome to vote");
			}
			else {
				System.out.println("not eliglible to vote");
			}
			return age;
		 }
	}
	public class Exception1{
		public static void main(String[]args)throws InvalidException {
			Userdefined d=new 	Userdefined ();
			Userdefined.valid(25);
			try {
				System.out.println("enter age");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	





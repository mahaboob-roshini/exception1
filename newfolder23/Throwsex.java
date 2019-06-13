package myproject7;
public class Throwsex {
 void method1()throws ArithmeticException {
method2();
  }
  void method2()throws ArithmeticException  {
method3();
  }
  void method3() {
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
  }
 public static void main(String args[]){
   Throwsex e=new Throwsex();
e.method3();

	}
	}	
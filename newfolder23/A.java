package myproject7;

import java.io.FileOutputStream;
public class A {
public static void main(String[] args) {
try(FileOutputStream fileOutputStream =new FileOutputStream("c:/java.txt"))
{
		String s = "Welcome ";      
		byte byteArray[] = s.getBytes();      
		fileOutputStream.write(byteArray);  
		System.out.println("Message written to file successfuly!");      
 }catch(Exception e)
 {
	 System.out.println(e);
 }
	}

}

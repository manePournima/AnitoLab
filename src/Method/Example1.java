package Method;

public class Example1 {

 public static void main (String [] args)
 {
	 System.out.println("Main method start from here");
	  
	 Example2.Another();
	 Method2();
	 
	 System.out.println("Main method end here");
 }
 
 public static void Method2() 
 {
	 System.out.println("if the another method writen outside the main method in a same class then you can call by methodname");
 }
}

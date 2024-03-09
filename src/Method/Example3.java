package Method;

public class Example3 {
	public static void main(String[] args)
	{
		System.out.println("main method start");
		
		Example3 nonstaticmethod = new Example3();
		nonstaticmethod.testing();
		
		Example4 nonstaticmethodlogy = new Example4();
		nonstaticmethodlogy.saintyTesting();
		
		System.out.println("main method end");
	}
	
	public void testing()
	{
		System.out.println("calling a nonstatic method in a same class by creating its object");
	}

}

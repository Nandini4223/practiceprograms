package exceptionhandling;

public class ExceptionDemo2 {
	public static void main(String[] args) throws ClassNotFoundException {
		//System.out.println("main begin");
		//Class.forName("423"); //this line give java.lang.ClassNotFoundException
		//System.out.println("main end");
		
		System.out.println("main begin");
		
		try {
			Class.forName("423");
		}catch(ClassNotFoundException e) {
			System.out.println("423 class nahi mila");
		}
		System.out.println("main end");
	}

}

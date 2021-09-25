package exceptionhandling;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		/*System.out.println("main begin");
		int a[]= {23,78};  //a[0],a[1]
		a[4]=5; //this line give java.lang.ArrayIndexOutOfBoundsException
		System.out.println("main end");*/
		
		System.out.println("main begin");
		try {
			int a[]= {23,78};  
			a[4]=5;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("runtime error");
		}
		System.out.println("main end");
	}

}

package exceptionhandling;

public class Demo3 {
	/*public static void main(String[] args) {
		NullPointerException e=new NullPointerException();
		throw e;
	}*/
	public static void main(String[] args) {
		try {

		NullPointerException e=new NullPointerException();
		throw e;
		}
		catch(NullPointerException e) {
			System.out.println("caught NPE");
		}
		}
}

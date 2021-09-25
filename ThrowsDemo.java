package exceptionhandling;

public class ThrowsDemo {
	/*static void fun(int a) throws Throwable {
		System.out.println("fun begin");
		if(a==0)
			throw(new Throwable());
		System.out.println("fun end");
	}
	public static void main(String[] args) throws Throwable {
		System.out.println("main begin");
		fun(0);
		System.out.println("main end");
	}*/
	static void fun(int a) throws Throwable {
		System.out.println("fun begin");
		if(a==0)
			throw(new Throwable());
		System.out.println("fun end");
	}
	public static void main(String[] args) throws Throwable {
		System.out.println("main begin");
		try {
		fun(0);
		}catch(Throwable t) {
			System.out.println("caught the exception");
		}
		System.out.println("main end");
}
}

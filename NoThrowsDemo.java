package exceptionhandling;

public class NoThrowsDemo {
static void fun(int a) {
	System.out.println("fun begin");
	try {
		if(a==0)
			throw new Throwable();
	}catch(Throwable t) {
		System.out.println("caught exception");
	}
	System.out.println("fun end");
}
public static void main(String[] args) {
	System.out.println("main begin");
	fun(0);
	System.out.println("main end");
}
}

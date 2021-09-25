package exceptionhandling;

public class ExceptionDemo5 {
	/*public static void fun(int a) {
		RuntimeException e=new RuntimeException("param is -ve");
		System.out.println("fun begin");
		if(a<0)
			throw e;
		System.out.println("fun end");
	}
	public static void main(String[] args) {
		System.out.println("main begin");
		fun(0);
		fun(-1);
		System.out.println("main end");
	}*/
	public static void fun(int a) {
		RuntimeException e=new RuntimeException("param is -ve");
		System.out.println("fun begin");
		if(a<0)
			throw e;
		System.out.println("fun end");
	}
	public static void main(String[] args) {
		System.out.println("main begin");
		try {
			fun(0);
			fun(-1);
		}catch(RuntimeException e) {
			System.out.println("caught:"+e);
		}
		System.out.println("main end");
		}
}

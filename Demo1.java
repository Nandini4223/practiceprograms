package exceptionhandling;

public class Demo1 {
	static void fun3() {
		RuntimeException r=new RuntimeException("silly exception");
		throw r;
	}
	static void fun2() {
		fun3();
	}
	static void fun1() {
		fun2();
	}
	public static void main(String[] args) {
		try {
			fun1();
		}catch(RuntimeException e) {
			e.printStackTrace();
			
		}
	}

}

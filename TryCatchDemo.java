package exceptionhandling;

public class TryCatchDemo {
	/*static void fun(int a) {
		try {
			if(a==0)
				throw new Exception(""+a);
			if(a==1)
				throw new Error(""+a);
		}catch(Exception e) {
			System.out.println("caught exception:"+e.getMessage());
		}catch(Error e) {
			System.out.println("caught error:"+e.getMessage());
		}
	}*/
	static void fun(int a) {
	try {
		if(a==0)
			throw new Exception(""+a);
		if(a==1)
			throw new Error(""+a);
	}catch(Throwable e) { //super class for all exceptions & errors
		System.out.println("caught throwable:"+e.getMessage());
		
	}
	}
	public static void main(String [] args) {
		fun(1);
		fun(0);
	}

}

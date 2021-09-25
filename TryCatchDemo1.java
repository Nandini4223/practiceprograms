/* in catch block catch statements are first catches should be subclasses next class super class*/

package exceptionhandling;

import java.io.IOException;

public class TryCatchDemo1 {
	static void fun(int a) {
		try {
			if(a==0)
				throw new Exception(""+a);
			if(a==1)
				throw new IOException(""+a);
		}catch(IOException e) {
			System.out.println("caught ioexception:"+e.getMessage());
		}catch(Exception e) {
			System.out.println("caught exception:"+e.getMessage());
		}
	}
	public static void main(String[] args) {
		fun(-1);
		fun(0);
	}

}

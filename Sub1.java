
public class Sub1 extends Sample1 {
	void fun2() {
		
	}
	void caller() {
		//fun1(); not allowed
		f();            //indirect fun1 calling
		fun2();
	}

}

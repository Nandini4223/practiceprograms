package exceptionhandling;

public class Demo5 {
	/*public static void main(String[] args) {
		Thread t=null;
		t=getThread();  //this line may give thread object or null to reference 't'
		t.start();
	}
	static Thread getThread() {
		return null;
		
	}*/
	
	public static void main(String[] args) {
		Thread t=null;
		t=getThread();
		if(t!=null)
			t.start();
		else
			System.out.println("thread object not created");
	}
		static Thread getThread() {
			return null;
}
}

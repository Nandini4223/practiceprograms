package exceptionhandling;

public class ResourceLeakDemo {
	static void printDoc(int a) throws RunTimeException {
		Printer p=new Printer();
		try {
			p.allocatePrinter();
			if(a==1) throw new DocNotFoundException();
			if(a==2) throw new RunTimeException("unknown error");
			p.releasePrinter();
		}
		catch(DocNotFoundException e) {
			System.out.println("caughtDNFE");
		}
		finally {
			p.releasePrinter();
		}
	}
   public static void main(String [] args) throws RunTimeException {
	   printDoc(0);
	   printDoc(1);
	   printDoc(2);
   }
}

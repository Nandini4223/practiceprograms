package exceptionhandling;

import java.util.Scanner;

public class Demo {
static int divide(int a,int b) {
	RuntimeException e=new RuntimeException("division by zero error");
	if(b==0) throw e;
	return a/b;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.printf("1st num:");
	int a=sc.nextInt();
	System.out.printf("2nd num:");
    int b=sc.nextInt();
    try {
    	int c=divide(a,b);
    	System.out.printf("coff="+c);
    }catch(RuntimeException e) {
    	System.out.println(e.getMessage());
    }
}
}

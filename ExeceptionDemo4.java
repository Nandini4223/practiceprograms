package exceptionhandling;

import java.util.Scanner;

public class ExeceptionDemo4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array:");
	int size=sc.nextInt();
	int a[]=null;
	try {
		a=new int[size];
	}catch(ArrayIndexOutOfBoundsException e1) {
		System.out.println("caught:"+e1);
	}                                                                                                                                                                                                                                                                                                                                                                    
	
	try {
		a[-1]=23;
	}catch(ArrayIndexOutOfBoundsException e2) {
		System.out.println("caught:"+e2);
	}catch(NullPointerException e3) {
		System.out.println("caught:"+e3);
	}
}
}

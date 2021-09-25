package pack2;

import pack1.Employee;

public class Manager {
	Employee a[]=new Employee[10];
	int index=0;
	public void add(Employee e) {
		a[index++]=e;
	}
	public void remove(Employee e) {
	}

}

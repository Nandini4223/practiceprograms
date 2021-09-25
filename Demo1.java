import pack1.Employee;
import pack2.Manager;

public class Demo1 {
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Manager m=new Manager();
		m.add(e1);
		m.add(e2);
	}

}

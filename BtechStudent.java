
public class BtechStudent extends Student {
	private String branch;
	//public BtechStudent() {
	//this(0,null,null);
	//System.out.println("btechstudent zero arg con");
	//}
	public BtechStudent(int rollnum, String name, String branch) {
		//rollnum=rollnum;----------not allowed
		//name=name;--------------not allowed
		super(rollnum, name);//calls super class constructor..
		this.branch = branch;
		System.out.println("btechstudent arg con");
	}
	public String getBranch() {
		return branch;
	}
	
}

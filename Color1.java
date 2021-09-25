
public enum Color1 {
	RED(2),GREEN,BLUE(3,4);
	Color1(){
		System.out.println("Color obj created "+this);
	}
	//public static void main(String[] args) {
	//	System.out.println("Color main");
//	}
	Color1(int a){
		System.out.println("con with one arg"+a);
	}
	Color1(int x,int y){
		System.out.println("con with two args"+x+","+y);
	}

}

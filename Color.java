
public enum Color {
	RED(4),GREEN(0),BLUE(15);
	private int colorValue;
	Color(int cv){
		colorValue=cv;
		System.out.println("color obj has created");
	}
	int getColorValue() {
		return colorValue;
	}

}

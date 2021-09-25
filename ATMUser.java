
public class ATMUser {
	public static void main(String[] args) {
		SBICard s=new SBICard();
		AXISCard a=new AXISCard();
		ICICICard i=new ICICICard();
		ATMMachine.readCard(s);
		ATMMachine.readCard(a);
		ATMMachine.readCard(i);
	}

}


public class Main {
public static void main(String[] args) {
	SimCard c1=new SimCard();
	ThreeSimCard c2=new ThreeSimCard();
	c1.makeVoiceCall();
	c2.makeVoiceCall();
	c2.makeVideoCall();
	SimCard c3=c2;//allowed
	c3.makeVoiceCall();
	//c3.makeVideoCall();----------C error
	System.out.println(c1);//SimCard@hc1
	System.out.println(c2);//ThreeSimCard@hc2
	System.out.println(c3);//ThreeSimCard@hc2
}
}

package week7_0419_2;

public class RunTV {

	public static void main(String[] args) {
		TV t1 = new TV();
		TV t2 = new TV();
		
		t1.setChannel(7);
		t1.setColor("Gold");
		t1.setPrice(1000000);
		t1.setProducer("SAMSUNG");
		t1.setSize(155);
		
		t2.setChannel(41);
		t2.setColor("Sliver");
		t2.setPrice(1000001110);
		t2.setProducer("LG전자");
		t2.setSize(95);
		
		t1.powerOn();
		t1.upChannel();
		t1.upChannel();
		t1.downChannel();
		
		t2.powerOn();
		t2.upChannel();
		t2.upChannel();
		t2.powerOff();
	}

}

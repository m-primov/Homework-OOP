package _02_Task;

public class Demo {

	public static void main(String[] args) {
		Gsm samsung = new Gsm();
		samsung.setModel("Galaxy Note 7");
		samsung.insertSimCard("0888123456");
		Gsm meizu = new Gsm();
		meizu.setModel("Pro 6");
		meizu.insertSimCard("0896123456");
		
		samsung.call(meizu, 5);
		samsung.call(meizu, 5);
		
		samsung.printInfoForTheLastOutgoingCall();
		System.out.println("========================================");
		samsung.printInfoForTheLastIncomingCall();		
		System.out.println("========================================");
		
		meizu.printInfoForTheLastIncomingCall();
		System.out.println("========================================");
		meizu.printInfoForTheLastOutgoingCall();
		System.out.println("========================================");
	}

}

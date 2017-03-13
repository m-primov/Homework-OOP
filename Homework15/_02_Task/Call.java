package _02_Task;

public class Call {
	public static double priceForAMinute = 0.14;
	private Gsm caller;
	private Gsm receiver;
	private int duration;
	
	public void setReceiver(Gsm receiver) {
		this.receiver = receiver;
	}

	public void setCaller(Gsm caller) {
		this.caller = caller;
	}
	
	public Gsm getReceiver() {
		return receiver;
	}

	public Gsm getCaller() {
		return this.caller;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}

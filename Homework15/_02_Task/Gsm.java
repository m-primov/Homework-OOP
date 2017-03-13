package _02_Task;

public class Gsm {
	private String model;
	private boolean hasSimCard;
	private String simMobileNumber;
	private int outgoingCallsDuration;
	private Call lastIncomingCall;
	private Call lastOutgoingCall;
	
	public void setModel(String model) {
		if (model != null && !model.isEmpty()) {
			this.model = model;
		} else {
			System.out.println("Invalid model name");
		}
	}

	public void insertSimCard(String simMobileNumber){
		String firstTwoDigits = simMobileNumber.substring(0, 2);
		if (firstTwoDigits.equals("08") && simMobileNumber.length() == 10) {
			this.simMobileNumber = simMobileNumber;
			this.hasSimCard = true;
		} else {
			System.out.println("Ivalid sim mobile number");
		}
	}
	
	public void removeSimCard(){
		this.hasSimCard = false;
	}
	
	public void call(Gsm receiver, int duration){
		if (duration < 0 || duration > 60) {
			System.out.println("Inavalid call duration");
			return;
		}
		
		if (!(this.hasSimCard && receiver.hasSimCard)) {
			System.out.println("One of the phones or the two phones do not have sim cards");
			return;
		}
		
		if (this.simMobileNumber.equals(receiver.simMobileNumber)) {
			System.out.println("Cannot make call between one number");
			return;
		}
		
		Call newCall = new Call();
		newCall.setCaller(this);
		newCall.setReceiver(receiver);
		newCall.setDuration(duration);
		this.lastOutgoingCall = newCall;
		receiver.lastIncomingCall = newCall;
		
		
		this.outgoingCallsDuration += this.lastOutgoingCall.getDuration();
	}
	
	public double getSumForCall() {
		return this.outgoingCallsDuration * Call.priceForAMinute;
	}
	
	public void printInfoForTheLastOutgoingCall(){
		if (this.lastOutgoingCall != null && this.lastOutgoingCall.getDuration() > 0) {
			System.out.println("GSM model: " + this.model + "\n" +
					"Your mobile number: " + this.simMobileNumber + "\n" +
					"Outgoing call number: " + this.lastOutgoingCall.getReceiver().simMobileNumber + "\n" +
					"Last outgoing call duration: " + this.lastOutgoingCall.getDuration() + "\n" +
					"Call charge: " + this.lastOutgoingCall.getDuration() * Call.priceForAMinute + "\n" +
					"All outgoing calls charge: " + this.getSumForCall());
		} else {
			System.out.println("No last outgoing call have been made");
		}
	}
	
	public void printInfoForTheLastIncomingCall(){
		if (this.lastIncomingCall != null && this.lastIncomingCall.getDuration() > 0) {
			System.out.println("GSM model: " + this.lastIncomingCall.getReceiver().model + "\n" + 
								"Your mobile number: " + this.lastIncomingCall.getReceiver().simMobileNumber + "\n" +
								"Incoming call number: " + this.lastIncomingCall.getCaller().simMobileNumber + "\n" +
								"Last outgoing call duration: " + this.lastIncomingCall.getDuration() + "\n" + 
								"Call charge: " + (this.lastOutgoingCall != null?this.lastOutgoingCall.getDuration() * Call.priceForAMinute : 0) + "\n" + 
								"All outgoing calls charge: " + this.getSumForCall());
		} else {
			System.out.println("No last incoming call for number " + this.simMobileNumber);
		}
	}
}

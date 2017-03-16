
public class Car {
	String model;
	int maxSpeed;
	int currentSpeed;
	String color;
	int currentGear;
	Person owner;
	double price;
	boolean isSportCar;
	
	public Car() {
		
	}
	
	public Car(String modelParam, boolean isSportCarParam, String colorParam) {
		if (modelParam != null && !modelParam.isEmpty()) {
			this.model = modelParam;
		}
		
		if (colorParam != null && !colorParam.isEmpty()) {
			this.color = colorParam;
		}
	}
	
	void changeGearUp() {
		if(currentGear < 5) {
			currentGear++;
		}
	} 
	
	void changeGearDown() {
		if(currentGear > 0 ) {
			currentGear--;
		} else {
			System.out.println("You are now on 1st gear!!!");
		}
	} 
	
	void changeGear(int nextGear) {
		if(nextGear > 0 && nextGear < 6) {
			currentGear = nextGear;
		}
	} 
	
	void changeColor(String newColor) {
		color = newColor;
	}
	
	boolean isMoreExpensive(Car car) {
		return this.price > car.price;
	}
	
	double calculateCarPriceForScrap(double metalPrice) {
		double coef = 0.2;
		if (this.color.equals("black") || this.color.equals("white")) {
			coef += 0.05;
		}
		if (this.isSportCar) {
			coef += 0.05;
		}
		
		return metalPrice * coef;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Car model: " + this.model + "\n");
		sb.append("Car maxspeed: " + this.maxSpeed + "\n");
		sb.append("Car color: " + this.color + "\n");
		sb.append("Sport car: " + (isSportCar?"yes":"no") + "\n");
		sb.append("Price: " + this.price + "\n");
		return sb.toString();
	}
}

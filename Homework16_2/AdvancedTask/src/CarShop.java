
public class CarShop {
	private Car[] cars;
	private int freePlaces;
	private int nextCarIdx;
	//private int sellNextCarIdx;
	
	public CarShop(int capacity) {
		if (capacity > 0) {
			this.cars = new Car[capacity];
			this.freePlaces = cars.length;
		}
		
		this.nextCarIdx = 0;
		//this.sellNextCarIdx = 0;
	}
	
	public void addCar(Car car) {
		if (car != null) {
			if (this.freePlaces > 0) {
				this.cars[this.cars.length - this.freePlaces] = car;
				this.freePlaces--;
			}
		}
	}
	
	private Car getNextCar() {
		if (this.nextCarIdx < this.cars.length - this.freePlaces) {
			this.nextCarIdx++;
			return this.cars[nextCarIdx - 1];
		}
		
		return null;
	}
	
	public void sellNextCar(Person buyer) {
		if (buyer != null) {
			Car nextCarToSell = this.getNextCar();
			if (nextCarToSell != null) {
				buyer.buyCar(nextCarToSell);
				buyer.changeOwner(buyer);
				this.removeCar(this.cars[this.nextCarIdx - 1]);
			}
		}
	}
	
	private void removeCar(Car car) {
		if (car != null) {
			for (int i = 0; i < this.cars.length - this.freePlaces; i++) {
				if (this.cars[i] != null && this.cars[i].equals(car)) {
					this.cars[i] = null;
				}
			}
		}
		
	}
	
	public void showAllCarsInTheShop() {
		for (int i = 0; i < this.cars.length - this.freePlaces; i++) {
			if (this.cars[i] != null) {
				System.out.println(this.cars[i].toString());
			}
		}
	}
}

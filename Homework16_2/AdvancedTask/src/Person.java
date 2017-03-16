
public class Person {
	String name;
	int age;
	String personalNumber;
	boolean isWoman;
	double weight;
	double height;
	Person[] friends;
	double money;
	Car car;
	
	public Person(){
		this.age = 0;
		this.weight = 4.0;
	}
	
	public Person(String name, String personalNumber, boolean
			isMale) {
		this();
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
		
		if (personalNumber != null && !personalNumber.isEmpty()) {
			this.personalNumber = personalNumber;
		}
		
		this.isWoman = !isMale;
		this.friends = new Person[3];
	}
	
	void eat() {
		System.out.println("Eating...");
	}
		
	void walk() {
		System.out.println(name + " is walking");
	}
		
	void growUp() {
		age++;
	}
		
	void drinkWater(double liters) {
		if(liters > 1) {
			System.out.println("This is too much water!!!");
		} else {
			System.out.println(name + " is drinking " + liters + " water.");
		}
	}
	
	void buyCar(Car car) {
		if (this.money >= car.price) {
			this.car = car;
			car.owner = this;
			this.money -= car.price;
		} else {
			System.out.println("No enough money");
		}
	}
	
	void changeOwner(Person newOwner) {
		if (newOwner != null) {
			this.car.owner = newOwner;
		}
	}
	
	double sellCarForScrap() {
		this.money += car.calculateCarPriceForScrap(15000);
		return this.money;
	}
}

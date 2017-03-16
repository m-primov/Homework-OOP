
public class Demo {

	public static void main(String[] args) {
		Person ivan = new Person();
		Person maria = new Person();
		
		ivan.name = "Ivan";
		ivan.age = 25;
		ivan.isWoman = false;
		ivan.personalNumber = "8612025287";
		ivan.weight = 80.5;
		ivan.money = 100000;
		maria.name = "Maria";
		maria.age = 22;
		maria.isWoman = true;
		maria.personalNumber = "9612025282";
		maria.weight = 55.5;
		maria.money = 25000;
		
		System.out.print("Ivan is " + ivan.age + " years old ");
		System.out.println("and his weight is " + ivan.weight);
		
		System.out.println("===============================");
		
		/*Person joro = new Person();
		Person mitko = new Person();
		joro.age = 18;
		mitko = joro;
		mitko.age = 21;
		System.out.println(joro.age);*/
		
		Car car1 = new Car();
		car1.model = "Golf 2";
		car1.color = "Black";
		car1.currentGear = 3;
		car1.currentSpeed = 90;
		car1.maxSpeed = 180;
		car1.price = 1500;
		Car car2 = new Car();
		car2.model = "Golf 3 GT";
		car2.isSportCar = true;
		car2.color = "Silver";
		car2.currentSpeed = 120;
		car2.currentGear = 2;
		car2.maxSpeed = 320;
		car2.price = 50000;
		/*car2.owner = ivan;
		System.out.println("Car " + car2.model + " have owner " + car2.owner.name 
				+ " at " + car2.owner.age + " years.");*/
		
		System.out.println("=======================");
		ivan.walk();
		double literWater = 0.3;
		ivan.drinkWater(literWater);
		
		System.out.println("=======================");
		/*ivan.buyCar(car2);
		System.out.println("Car " + car2.model + " have owner " + car2.owner.name 
				+ " at " + car2.owner.age + " years.");
		System.out.println(ivan.money);
		System.out.println(ivan.sellCarForScrap());*/
		CarShop carShop = new CarShop(5);
		carShop.addCar(car1);
		carShop.addCar(car2);
		carShop.showAllCarsInTheShop();
		
		System.out.println("=======================");
		carShop.sellNextCar(ivan);
		System.out.println("Car " + car1.model + " have owner " + car1.owner.name 
				+ " at " + car1.owner.age + " years.");
		
		carShop.showAllCarsInTheShop();
	}

}

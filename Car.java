package com.masai;

public class Car {

	private String model;
	private String companyName;
	private String color;
	private Engine engine = new Engine();
	
	public Car(String model, String companyName, String color,int rpm,int Power,String manufacturer,boolean hasTurbo){
		System.out.println("Car Model :"+ model);
		System.out.println("Car companyName : "+companyName);
		System.out.println("Car color : "+color);
		System.out.println("Car RPM : "+rpm);
		System.out.println("Car power : "+Power);
		System.out.println("Car Engine Manufacturer : "+manufacturer);
		System.out.println("Car Has Turbo : "+hasTurbo);
	}
	
	public Car() {
		System.out.println("Car Model :"+ model);
		System.out.println("Car companyName : "+companyName);
		System.out.println("Car color : "+color);
		System.out.println("Car RPM : "+engine.rpm);
		System.out.println("Car power : "+engine.Power);
		System.out.println("Car Engine Manufacturer : "+engine.manufacturer);
		System.out.println("Car Has Turbo : "+engine.hasTurbo);
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.model="Harrier";
		car.companyName="Tata";
		car.color="black";
		car.engine.rpm=10000;
		car.engine.Power=110;
		car.engine.manufacturer="tata";
		car.engine.hasTurbo=true;
		
		Car car2 = new Car("Harrier","Tata","black",10000,110,"tata",true);
	
//		System.out.println(car);
//		System.out.println(car2);
	}
}

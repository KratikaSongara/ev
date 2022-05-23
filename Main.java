package com.masai;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes shapes = new Shapes();
		shapes.area(new Circle());
		shapes.area(new Rectangle());
		shapes.area(new Square());
	}

}

//Static polymorphism means when we use the same method name but the only difference lies in the parameters which we pass in them.
//Static polymorphism is acheived with the help of method overloading.
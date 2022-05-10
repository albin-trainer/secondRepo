package com.cg;
public class CastingEx {
public static void main(String[] args) {
	Animal a1=new Dog();
	a1.walk();
	//Dog a2=a1; Compilation Error .....
	Dog a2=(Dog)a1;
	a2.barks();
	
	a1=new Cat();
	Cat a3=(Cat)a1;
	a3.mew();
	
	Dog a4=(Dog)a1;  //ClassCastException ......
	a4.barks();
	
	Object a5=new Dog();
	
	Dog a6=(Dog)a5; //downcasting req to call child specific methods
	a6.barks();
}
}
class Animal /*extends Object*/{
	void walk() {
		System.out.println("Animal is walking");
	}
}
class Dog extends Animal{
	void walk() {
		System.out.println("Dog is walking");
	}
	void barks() {
		System.out.println("Dog barking.....");
	}
}
class Cat extends Animal{
	void walk() {
		System.out.println("Cat is walking");
	}
	void mew() {
		System.out.println("cat mew mew......");
	}
}
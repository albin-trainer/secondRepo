package com.cg;

public class InstanceOfEx {

	public static void main(String[] args) {
		Dog dog= new Dog();
		print(dog);
		System.out.println("--------------");
		Cat cat=new Cat();
		print(cat);
		
		
	}
	static void print(Animal animal) {
		animal.walk();
		//Always before casting, v hv to chk the type 
		//of the obejct
		if(animal instanceof Dog) {
			Dog dog=(Dog)animal;
			dog.barks();
		}
		//do the else if for Cat 
		
	}
}

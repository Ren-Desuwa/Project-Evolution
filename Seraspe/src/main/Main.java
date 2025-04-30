package main;

import objects.Person;

public class Main {
	public static void main(String[] args) {
	
		//this is how you initialize a Person, first the Object Class Which is a Person
		//then you give the Object a Variable name, in this case is Ren
		//then you initialize a "new" Person.
		//and finally fill up the Constructor with the information about the Person ie. Name, Age, Birthday
		Person Ren = new Person("Ren Seraspe", 19, "April 17, 2006");
		
		//this is how the Person or "Ren" perfoms the Method or the tasks, Breathe and Drink Water
		Ren.Breathe();
		Ren.DrinkWater();
		
	}
}
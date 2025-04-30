package objects;

//this is a Class or a Blueprint for a person
public class Person {

	//this are the Fields or the information the person Holds, its name, age, birthday
	private String myName;
	private int myAge;
	
	private String myBirthDay;
	
	//this is a Constructor for a person, this is where you input the name, age, birthday
	public Person(String name, int age, String birthday) {
		this.myName = name;
		this.myAge = age;
		this.myBirthDay = birthday;
	}
	
	//this is the methods or the tasks the person can do, such as breathe and drink water.
	public void Breathe() {
		System.out.println( myName + " is breathing");
	}
	public void DrinkWater() {
		System.out.println( myName + " is drinking water");
	}
	
	// getters and setters are standard methods or functions that interact with the object or Person
	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public int getMyAge() {
		return myAge;
	}

	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}

	public String getMyBirthDay() {
		return myBirthDay;
	}

	public void setMyBirthDay(String myBirthDay) {
		this.myBirthDay = myBirthDay;
	}
	
}
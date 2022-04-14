/*
 * Author: Nicolette Hill
 * Date:28 February 22
 * Description : In this quiz, you will be implementing a Person Class that’s a blueprint of 
   person’s attributes and behaviors. A Fitness class that will contain the main function 
   and 4 person objects. You will be printing each person’s name, BMI and BMI level.
 */

public class Person {  

	//Access Modifiers used are (2) public & Private
	private String firstName;
	private String lastName;
	private char lastNameInitial;
	private int age;
	private int feet;
	private int inches;
	private double weight;
		
	
	//Constructors for different Person BMI
	Person(String firstName, String lastName, double weight, int feet, int inches) {
		
	    this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
	}
	    
	//Constructors 2 for different Person BMI
	Person(String firstName, char lastNameInitial, double weight, int feet, int inches) {
		
		this.firstName = firstName;
		this.lastNameInitial = lastNameInitial;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
	}
	
   // Constructors 3 for different Person BMI
	Person(String firstName, String lastName, char lastNmaeInitial, int age, int feet, int inches, double weight){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastNameInitial = lastNameInitial;
		this.age = age;
		this.feet = feet;
		this.inches = inches;
		this.weight = weight;
		
	}		
	//Getters & Setters for Person's attributes	
public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getLastNameInitial() {
		return lastNameInitial;
	}

	public void setLastNameInitial(char lastNameInitial) {
		this.lastNameInitial = lastNameInitial;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	
	}
	 
// Instance Method 
//Formula for BMI=( weight * 703)/(heightInInches * heightInIches)
//Formula for HeightInInches (person's feet * 12  + person's inches)
//Both Formulas calculate BMI & BMILevels for each person's attribute
	String calculateBMI() {
	
	int heightInInches = (this.feet * 12) + this.inches;
    double BMI = (this.weight * 703) / (heightInInches * heightInInches);
    
    String BMILevel;
    if (BMI < 18.5)
    System.out.println("Underweight");
    
    else if(BMI >= 18.5 && BMI < 24.9)
    System.out.println("Normal");
	 
    else if (BMI <= 25.0 && BMI < 29.9 )
    System.out.println("overweight");
	  
    
  return "";  
    
	}

	}

	
	
	

	
	
	

				





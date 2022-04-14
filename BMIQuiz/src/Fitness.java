/*
 * Author:Nicolette Hill
 * Date:28 February 22
 *  Description: In this quiz, you will be implementing a Person Class that’s a blueprint of 
    person’s attributes and behaviors. A Fitness class that will contain the main function 
    and 4 person objects. You will be printing each person’s name, BMI and BMI level.  
 */
public class Fitness {
 
public static void main(String[] args, Object calculateBMI) {

//Person 1 attributes
	Person person1 = new Person("Tom",'H', 152.5, 5, 6); 
		System.out.println("person1"+ person1.calculateBMI());

//Leslie attributes
	Person leslie = new Person ("leslie", "Knope",'K',32,4,11,122.9);
		System.out.println("leslie"+ leslie.calculateBMI());
	
//Man attributes
		Person man = new Person ("Ron", "Swanson", 222.2, 6, 0);
		System.out.println("man"+ man.calculateBMI());
		
//Woman attributes
		Person woman = new Person ("April", "Ludgate", 110.5, 5, 5);
		System.out.println("woman"+ woman.calculateBMI());
		  
		
		
	

	
	
}
}



	


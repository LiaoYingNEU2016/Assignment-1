/* Description : A student is driving home from school;
 * 
 * Objects in this scenario (with state and behaviors):
 * 
 * 		Object : Student
 * 			State : name
 * 			Behavior : drive()
 *		
 * 		Object : Car
 * 			State : make, model, color
 * 			Behavior : move(), stop()
 * 
 * 		Object : Place
 * 			State : address
 */

public class DriveHome{
	public static void main(String[] args) {
		Student Ruby = new Student();
		Ruby.name = "Ruby";
		
		Car CarOfRuby = new Car();
		CarOfRuby.make = "Infinity";
		CarOfRuby.model = "Q50";
		CarOfRuby.color = "blue";

		Place school = new Place();
		school.address = "401 Terry Ave N";
		Place home = new Place();
		home.address = "150 NE 8th St";

		Ruby.drive(CarOfRuby, school.address, home.address);
		CarOfRuby.move();
		CarOfRuby.stop();
	}

	class Student {
		String name;
		void drive(Car c, String startAddress, String endAddress){}
	}

	class Car {
		String make;
		String model;
		String color;
		void move(){}
		void stop(){}
	}

	class Place {
		String address;
	}
}
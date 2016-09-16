/* Description : A tourist wants to book a house on Airbnb App;
 * 
 * Objects in this scenario (with state and behaviors):
 * 
 * 		Object : Tourist
 * 			State : name, destination, travalTime
 * 			Behavior : logOnAirbnbApp(), chooseHouse(), bookAHouse(),makePaymentToAirbnbApp()
 *
 * 		Object : AirbnbApp
 * 			State : available Houses
 * 			Behavior : getAvaibleHouses(), acceptBookFromTourist(), acceptPaymentAndConfirm()
 * 
 * 		Object : House
 * 			State : ID, location, price
 * 			Behavior : getPrice()
 * 		
 * 		Object : Confirmation
 * 			State : confirmationMessage
*
 * 		Object : Bill
 * 			State : amount
 *
 * 		Object : Money
 * 			State : amount
 */

import java.util.*;
public class BookingAnAirbnb {
	public static void main(String args[]) {
		Tourist Ruby = new Tourist();
		Ruby.name = "Ruby";
		Ruby.destination = "Seattle";
		Ruby.travalTime = new Date("2016-09-30");
		
		House house1 = new House();
		house1.ID = "001";
		house1.location = "Seattle";
		house1.price = 200;
		House house2 = new House();
		house2.ID = "002";
		house1.location = "Bellevue";
		house1.price = 150;
		AirbnbApp airbnb = new AirbnbApp();
		airbnb.availableHouses = new House[]{house1, house2};

		Ruby.logOnAirbnbApp(airbnb);
		House[] availableHouses = airbnb.getAvaibleHouses(Ruby);
		House chosenHouse = Ruby.chooseHouse(availableHouses);
		Ruby.bookAHouse(chosenHouse);
		
		Bill billForRuby = airbnb.acceptBookFromTourist(Ruby, chosenHouse);
		Money paymentFromRuby = Ruby.makePaymentToAirbnbApp(airbnb, billForRuby);
		Confirmation ConfirmationForRuby = airbnb.acceptPaymentAndConfirm(Ruby, paymentFromRuby);
}

class Tourist {
	String name;
	String destination;
	Date travalTime; // Time when a house is needed
	House chooseHouse(House[] houses){} //choose from the houses that are not far from the destination
	void logOnAirbnbApp(AirbnbApp a){}
	void bookAHouse(House h){}
	Money makePaymentToAirbnbApp(AirbnbApp a, Bill b){}
}

class AirbnbApp {
	House[] availableHouses;
	House[] getAvaibleHouses(Tourist t){}
	Bill acceptBookFromTourist(Tourist t, House h){}
	Confirmation acceptPaymentAndConfirm(Tourist t, Money m){}
}

class House {
	String ID;
	String location;
	float price;
	float getPrice(){}
}

class Confirmation {
	String confirmationMessage;
}

class Bill {
	float amount;
}

class Money {
	float amount;
}
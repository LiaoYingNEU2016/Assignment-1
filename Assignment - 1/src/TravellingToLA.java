
/* Description : A tourist is trying to find the cheapest flight to LA;
 * 
 * Objects in this scenario (with state and behaviors):
 * 
 * 		Object : Tourist
 * 			State : name, destination, departureDate
 * 			Behavior : visitWebsite(), findCheapestFlight(), placeOrderForFlight(), makePaymentToWebsite()
 *
 * 		Object : TravelAgencyWebsite
 * 			State : name, allFlights
 * 			Behavior : getAvailableFlights(), accepteOrderFromTourist(), acceptPaymentAndConfirm()
 * 
 * 		Object : Flight
 * 			State : airCompany, price, departureTime, destination
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
public class TravellingToLA {
	public static void main(String args[]) {
		Tourist Ruby = new Tourist();
		Ruby.name = "Ruby";
		Ruby.destination = "LA";
		Ruby.departureDate = new Date("2016-09-30");


		Flight f1 = new Flight();
		f1.destination = "LA";
		f1.airCompany = "Delta";
		f1.departureTime = new DateTime("2016-09-30 12:00");
		f1.price = "200";

		Flight f2 = new Flight();
		f2.destination = "LA";
		f2.airCompany = "Alaska";
		f2.departureTime = new DateTime("2016-09-30 11:00");
		f2.price = "150";

		TravelAgencyWebsite expedia = new TravelAgencyWebsite();
		expedia.name = "expedia";
		expedia.allFlights = new Flight[]{f1,f2};

		Ruby.visitWebsite(expedia);
		Flight[] availableFlights = expedia.getAvailableFlights(Ruby);
		//choose the lowest price for all the flights displayed
		Flight cheapestFlight = Ruby.findCheapestFlight(availableFlights);

		Ruby.placeOrderForFlight(cheapestFlight);
		Bill bill = expedia.accepteOrderFromTourist(Ruby, cheapestFlight);
		Money payment = Ruby.makePaymentToWebsite(expedia, bill);
		Confirmation ConfirmationForRuby = expedia.acceptPaymentAndConfirm(Ruby, payment);
}

class Tourist {
	String name;
	String destination;
	Date departureDate;
	void visitWebSite(TravelAgentWebsite w){}
	Flight findCheapestFlight(Flight[] flights){}
	void placeOrderForFlight(Flight f){}
	void makePaymentToWebsite(Flight f){}
}

class TravelAgentWebsite {
	String name;
	Flight[] allFlights; //array of flights
	Flight[] getAvailableFlights(Tourist t){};
	Bill accepteOrderFromTourist(Tourist t, Flight f){}
	Confirmation acceptPaymentAndConfirm(Tourist t, Money m){}
}

class Flight {
	String destination;
	String airCompany;
	Date departureTime;
	float price;
	float getPrice(){};
}

class Confirmation {
	String confirmationMessage;
}

class bill
{
	float amount;
}

class Money
{
	float amount;
}
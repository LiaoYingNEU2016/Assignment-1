/* Description : A consumer is going to order a delivery through phone call;
 * 
 * Objects in this scenario (with state and behaviors):
 * 
 * 		Object : Customer
 * 			State : name, address
 * 			Behavior : chooseRestaurant(), callRestaurant(), placeOrderForFood(), payBill()
 *
 * 		Object : Restaurant
 * 			State : name, phoneNumber
 * 			Behavior : answerPhoneCall(), acceptOrderFromCustomer(), deliverFoodForCustomer(), acceptPayment()
 *
 * 		Object : Order
 * 			State : items, price
 *
 * 		Object : Money
 * 			State : amount
 */


public class OrderForDelivery {
	public static void main(String args[]) {
		Customer Ruby = new Customer();
		Ruby.name = "Ruby";
		Ruby.address = "401 Terry Ave N";		
/*
 * Student choose restaurant from Pizza Hut and Red Robin
 */
		Restaurant pizzaHut = new Restaurant();
		pizzaHut.name = "Pizza Hut";
		pizzaHut.phoneNumber = "111-111-1111";
		Restaurant redRobin = new Restaurant();
		redRobin.name = "Red Robin";
		redRobin.phoneNumber = "222-222-2222";
		Restaurant[] restaurants = new Restaurant[]{pizzaHut, redRobin};
		Restaurant chosenRestaurantByRuby = Ruby.chooseRestaurant(restaurants);
		
		Ruby.callRestaurant(chosenRestaurantByRuby);
		chosenRestaurantByRuby.answerPhoneCall();

		String[] items = Ruby.placeOrderForFood();
		Order RubysOrder = chosenRestaurantByRuby.acceptOrderFromCustomer(items);
		chosenRestaurantByRuby.deliverFoodForCustomer(Ruby, Order);

		Money paymentFromRuby = Ruby.payBill(chosenRestaurantByRuby, RubysOrder);
		chosenRestaurantByRuby.acceptPayment(Ruby, paymentFromRuby);
		chosenRestaurantByRuby.deliverFoodForCustomer(Ruby, RubysOrder);
}

class Customer {
	String name;
	String address;
	Restaurant chooseRestaurant(Restaurant[] restaurants){}
	void callRestaurant(Restaurant r){}
	void placeOrderForFood(){}
	Money payBill(Restaurant r, Order o){}
}

class Restaurant {
	String name;
	String phoneNumber;
	void answerPhoneCall(){}
	Order acceptOrderFromCustomer(String[] items){} 
	void acceptPayment(Customer c, Money m){}
	void deliverFoodForCustomer(Customer c, Order o){}
}

class Order {
	String[] items;
	float price;
}

class Money {
	float amount;
}
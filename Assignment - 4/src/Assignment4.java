import java.util.Stack;

public class Assignment4 {

	
	/**
	1. Write JUnitTest for all the problems in assignemnt3.
	*/
	/*
	 * see Assignment3Test.java
	 */

	/**
	 * 2. Implement Class MusicAlbum which encapsulated a music Album,
	 * each album has a string variable albumTitle and a String variable singer representing the name of singer,
	 * double variable price representing the price of album, objects of this class are Initialized using all of its instance variables.
	 * The class has accessor methods for all its Variables and a mutator method for price.
	 */
	public class MusicAlbum 
	{
		private String albumTittle;
		private String singer;
		private double price;
		
		public String getAlbumTittle()
		{
			return albumTittle;
		}
		public String getSinger()
		{
			return singer;
		}
		public double getPrice()
		{
			return price;
		}
		public void setPrice(double albumPrice)
		{
			price = albumPrice;
		}
		
		
		public MusicAlbum(String albumTittle, String singer, double price)
		{
			this.albumTittle = albumTittle;
			this.singer = singer;
			this.price = price;
			
		}
		
	}
	
	

	/**
	 * 3. Write a class named GasTank containing:
	 * An instance variable named amount of type double, initialized to 0.
	 * A method named addGas that accepts a parameter of type double . The value of the amount instance variable is increased by the value of the parameter.
	 * A method named useGas that accepts a parameter of type double . The value of the amount instance variable is decreased by the value of the parameter.
	 * A method named getGasLevel that accepts no parameters. getGasLevel returns the value of the amount instance variable.
	 */

	public class GasTank
	{
		private double amount;
		public void addGas(double gasAdded)
		{
			amount+=gasAdded;
		}
		public void useGas(double gasUsed)
		{
			amount-=gasUsed;
		}
		public double getGasLevel()
		{
			return amount;
		}
		
		public GasTank(double amount)
		{
			this.amount = 0;
		}
		
	}
	
	/**
	 * 4. Design and implement a class called Car. You need to create necessary attributes for this class, and method if needed
	 * Define the Car constructor to initialize these values (in that order). Include getter and setter methods for all instance data.
	 */

	public class Car
	{
		private String make;
		private String model;
		private String color;
		private double price;
		GasTank gasTank;

		public String getMake()
		{
			return make;
		}
		public String getModel()
		{
			return model;
		}
		public String getColor()
		{
			return color;
		}
		public double getPrice()
		{
			return price;
		}
		public double getGasTank()
		{
			return gasTank.amount;
		}
		public void setMake(String m)
		{
			make = m;
		}
		public void setModel(String m)
		{
			model = m;
		}
		public void setColor(String c)
		{
			color = c;
		}
		public void setPrice()
		{
			if(make == "Tesla" && model == "S")
			{
				price = 74000;
			}
			else
			{
				price = 50000;
			}
			
		}
		public void setGasTank(double amount)
		{
			this.gasTank.amount = amount;
		}
		
		public void move(double distance)
		{
			
		}
		
		public Car(String make, String model, String color)
		{
			this.make=make;
			this.model=model;
			this.color=color;
			setPrice();
		}
		
		public Car()
		{
			this("Tesla", "S", "White");
		}
	}
	
	/**
	 * 5. Combine with problem 3 and 4, define a class named Driver 
	 * that contains methods like drive and addGas so that the driver can drive the car.
	*/
	
	public class Driver
	{
		private String name;
		public void drive(Car car, double distance)
		{
			if ( car.gasTank.amount == 0 )
			{
				System.out.println("Error: Run out of gas");
			}
			else
			{
			car.move(distance);
			}
		}
		
		public void addGas(GasTank gasTank, double gasAdded)
		{
			gasTank.addGas(gasAdded);
		}
	}
	
	/**
	 * Bonus: 
	 * Design a java class that encapsulate the data structure Stack (Last in First out). The class has 2 methods:
	 * (push): method for adding items to stack, the push operation adds items to the top of the list
	 * (pop): method for retrieving items from the stack. The pop operation removes an item from the top of the list, and returns its value to the caller.
	 * In the case of overflow the user should be informed with a message
	 * In the case of underflow, the user should be informed with a message & a value of zero is returned.
	 * 
	 * Assumptions: The stack will hold up to 10 integer values.
	 */
	
	public class StackWithLimit
	{
		private int[] list;
		private int count = 0;
		public void push(int i)
		{
			if (count == 9)
			{
				System.out.println("Error:overflow");
			}
			else
			{
				list[count] = i;
				count++;
			}	
		}
		public int pop(int count)
		{
			this.count = count;
			if(count == 0)
			{
				System.out.println("Error:underflow");
				return count;
			}
			else
			{
				count--;
				return list[count];			
			}
		}
		
	}
	
}

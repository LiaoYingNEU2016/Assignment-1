
public class DessertShoppe 
{
	public final static double taxRate = 0.065;
	public final static String storeName = "M & M Dessert Shoppe";
	public final static int maxLengthOfItemName = 20;
	public final static int maxWidthOfItemCost = 30;
	
	
	public static String cents2dollarsAndCents(int cents)
	{
		double dollar = cents/100.00;
		String result = String.valueOf(dollar);
		return result;
	}
	
}

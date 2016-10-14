
public class Cookie extends DessertItem
{

	private int number;
	private int pricePerDozen;
	
	public Cookie(String name, int number, int pricePerDozen)
	{
		super(name);
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}
	
	
	@Override
	public int getCost()
	{
		return (int) Math.round(number*pricePerDozen/12);
	}
	
	public String getName()
	{
		String result = String.valueOf(number) + " @ " + String.valueOf(pricePerDozen/100.00) + " /dz." + "\n" + name;
		return result;
	}
	
}

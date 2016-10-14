
public class Cookie extends DessertItem
{

	protected int number;
	protected int pricePerDozen;
	
	public Cookie(String name, int number, int pricePerDozen)
	{
		super(name);
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}
	
	public String getOriginalName()
	{
		return name;
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

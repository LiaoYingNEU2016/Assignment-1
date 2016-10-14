
public class Candy extends DessertItem{

	private double weight;
	private double pricePerPound;
	
	public Candy(String name, double weight, double pricePerPound)
	{
		super(name);
		this.weight = weight;
		this.pricePerPound = pricePerPound;
	}
	

	@Override
	public int getCost()
	{
		return (int) Math.round(weight*pricePerPound);
	}
	
	public String getName()
	{
		String result = String.valueOf(weight) + " lbs. @ " + String.valueOf(pricePerPound/100.00) + " /lb." + "\n" + name;
		return result;
	}
	

}

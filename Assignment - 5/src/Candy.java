
public class Candy extends DessertItem{

	protected double weight;
	protected double pricePerPound;
	
	public Candy(String name, double weight, double pricePerPound)
	{
		super(name);
		this.weight = weight;
		this.pricePerPound = pricePerPound;
	}
	
	public String getOriginalName()
	{
		return name;
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

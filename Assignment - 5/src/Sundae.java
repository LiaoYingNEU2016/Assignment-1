
public class Sundae extends IceCream
{
	protected int topCost;
	protected String topName;
	
	public Sundae(String name, int cost, String topName, int topCost)
	{
		super(name, cost);
		this.topName = topName + " Sundae with " + "\n" + name;
		this.topCost = topCost;
	}
	
	public String getOriginalName()
	{
		return name;
	}
	
	@Override
	public int getCost()
	{
		return cost + topCost;
	}
	
	public String getName()
	{
		return topName;
	}
}

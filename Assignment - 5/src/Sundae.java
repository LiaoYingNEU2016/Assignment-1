
public class Sundae extends IceCream
{
	protected int topCost;
	private String topName;
	
	public Sundae(String name, int cost, String topName, int topCost)
	{
		super(name, cost);
		this.topName = topName + " Sundae with " + "\n" + name;
		this.topCost = topCost;
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


public class Checkout 
{
	private int numberOfItem;
	private DessertItem[] dessertItems;
	private final double taxRate;
	
	
	public Checkout()
	{
		numberOfItem = 0;
		dessertItems = new DessertItem[100];
		taxRate = DessertShoppe.taxRate;
	}
	

	public void enterItem(DessertItem item) 
	{
		dessertItems[numberOfItem] = item;
		numberOfItem++;		
	}

	public int numberOfItems() {
		return numberOfItem;
	}

	public int totalCost() 
	{	
		int sum = 0;
		for(int i = 0; i < numberOfItem; i++)
        {
			sum += dessertItems[i].getCost();
        }
		return sum;		
	}

	public int totalTax() 
	{
		return (int)Math.round(this.totalCost()*taxRate);
	}

	public void clear() 
	{
		for(int i = 0; i < numberOfItem; i++)
        {
			dessertItems[i] = null;
        }
		numberOfItem = 0;
	}
	
	public String toString()
	{
		String result = "";
		result += "     ";
		result += DessertShoppe.storeName + "\n";
		result += "     --------------------     \n";
		result += "\n";
		
		for(int i = 0; i < numberOfItem; i++)
		{
			result += dessertItems[i].getName() ;
			result += String.format("%" + (DessertShoppe.maxWidthOfItemCost - dessertItems[i].getOriginalName().length()) + "s%n", DessertShoppe.cents2dollarsAndCents(dessertItems[i].getCost()));
			
		}
		result += "\n";

        result += "Tax";
        int tax = (int)Math.round(this.totalCost() * DessertShoppe.taxRate);
        String taxS = DessertShoppe.cents2dollarsAndCents(tax);
        int widthTax = DessertShoppe.maxWidthOfItemCost - 3;
        result += String.format("%" + widthTax + "s%n", taxS);
        
        result += "Total";
        String totalS = DessertShoppe.cents2dollarsAndCents(this.totalCost() + this.totalTax());
        int widthTotal = DessertShoppe.maxWidthOfItemCost - 5;
        result += String.format("%" + widthTotal + "s%n", totalS);
        
        return result;
    }
		
}

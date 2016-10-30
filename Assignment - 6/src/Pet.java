

public class Pet 
{
	private String petName;
	private String ownerName;
	private String color;
	protected int sex;
	
	//Constructor
	public Pet(String petName, String ownerName, String color)
	{
		this.petName = petName;
		this.ownerName = ownerName;
		this.color = color;
	}
	
	public String getPetName()
	{
		return petName;
	}
	
	public String getOwnerName()
	{
		return ownerName;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setSex(int sexid) throws InvalidArgumentException
	{
		if(sexid <0 || sexid >3)
		{
			System.out.println("Please notify: MALE=0, FEMALE=1, SPAYED=2, NEUTERED=3 ");
			throw new InvalidArgumentException();
		}
		else this.sex = sexid;
	}	
	
	public String getSex()
	{
		String sex = null;
		if (this.sex == 0) sex = "Male";
		if (this.sex == 1) sex = "Female";
		if (this.sex == 2) sex = "Spayed";
		if (this.sex == 3) sex = "Neutured";
		return sex;
	}
	
	@Override
	public String toString()
	{
		String result = "";
		result += petName + " owned by " + ownerName + "\n";
		result += "Color: " + color + "\n";
		result += "Sex: " + this.getSex();
		return result;
	}
	
}

	

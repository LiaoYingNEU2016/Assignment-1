import java.util.ArrayList;

public class AnimalHospital 
{
	private String inputFile;
	public ArrayList<Pet> pets = new ArrayList<Pet>();
	
	public AnimalHospital(String inputFile)
	{
		this.inputFile = inputFile;
	}
	
	public void printPetInfoByName(String name)
	{
		for(Pet p:pets)
		{
			if(p.getPetName().equals(name))
				System.out.println(p.toString());
		}
	}
	
	public void printInforByOwner(String name)
	{
		for(Pet p:pets)
		{
			if(p.getOwnerName().equals(name))
				System.out.println(p.toString());
		}
	}
	
	public void printPetsBoarding(int month, int day, int year) throws InvalidArgumentException
	{
		for(Pet p:pets)
		{
			if(p instanceof Cat)
			{
				if(((Cat) p).boarding(month, day, year))
					System.out.println(p.toString());
			}
			else if(p instanceof Dog)
			{
				if(((Dog) p).boarding(month, day, year))
					System.out.println(p.toString());
			}
		}
	}
}

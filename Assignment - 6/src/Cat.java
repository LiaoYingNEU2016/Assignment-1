
public class Cat extends Pet implements Boardable 
{
	private String hairLength;
	private Date boardingStart, boardingEnd;
	public String getHairLength()
	{
		return hairLength;
	}
	
	//Create own Date class
	public class Date
	{
		private int month, day, year;
		
		public Date(int month, int day, int year) throws InvalidArgumentException
		{
			if (day<1||day>31||month<1||month>12||year<1000||year>2016)
			{
				throw new InvalidArgumentException();
			}
			this.month = month;
			this.day = day;
			this.year = year;
		}
		
		public int dateCovertToInteger(int month, int day, int year)
		{
			int dateTime = year*10000 + month*100 + day;
			return dateTime;
			
		}
	}
	
	public Cat(String petName, String ownerName, String color, String hairLength) {
		super(petName, ownerName, color);
		this.hairLength = hairLength;
	}	
	
	@Override
	public String toString()
	{
		String result = "";
		result += "CAT: "+ "\n" + super.toString() + "\n";
		result += "Hair: " + this.hairLength;
		return result;
	}
	@Override
	public void setBoardStart(int month, int day, int year) throws InvalidArgumentException
	{
		boardingStart = new Date(month, day, year);
	}
	@Override
	public void setBoardEnd(int month, int day, int year) throws InvalidArgumentException
	{
		boardingEnd = new Date(month, day, year);
	}
	@Override
	public boolean boarding(int month, int day, int year) throws InvalidArgumentException
	{
		Date dateBoarding = new Date(month, day, year);
		if( dateBoarding.dateCovertToInteger(month, day, year)<=boardingEnd.dateCovertToInteger(month, day, year) 
				&& dateBoarding.dateCovertToInteger(month, day, year)>=boardingStart.dateCovertToInteger(month, day, year))
		return true;
		else return false;
	}

}

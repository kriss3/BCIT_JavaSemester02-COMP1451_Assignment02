package pl.kriss3.bcit.comp1451;

public class Airplane extends Vehicle 
{
	private int maximumHeightFeet;
	
	public Airplane(int year, String make, String model, int maximumHeightFeet)
	{
		super(year, make, model);
		setMaximumHeightFeet(maximumHeightFeet);
	}
	
	public int getMaximumHeightFeet()
	{
		return maximumHeightFeet;
	}
	
	public void setMaximumHeightFeet(int value)
	{
		this.maximumHeightFeet = value <= 0 ? value  = 10 : value;
	}
	
}

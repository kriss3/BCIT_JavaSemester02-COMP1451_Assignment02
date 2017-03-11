package pl.kriss3.bcit.comp1451;

public class Boat extends Vehicle 
{
	private boolean isMotorized;
	
	public Boat(int year, String make, String model, boolean motorized)
	{
		super(year, make, model);
		setIsMotorized(motorized);
	}
	
	public boolean getIsMotorized()
	{
		return isMotorized;
	}
	
	public void setIsMotorized(boolean value)
	{
		this.isMotorized = value;
	}
}

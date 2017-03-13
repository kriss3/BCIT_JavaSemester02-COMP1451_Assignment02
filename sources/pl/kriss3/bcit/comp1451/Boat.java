package pl.kriss3.bcit.comp1451;

public class Boat extends Vehicle implements ISteerable, Comparable<Boat>
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
	
	//This boat is a 1980 Bayliner Extreme (with motor).
	@Override
	public String toString()
	{
		return String.format("This %s is a %s %s %s (%s motor)", 
				this.getClass().getSimpleName(), super.getYear(), super.getMake(), super.getModel(), getVerb());
	}

	@Override
	public int compareTo(Boat boat) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void accelerate() 
	{
		System.out.println("Adding more nautical knots!");
	}

	@Override
	public void steerLeft() 
	{
		//Port and starboard are nautical and aeronautical terms for left and right
		System.out.println("Port - Turn the boat left");
	}

	@Override
	public void steerRight() 
	{
		//Port and starboard are nautical and aeronautical terms for left and right,
		System.out.println("Starboard - Turn the boat right");
	}
	
	//add proper implementation - should return either with or without verb
	private String getVerb()
	{
		return String.format("", isMotorized);
	}
}

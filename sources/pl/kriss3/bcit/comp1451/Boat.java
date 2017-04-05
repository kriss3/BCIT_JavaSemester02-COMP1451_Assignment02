package pl.kriss3.bcit.comp1451;

/**
 * 
 * @author kszczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-COMP1451_Assignment02.git
 * @since 2017-03-11
 */
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
		return String.format("This %s is a %s %s %s (%s motor).", 
				this.getClass().getSimpleName().toLowerCase(), super.getYearManufactured(), super.getMake(), super.getModel(), getVerb());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isMotorized ? 1231 : 1237);
		return result;
	}

	
	@Override
	public boolean equals(Object boatObj) {
		if (this == boatObj)
			return true;
		if (boatObj == null)
			return false;
		if (!(boatObj instanceof Boat))
			return false;
		Boat other = (Boat) boatObj;
		if (isMotorized != other.isMotorized)
			return false;
		else return true;
	}

	
	@Override
	public int compareTo(Boat boat) 
	{
		return this.getYearManufactured() - boat.getYearManufactured();
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
		return isMotorized ? "with" : "without";
	}

}

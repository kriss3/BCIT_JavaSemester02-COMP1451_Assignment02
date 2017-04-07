package pl.kriss3.bcit.comp1451;

/**
 * Class Boat to create and operate on Boat objects
 * @author Krzsyztof Szczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-COMP1451_Assignment02.git
 * @since 2017-03-11
 */
public class Boat extends Vehicle implements ISteerable, Comparable<Boat>
{
	private boolean isMotorized;
	
	/**
	 * Ctor takes year,make,model and motorized => calling super() class
	 * @param year - year of a boat
	 * @param make - make of a boat
	 * @param model - model of a boat;
	 * @param motorized - flag to indicate if boat has motor or not;
	 */
	public Boat(int year, String make, String model, boolean motorized)
	{
		super(year, make, model);
		setIsMotorized(motorized);
	}
	
	/**
	 * Get property of a boat class;
	 * @return boolean, indicating whether a boat has motor or not;
	 */
	public boolean getIsMotorized()
	{
		return isMotorized;
	}
	
	/**
	 * Set property to set whether a boat has motor or not;
	 * @param value, boolean;
	 */
	public void setIsMotorized(boolean value)
	{
		this.isMotorized = value;
	}
	
	/**
	 * toString() prints custom message for a boat objects;
	 * @return returns String with Baot message;
	 */
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

	/**
	 * Checks if two boats are equal;
	 * @param takes Object as param, check if Object is a boat;
	 * @return true if Object passed-in is equal to the current object;
	 */
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

	/**
	 * Compares two boat object;
	 * @param boat object to compare to;
	 * @return int value indicating same object when sorting(0), greater(>0), smaller(<0)
	 */
	@Override
	public int compareTo(Boat boat) 
	{
		return this.getYearManufactured() - boat.getYearManufactured();
	}

	/**
	 * Accelerate method to speed up boat.
	 * Takes no params and returns nothing;
	 */
	@Override
	public void accelerate() 
	{
		System.out.println("Adding more nautical knots!");
	}

	/**
	 * steerLeft() method mimics boat's turning left;
	 */
	@Override
	public void steerLeft() 
	{
		//Port and starboard are nautical and aeronautical terms for left and right
		System.out.println("Port - Turn the boat left");
	}

	/**
	 * steerRight() mimics boat's turning right;
	 */
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

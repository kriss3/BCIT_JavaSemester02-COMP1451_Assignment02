package pl.kriss3.bcit.comp1451;

/**
 * Class Airplane to create and operate on airplane objects
 * @author Krzysztof Szczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-COMP1451_Assignment02.git
 * @since 2017-03-11
 */
public class Airplane extends Vehicle implements ISteerable, Comparable<Airplane>
{
	private int maximumHeightFeet;
	
	/**
	 * Ctor takes year,make, model and maximum height in feet => calling super() class
	 * @param year - year of an airplane;
	 * @param make - make of an airplane;
	 * @param model - model of an airplane;
	 * @param maximumHeightFeet - maximum height in feet;
	 */
	public Airplane(int year, String make, String model, int maximumHeightFeet)
	{
		super(year, make, model);
		setMaximumHeightFeet(maximumHeightFeet);
	}
	
	/**
	 * Get property to get airplanes' max height in feet;
	 * @return int with max height in feet;
	 */
	public int getMaximumHeightFeet()
	{
		return maximumHeightFeet;
	}
	
	/**
	 * Set property of airplane to set max height in feet;
	 * @param int, value to set as max height in feet;
	 * When param <=0 max height set to 10000;
	 */
	public void setMaximumHeightFeet(int value)
	{
		this.maximumHeightFeet = value <= 0 ? value = 10000 : value;
	}
	
	/**
	 * toString() prints message customized for airplane objects;
	 * @return returns String with message for airplane objects;
	 */
	@Override
	public String toString()
	{
		return String.format("This %s is a %s %s %s that can reach %s feet.", 
				this.getClass().getSimpleName().toLowerCase(), super.getYearManufactured(), super.getMake(), super.getModel(), maximumHeightFeet);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maximumHeightFeet;
		return result;
	}

	/**
	 * Checks if two Airplane objects are equal;
	 * @param takes Objects => preferably airplane;
	 * @return returns true if compared object is the same;
	 */
	@Override
	public boolean equals(Object airplaneObj) {
		if (this == airplaneObj)
			return true;
		if (airplaneObj == null)
			return false;
		if (!(airplaneObj instanceof Airplane))
			return false;
		Airplane other = (Airplane) airplaneObj;
		if (Math.abs(this.getMaximumHeightFeet() - other.getMaximumHeightFeet()) <=1000)
			return true;
		else return false;
	}
	
	/**
	 * Airplane compareTo() compares two Airplane objects and determines whether they are equal or not;
	 * @param takes Airplane object to compare;
	 * @return returns int value indicating, if compared object is "smaller"(<0), "greater"(>0) or equal(0)
	 */
	@Override
	public int compareTo(Airplane ap) 
	{
		return this.maximumHeightFeet - ap.maximumHeightFeet;
	}
	
	/**
	 * Accelerate method to speed up an airplane.
	 * Takes no params and returns nothing;
	 */
	@Override
	public void accelerate() 
	{
		System.out.println("Adding more knots (kt)!");
	}

	/**
	 * steerLeft() method mimics airplane "turning" left;
	 * prints message to output;
	 */
	@Override
	public void steerLeft() 
	{
		System.out.println("Flying LEFT and Down !!!");
	}
	
	/**
	 * steerRight() method mimics airplane "turning" right;
	 * prints message to standard output;
	 */
	@Override
	public void steerRight() 
	{
		System.out.println("Flying RIGHT and Down !!!");
	}
}

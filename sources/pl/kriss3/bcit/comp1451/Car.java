package pl.kriss3.bcit.comp1451;

/**
 * Class Car to create and operate on Car objects
 * @author Krzysztof Szczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-COMP1451_Assignment02.git
 * @since 2017-03-11
 */
public class Car extends Vehicle implements ISteerable, Comparable<Car>
{
	private int horsePower;

	/**
	 * Ctor takes year,make, model and horsePower calling super() class
	 * @param year - year of a car
	 * @param make - make of a car
	 * @param model - model of a car;
	 * @param horsePower - horsepower of a car;
	 */
	public Car(int year, String make, String model, int horsePower) 
	{
		super(year, make, model);
		setHorsePower(horsePower);
	}

	/**
	 * Get property of a car's horsPower;
	 * @return horsePower of a car;
	 */
	public int getHorsePower() 
	{
		return horsePower;
	}

	/**
	 * Set property of a car's horsePower;
	 * @param horsePower
	 */
	public void setHorsePower(int horsePower) 
	{
		this.horsePower = horsePower <= 0 ? 75 : horsePower;
	}

	/**
	 * toString() prints custom message for Car objects;
	 * @return returns String with Car message;
	 */
	@Override
	public String toString() 
	{
		return String.format("This %s is a %s %s %s with %s hp.", 
				this.getClass().getSimpleName().toLowerCase(), super.getYearManufactured(), super.getMake(), super.getModel(), horsePower);
	}
	
	/**
	 * Compares two cars object;
	 * @param Car object to compare to;
	 * @return int value indicating same object when sorting(0), greater(>0), smaller(<0)
	 */
	@Override
	public int compareTo(Car car) 
	{
		return this.horsePower - car.horsePower;
	}
	
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + horsePower;
		return result;
	}

	/**
	 * Checks if two cars are equal;
	 * @param takes Object as param, check if Object is a Car;
	 * @return true if Object passed in is equal;
	 */
	@Override
	public boolean equals(Object otherCar) 
	{
		if (this == otherCar)
			return true;
		if (otherCar == null)
			return false;
		if (!(otherCar instanceof Car))
			return false;
		
		Car other =  (Car)otherCar;
		
		if(Math.abs(this.getHorsePower() - other.getHorsePower()) <= 10)
			return true;
		else 
			return false;
	}

	/**
	 * Accelerate method to speed up boat.
	 * Takes no params and returns nothing;
	 */
	@Override
	public void accelerate() 
	{
		System.out.println(this.getClass().getSimpleName() + " is INCREASING speed!");
	}

	/**
	 * steerLeft() method mimics car's turning left;
	 */
	@Override
	public void steerLeft() 
	{
		System.out.println(this.getClass().getSimpleName() + " is turning LEFT!");
	}

	/**
	 * steerRight() mimics car's turning right;
	 */
	@Override
	public void steerRight() 
	{
		System.out.println(this.getClass().getSimpleName() + " is turning RIGHT!");	
	}
}

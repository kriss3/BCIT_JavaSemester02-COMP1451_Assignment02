package pl.kriss3.bcit.comp1451;

/**
 * 
 * @author Krzysztof Szczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-COMP1451_Assignment02.git
 * @since 2017-03-11
 */
public class Car extends Vehicle implements ISteerable, Comparable<Car>
{
	private int horsePower;

	public Car(int year, String make, String model, int horsePower) 
	{
		super(year, make, model);
		setHorsePower(horsePower);
	}

	public int getHorsePower() 
	{
		return horsePower;
	}

	public void setHorsePower(int horsePower) 
	{
		this.horsePower = horsePower;
	}

	@Override
	public String toString() 
	{
		return String.format("This %s is a %s %s %s with %s hp.", 
				this.getClass().getSimpleName().toLowerCase(), super.getYearManufactured(), super.getMake(), super.getModel(), horsePower);
	}
	
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

	
	@Override
	public void accelerate() 
	{
		System.out.println(this.getClass().getSimpleName() + " is INCREASING speed!");
	}

	@Override
	public void steerLeft() 
	{
		System.out.println(this.getClass().getSimpleName() + " is turning LEFT!");
	}

	@Override
	public void steerRight() 
	{
		System.out.println(this.getClass().getSimpleName() + " is turning RIGHT!");	
	}
}

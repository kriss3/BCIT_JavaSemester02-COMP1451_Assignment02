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

	//This car is a 1999 Toyota Corrola with 140 hp.
	@Override
	public String toString() 
	{
		return String.format("This %s is a %s %s %s with %s hp", 
				this.getClass().getSimpleName(), super.getYear(), super.getMake(), super.getModel(), horsePower);
	}
	
	@Override
	public int compareTo(Car car) 
	{
		return 0;
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

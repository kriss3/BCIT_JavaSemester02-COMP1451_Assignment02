package pl.kriss3.bcit.comp1451;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void steerLeft() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void steerRight() 
	{
		// TODO Auto-generated method stub
		
	}
}

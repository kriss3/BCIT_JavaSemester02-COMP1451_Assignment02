package pl.kriss3.bcit.comp1451;

public class Car extends Vehicle 
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
}

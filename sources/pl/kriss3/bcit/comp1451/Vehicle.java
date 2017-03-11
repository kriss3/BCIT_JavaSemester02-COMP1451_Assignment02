package pl.kriss3.bcit.comp1451;

public abstract class Vehicle 
{
	private int year;
	private String make;
	private String model;
	
	
	public int getYear() 
	{
		return year;
	}
	
	public Vehicle(int year, String make, String model) 
	{
		setYear(year);
		setMake(make);
		setModel(model);
	}

	public void setYear(int year) 
	{
		this.year = year;
	}
	
	public String getMake() 
	{
		return make;
	}
	
	public void setMake(String make) 
	{
		this.make = make;
	}
	
	public String getModel() 
	{
		return model;
	}
	
	public void setModel(String model) 
	{
		this.model = model;
	}

	
	
	
}

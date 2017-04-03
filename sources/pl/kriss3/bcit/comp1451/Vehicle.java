package pl.kriss3.bcit.comp1451;

/**
 * Abstract class to represent different type of Vehicle objects;
 * @author kszczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-COMP1451_Assignment02.git
 * @since 2017-03-11
 */
public abstract class Vehicle 
{
	private int yearManufactured;
	private String make;
	private String model;
	
	public Vehicle(int yearManufactured, String make, String model) 
	{
		setYearManufactured(yearManufactured);
		setMake(make);
		setModel(model);
	}
	
	public int getYearManufactured() 
	{
		return this.yearManufactured;
	}

	public void setYearManufactured(int year) 
	{
		this.yearManufactured = year;
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

package pl.kriss3.bcit.comp1451;

/**
 * 
 * @author kszczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-COMP1451_Assignment02.git
 * @since 2017-03-11
 */
public class Airplane extends Vehicle implements ISteerable, Comparable<Airplane>
{
	private int maximumHeightFeet;
	
	public Airplane(int year, String make, String model, int maximumHeightFeet)
	{
		super(year, make, model);
		setMaximumHeightFeet(maximumHeightFeet);
	}
	
	public int getMaximumHeightFeet()
	{
		return maximumHeightFeet;
	}
	
	public void setMaximumHeightFeet(int value)
	{
		this.maximumHeightFeet = value <= 0 ? value  = 10 : value;
	}

	
	//This airplane is a 1998 ABC Motors Comac that can reach 10000 feet. 
	@Override
	public String toString()
	{
		return String.format("This %s is a %s %s %s that can reach %s feet", 
				this.getClass().getSimpleName(), super.getYear(), super.getMake(), super.getModel(), maximumHeightFeet);
	}
	
	@Override
	public int compareTo(Airplane ap) 
	{
		return 0;
	}

	@Override
	public void accelerate() 
	{
		System.out.println("Adding more knots (kt)!");
	}

	@Override
	public void steerLeft() 
	{
		System.out.println("Flying LEFT and Down !!!");
		
	}

	@Override
	public void steerRight() 
	{
		System.out.println("Flying RIGHT and Down !!!");
	}
}

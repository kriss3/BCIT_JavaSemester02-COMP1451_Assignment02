package pl.kriss3.bcit.comp1451;

import java.util.ArrayList;
import java.util.List;

/**
 * Starting point of Assignment 02
 * @author Krzysztof Szczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-COMP1451_Assignment02.git
 * @ 2017-03-11 (set as static)
 */
public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("Assignment 02 Start ...");
		run();
	}
	
	private static void run()
	{
		Car c = new Car(1999, "Fiat", "126p", 12);
		System.out.println(c.toString());
		
		List<Car> cars = new ArrayList<Car>();
		cars.add(c);
	}
}

package pl.kriss3.bcit.comp1451;

import java.util.ArrayList;
import java.util.List;

/**
 * Starting point of Assignment 02
 * @author Krzysztof Szczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-COMP1451_Assignment02.git
 * @sine 2017-03-11 (set as static)
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
		
		Car d = new Car(2011,"Lambo","Diablo", 22);
		
		boolean isEqual = c.equals(d);
		
		if(isEqual)
			System.out.println(String.format("%s\n%s\nObject: %s is equal to object: %s", c.toString(), d.toString(), c.toString(), d.toString()));
		
		System.out.println(c.toString());
		
		//List<Car> cars = new ArrayList<Car>();
		//cars.add(c);
		System.out.println("Finished !!");
	}
	
	private static void addValues()
	{
		List<Car> cars = new ArrayList<>();
		cars.add(new Car(2000,"Lamborghini","Diablo",700));
		cars.add(new Car(1997,"Dodge","Ram",175));
		cars.add(new Car(1940,"Buggati","Veyron",135));
		cars.add(new Car(2014,"Honda","Civic",143));
		cars.add(new Car(1999,"Toyota","Corrola",140));
		
		List<Boat> boats = new ArrayList<>();
		boats.add(new Boat(1980,"Bayliner","Extreme", true));
		boats.add(new Boat(2014,"Bayliner","Extreme II",true));
		boats.add(new Boat(2000,"American Skier","Skier Supreme",false));
		boats.add(new Boat(2010,"Boesch","Journey",false));
		
		
		List<Airplane> airplanes = new ArrayList<>();
		airplanes.add(new Airplane(1998,"ABC Motors","Comac",10000));
		airplanes.add(new Airplane(1940,"Boeing","84",45000));
		airplanes.add(new Airplane(2012,"Boeing","737",80000));
		airplanes.add(new Airplane(2014,"Abrams","Motorhead",70000));
		
	}
	
	
}

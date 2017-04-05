package pl.kriss3.bcit.comp1451;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Helper 
{
	public static void addValues()
	{
		List<Car> cars = new ArrayList<>();
		System.out.println("CARS:");
		cars.add(new Car(2000,"Lamborghini","Diablo",700));
		cars.add(new Car(1997,"Dodge","Ram",175));
		cars.add(new Car(1940,"Buggati","Veyron",135));
		cars.add(new Car(2014,"Honda","Civic",143));
		cars.add(new Car(1999,"Toyota","Corrola",140));
		print(cars);
		System.out.println();
		Collections.sort(cars);
		System.out.println("CARS after SORT (by Horse Power):");
		print(cars);
		System.out.println();
		
		List<Boat> boats = new ArrayList<>();
		System.out.println("BOATS:");
		boats.add(new Boat(1980,"Bayliner","Extreme", true));
		boats.add(new Boat(2014,"Bayliner","Extreme II",true));
		boats.add(new Boat(2000,"American Skier","Skier Supreme",false));
		boats.add(new Boat(2010,"Boesch","Journey",false));
		print(boats);
		System.out.println();
		Collections.sort(boats);
		System.out.println("BOATS after SORT (aby year manufactured):");
		print(boats);
		System.out.println();
		
		
		List<Airplane> airplanes = new ArrayList<>();
		System.out.println("AIRPLANES:");
		airplanes.add(new Airplane(1998,"ABC Motors","Comac",10000));
		airplanes.add(new Airplane(1940,"Boeing","84",45000));
		airplanes.add(new Airplane(2012,"Boeing","737",80000));
		airplanes.add(new Airplane(2014,"Abrams","Motorhead",70000));
		print(airplanes);
		System.out.println();
		Collections.sort(airplanes);
		System.out.println("AIRPLANES after SORT (by altitude):");
		print(airplanes);
		System.out.println();
	}
	
	public static <T> void print(List<T>  vehicles)
	{
		for (T myV :  vehicles) 
		{
			System.out.println(myV.toString());
		}
	}
}

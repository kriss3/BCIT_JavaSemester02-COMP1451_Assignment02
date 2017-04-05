package pl.kriss3.bcit.comp1451;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Assignment2Test 
{
	private Vehicle car;
	private Vehicle boat;
	private Vehicle airplane;
	
	@Before
    public void setUp()
    {
        car = new Car(2000,"","",150);
        boat = new Boat(1888,"","",true);
        airplane = new Airplane(2014,"","",10000);
        
    } // end setup
	
	@Test
	public void checkThatHorsePowerIsNotBelowZero()
	{
		Car c = new Car(2014,"","", -30);
		assertEquals(75,c.getHorsePower());
	}
	
	
	@After
	public void tearDown()
	{
		car = null;
		boat = null;
		airplane = null;
	}
}

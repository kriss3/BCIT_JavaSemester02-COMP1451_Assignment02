package pl.kriss3.bcit.comp1451;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class to test methods in Car, Boat and Airplane classes
 * @author Krzysztof Szczurowski
 * @see https://github.com/kriss3/BCIT_JavaSemester02-COMP1451_Assignment02.git
 * @since 2017-03-11
 */
public class Assignment2Test 
{
	private Car car;
	private Boat boat;
	private Airplane airplane;
	
	
	@Before
    public void setUp()
    {
        car = new Car(2000,"Fiat","126p",900);
        boat = new Boat(1980,"Bayliner","Extreme",true);
        airplane = new Airplane(2014,"Abrams","Motorhead",10000);
        
    } // end setup
	
	@Test
	public void checkThatHorsePowerIsNotBelowZero()
	{
		car = new Car(2014,"Fiat","126p", -30);
		assertEquals(75,car.getHorsePower());
	}
	
	@Test
	public void checkThatTwoCarsAreEqual()
	{	
		Car c2 = new Car(2011,"Fiat","126p",890);
		assertTrue(car.equals(c2));
	}
	
	@Test
	public void checkThatTwoCarsAreNOTEqal()
	{
		Car c2 = new Car(2011,"Fiat","126p",110);
		assertFalse(car.equals(c2));
	}
	
	@Test
	public void checkThatCarReturnsCorrectMessage()
	{
		assertEquals("This car is a 2000 Fiat 126p with 900 hp.",car.toString());
	}
	
	@Test
	public void checkThatCarIsGreaterThanOther()
	{
		Car c2 = new Car(2000,"Fiat","126p",890);
		assertEquals(10,car.compareTo(c2));
	}
	
	@Test
	public void checkThatTwoBoatsAreEqual()
	{
		Boat b2 = new Boat(1888, "Big Boat","Two", true);
		assertTrue(boat.equals(b2));
	}
	
	@Test
	public void checkThaBoatReturnsCorrectMessage()
	{
		assertEquals("This boat is a 1980 Bayliner Extreme (with motor).", boat.toString());
	}
	
	@Test
	public void checkThatBoatIsMotorised()
	{
		assertTrue(boat.getIsMotorized());
	}
	
	@Test
	public void checkThatBoatisNOTMotorised()
	{
		boat.setIsMotorized(false);
		assertFalse(boat.getIsMotorized());
	}
	
	@Test
	public void checkComparisonOfTwoBoats()
	{
		Boat b2 = new Boat(1980,"myBoat1","Neversink II",true);
		assertEquals(0,boat.compareTo(b2));
	}
	
	@Test
	public void checkThatTwoAirplanesAreEqual()
	{
		Airplane a2 = new Airplane(1999,"","", 11000);
		assertTrue(airplane.equals(a2));
	}
	
	@Test
	public void checkThatTwoAirplanesAreNOTEqual()
	{
		Airplane a3 = new Airplane(1888,"","",8999);
		assertFalse(airplane.equals(a3));
	}
	
	@Test 
	public void checkThatAirplanesHaveMaxHeighFeet()
	{
		Airplane a4 = new Airplane(2000,"","",-100);
		assertEquals(10000,a4.getMaximumHeightFeet());
	}
	
	@Test
	public void checkThatAirplaneSetMaxHeightFeetSetHeightCorrectly()
	{
		airplane.setMaximumHeightFeet(45000);
		assertEquals(45000, airplane.getMaximumHeightFeet());
	}
	
	@Test
	public void checkThatAirplaneReturnsCorrectMessage()
	{
		assertEquals("This airplane is a 2014 Abrams Motorhead that can reach 10000 feet.", airplane.toString());
	}
	
	
	@After
	public void tearDown()
	{
		car = null;
		boat = null;
		airplane = null;
	}
}

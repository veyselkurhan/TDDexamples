import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Testing {
	Game game=null;
	Predictions prediction;
	@Before
	public void setUp() throws Exception {
 game=new Game();
		prediction=new Predictions();
	}

	@After
	public void tearDown() throws Exception {
		game=null;
		prediction=null;
	}

	@Test 
	public void NonIntegerValueTest()
	{	
		assertEquals(true, prediction.isTheValueInteger("0a"));	
		
	}
	@Test
	public void FourDigitTest() {
		
		try
		{
			prediction.FourDigitControl(12345);
		fail();
		}
		catch(NonFourDigitException e)
		{
			
		}
	}
		@Test
		public void IsTheFirstDigitZeroTest()
		{
			assertFalse(prediction.isTheFirstDigitZero(1245));
			
		}
		@Test
		public void AredigitsDifferentTest()
		{	
			assertTrue(prediction.digitsDifferent(1234));
		}
		@Test
		public void CorrectpredictionTest()
		{	
		assertTrue(game.correctPrediction(game.realnumber));
			
		}
	@Test
	public void WrongPredictionTest(){
		
		assertEquals("4+ 0-",game.wrongPrediction(game.realnumber));
		
	}
	@Test
	public void TheNumberOfTries()
	{	
		prediction.setPrediction(1235);
		game.predict(prediction);
		prediction.setPrediction(1234);
		game.predict(prediction);
		assertEquals(2,game.getCounter());
		
	
	}
	@Test
	public void TestTheRandomNumberHasDifferentDigits()
	{
		assertTrue(digitsDifferent(game.realnumber));
	}
	public boolean digitsDifferent(int a)
	{
		ArrayList<Integer> digits=new ArrayList<Integer>();
		int digit=a/1000;
		digits.add(digit);
		a=a%1000;
		digit=a/100;
	if(digits.contains(digit)==true)
		return false;
	digits.add(digit);
	a=a%100;
	digit=a/10;
	if(digits.contains(digit)==true)
		return false;
	digits.add(digit);
	a=a%10;
	if(digits.contains(a)==true)
		return false;
	digits.add(digit);
		return true;
		
	}
	}



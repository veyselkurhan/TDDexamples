import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Testing {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test 
	public void NonIntegerValueTest()
	{
		Game game=new Game();
		Predictions prediction=new Predictions();
		assertEquals(true, prediction.isTheValueInteger("0a"));	
		
	}
	@Test
	public void FourDigitTest() {
		Game game=new Game();
		Predictions prediction=new Predictions();
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
			Game game=new Game();
			Predictions prediction=new Predictions();
			assertFalse(prediction.isTheFirstDigitZero(1245));
			
		}
		@Test
		public void AredigitsDifferentTest()
		{	Predictions prediction=new Predictions();
			Game game=new Game();
			assertTrue(prediction.digitsDifferent(1234));
		}
		@Test
		public void CorrectpredictionTest()
		{	Predictions prediction=new Predictions();
		Game game=new Game();
		assertTrue(game.correctPrediction(1234));
			
		}
	@Test
	public void WrongPredictionTest(){
		Game game=new Game();
		Predictions prediction=new Predictions();
		assertEquals("4+ 0-",game.wrongPrediction(1235));
		
	}
	@Test
	public void TheNumberOfTries()
	{
		Game game =new Game();
		Predictions prediction=new Predictions();
		prediction.setPrediction(1235);
		game.predict(prediction);
		prediction.setPrediction(1234);
		game.predict(prediction);
		assertEquals(2,game.getCounter());
		
	
	}
	}



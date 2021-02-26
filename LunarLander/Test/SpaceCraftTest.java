import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SpaceCraftTest {
	private SpaceCraft sc; 
	@Before
	public void setUp() throws Exception {
		sc = new SpaceCraft(); 
	}

	@After
	public void tearDown() throws Exception {
		sc = null ; 
	}

	

	@Test
	public void testGetBurnRate() {
		assertNotNull(sc.getBurnRate());
	}

	@Test
	public void testSetBurnRate() {
		sc.setBurnRate(2);
		assertEquals(2, sc.getBurnRate());
	}

	@Test
	public void testCalcNewValues() {
		SpaceCraft sc = new SpaceCraft();
		sc.init();
		assertEquals(0, sc.getBurnRate());
		
		sc.setBurnRate(1000);
		try {
			sc.calcNewValues();
			fail("Exception should be thrown");
			} catch (Exception e){
			;//Exception expected
			}
			sc.setBurnRate(5);
			sc.setFuel(45);
			try{
			sc.calcNewValues();
			} catch (Exception e){
			;//Ignore this time
			}
			assertEquals(40, sc.getFuel());
			}

	@Ignore
	public void oldTest() {
		fail("If executred, this test should fail.");
	}
	
	@Test
	public void testGetFuel() {
		assertNotNull(sc.getFuel());
	}

	@Test
	public void testSetFuel() {
		sc.setFuel(40);
		assertEquals(40, sc.getFuel());
		
	}

}

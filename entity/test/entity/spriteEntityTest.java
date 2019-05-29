package entity;

import static org.junit.Assert.*;

import java.io.CharConversionException;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class spriteEntityTest {
	
	spriteEntity sprEnt;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		sprEnt = new spriteEntity().getInstance();
		String allExistingString = "trdcsexm#zaokjw";
		for (int i = 0; i < allExistingString.length(); i++) {
			sprEnt.setCorrepondingEntity(allExistingString.charAt(i));
		}
		sprEnt.setEnoughDiamond(true);
		sprEnt.setCorrepondingEntity('x');
		sprEnt.setLastBehavior(5);
		sprEnt.setCorrepondingEntity('s');
		sprEnt.setLastBehavior(2);
		sprEnt.setCorrepondingEntity('s');
		sprEnt.setLastBehavior(1);
		sprEnt.setCorrepondingEntity('s');
		sprEnt.setLastBehavior(3);
		sprEnt.setCorrepondingEntity('s');
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testSetLastBehavior() {
		//assertNotNull(sprEnt.);
	}

	@Test
	public void testSetCorrepondingEntity() {
		try {
			sprEnt.setCorrepondingEntity('f'); //unexisting char
            fail("Expected an OBJECT_NOT_EXIST");
        } catch (IOException e ) {
        	System.out.println(e.getMessage());
            assertEquals(e.getMessage(), "This char doesn't exist");
        } 
	}

	@Test
	public void testGetMyPicture() {
		assertNotNull(sprEnt.getMyPicture());
	}

	@Test
	public void testGetBorderTopAndBottom() {
		assertNotNull(sprEnt.getBorderTopAndBottom());
	}

	@Test
	public void testGetEarth() {
		assertNotNull(sprEnt.getEarth());
	}

	@Test
	public void testGetDiamond() {
		assertNotNull(sprEnt.getDiamond());
	}

	@Test
	public void testGetRock() {
		assertNotNull(sprEnt.getRock());
	}

	@Test
	public void testGetWay() {
		assertNotNull(sprEnt.getWay());
	}

	@Test
	public void testGetEnnemy() {
		assertNotNull(sprEnt.getEnnemy());
	}

	@Test
	public void testGetExit() {
		assertNotNull(sprEnt.getExit());
	}

	@Test
	public void testGetWall() {
		assertNotNull(sprEnt.getWall());
	}

	@Test
	public void testGetHeroUp() {
		assertNotNull(sprEnt.getHeroUp());
	}

	@Test
	public void testGetHeroDown() {
		assertNotNull(sprEnt.getHeroDown());
	}

	@Test
	public void testGetHeroRight() {
		assertNotNull(sprEnt.getHeroRight());
	}

	@Test
	public void testGetHeroLeft() {
		assertNotNull(sprEnt.getHeroLeft());
	}

	@Test
	public void testGetBorderLeft() {
		assertNotNull(sprEnt.getBorderLeft());
	}

	@Test
	public void testGetBorderTopLeft() {
		assertNotNull(sprEnt.getBorderTopLeft());
	}

	@Test
	public void testGetBorderRight() {
		assertNotNull(sprEnt.getBorderRight());
	}

	@Test
	public void testGetBorderTopRight() {
		assertNotNull(sprEnt.getBorderTopRight());
	}

	@Test
	public void testGetBorderBottomRight() {
		assertNotNull(sprEnt.getBorderBottomRight());
	}

	@Test
	public void testGetBorderBottomLeft() {
		assertNotNull(sprEnt.getBorderBottomLeft());
	}

}

package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import entity.level;

public class collisionHandlerTest {
	
	collisionHandler cH;
	Model modelForTestPurposes;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cH = new collisionHandler();
		modelForTestPurposes = new Model();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCheckCollisionForPlayerPositionMovementAndPush() {
		modelForTestPurposes.loadLevel(3);
		String oldLevel = modelForTestPurposes.getLevel().getLevelAsString();
		int moveItTo = 3;
		cH.checkCollisionForPlayerPositionMovementAndPush(modelForTestPurposes.getLevel().getPlayerPositionX(), modelForTestPurposes.getLevel().getPlayerPositionY(), moveItTo, modelForTestPurposes.getLevel(), modelForTestPurposes, modelForTestPurposes.getLevel().getLevelAsList());
		String newLevel = modelForTestPurposes.getLevel().getLevelAsString();
		assertEquals(oldLevel, newLevel);
	}

	
	
	@Test
	public void testMakeEverythingFallDownAndEnnemyMove() {
		modelForTestPurposes.loadLevel(3);
		String oldLevel = modelForTestPurposes.getLevel().getLevelAsString();
		cH.makeEverythingFallDownAndEnnemyMove(modelForTestPurposes.getLevel(), modelForTestPurposes);
		String newLevel = modelForTestPurposes.getLevel().getLevelAsString();
		assertNotEquals(oldLevel, newLevel);
	}

}

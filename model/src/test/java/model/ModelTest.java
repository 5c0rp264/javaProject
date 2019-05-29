package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ModelTest {

	
	Model modelTest;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		modelTest = new Model();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLoadLevel() {
		String expectedLevel4 = "ttttttttttttttttttttttttttttmttttttttttttttttttttttttttttttt\r\n" + 
				"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
				"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
				"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
				"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
				"ttttrtttttcttttttttttttmmmmmmmmmmmttttrtrrctrtrtttcrtttttttt\r\n" + 
				"tccctttttcRcttttctrtttmttttcttrtttmttttcttRctttttcRttttttttt\r\n" + 
				"ttttrrrrrtrttttttttccmtcttrRtcrtcrcmtttcttttttctctcttttttttt\r\n" + 
				"ttttttttttz######################################wtttttttttt\r\n" + 
				"tttmmrttttammmmmmmmmttttrtrttrttttttttrtmmmmmmmmmjtttttttttt\r\n" + 
				"ttttttttttamcccccccctttttttttttrttttrtttccccccccmjtttrrttttt\r\n" + 
				"ttttttttttamcdecccccttrttttttttttrtttrttcccccedcmjtttttttttt\r\n" + 
				"tttttmttttammmmmmmmmttrttttttttrttttttrtmmmmmmmmmjtttttcrttt\r\n" + 
				"ttttmtmtttamccccccccttttttrtttrtttttttrtccccccccmjtrcttttttt\r\n" + 
				"tttmmmmmttamcdecccccttttrttttttrtrrtttttcccccedcmjttmttttttt\r\n" + 
				"ttmrttttmtammmmmmmmmtrrttttttttrtrrtttttmmmmmmmmmjtttttccttt\r\n" + 
				"tmtttttttmamccccccccttttrtrttttrttrtttttccccccccmjttttrttttt\r\n" + 
				"trrrttttttamcdecccccttttrtrttttrttrttrttcccccedcmjttttttmrtt\r\n" + 
				"ttttttttddammmmmmmmmtrrtrttrttttrtttrtttmmmmmmmmmjttcctttttt\r\n" + 
				"tttttcrtttamcccccccctrrtrttrttttttttttttccccccccmjttcrtttttt\r\n" + 
				"tttcctttttamcdecccccttttrttrttttttttrtttcccccedcmjttttrrtttt\r\n" + 
				"ttttttttttammmmmmmmmtttttrtttrttttrttrttmmmmmmmmmjtttttttttt\r\n" + 
				"ttttttttttattttrtrttrttttttttrtttttrttttttttttttrjtttmmmtttt\r\n" + 
				"ttttttttttattttttrttttrttttrttrtrtttrttrtttttttttjtttttttttt\r\n" + 
				"ttttrdttttattrttttrtttttrtttrtttttttrttrtttttttttjtttdtttttt\r\n" + 
				"ttttttttttattrttttttttrttttttrtrrtttttttttrttttttjtctttttttt\r\n" + 
				"ttttttdcttartstttrtttttttttttrtrrtttttttttrrttrtxjttttmrtttt\r\n" + 
				"ttttttttttattttrttttttrtrrttttttrttttttttrttrttttjtt#ttttttt\r\n" + 
				"ttttcttdttarrtttttttttrtrrtttttttttrttrtrtrttrtttjtttmtttttt\r\n" + 
				"tttttttttto######################################ktmtctttttt\r\n" + 
				"tttttttttttttddtttttttttttttmttttttttddttttttttttttttttttttt\r\n" + 
				"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
				"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
				"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
				"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
				"ttttrtttttcttttttttttttmmmmmmmmmmmttttrtrrctrtrtttcrtttttttt\r\n" + 
				"tccctttttcRcttttctrtttmttttcttrtttmttttcttRctttttcRttttttttt\r\n" + 
				"ttttrrrrrtrttttttttccmtcttrRtcrtcrcmtttcttttttctctcttttttttt\r\n" ;
		modelTest.loadLevel(4);
		String level4GotFromSQL = modelTest.getLevel().getLevelAsString();
		//System.out.println(modelTest.getLevel().getLevelAsString());
		assertEquals(level4GotFromSQL,expectedLevel4);
	}

	@Test
	public void testMovePlayer() {
		String expectedLevel1AfterMoveUp = "ttttttttttttttttttttttttttttmttttttttttttttttttttttttttttttt\r\n" + 
				"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
				"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
				"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
				"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
				"ttttrtttttcttttttttttttmmmmmmmmmmmttttrtrrctrtrtttcrtttttttt\r\n" + 
				"tccctttttcrcttttctrtttmttttcttrtttmttttcttrctttttccttttttttt\r\n" + 
				"ttttrrrrrtrttttttttccmtcttrrtcrtcrcmtttcttttttctctrttttttttt\r\n" + 
				"ttttttttttz######################################wtttttttttt\r\n" + 
				"tttmmrttttattstttcttdtrctttttrtrtttttttcttttrttttjtttttttttt\r\n" + 
				"ttttttttttatrcrttttttctttttttttrdttrttttctttttcttjtttrrttttt\r\n" + 
				"ttttttttttattttttttttcttctttttrtrttrttttttttrttttjtttttttttt\r\n" + 
				"tttttmttttartcctttttttttrttttttrttrttttrtttrtttttjtttttcrttt\r\n" + 
				"ttttmtmtttartrrtttttttttrrttrttttttttrttttttrtrctjtrcttttttt\r\n" + 
				"tttmmmmmttatttrttrttttttttrtttttrtcrttttttttrtrrtjttmttttttt\r\n" + 
				"ttmrttttmtammmmmmmmmmmmmmmmmmmmmmmmmmmmmmtttrttrtjtttttccttt\r\n" + 
				"tmtttttttmatctttrttdtcttrtrttttttttttdtrcttttttrtjtttttttttt\r\n" + 
				"trrrttttttattdtttttrtttttcttttttttrccrttdttttrtttjtttttttttt\r\n" + 
				"ttttttttddatttrttrtrttttttttttttttrrtrttrttttttttjtttttttttt\r\n" + 
				"tttttcrtttatctttttrttttttttrrctttttttrttrtdttttctjttcrtttttt\r\n" + 
				"tttcctttttatrttcttrtcctttttrtrdttdttttrtttrttdtrtjttttrrtttt\r\n" + 
				"ttttttttttatdrttttttttttttttrrrttrttttttttdtttttrjtttttttttt\r\n" + 
				"ttttttttttattttttttmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmjtttmmmtttt\r\n" + 
				"ttttttttttacctttttttttctttdttttrtttttrtttrtttttttjtttttttttt\r\n" + 
				"ttttrdttttacrtttttttttrrttrttttttttrttttttrtrcttxjtttdtttttt\r\n" + 
				"ttttttttttatrttrttttttttrtttttrtccttttdtttrtrrtttjtctttttttt\r\n" + 
				"ttttttdcttattttrdttcttttttttrttttttrtrdttttttrtttjttttmrtttt\r\n" + 
				"ttttttttttatttcttctrttrtrrtttttttttrtrdttttttrttrjtt#ttttttt\r\n" + 
				"ttttcttdttatdttttrtttttctttttttttctrttrttttrtttrtjtttmtttttt\r\n" + 
				"tttttttttto######################################ktmtctttttt\r\n" + 
				"tttttttttttttddtttttttttttttmttttttttddttttttttttttttttttttt\r\n" + 
				"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
				"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
				"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
				"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
				"ttttrtttttcttttttttttttmmmmmmmmmmmttttrtrrctrtrtttcrtttttttt\r\n" + 
				"tccctttttcrcttttctrtttmttttcttrtttmttttcttrctttttccttttttttt\r\n" + 
				"ttttrrrrrtrttttttttccmtcttrRtcrtcrcmtttcttttttctctRttttttttt\r\n";
		modelTest.loadLevel(1);
		modelTest.movePlayer(5);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String level1GotAfterMove = modelTest.getLevel().getLevelAsString();
		//System.out.println(modelTest.getLevel().getLevelAsString());
		assertEquals(level1GotAfterMove,expectedLevel1AfterMoveUp);
	}
	
	
	@Test
	public void testLoadNextLevelAtExit() {
		modelTest.loadLevel(1);
		String firstLevelAtEnd = "ttttttttttttttttttttttttttttmttttttttttttttttttttttttttttttt\r\n" + 
				"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
				"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
				"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
				"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
				"ttttrtttttcttttttttttttmmmmmmmmmmmttttrtrrctrtrtttcrtttttttt\r\n" + 
				"tccctttttcrcttttctrtttmttttcttrtttmttttcttrctttttccttttttttt\r\n" + 
				"ttttrrrrrtrttttttttccmtcttrrtcrtcrcmtttcttttttctctrttttttttt\r\n" + 
				"ttttttttttz######################################wtttttttttt\r\n" + 
				"tttmmrttttattctttcttdtrctttttrtrtttttttcttttrttttjtttttttttt\r\n" + 
				"ttttttttttatrcrttttttctttttttttrdttrttttctttttcttjtttrrttttt\r\n" + 
				"ttttttttttattttttttttcttctttttrtrttrttttttttrttttjtttttttttt\r\n" + 
				"tttttmttttartcctttttttttrttttttrttrttttrtttrtttttjtttttcrttt\r\n" + 
				"ttttmtmtttartrrtttttttttrrttrttttttttrttttttrtrctjtrcttttttt\r\n" + 
				"tttmmmmmttatttrttrttttttttrtttttrtcrttttttttrtrrtjttmttttttt\r\n" + 
				"ttmrttttmtammmmmmmmmmmmmmmmmmmmmmmmmmmmmmtttrttrtjtttttccttt\r\n" + 
				"tmtttttttmatctttrttdtcttrtrttttttttttdtrcttttttrtjtttttttttt\r\n" + 
				"trrrttttttattdtttttrtttttcttttttttrccrttdttttrtttjtttttttttt\r\n" + 
				"ttttttttddatttrttrtrttttttttttttttrrtrttrttttttttjtttttttttt\r\n" + 
				"tttttcrtttatctttttrttttttttrrctttttttrttrtdttttctjttcrtttttt\r\n" + 
				"tttcctttttatrttcttrtcctttttrtrdttdttttrtttrttdtrtjttttrrtttt\r\n" + 
				"ttttttttttatdrttttttttttttttrrrttrttttttttdtttttrjtttttttttt\r\n" + 
				"ttttttttttattttttttmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmjtttmmmtttt\r\n" + 
				"ttttttttttacctttttttttctttdttttrtttttrtttrttttttsjtttttttttt\r\n" + 
				"ttttrdttttacrtttttttttrrttrttttttttrttttttrtrcttxjtttdtttttt\r\n" + 
				"ttttttttttatrttrttttttttrtttttrtccttttdtttrtrrtttjtctttttttt\r\n" + 
				"ttttttdcttattttrdttcttttttttrttttttrtrdttttttrtttjttttmrtttt\r\n" + 
				"ttttttttttatttcttctrttrtrrtttttttttrtrdttttttrttrjtt#ttttttt\r\n" + 
				"ttttcttdttatdttttrtttttctttttttttctrttrttttrtttrtjtttmtttttt\r\n" + 
				"tttttttttto######################################ktmtctttttt\r\n" + 
				"tttttttttttttddtttttttttttttmttttttttddttttttttttttttttttttt\r\n" + 
				"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
				"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
				"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
				"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
				"ttttrtttttcttttttttttttmmmmmmmmmmmttttrtrrctrtrtttcrtttttttt\r\n" + 
				"tccctttttcrcttttctrtttmttttcttrtttmttttcttrctttttccttttttttt\r\n" + 
				"ttttrrrrrtrttttttttccmtcttrRtcrtcrcmtttcttttttctctRttttttttt\r\n";
		modelTest.getLevel().setLevelAsString(firstLevelAtEnd);
		modelTest.getLevel().setDiamondGot(15);
		modelTest.movePlayer(2);
		//System.out.println(modelTest.getLevel().getLevelAsString());
		//System.out.println(modelTest.getLevel().getLevelID());
		assertEquals(modelTest.getLevel().getLevelID(),2);
	}
	
	
	@Test
	public void testDeath() {
		String firstLevelAtEnd = "ttttttttttttttttttttttttttttmttttttttttttttttttttttttttttttt\r\n" + 
				"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
				"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
				"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
				"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
				"ttttrtttttcttttttttttttmmmmmmmmmmmttttrtrrctrtrtttcrtttttttt\r\n" + 
				"tccctttttcrcttttctrtttmttttcttrtttmttttcttrctttttccttttttttt\r\n" + 
				"ttttrrrrrtrttttttttccmtcttrrtcrtcrcmtttcttttttctctrttttttttt\r\n" + 
				"ttttttttttz######################################wtttttttttt\r\n" + 
				"tttmmrttttattctttcttdtrctttttrtrtttttttcttttrttttjtttttttttt\r\n" + 
				"ttttttttttatrcrttttttctttttttttrdttrttttctttttcttjtttrrttttt\r\n" + 
				"ttttttttttattttttttttcttctttttrtrttrttttttttrttttjtttttttttt\r\n" + 
				"tttttmttttartcctttttttttrttttttrttrttttrtttrtttttjtttttcrttt\r\n" + 
				"ttttmtmtttartrrtttttttttrrttrttttttttrttttttrtrctjtrcttttttt\r\n" + 
				"tttmmmmmttatttrttrttttttttrtttttrtcrttttttttrtrrtjttmttttttt\r\n" + 
				"ttmrttttmtammmmmmmmmmmmmmmmmmmmmmmmmmmmmmtttrttrtjtttttccttt\r\n" + 
				"tmtttttttmatctttrttdtcttrtrttttttttttdtrcttttttrtjtttttttttt\r\n" + 
				"trrrttttttattdtttttrtttttcttttttttrccrttdttttrtttjtttttttttt\r\n" + 
				"ttttttttddatttrttrtrttttttttttttttrrtrttrttttttttjtttttttttt\r\n" + 
				"tttttcrtttatctttttrttttttttrrctttttttrttrtdttttctjttcrtttttt\r\n" + 
				"tttcctttttatrttcttrtcctttttrtrdttdttttrtttrttdtrtjttttrrtttt\r\n" + 
				"ttttttttttatdrttttttttttttttrrrttrttttttttdtttttrjtttttttttt\r\n" + 
				"ttttttttttatcttttttmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmjtttmmmtttt\r\n" + 
				"ttttttttttacctttttttttctttdttttrtttttrtttrtttttttjtttttttttt\r\n" + 
				"ttttrdttttacstttttttttrrttrttttttttrttttttrtrcttxjtttdtttttt\r\n" + 
				"ttttttttttatrttrttttttttrtttttrtccttttdtttrtrrtttjtctttttttt\r\n" + 
				"ttttttdcttattttrdttcttttttttrttttttrtrdttttttrtttjttttmrtttt\r\n" + 
				"ttttttttttatttcttctrttrtrrtttttttttrtrdttttttrttrjtt#ttttttt\r\n" + 
				"ttttcttdttatdttttrtttttctttttttttctrttrttttrtttrtjtttmtttttt\r\n" + 
				"tttttttttto######################################ktmtctttttt\r\n" + 
				"tttttttttttttddtttttttttttttmttttttttddttttttttttttttttttttt\r\n" + 
				"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
				"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
				"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
				"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
				"ttttrtttttcttttttttttttmmmmmmmmmmmttttrtrrctrtrtttcrtttttttt\r\n" + 
				"tccctttttcrcttttctrtttmttttcttrtttmttttcttrctttttccttttttttt\r\n" + 
				"ttttrrrrrtrttttttttccmtcttrRtcrtcrcmtttcttttttctctRttttttttt\r\n";
		modelTest.getLevel().setLevelAsString(firstLevelAtEnd);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(modelTest.getLevel().isDead(),true);
	}
	
	
	@Test
	public void testPushRock() {
		String levelAtFirst = "ttttttttttttttttttttttttttttmttttttttttttttttttttttttttttttt\r\n" + 
				"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
				"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
				"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
				"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
				"ttttrtttttrttttttttttttmmmmmmmmmmmttttrtrrrtrtrtttrrtttttttt\r\n" + 
				"tccctttttcccttttctrtttmttttrttrtttmttttcttcctttttccttttttttt\r\n" + 
				"ttttrrrrrtrttttttttccmtcttrctcrtcrcmtttcttttttctctcttttttttt\r\n" + 
				"ttttttttttz######################################wtttttttttt\r\n" + 
				"tttmmrttttatrttrttmtrtttdtmtttxtrtmcttttttmttrrttjtttttttttt\r\n" + 
				"ttttttttttatttttttmttttttcmcctrtttmcttctttmttttctjtttrrttttt\r\n" + 
				"ttttttttttaccccccccccccccrcrrcccccsrccdccccccccrcjtttttttttt\r\n" + 
				"tttttmttttadttttttmtrttttrmtrtcttcmttrttdtmttrtrtjtttttcrttt\r\n" + 
				"ttttmtmtttatttttttmtrttttrmtrtccttmtttttrtmtttcttjtrcttttttt\r\n" + 
				"tttmmmmmttammmmmmmmmmmmmmmmmmmcmmmmmmmmmmmmmmmmmmjttmttttttt\r\n" + 
				"ttmrttttmtattttrrtmttcttttmtttcttrmttttcttmtttttcjtttttccttt\r\n" + 
				"tmtttttttmatttttttmttcttttmtttctttmttttrtcmtttttrjtttttttttt\r\n" + 
				"trrrttttttaccccccccccrcccccccccccccccccrccccccccrjtttttttttt\r\n" + 
				"ttttttttddarttrtttmttttrttmttrctttmttttttdmctttttjtttttttttt\r\n" + 
				"tttttcrtttarttttrtmttrttrtmtttctccmtttttttmrtttrtjttcrtttttt\r\n" + 
				"tttcctttttatrtttttmtttrtttmtttctrrmtttttttmrrttrtjttttrrtttt\r\n" + 
				"tttttrrtttammmmmmmmmmmmmmmmmmmcmmmmmmmmmmmmmmmmmmjtttttttttt\r\n" + 
				"ttttttttttarteccttmttttrtrmtttctttmtrdttrtmttttttjtttmmmtttt\r\n" + 
				"ttttttttttatttttctmcttttttmttcctttmcttctttmtctcctjtttttttttt\r\n" + 
				"ttttrdttttaccccccccrcccccccccdccccccccrcccccrcrrcjtttdtttttt\r\n" + 
				"ttttttttttadttctrtmrttttrtmtrtcttrmtrtrtttmttttttjtctttttttt\r\n" + 
				"ttttttdcttatttttrtmrttdtttmtttccttmttrttttmtttcccjttttmrtttt\r\n" + 
				"ttttttttttatdtttrcmttcttttmttdcrttmtctttttmtttrrrjtt#ttttttt\r\n" + 
				"ttttcttdttatrttttrmttrttrtmt#trtttmttttrtrmttttrtjtttmtttttt\r\n" + 
				"tttttttttto######################################ktmtctttttt\r\n" + 
				"tttttttttttttddtttttttttttttmttttttttddttttttttttttttttttttt\r\n" + 
				"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
				"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
				"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
				"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
				"ttttrtttttrttttttttttttmmmmmmmmmmmttttrtrrrtrtrtttrrtttttttt\r\n" + 
				"tccctttttcccttttctrtttmttttrttrtttmttttcttcctttttccttttttttt\r\n" + 
				"ttttrrrrrtrttttttttccmtcttrctcrtcrcmtttcttttttctctcttttttttt\r\n" ;
		String levelExpected = "ttttttttttttttttttttttttttttmttttttttttttttttttttttttttttttt\r\n" + 
				"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
				"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
				"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
				"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
				"ttttrtttttrttttttttttttmmmmmmmmmmmttttrtrrrtrtrtttrrtttttttt\r\n" + 
				"tccctttttcccttttctrtttmttttrttrtttmttttcttcctttttccttttttttt\r\n" + 
				"ttttrrrrrtrttttttttccmtcttrctcrtcrcmtttcttttttctctcttttttttt\r\n" + 
				"ttttttttttz######################################wtttttttttt\r\n" + 
				"tttmmrttttatrttrttmtrtttdtmtttxtrtmcttttttmttrrttjtttttttttt\r\n" + 
				"ttttttttttatttttttmttttttcmcctrtttmcttctttmttttctjtttrrttttt\r\n" + 
				"ttttttttttaccccccccccccccrcrrccccccsrcdccccccccrcjtttttttttt\r\n" + 
				"tttttmttttadttttttmtrttttrmtrtcttcmttrttdtmttrtrtjtttttcrttt\r\n" + 
				"ttttmtmtttatttttttmtrttttrmtrtccttmtttttrtmtttcttjtrcttttttt\r\n" + 
				"tttmmmmmttammmmmmmmmmmmmmmmmmmcmmmmmmmmmmmmmmmmmmjttmttttttt\r\n" + 
				"ttmrttttmtattttrrtmttcttttmtttcttrmttttcttmtttttcjtttttccttt\r\n" + 
				"tmtttttttmatttttttmttcttttmtttctttmttttrtcmtttttrjtttttttttt\r\n" + 
				"trrrttttttaccccccccccrcccccccccccccccccrccccccccrjtttttttttt\r\n" + 
				"ttttttttddarttrtttmttttrttmttrctttmttttttdmctttttjtttttttttt\r\n" + 
				"tttttcrtttarttttrtmttrttrtmtttctccmtttttttmrtttrtjttcrtttttt\r\n" + 
				"tttcctttttatrtttttmtttrtttmtttctrrmtttttttmrrttrtjttttrrtttt\r\n" + 
				"tttttrrtttammmmmmmmmmmmmmmmmmmcmmmmmmmmmmmmmmmmmmjtttttttttt\r\n" + 
				"ttttttttttarteccttmttttrtrmtttctttmtrdttrtmttttttjtttmmmtttt\r\n" + 
				"ttttttttttatttttctmcttttttmttcctttmcttctttmtctcctjtttttttttt\r\n" + 
				"ttttrdttttaccccccccrcccccccccdccccccccrcccccrcrrcjtttdtttttt\r\n" + 
				"ttttttttttadttctrtmrttttrtmtrtcttrmtrtrtttmttttttjtctttttttt\r\n" + 
				"ttttttdcttatttttrtmrttdtttmtttccttmttrttttmtttcccjttttmrtttt\r\n" + 
				"ttttttttttatdtttrcmttcttttmttdcrttmtctttttmtttrrrjtt#ttttttt\r\n" + 
				"ttttcttdttatrttttrmttrttrtmt#trtttmttttrtrmttttrtjtttmtttttt\r\n" + 
				"tttttttttto######################################ktmtctttttt\r\n" + 
				"tttttttttttttddtttttttttttttmttttttttddttttttttttttttttttttt\r\n" + 
				"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
				"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
				"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
				"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
				"ttttrtttttrttttttttttttmmmmmmmmmmmttttrtrrrtrtrtttrrtttttttt\r\n" + 
				"tccctttttcccttttctrtttmttttrttrtttmttttcttcctttttccttttttttt\r\n" + 
				"ttttrrrrrtrttttttttccmtcttrctcrtcrcmtttcttttttctctcttttttttt\r\n" ;
		modelTest.getLevel().setLevelAsString(levelAtFirst);
		modelTest.movePlayer(3);
		assertEquals(modelTest.getLevel().getLevelAsString(),levelExpected);
	}

}

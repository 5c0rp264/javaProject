package entity;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class levelTest {
	
	
	private static level levelToTest;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		levelToTest = new level(1, 0, "ttttttttttttttttttttttttttttmttttttttttttttttttttttttttttttt\r\n" + 
				"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
				"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
				"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
				"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
				"ttttrtttttrttttttttttttmmmmmmmmmmmttttrtrrrtrtrtttrrtttttttt\r\n" + 
				"tccctttttcccttttctrtttmttttrttrtttmttttcttcctttttccttttttttt\r\n" + 
				"ttttrrrrrtrttttttttccmtcttrctcrtcrcmtttcttttttctctcttttttttt\r\n" + 
				"ttttttttttz######################################wtttttttttt\r\n" + 
				"tttmmrttttattttttcttdtrctttttrtrtttttttcttttrttttjtttttttttt\r\n" + 
				"ttttttttttatrsrttttttctttttttttrdttrttttctttttcttjtttrrttttt\r\n" + 
				"ttttttttttattttttttttcttrtttttrtrttrttttttttrttttjtttttttttt\r\n" + 
				"tttttmttttartrrtttttttttrttttttrttrttttrtttrtttttjtttttcrttt\r\n" + 
				"ttttmtmtttartcrtttttttttcrttrttttttttrttttttrtrrtjtrcttttttt\r\n" + 
				"tttmmmmmttatttcttrttttttttrtttttrtcrttttttttrtrrtjttmttttttt\r\n" + 
				"ttmrttttmtammmmmmmmmmmmmmmmmmmmmmmmmmmmmmtttrttrtjtttttccttt\r\n" + 
				"tmtttttttmatctttrttdtcttrtrttttttttttdtrdttttttctjtttttttttt\r\n" + 
				"trrrttttttattdtttttrtttttcttttttttrrcrttrttttrtttjtttttttttt\r\n" + 
				"ttttttttddatttrttrtrttttttttttttttrctrttrttttttttjtttttttttt\r\n" + 
				"tttttcrtttatrtttttrttttttttrrrtttttttrttctdttttrtjttcrtttttt\r\n" + 
				"tttcctttttatdttcttrtcctttttrtrdttdttttrtttrttdtctjttttrrtttt\r\n" + 
				"ttttttttttatcrttttttttttttttrcrttrttttttttdtttttrjtttttttttt\r\n" + 
				"ttttttttttattttttttmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmjtttmmmtttt\r\n" + 
				"ttttttttttacrtttttttttrtttdttttrtttttrtttrtttttttjtttttttttt\r\n" + 
				"ttttrdttttacrtttttttttcrttrttttttttrttttttrtrrttxjtttdtttttt\r\n" + 
				"ttttttttttatcttrttttttttrtttttrtccttttdtttrtrrtttjtctttttttt\r\n" + 
				"ttttttdcttattttrdttrttttttttrttttttrtrdttttttrtttjttttmrtttt\r\n" + 
				"ttttttttttatttcttrtcttrtrrtttttttttrtrdttttttcttrjtt#ttttttt\r\n" + 
				"ttttcttdttatdttttctttttctttttttttctrttrttttrtttrtjtttmtttttt\r\n" + 
				"tttttttttto######################################ktmtctttttt\r\n" + 
				"tttttttttttttddtttttttttttttmttttttttddttttttttttttttttttttt\r\n" + 
				"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
				"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
				"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
				"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
				"ttttrtttttrttttttttttttmmmmmmmmmmmttttrtrrrtrtrtttrrtttttttt\r\n" + 
				"tccctttttcccttttctrtttmttttrttrtttmttttcttcctttttccttttttttt\r\n" + 
				"ttttrrrrrtrttttttttccmtcttrctcrtcrcmtttcttttttctctcttttttttt\r\n", 150,12);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testLevelLowerLevelId() {
		try {
	        level newLevelThatShouldNotWork = new level(-5, 0, 
	        		"ttttttttttttttttttttttttttttmttttttttttttttttttttttttttttttt\r\n" + 
					"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
					"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
					"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
					"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
					"ttttrtttttrttttttttttttmmmmmmmmmmmttttrtrrrtrtrtttrrtttttttt\r\n" + 
					"tccctttttcccttttctrtttmttttrttrtttmttttcttcctttttccttttttttt\r\n" + 
					"ttttrrrrrtrttttttttccmtcttrctcrtcrcmtttcttttttctctcttttttttt\r\n" + 
					"ttttttttttz######################################wtttttttttt\r\n" + 
					"tttmmrttttattttttcttdtrctttttrtrtttttttcttttrttttjtttttttttt\r\n" + 
					"ttttttttttatrsrttttttctttttttttrdttrttttctttttcttjtttrrttttt\r\n" + 
					"ttttttttttattttttttttcttrtttttrtrttrttttttttrttttjtttttttttt\r\n" + 
					"tttttmttttartrrtttttttttrttttttrttrttttrtttrtttttjtttttcrttt\r\n" + 
					"ttttmtmtttartcrtttttttttcrttrttttttttrttttttrtrrtjtrcttttttt\r\n" + 
					"tttmmmmmttatttcttrttttttttrtttttrtcrttttttttrtrrtjttmttttttt\r\n" + 
					"ttmrttttmtammmmmmmmmmmmmmmmmmmmmmmmmmmmmmtttrttrtjtttttccttt\r\n" + 
					"tmtttttttmatctttrttdtcttrtrttttttttttdtrdttttttctjtttttttttt\r\n" + 
					"trrrttttttattdtttttrtttttcttttttttrrcrttrttttrtttjtttttttttt\r\n" + 
					"ttttttttddatttrttrtrttttttttttttttrctrttrttttttttjtttttttttt\r\n" + 
					"tttttcrtttatrtttttrttttttttrrrtttttttrttctdttttrtjttcrtttttt\r\n" + 
					"tttcctttttatdttcttrtcctttttrtrdttdttttrtttrttdtctjttttrrtttt\r\n" + 
					"ttttttttttatcrttttttttttttttrcrttrttttttttdtttttrjtttttttttt\r\n" + 
					"ttttttttttattttttttmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmjtttmmmtttt\r\n" + 
					"ttttttttttacrtttttttttrtttdttttrtttttrtttrtttttttjtttttttttt\r\n" + 
					"ttttrdttttacrtttttttttcrttrttttttttrttttttrtrrttxjtttdtttttt\r\n" + 
					"ttttttttttatcttrttttttttrtttttrtccttttdtttrtrrtttjtctttttttt\r\n" + 
					"ttttttdcttattttrdttrttttttttrttttttrtrdttttttrtttjttttmrtttt\r\n" + 
					"ttttttttttatttcttrtcttrtrrtttttttttrtrdttttttcttrjtt#ttttttt\r\n" + 
					"ttttcttdttatdttttctttttctttttttttctrttrttttrtttrtjtttmtttttt\r\n" + 
					"tttttttttto######################################ktmtctttttt\r\n" + 
					"tttttttttttttddtttttttttttttmttttttttddttttttttttttttttttttt\r\n" + 
					"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
					"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
					"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
					"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
					"ttttrtttttrttttttttttttmmmmmmmmmmmttttrtrrrtrtrtttrrtttttttt\r\n" + 
					"tccctttttcccttttctrtttmttttrttrtttmttttcttcctttttccttttttttt\r\n" + 
					"ttttrrrrrtrttttttttccmtcttrctcrtcrcmtttcttttttctctcttttttttt\r\n", 150,12);
	        fail("Expected an InstantiationException");
	    } catch ( InstantiationException e) {
	    	
	        assertEquals(e.getMessage(), "InstantiationException : couldn't instantiate a new level with these parameters");
	    }
	}
	
	@Test
	public void testLevelHigherLevelId() {
		try {
	        level newLevelThatShouldNotWork = new level(10, 0, 
	        		"ttttttttttttttttttttttttttttmttttttttttttttttttttttttttttttt\r\n" + 
					"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
					"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
					"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
					"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
					"ttttrtttttrttttttttttttmmmmmmmmmmmttttrtrrrtrtrtttrrtttttttt\r\n" + 
					"tccctttttcccttttctrtttmttttrttrtttmttttcttcctttttccttttttttt\r\n" + 
					"ttttrrrrrtrttttttttccmtcttrctcrtcrcmtttcttttttctctcttttttttt\r\n" + 
					"ttttttttttz######################################wtttttttttt\r\n" + 
					"tttmmrttttattttttcttdtrctttttrtrtttttttcttttrttttjtttttttttt\r\n" + 
					"ttttttttttatrsrttttttctttttttttrdttrttttctttttcttjtttrrttttt\r\n" + 
					"ttttttttttattttttttttcttrtttttrtrttrttttttttrttttjtttttttttt\r\n" + 
					"tttttmttttartrrtttttttttrttttttrttrttttrtttrtttttjtttttcrttt\r\n" + 
					"ttttmtmtttartcrtttttttttcrttrttttttttrttttttrtrrtjtrcttttttt\r\n" + 
					"tttmmmmmttatttcttrttttttttrtttttrtcrttttttttrtrrtjttmttttttt\r\n" + 
					"ttmrttttmtammmmmmmmmmmmmmmmmmmmmmmmmmmmmmtttrttrtjtttttccttt\r\n" + 
					"tmtttttttmatctttrttdtcttrtrttttttttttdtrdttttttctjtttttttttt\r\n" + 
					"trrrttttttattdtttttrtttttcttttttttrrcrttrttttrtttjtttttttttt\r\n" + 
					"ttttttttddatttrttrtrttttttttttttttrctrttrttttttttjtttttttttt\r\n" + 
					"tttttcrtttatrtttttrttttttttrrrtttttttrttctdttttrtjttcrtttttt\r\n" + 
					"tttcctttttatdttcttrtcctttttrtrdttdttttrtttrttdtctjttttrrtttt\r\n" + 
					"ttttttttttatcrttttttttttttttrcrttrttttttttdtttttrjtttttttttt\r\n" + 
					"ttttttttttattttttttmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmjtttmmmtttt\r\n" + 
					"ttttttttttacrtttttttttrtttdttttrtttttrtttrtttttttjtttttttttt\r\n" + 
					"ttttrdttttacrtttttttttcrttrttttttttrttttttrtrrttxjtttdtttttt\r\n" + 
					"ttttttttttatcttrttttttttrtttttrtccttttdtttrtrrtttjtctttttttt\r\n" + 
					"ttttttdcttattttrdttrttttttttrttttttrtrdttttttrtttjttttmrtttt\r\n" + 
					"ttttttttttatttcttrtcttrtrrtttttttttrtrdttttttcttrjtt#ttttttt\r\n" + 
					"ttttcttdttatdttttctttttctttttttttctrttrttttrtttrtjtttmtttttt\r\n" + 
					"tttttttttto######################################ktmtctttttt\r\n" + 
					"tttttttttttttddtttttttttttttmttttttttddttttttttttttttttttttt\r\n" + 
					"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
					"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
					"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
					"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
					"ttttrtttttrttttttttttttmmmmmmmmmmmttttrtrrrtrtrtttrrtttttttt\r\n" + 
					"tccctttttcccttttctrtttmttttrttrtttmttttcttcctttttccttttttttt\r\n" + 
					"ttttrrrrrtrttttttttccmtcttrctcrtcrcmtttcttttttctctcttttttttt\r\n", 150,12);
	        fail("Expected an InstantiationException");
	    } catch ( InstantiationException e) {
	    	
	        assertEquals(e.getMessage(), "InstantiationException : couldn't instantiate a new level with these parameters");
	    }
	}
	
	@Test
	public void testLevelHighScoreTooLow() {
		try {
	        level newLevelThatShouldNotWork = new level(2, -5, 
	        		"ttttttttttttttttttttttttttttmttttttttttttttttttttttttttttttt\r\n" + 
					"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
					"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
					"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
					"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
					"ttttrtttttrttttttttttttmmmmmmmmmmmttttrtrrrtrtrtttrrtttttttt\r\n" + 
					"tccctttttcccttttctrtttmttttrttrtttmttttcttcctttttccttttttttt\r\n" + 
					"ttttrrrrrtrttttttttccmtcttrctcrtcrcmtttcttttttctctcttttttttt\r\n" + 
					"ttttttttttz######################################wtttttttttt\r\n" + 
					"tttmmrttttattttttcttdtrctttttrtrtttttttcttttrttttjtttttttttt\r\n" + 
					"ttttttttttatrsrttttttctttttttttrdttrttttctttttcttjtttrrttttt\r\n" + 
					"ttttttttttattttttttttcttrtttttrtrttrttttttttrttttjtttttttttt\r\n" + 
					"tttttmttttartrrtttttttttrttttttrttrttttrtttrtttttjtttttcrttt\r\n" + 
					"ttttmtmtttartcrtttttttttcrttrttttttttrttttttrtrrtjtrcttttttt\r\n" + 
					"tttmmmmmttatttcttrttttttttrtttttrtcrttttttttrtrrtjttmttttttt\r\n" + 
					"ttmrttttmtammmmmmmmmmmmmmmmmmmmmmmmmmmmmmtttrttrtjtttttccttt\r\n" + 
					"tmtttttttmatctttrttdtcttrtrttttttttttdtrdttttttctjtttttttttt\r\n" + 
					"trrrttttttattdtttttrtttttcttttttttrrcrttrttttrtttjtttttttttt\r\n" + 
					"ttttttttddatttrttrtrttttttttttttttrctrttrttttttttjtttttttttt\r\n" + 
					"tttttcrtttatrtttttrttttttttrrrtttttttrttctdttttrtjttcrtttttt\r\n" + 
					"tttcctttttatdttcttrtcctttttrtrdttdttttrtttrttdtctjttttrrtttt\r\n" + 
					"ttttttttttatcrttttttttttttttrcrttrttttttttdtttttrjtttttttttt\r\n" + 
					"ttttttttttattttttttmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmjtttmmmtttt\r\n" + 
					"ttttttttttacrtttttttttrtttdttttrtttttrtttrtttttttjtttttttttt\r\n" + 
					"ttttrdttttacrtttttttttcrttrttttttttrttttttrtrrttxjtttdtttttt\r\n" + 
					"ttttttttttatcttrttttttttrtttttrtccttttdtttrtrrtttjtctttttttt\r\n" + 
					"ttttttdcttattttrdttrttttttttrttttttrtrdttttttrtttjttttmrtttt\r\n" + 
					"ttttttttttatttcttrtcttrtrrtttttttttrtrdttttttcttrjtt#ttttttt\r\n" + 
					"ttttcttdttatdttttctttttctttttttttctrttrttttrtttrtjtttmtttttt\r\n" + 
					"tttttttttto######################################ktmtctttttt\r\n" + 
					"tttttttttttttddtttttttttttttmttttttttddttttttttttttttttttttt\r\n" + 
					"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
					"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
					"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
					"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
					"ttttrtttttrttttttttttttmmmmmmmmmmmttttrtrrrtrtrtttrrtttttttt\r\n" + 
					"tccctttttcccttttctrtttmttttrttrtttmttttcttcctttttccttttttttt\r\n" + 
					"ttttrrrrrtrttttttttccmtcttrctcrtcrcmtttcttttttctctcttttttttt\r\n", 150,12);
	        fail("Expected an InstantiationException");
	    } catch ( InstantiationException e) {
	    	
	        assertEquals(e.getMessage(), "InstantiationException : couldn't instantiate a new level with these parameters");
	    }
	}
	
	
	@Test
	public void testLevelTimerTooLow() {
		try {
	        level newLevelThatShouldNotWork = new level(2, 5, 
	        		"ttttttttttttttttttttttttttttmttttttttttttttttttttttttttttttt\r\n" + 
					"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
					"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
					"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
					"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
					"ttttrtttttrttttttttttttmmmmmmmmmmmttttrtrrrtrtrtttrrtttttttt\r\n" + 
					"tccctttttcccttttctrtttmttttrttrtttmttttcttcctttttccttttttttt\r\n" + 
					"ttttrrrrrtrttttttttccmtcttrctcrtcrcmtttcttttttctctcttttttttt\r\n" + 
					"ttttttttttz######################################wtttttttttt\r\n" + 
					"tttmmrttttattttttcttdtrctttttrtrtttttttcttttrttttjtttttttttt\r\n" + 
					"ttttttttttatrsrttttttctttttttttrdttrttttctttttcttjtttrrttttt\r\n" + 
					"ttttttttttattttttttttcttrtttttrtrttrttttttttrttttjtttttttttt\r\n" + 
					"tttttmttttartrrtttttttttrttttttrttrttttrtttrtttttjtttttcrttt\r\n" + 
					"ttttmtmtttartcrtttttttttcrttrttttttttrttttttrtrrtjtrcttttttt\r\n" + 
					"tttmmmmmttatttcttrttttttttrtttttrtcrttttttttrtrrtjttmttttttt\r\n" + 
					"ttmrttttmtammmmmmmmmmmmmmmmmmmmmmmmmmmmmmtttrttrtjtttttccttt\r\n" + 
					"tmtttttttmatctttrttdtcttrtrttttttttttdtrdttttttctjtttttttttt\r\n" + 
					"trrrttttttattdtttttrtttttcttttttttrrcrttrttttrtttjtttttttttt\r\n" + 
					"ttttttttddatttrttrtrttttttttttttttrctrttrttttttttjtttttttttt\r\n" + 
					"tttttcrtttatrtttttrttttttttrrrtttttttrttctdttttrtjttcrtttttt\r\n" + 
					"tttcctttttatdttcttrtcctttttrtrdttdttttrtttrttdtctjttttrrtttt\r\n" + 
					"ttttttttttatcrttttttttttttttrcrttrttttttttdtttttrjtttttttttt\r\n" + 
					"ttttttttttattttttttmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmjtttmmmtttt\r\n" + 
					"ttttttttttacrtttttttttrtttdttttrtttttrtttrtttttttjtttttttttt\r\n" + 
					"ttttrdttttacrtttttttttcrttrttttttttrttttttrtrrttxjtttdtttttt\r\n" + 
					"ttttttttttatcttrttttttttrtttttrtccttttdtttrtrrtttjtctttttttt\r\n" + 
					"ttttttdcttattttrdttrttttttttrttttttrtrdttttttrtttjttttmrtttt\r\n" + 
					"ttttttttttatttcttrtcttrtrrtttttttttrtrdttttttcttrjtt#ttttttt\r\n" + 
					"ttttcttdttatdttttctttttctttttttttctrttrttttrtttrtjtttmtttttt\r\n" + 
					"tttttttttto######################################ktmtctttttt\r\n" + 
					"tttttttttttttddtttttttttttttmttttttttddttttttttttttttttttttt\r\n" + 
					"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
					"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
					"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
					"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
					"ttttrtttttrttttttttttttmmmmmmmmmmmttttrtrrrtrtrtttrrtttttttt\r\n" + 
					"tccctttttcccttttctrtttmttttrttrtttmttttcttcctttttccttttttttt\r\n" + 
					"ttttrrrrrtrttttttttccmtcttrctcrtcrcmtttcttttttctctcttttttttt\r\n", -10,12);
	        fail("Expected an InstantiationException");
	    } catch ( InstantiationException e) {
	    	
	        assertEquals(e.getMessage(), "InstantiationException : couldn't instantiate a new level with these parameters");
	    }
	}
	
	
	@Test
	public void testLevelMinDiamondTooLow() {
		try {
	        level newLevelThatShouldNotWork = new level(2, 5, 
	        		"ttttttttttttttttttttttttttttmttttttttttttttttttttttttttttttt\r\n" + 
					"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
					"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
					"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
					"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
					"ttttrtttttrttttttttttttmmmmmmmmmmmttttrtrrrtrtrtttrrtttttttt\r\n" + 
					"tccctttttcccttttctrtttmttttrttrtttmttttcttcctttttccttttttttt\r\n" + 
					"ttttrrrrrtrttttttttccmtcttrctcrtcrcmtttcttttttctctcttttttttt\r\n" + 
					"ttttttttttz######################################wtttttttttt\r\n" + 
					"tttmmrttttattttttcttdtrctttttrtrtttttttcttttrttttjtttttttttt\r\n" + 
					"ttttttttttatrsrttttttctttttttttrdttrttttctttttcttjtttrrttttt\r\n" + 
					"ttttttttttattttttttttcttrtttttrtrttrttttttttrttttjtttttttttt\r\n" + 
					"tttttmttttartrrtttttttttrttttttrttrttttrtttrtttttjtttttcrttt\r\n" + 
					"ttttmtmtttartcrtttttttttcrttrttttttttrttttttrtrrtjtrcttttttt\r\n" + 
					"tttmmmmmttatttcttrttttttttrtttttrtcrttttttttrtrrtjttmttttttt\r\n" + 
					"ttmrttttmtammmmmmmmmmmmmmmmmmmmmmmmmmmmmmtttrttrtjtttttccttt\r\n" + 
					"tmtttttttmatctttrttdtcttrtrttttttttttdtrdttttttctjtttttttttt\r\n" + 
					"trrrttttttattdtttttrtttttcttttttttrrcrttrttttrtttjtttttttttt\r\n" + 
					"ttttttttddatttrttrtrttttttttttttttrctrttrttttttttjtttttttttt\r\n" + 
					"tttttcrtttatrtttttrttttttttrrrtttttttrttctdttttrtjttcrtttttt\r\n" + 
					"tttcctttttatdttcttrtcctttttrtrdttdttttrtttrttdtctjttttrrtttt\r\n" + 
					"ttttttttttatcrttttttttttttttrcrttrttttttttdtttttrjtttttttttt\r\n" + 
					"ttttttttttattttttttmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmjtttmmmtttt\r\n" + 
					"ttttttttttacrtttttttttrtttdttttrtttttrtttrtttttttjtttttttttt\r\n" + 
					"ttttrdttttacrtttttttttcrttrttttttttrttttttrtrrttxjtttdtttttt\r\n" + 
					"ttttttttttatcttrttttttttrtttttrtccttttdtttrtrrtttjtctttttttt\r\n" + 
					"ttttttdcttattttrdttrttttttttrttttttrtrdttttttrtttjttttmrtttt\r\n" + 
					"ttttttttttatttcttrtcttrtrrtttttttttrtrdttttttcttrjtt#ttttttt\r\n" + 
					"ttttcttdttatdttttctttttctttttttttctrttrttttrtttrtjtttmtttttt\r\n" + 
					"tttttttttto######################################ktmtctttttt\r\n" + 
					"tttttttttttttddtttttttttttttmttttttttddttttttttttttttttttttt\r\n" + 
					"tttttttttttttttttttttttttttmtmtttttttttttttttttttttttttttttt\r\n" + 
					"tttrttttttrrttttttttttttttmtttmtttttttttttrrrrtttttttttrtttt\r\n" + 
					"ttttttrtttrrtttttttttttttmtttttmttttttttttrrttttttrttrtttttt\r\n" + 
					"ttttttttttttttttttrrtttrmttrrrttmttttrtrtttttdttttttrttttttt\r\n" + 
					"ttttrtttttrttttttttttttmmmmmmmmmmmttttrtrrrtrtrtttrrtttttttt\r\n" + 
					"tccctttttcccttttctrtttmttttrttrtttmttttcttcctttttccttttttttt\r\n" + 
					"ttttrrrrrtrttttttttccmtcttrctcrtcrcmtttcttttttctctcttttttttt\r\n", 150,-10);
	        fail("Expected an InstantiationException");
	    } catch ( InstantiationException e) {
	    	
	        assertEquals(e.getMessage(), "InstantiationException : couldn't instantiate a new level with these parameters");
	    }
	}

	@Test
	public void testUnderSetLevelID() {
		try {
	        levelToTest.setLevelID(-5);
	        fail("Expected an IndexOutOfBoundsException to be thrown");
	    } catch (IndexOutOfBoundsException anIndexOutOfBoundsException) {
	    	
	        assertEquals(anIndexOutOfBoundsException.getMessage(), "levelID out of bounds");
	    }
	}
	
	@Test
	public void testAboveSetLevelID() {
		try {
	        levelToTest.setLevelID(10);
	        fail("Expected an IndexOutOfBoundsException to be thrown");
	    } catch (IndexOutOfBoundsException anIndexOutOfBoundsException) {
	    	
	        assertEquals(anIndexOutOfBoundsException.getMessage(), "levelID out of bounds");
	    }
	}

}

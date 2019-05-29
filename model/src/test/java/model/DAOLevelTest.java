package model;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import entity.level;

public class DAOLevelTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	public void testFindInt() {
		try {
			DAOLevel daoTest = new DAOLevel(DBConnection.getInstance().getConnection());
			level levelTest = daoTest.find(1);
			String level1ExpectedString = "ttttttttttttttttttttttttttttmttttttttttttttttttttttttttttttt\r\n" + 
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
					"ttttrrrrrtrttttttttccmtcttrctcrtcrcmtttcttttttctctcttttttttt\r\n" ;
			assertEquals(levelTest.getLevelAsString(), level1ExpectedString);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

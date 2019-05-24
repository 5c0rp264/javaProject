package entity;

import java.io.IOException;
import java.util.ArrayList; // import the ArrayList class


public class level extends Entity {

	/** The id. */
	private int	lvlId;

	/** The key. */
	private int	highScore;

	/** The message. */
	private String	levelAsString;
	
	private int currentScore;
	
	private int playerPositionX;
	
	private int playerPositionY;
	
	private int diamondGot;
	
	private ArrayList<ArrayList<Character> > charList = new ArrayList<ArrayList<Character> >();

	/**
	 * Instantiates a new level.
	 *
	 * @param _lvlId
	 *          the level ID 
	 * @param _highScore
	 *          the highScore
	 * @param _levelAsString
	 *          levelAsString
	 */
	public level(final int _lvlId, final int _highScore, final String _levelAsString) {
		this.setLevelID(_lvlId);
		this.setHighScoreLevel(_highScore);
		this.setLevelAsString(_levelAsString);
		this.currentScore = 0;
	}

	/**
	 * Instantiates a new hello world.
	 */
	public level() {
		this(1, 0, "########################################\r\n" + 
				"#ttttttcttdtrctttttrtrtttttttcttttrtttt#\r\n" + 
				"#trsrttttttctttttttttrdttrttttctttttctt#\r\n" + 
				"#ttttttttttcttrtttttrtrttrttttttttrtttt#\r\n" + 
				"#rtrrtttttttttrttttttrttrttttrtttrttttt#\r\n" + 
				"#rtcrtttttttttcrttrttttttttrttttttrtrrt#\r\n" + 
				"#tttcttrttttttttrtttttrtcrttttttttrtrrt#\r\n" + 
				"#mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmtttrttrt#\r\n" + 
				"#tctttrttdtcttrtrttttttttttdtrdttttttct#\r\n" + 
				"#ttdtttttrtttttcttttttttrrcrttrttttrttt#\r\n" + 
				"#tttrttrtrttttttttttttttrctrttrtttttttt#\r\n" + 
				"#trtttttrttttttttrrrtttttttrttctdttttrt#\r\n" + 
				"#tdttcttrtcctttttrtrdttdttttrtttrttdtct#\r\n" + 
				"#tcrttttttttttttttrcrttrttttttttdtttttr#\r\n" + 
				"#ttttttttmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm#\r\n" + 
				"#crtttttttttrtttdttttrtttttrtttrttttttt#\r\n" + 
				"#crtttttttttcrttrttttttttrttttttrtrrttX#\r\n" + 
				"#tcttrttttttttrtttttrtccttttdtttrtrrttt#\r\n" + 
				"#ttttrdttrttttttttrttttttrtrdttttttrttt#\r\n" + 
				"#tttcttrtcttrtrrtttttttttrtrdttttttcttr#\r\n" + 
				"#tdttttctttttctttttttttctrttrttttrtttrt#\r\n" + 
				"########################################\r\n");
	}

	
	/**
	 * Gets the lvlId.
	 *
	 * @return the lvlId
	 */
	public int getLevelID() {
		return lvlId;
	}
	/**
	 * Sets the lvlId.
	 *
	 * @param lvlId
	 *          the new lvlId
	 */
	public void setLevelID(int lvlId) {
		this.lvlId = lvlId;
	}
	/**
	 * Gets the highScore.
	 *
	 * @return the highScore
	 */
	public int getHighScoreLevel() {
		return highScore;
	}
	/**
	 * Sets the highScore.
	 *
	 * @param highScore
	 *          the highScore
	 */
	public void setHighScoreLevel(int highScore) {
		this.highScore = highScore;
	}
	/**
	 * Gets the levelAsString.
	 *
	 * @return the levelAsString
	 */
	public String getLevelAsString() {
		return this.levelAsString;
	}

	/**
	 * Sets the level as String.
	 *
	 * @param levelAsString
	 *          the levelAsString
	 */
	public void setLevelAsString(String levelAsString) {
		this.levelAsString = levelAsString;
		ArrayList<ArrayList<Character>> outer = new ArrayList<ArrayList<Character>>();
	    ArrayList<Character> inner = new ArrayList<Character>();
	    int x = 1;
	    int y = 1;
		for (int i = 0; i < this.levelAsString.length(); i++) {
			if (this.levelAsString.charAt(i) == '\n') {
				//System.out.println("That's a \\n");
				inner.add(this.levelAsString.charAt(i));
				outer.add(inner);
				inner = new ArrayList<Character>();
				y++;
				x=1;
			}else {
		    	if (this.levelAsString.charAt(i) == 's') {
		    		this.setPlayerPositionY(y);
		    		this.setPlayerPositionX(x);
		    	}
				inner.add(this.levelAsString.charAt(i));
			}
			x++;
		}
		this.charList = outer;
	}

	public ArrayList<ArrayList<Character> > getLevelAsList() {
		return charList;
	}

	public void setLevelAsList(ArrayList<ArrayList<Character> > charList) {
		this.charList = charList;
		String iWillBeLevelAsString = "";
		for (int i = 0; i < this.charList.size(); i++){
		    for (int j = 0; j < this.charList.get(i).size(); j++){
		    	//System.out.println(iWillBeLevelAsString);
		    	iWillBeLevelAsString = (String) iWillBeLevelAsString + this.charList.get(i).get(j);
		    	if (this.charList.get(i).get(j) == 's') {
		    		this.setPlayerPositionY(i);
		    		this.setPlayerPositionX(j);
		    	}
		    } 
		}
		this.levelAsString = iWillBeLevelAsString;
	}

	public int getCurrentScore() {
		return currentScore;
	}

	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}

	public int getPlayerPositionX() {
		return playerPositionX;
	}

	public void setPlayerPositionX(int playerPositionX) {
		this.playerPositionX = playerPositionX;
	}

	public int getPlayerPositionY() {
		return playerPositionY;
	}

	public void setPlayerPositionY(int playerPositionY) {
		this.playerPositionY = playerPositionY;
	}

	public int getDiamondGot() {
		return diamondGot;
	}

	public void setDiamondGot(int diamondGot) {
		this.diamondGot = diamondGot;
	}
}

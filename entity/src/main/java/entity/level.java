package entity;

import java.io.IOException;
import java.util.ArrayList; // import the ArrayList class


public class level extends Entity {

	/** The id. */
	/**
	 * 
	 */
	private int	lvlId;

	/** The key. */
	/**
	 * 
	 */
	private int	highScore;

	/** The message. */
	/**
	 * 
	 */
	private String	levelAsString;
	
	/**
	 * 
	 */
	private final int maxLevelID = 5;
	
	/**
	 * 
	 */
	private int timeRemaining;
	
	/**
	 * 
	 */
	private int playerPositionX;
	
	/**
	 * 
	 */
	private int playerPositionY;
	
	/**
	 * 
	 */
	private int minDiamond;
	
	/**
	 * 
	 */
	private int diamondGot;
	
	/**
	 * 
	 */
	private boolean isDead = false;
	
	/**
	 * 
	 */
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
	/**
	 * @param _lvlId
	 * @param _highScore
	 * @param _levelAsString
	 * @param maxTimeToDoLevel
	 * @param minDiamond
	 * @throws InstantiationException
	 */
	public level(final int _lvlId, final int _highScore, final String _levelAsString, int maxTimeToDoLevel, int minDiamond) throws InstantiationException {
		if (1<=_lvlId && _lvlId <=5) {
			this.setLevelID(_lvlId);
		}else {
			throw new InstantiationException("InstantiationException : couldn't instantiate a new level with these parameters");
		}
		if (_highScore>=0) {
			this.setHighScoreLevel(_highScore);
		}else {
			throw new InstantiationException("InstantiationException : couldn't instantiate a new level with these parameters");
		}
		this.setLevelAsString(_levelAsString);
		if (maxTimeToDoLevel > 0) {
			this.timeRemaining = (maxTimeToDoLevel+2)*4;
		}else {
			throw new InstantiationException("InstantiationException : couldn't instantiate a new level with these parameters");
		}
		if (minDiamond > 0) {
			this.setMinDiamond(minDiamond);
		}else {
			throw new InstantiationException("InstantiationException : couldn't instantiate a new level with these parameters");
		}

	}

	/**
	 * @throws InstantiationException 
	 * Instantiates a new hello world.
	 * @throws  
	 */
	/**
	 * @throws InstantiationException
	 */
	public level() throws InstantiationException {
		this(1, 5, "########################################\r\n" + 
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
				"########################################\r\n", 150,12);
	}

	
	/**
	 * Gets the lvlId.
	 *
	 * @return the lvlId
	 */
	/**
	 * @return int Returns the id of the level corresponding to the current level.
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
	/**
	 * @param lvlId
	 * @throws IndexOutOfBoundsException
	 */
	public void setLevelID(int lvlId) throws IndexOutOfBoundsException {
		if (1 <= lvlId && lvlId <=maxLevelID) {
			this.lvlId = lvlId;
		}else {
			throw new IndexOutOfBoundsException("levelID out of bounds"); 
		}
	}
	/**
	 * Gets the highScore.
	 *
	 * @return the highScore
	 */
	/**
	 * @return int Returns HighScore for current level.
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
	/**
	 * @param highScore
	 */
	public void setHighScoreLevel(int highScore) {
		this.highScore = highScore;
	}
	/**
	 * Gets the levelAsString.
	 *
	 * @return the levelAsString
	 */
	/**
	 * @return String Return levelAsString
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
	/**
	 * @param levelAsString
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

	/**
	 * @return ArrayList ArrayList Character Returns LevelAsList
	 */
	public ArrayList<ArrayList<Character> > getLevelAsList() {
		return charList;
	}

	/**
	 * @param charList
	 */
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

	/**
	 * @return int Returns TimeRemaining
	 */
	public int getTimeRemaining() {
		return timeRemaining;
	}

	/**
	 * @param _timeRemaining
	 */
	public void setTimeRemaining(int _timeRemaining) {
		this.timeRemaining = _timeRemaining;
	}

	/**
	 * @return int X position of the player.
	 */
	public int getPlayerPositionX() {
		return playerPositionX;
	}

	/**
	 * @param playerPositionX
	 */
	public void setPlayerPositionX(int playerPositionX) {
		this.playerPositionX = playerPositionX;
	}

	/**
	 * @return int X position of the player.
	 */
	public int getPlayerPositionY() {
		return playerPositionY;
	}

	/**
	 * @param playerPositionY
	 */
	public void setPlayerPositionY(int playerPositionY) {
		this.playerPositionY = playerPositionY;
	}

	/**
	 * @return int Harvesting diamonds
	 */
	public int getDiamondGot() {
		return diamondGot;
	}

	/**
	 * @param diamondGot
	 */
	public void setDiamondGot(int diamondGot) {
		this.diamondGot = diamondGot;
	}

	/**
	 * @return boolean Dead player.
	 */
	public boolean isDead() {
		return isDead;
	}

	/**
	 * @param isDead
	 */
	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}

	/**
	 * @return int Harvesting Min Diamond.
	 */
	public int getMinDiamond() {
		return minDiamond;
	}

	/**
	 * @param minDiamond
	 */
	public void setMinDiamond(int minDiamond) {
		this.minDiamond = minDiamond;
	}
	
	
}



//
// _______  __  ____    ____  _______     __    __       _______.        ___      .__   __.         ___      
///  _____||  | \   \  /   / |   ____|   |  |  |  |     /       |       /   \     |  \ |  |        /   \     
//|  |  __ |  |  \   \/   /  |  |__      |  |  |  |    |   (----`      /  ^  \    |   \|  |       /  ^  \    
//|  | |_ ||  |   \      /   |   __|     |  |  |  |     \   \         /  /_\  \   |  . `  |      /  /_\  \   
//|  |__| ||  |    \    /    |  |____    |  `--'  | .----)   |       /  _____  \  |  |\   |     /  _____  \  
//\______| |__|     \__/     |_______|    \______/  |_______/       /__/     \__\ |__| \__|    /__/     \__\ 
//

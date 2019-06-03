package entity;

import java.io.IOException;
import java.util.ArrayList; // import the ArrayList class


public class level extends Entity {


	/**
	 * int	lvlId
	 */
	private int	lvlId;

	/**
	 * 
	 */
	private int	highScore;

	/**
	 * int	highScore
	 */
	private String	levelAsString;


	/**
	 * int maxLevelID
	 */
	private final int maxLevelID = 5;


	/**
	 * int timeRemaining
	 */
	private int timeRemaining;

	/**
	 * int playerPositionX
	 */
	private int playerPositionX;

	/**
	 * int playerPositionY
	 */
	private int playerPositionY;

	/**
	 * int minDiamond
	 */
	private int minDiamond;

	/**
	 * int diamondGot
	 */
	private int diamondGot;
	

	/**
	 * boolean isDead
	 */
	private boolean isDead = false;


	/**
	 * ArrayListArrayListCharacter charList
	 */
	private ArrayList<ArrayList<Character> > charList = new ArrayList<ArrayList<Character> >();

	
	

	/**
	 * @param _lvlId level number
	 * @param _highScore highscore of this level (in future release)
	 * @param _levelAsString simply the lvel as string
	 * @param maxTimeToDoLevel max time you have in seconds to achieve the level
	 * @param minDiamond minimum count of diamond to have to achieve this level
	 * @throws InstantiationException error if cannot create level with those parameters
	 */
	public level(final int _lvlId, final int _highScore, final String _levelAsString, int maxTimeToDoLevel, int minDiamond) throws InstantiationException {
		if (1<=_lvlId && _lvlId <=maxLevelID) {
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
	 * @throws InstantiationException error if cannot create level with those 
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
	 * @return
	 */
	public int getLevelID() {
		return lvlId;
	}

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
	 * @return
	 */
	public int getHighScoreLevel() {
		return highScore;
	}


	/**
	 * @param highScore
	 */
	public void setHighScoreLevel(int highScore) {
		this.highScore = highScore;
	}


	/**
	 * @return
	 */
	public String getLevelAsString() {
		return this.levelAsString;
	}


	
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
	 * @return
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
	 * @return
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
	 * @return
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
	 * @return
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
	 * @return
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
	 * @return
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
	 * @return
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

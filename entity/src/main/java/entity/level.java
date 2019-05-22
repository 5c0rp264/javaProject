package entity;

public class level extends Entity {

	/** The id. */
	private int	lvlId;

	/** The key. */
	private int	highScore;

	/** The message. */
	private String	levelAsString;

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
		this.setHighScoreLevel(highScore);
		this.setLevelAsString(levelAsString);
	}

	/**
	 * Instantiates a new hello world.
	 */
	public level() {
		this(1, 0, "WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"WRRRRRRRRRRRRRRRRDRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRW\r\n" + 
				"WRRRPRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRW\r\n" + 
				"WRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRDRRRRRRRRRRRRRRRRRRRRRRRRRRRRW\r\n" + 
				"WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWRRRRRRRRRRRRRRRRW\r\n" + 
				"WRRRRRRRRRRRDRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRW\r\n" + 
				"WRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRW\r\n" + 
				"WRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRW\r\n" + 
				"WRRRRRRRRRWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\r\n" + 
				"WRRRRRRRRRRDRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRW\r\n" + 
				"WRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRW\r\n" + 
				"WRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRREW\r\n" + 
				"WRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRW\r\n" + 
				"WRRRRRRRRRRRRDRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRW\r\n" + 
				"WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW\r\n" );
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
		return levelAsString;
	}
	/**
	 * Sets the level as String.
	 *
	 * @param levelAsString
	 *          the levelAsString
	 */
	public void setLevelAsString(String levelAsString) {
		this.levelAsString = levelAsString;
	}
}

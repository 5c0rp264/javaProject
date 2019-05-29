package contract;

import java.util.Observable;
import java.util.TimerTask;

import entity.level;

/**
 * The Interface IModel.
 *
 * @author Quentin Aoustin
 */
public interface IModel {


	/**
	 * Load the message.
	 *
	 * @param code
	 *          the code
	 */
	/**
	 * @param lvlNum
	 */
	void loadLevel(int lvlNum);

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	/**
	 * @return Observable return which class are observable
	 */
	Observable getObservable();

	/**
	 * @return  level allow to get level
	 */
	level getLevel();

	/**
	 * @param i
	 */
	void movePlayer(int i);

	/**
	 * 
	 */
	void flagObserver();

	/**
	 * @return TimerTask task used to performed animation and increment Scoring system
	 */
	TimerTask getRepeatedTask();

}

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
	 * Gets the hello world.
	 *
	 * @return the helloworld entity
	 */


	/**
	 * Load the message.
	 *
	 * @param code
	 *          the code
	 */
	void loadLevel(int lvlNum);

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();

	level getLevel();

	void movePlayer(int i);

	void flagObserver();

	TimerTask getRepeatedTask();

}

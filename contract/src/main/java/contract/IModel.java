package contract;

import java.util.Observable;

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
	void loadLevel(String lvlNum);

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();

	level getLevel();
}

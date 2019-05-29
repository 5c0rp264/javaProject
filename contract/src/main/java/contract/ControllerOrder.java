package contract;

/**
 * The Enum ControllerOrder.
 *
 * @author Quentin AOUSTIN
 */

public enum ControllerOrder {


	/**
	 * move up order
	 */
	Up,

	/**
	 * move down order
	 */
	Down,

	/**
	 * move left order
	 */
	Left,

	/**
	 * move right order
	 */
	Right, 
	
	/**
	 * do not move default if other key is typed
	 */
	notTheRightKey, 
	
	/**
	 * reload game
	 */
	Die
}

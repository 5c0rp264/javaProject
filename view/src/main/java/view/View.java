package view;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class View.
 *
 * @author Quentin AOUSTIN
 */
public final class View implements IView, Runnable {

	/** The frame. */
	private final ViewFrame viewFrame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}
	public void printMessage(final String message) {
        
        this.viewFrame.printMessage(message);
    }
	/**
	 * Key code to controller order.
	 *
	 * @param keyCode
	 *          the key code
	 * @return the controller order
	 */
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		System.out.println("Keypressed2");
		switch (keyCode) {
			case KeyEvent.VK_Z:
				System.out.println("Handled as a Z");
				return ControllerOrder.Up;
			case KeyEvent.VK_S:
				return ControllerOrder.Down;
			case KeyEvent.VK_Q:
				return ControllerOrder.Left;
			case KeyEvent.VK_D:
				return ControllerOrder.Right;
			default:
				//fail("Key not recognize");
				return ControllerOrder.notTheRightKey;
		}
	}


	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		this.viewFrame.setVisible(true);
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}

	@Override
	public void displayLevel(String levelAsText) {
		// TODO Auto-generated method stub
		System.out.println("should display here");
	}
}

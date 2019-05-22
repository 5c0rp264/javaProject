package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * The Class ViewPanel.
 *
 * @author Quentin AOUSTIN
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame					viewFrame;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;

	
	private BufferedImage myPicture;
	
	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		Graphics2D g2 = (Graphics2D) graphics;
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		String lvlAsStr = this.getViewFrame().getModel().getLevel().getLevelAsString();
		/*graphics.drawString(*/
		int x =1;
		int y =1;
		
		try {
			System.out.println(new File("../Terre.png").getAbsolutePath());
			myPicture = ImageIO.read(new File("../Terre.png"));
			g2.drawImage(myPicture,0,500,this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for (int i = 0; i < lvlAsStr.length(); i++) {
			if (lvlAsStr.charAt(i) == '\n') {
				System.out.println("That's a \\n");
				y++;
				x=1;
			}else if (lvlAsStr.charAt(i) == '\r') {
				System.out.println("That's a \\r");
			}else {
				System.out.print("The character is ");
				
				System.out.println(lvlAsStr.charAt(i));
			}
			
			
		}
		System.out.println(lvlAsStr);
		/*, 10, 20);*/
	}
}

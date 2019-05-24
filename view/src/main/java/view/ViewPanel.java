package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import entity.spriteEntity;

/**
 * The Class ViewPanel.
 *
 * @author Quentin AOUSTIN
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame viewFrame;
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -998294702363713521L;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame the view frame
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
	 * @param viewFrame the new view frame
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
	
	public void drawMenu(Graphics2D _g2) {
		ArrayList<ArrayList<Character> > charList = this.getViewFrame().getModel().getLevel().getLevelAsList();
	    _g2.drawRect(charList.size()*16,charList.get(charList.size()-1).size()*16,10,10);  
	    _g2.setColor(Color.RED);  
	    _g2.fillRect(230,80,10,10);
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
		/* graphics.drawString( */
		int x = 1;
		int y = 1;
		for (int i = 0; i < lvlAsStr.length(); i++) {
			if (lvlAsStr.charAt(i) == '\n') {
				// System.out.println("That's a \\n");
				y++;
				x = 1;
			} else if (lvlAsStr.charAt(i) == '\r') {
				// System.out.println("That's a \\r");
			} else {
				entity.spriteEntity _spriteEntity;
				try {
					_spriteEntity = new spriteEntity(lvlAsStr.charAt(i));
					g2.drawImage(_spriteEntity.getMyPicture(), (x - 1) * 16, (y - 1) * 16, this);
				} catch (IOException e) {
					System.out.println("Le fichier image n'a pas pu être correctement trouvé");
					e.printStackTrace();
				}
				// System.out.print("The character is ");
				// System.out.println(lvlAsStr.charAt(i));
				x++;
			}

		}
		this.drawMenu(g2);
		// System.out.println(lvlAsStr);
	}
}

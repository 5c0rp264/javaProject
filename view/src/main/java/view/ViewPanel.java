package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
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

	
	final int spriteSize = 32;
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
   
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		super.paintComponent(graphics);
		Graphics2D g2 = (Graphics2D) graphics;                           //Should work with arrayList and not String in the future
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());

		
		//new spriteEntity();
		entity.spriteEntity _spriteEntity = spriteEntity.getInstance();
		for (int y = 0; y < (this.getHeight()/spriteSize)+1; y++) {//make a background to avoid to have a blank white one
			for (int x = 0; x < (this.getWidth()/spriteSize)+1; x++) {
				try {
					_spriteEntity.setCorrepondingEntity('c');
					g2.drawImage(_spriteEntity.getMyPicture(),x*spriteSize,y*spriteSize, this);
					//System.out.println("Should print back");
				} catch (IOException e) {
					System.out.println("Le fichier image n'a pas pu être correctement trouvé");
					e.printStackTrace();
				}
			}
		}
		
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
				//this is an useless char added at the end of the line for no reason
			} else {
				try {
					_spriteEntity.setCorrepondingEntity(Character.toLowerCase(lvlAsStr.charAt(i)));
					g2.drawImage(_spriteEntity.getMyPicture(), ((x - 1) * spriteSize)-this.getViewFrame().getModel().getLevel().getPlayerPositionX()*spriteSize + this.getWidth()/2, ((y - 1) * spriteSize)-getViewFrame().getModel().getLevel().getPlayerPositionY()*spriteSize + this.getHeight()/2, this);
				} catch (IOException e) {
					System.out.println("Le fichier image n'a pas pu être correctement trouvé");
					e.printStackTrace();
				}
				// System.out.print("The character is ");
				// System.out.println(lvlAsStr.charAt(i));
				x++;
			}
		}
		graphics.setColor(new Color(223,198,87));
		graphics.fillRect(0,0,this.getWidth(),64);//making top bar background
		
		graphics.setColor(new Color(120,120,120));
		graphics.fillRect(this.getWidth()/6,16,96,32);//background diamond
		
		graphics.setColor(new Color(255,255,255));
		Font font = new Font("Verdana", Font.BOLD, 12);
		graphics.setFont(font);
		graphics.drawString(Integer.toString(this.getViewFrame().getModel().getLevel().getDiamondGot()), this.getWidth()/4,32+12/2);//number of diamond
		
		graphics.setColor(new Color(120,120,120));
		font = new Font("Verdana", Font.BOLD, 16);
		graphics.setFont(font);
		graphics.drawString("Level "+Integer.toString(this.getViewFrame().getModel().getLevel().getLevelID()), this.getWidth()*5/6,32+12/2);//level X at the top right hand corner
		
		graphics.setColor(new Color(120,120,120));
		graphics.fillRect(this.getWidth()/3,16,96,32);//background score
		
		graphics.setColor(new Color(255,255,255));
		font = new Font("Verdana", Font.BOLD, 12);
		graphics.setFont(font);
		graphics.drawString(Integer.toString(this.getViewFrame().getModel().getLevel().getCurrentScore()/4), this.getWidth()*15/40,32+12/2);//score
		

		try {
			_spriteEntity.setCorrepondingEntity('d');
			g2.drawImage(_spriteEntity.getMyPicture(), this.getWidth()/5, 20, 24, 24, this); //diamond sprite
		} catch (IOException e) {

			e.printStackTrace();
		}
		
//		ArrayList<ArrayList<Character> > charList = this.getViewFrame().getModel().getLevel().getLevelAsList();
//		graphics.setColor(new Color(223,198,87));
//		graphics.fillRect(0,charList.size()*spriteSize,(charList.get(charList.size()-1).size()-2)*spriteSize,50);
		//System.out.println(lvlAsStr);
	}
	
	public void Gameover(Graphics g){
		try {
			Image img = ImageIO.read(new File("gameover.png"));
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Font font = new Font ("Courier", Font.BOLD, 28);
		g.setFont(font);
		g.setColor(Color.white);
		g.drawString("Score :", 300, 200);
	}
}

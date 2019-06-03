package entity;

import java.awt.image.BufferedImage;
import java.io.CharConversionException;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class spriteEntity {

	/**
	 * 
	 */
	private static spriteEntity spriteEntityInstance = null;
	/**
	 * 
	 */
	char associatedChar;
	/**
	 * 
	 */
	private BufferedImage borderTopAndBottom;
	/**
	 * 
	 */
	private BufferedImage borderLeft;
	/**
	 * 
	 */
	private BufferedImage borderRight;
	/**
	 * 
	 */
	private BufferedImage borderTopLeft;
	/**
	 * 
	 */
	private BufferedImage borderTopRight;
	/**
	 * 
	 */
	private BufferedImage borderBottomLeft;
	/**
	 * 
	 */
	private BufferedImage borderBottomRight;
	/**
	 * 
	 */
	private BufferedImage earth;
	/**
	 * 
	 */
	private BufferedImage rock;
	/**
	 * 
	 */
	private BufferedImage diamond;
	/**
	 * 
	 */
	private BufferedImage way;
	/**
	 * 
	 */
	private BufferedImage heroUp;
	/**
	 * 
	 */
	private BufferedImage heroDown;
	/**
	 * 
	 */
	private BufferedImage heroLeft;
	/**
	 * 
	 */
	private BufferedImage heroRight;
	/**
	 * 
	 */
	private BufferedImage ennemy;
	/**
	 * 
	 */
	private BufferedImage exit;
	/**
	 * 
	 */
	private BufferedImage exitClosed;
	/**
	 * 
	 */
	private BufferedImage wall;

	/**
	 * 
	 */
	private int lastBehavior = 2;
	/**
	 * 
	 */
	private boolean enoughDiamond = false;

	/**
	 * @return Only Instance of spriteEntity.
	 */
	public spriteEntity getInstance() {
		if (spriteEntity.spriteEntityInstance == null) {
			spriteEntity.spriteEntityInstance = new spriteEntity();
		}
		return spriteEntity.spriteEntityInstance;
	}

	/**
	 * 
	 */
	public spriteEntity() {
		//spriteEntity.setLastBehavior(5);
	}

	/**
	 * @param _associatedChar
	 * @throws IOException
	 * @throws CharConversionException
	 */
	public void setCorrepondingEntity(char _associatedChar) throws IOException, CharConversionException {
		// System.out.println(_associatedChar);
		this.associatedChar = _associatedChar;
		switch (_associatedChar) {
		case '#':
			// code border
			if (this.getBorderTopAndBottom() == null) {
				this.setBorderTopAndBottom(ImageIO.read(new File("../Bordure face.png")));
			}
			break;
		case 'a':
			// code border
			if (this.getBorderLeft() == null) {
				this.setBorderLeft(ImageIO.read(new File("../Bordure gauche.png")));
			}
			break;
		case 'j':
			// code border
			if (this.getBorderRight() == null) {
				this.setBorderRight(ImageIO.read(new File("../Bordure droite.png")));
			}
			break;
		case 'z':
			// code border
			if (this.getBorderTopLeft() == null) {
				this.setBorderTopLeft(ImageIO.read(new File("../Bordure coin sup gauche.png")));
			}
			break;
		case 'w':
			// code border
			if (this.getBorderTopRight() == null) {
				this.setBorderTopRight(ImageIO.read(new File("../Bordure coin sup droit.png")));
			}
			break;
		case 'o':
			// code border
			if (this.getBorderBottomLeft() == null) {
				this.setBorderBottomLeft(ImageIO.read(new File("../Bordure coin inf gauche.png")));
			}
			break;
		case 'k':
			// code border
			if (this.getBorderBottomRight() == null) {
				this.setBorderBottomRight(ImageIO.read(new File("../Bordure coin inf droit.png")));
			}
			break;
		case 't':
			// code earth
			if (this.getEarth() == null) {
				this.setEarth(ImageIO.read(new File("../Terre.png")));
			}
			break;
		case 'r':
			// code rock
			if (this.getRock() == null) {
				this.setRock(ImageIO.read(new File("../Rocher.png")));
			}
			break;
		case 'd':
			// code diamond
			if (this.getDiamond() == null) {
				this.setDiamond(ImageIO.read(new File("../Diamant.png")));
			}
			break;
		case 'c':
			// code way
			if (this.getWay() == null) {
				this.setWay(ImageIO.read(new File("../Chemin.png")));
			}
			break;
		case 's':
			// code spawn
			//System.out.println("\n\nHello\n\n\n");
			switch (lastBehavior) {
			case 5:
				if (this.getHeroUp() == null) {
					this.setHeroUp(ImageIO.read(new File("../HeroDos.png")));
				}
				//System.out.println("\n\nHello\n\n\n");
				break;
			case 2:
				if (this.getHeroDown() == null) {
					this.setHeroDown(ImageIO.read(new File("../HeroFace.png")));
				}
				break;
			case 1:
				if (this.getHeroLeft() == null) {
					this.setHeroLeft(ImageIO.read(new File("../HeroGauche.png")));
				}
				break;
			case 3:
				if (this.getHeroRight() == null) {
					this.setHeroRight(ImageIO.read(new File("../HeroDroite.png")));
				}
				break;
			default:
				if (this.getHeroUp() == null) {
					this.setEnnemy(ImageIO.read(new File("../HeroDos.png")));
				}
				break;
			}
			break;
		case 'e':
			// code ennemy
			if (this.getEnnemy() == null) {
				this.setEnnemy(ImageIO.read(new File("../Ennemi.png")));
			}
			break;
		case 'x':
			// code exit
			if (this.isEnoughDiamond()) {
				if (this.getExit() == null) {
					this.setExit(ImageIO.read(new File("../Sortie ouverte.png")));
				}
			}else {
				if (this.getExitClosed() == null) {
					this.setExitClosed(ImageIO.read(new File("../Sortie fermee.png")));
				}
			}
			break;
		case 'm':
			// code wall
			if (this.getWall() == null) {
				this.setWall(ImageIO.read(new File("../Mur.png")));
			}
			break;
		default:
			throw new CharConversionException("This char doesn't exist");
		}

	}

	/**
	 * @return BufferedImage image associated
	 */
	public BufferedImage getMyPicture() {
		switch (this.associatedChar) {
		case '#':
			// code border
			return getBorderTopAndBottom();
		case 'a':
			// code border
			return getBorderLeft();
		case 'j':
			// code border
			return getBorderRight();
		case 'z':
			// code border
			return getBorderTopLeft();
		case 'w':
			// code border
			return getBorderTopRight();
		case 'o':
			// code border
			return getBorderBottomLeft();
		case 'k':
			// code border
			return getBorderBottomRight();
		case 't':
			// code earth
			return getEarth();
		case 'r':
			// code rock
			return getRock();
		case 'd':
			// code diamond
			return getDiamond();
		case 'c':
			// code way
			return getWay();
		case 's':
			// code spawn
			switch (lastBehavior) {
			case 5:
				//System.out.println("Going up");
				return getHeroUp();
			case 2:
				//System.out.println("Going down");
				return getHeroDown();
			case 1:
				//System.out.println("Going left");
				return getHeroLeft();
			case 3:
				//sSystem.out.println("Going right");
				return getHeroRight();
			default:
				return getHeroDown();
			}
		case 'e':
			// code ennemy
			return getEnnemy();
		case 'x':
			// code exit
			if (this.isEnoughDiamond()) {
				return getExit();
			}else {
				return getExitClosed();
			}
		case 'm':
			// code wall
			return getWall();
		default:
			return getWall();
		// code block
		}
	}

	/**
	 * @return
	 */
	public BufferedImage getBorderTopAndBottom() {
		return this.borderTopAndBottom;
	}

	/**
	 * @param border
	 */
	public void setBorderTopAndBottom(BufferedImage border) {
		this.borderTopAndBottom = border;
	}

	/**
	 * @return
	 */
	public BufferedImage getEarth() {
		return this.earth;
	}

	/**
	 * @param earth
	 */
	public void setEarth(BufferedImage earth) {
		this.earth = earth;
	}

	/**
	 * @return
	 */
	public BufferedImage getDiamond() {
		return this.diamond;
	}

	/**
	 * @param diamond
	 */
	public void setDiamond(BufferedImage diamond) {
		this.diamond = diamond;
	}

	/**
	 * @return
	 */
	public BufferedImage getRock() {
		return this.rock;
	}

	/**
	 * @param rock
	 */
	public void setRock(BufferedImage rock) {
		this.rock = rock;
	}

	/**
	 * @return
	 */
	public BufferedImage getWay() {
		return this.way;
	}

	/**
	 * @param way
	 */
	public void setWay(BufferedImage way) {
		this.way = way;
	}

	/**
	 * @return
	 */
	public BufferedImage getEnnemy() {
		return this.ennemy;
	}

	/**
	 * @param ennemy
	 */
	public void setEnnemy(BufferedImage ennemy) {
		this.ennemy = ennemy;
	}

	/**
	 * @return
	 */
	public BufferedImage getExit() {
		return this.exit;
	}

	/**
	 * @param exit
	 */
	public void setExit(BufferedImage exit) {
		this.exit = exit;
	}

	/**
	 * @return
	 */
	/**
	 * @return
	 */
	public BufferedImage getWall() {
		return this.wall;
	}

	/**
	 * @param wall
	 */
	/**
	 * @param wall
	 */
	public void setWall(BufferedImage wall) {
		this.wall = wall;
	}

	/**
	 * @return
	 */
	/**
	 * @return
	 */
	public int getLastBehavior() {
		return this.lastBehavior;
	}

	/**
	 * @param lastBehavior
	 */
	/**
	 * @param lastBehavior
	 */
	/**
	 * @param lastBehavior
	 */
	public void setLastBehavior(int lastBehavior) {
		if (lastBehavior == 5 || lastBehavior == 1 || lastBehavior == 3 || lastBehavior == 1) {
			this.lastBehavior = lastBehavior;
		}else {
			
		}
	}

	/**
	 * @return
	 */
	public BufferedImage getHeroUp() {
		return this.heroUp;
	}

	/**
	 * @param heroUp
	 */
	public void setHeroUp(BufferedImage heroUp) {
		this.heroUp = heroUp;
	}

	/**
	 * @return
	 */
	public BufferedImage getHeroDown() {
		return this.heroDown;
	}

	/**
	 * @param heroDown
	 */
	public void setHeroDown(BufferedImage heroDown) {
		this.heroDown = heroDown;
	}

	/**
	 * @return
	 */
	public BufferedImage getHeroRight() {
		return this.heroRight;
	}

	/**
	 * @param heroRight
	 */
	public void setHeroRight(BufferedImage heroRight) {
		this.heroRight = heroRight;
	}

	/**
	 * @return
	 */
	public BufferedImage getHeroLeft() {
		return this.heroLeft;
	}

	/**
	 * @param heroLeft
	 */
	public void setHeroLeft(BufferedImage heroLeft) {
		this.heroLeft = heroLeft;
	}

	/**
	 * @return
	 */
	public BufferedImage getBorderLeft() {
		return this.borderLeft;
	}

	/**
	 * @param borderLeft
	 */
	public void setBorderLeft(BufferedImage borderLeft) {
		this.borderLeft = borderLeft;
	}

	/**
	 * @return
	 */
	public BufferedImage getBorderTopLeft() {
		return this.borderTopLeft;
	}

	/**
	 * @param borderTopLeft
	 */
	public void setBorderTopLeft(BufferedImage borderTopLeft) {
		this.borderTopLeft = borderTopLeft;
	}

	/**
	 * @return
	 */
	public  BufferedImage getBorderRight() {
		return borderRight;
	}

	/**
	 * @param borderRight
	 */
	public void setBorderRight(BufferedImage borderRight) {
		this.borderRight = borderRight;
	}

	/**
	 * @return
	 */
	public BufferedImage getBorderTopRight() {
		return this.borderTopRight;
	}

	/**
	 * @param borderTopRight
	 */
	public void setBorderTopRight(BufferedImage borderTopRight) {
		this.borderTopRight = borderTopRight;
	}

	/**
	 * @return
	 */
	public BufferedImage getBorderBottomRight() {
		return this.borderBottomRight;
	}

	/**
	 * @param borderBottomRight
	 */
	public void setBorderBottomRight(BufferedImage borderBottomRight) {
		this.borderBottomRight = borderBottomRight;
	}

	/**
	 * @return
	 */
	public BufferedImage getBorderBottomLeft() {
		return this.borderBottomLeft;
	}

	/**
	 * @param borderBottomLeft
	 */
	public void setBorderBottomLeft(BufferedImage borderBottomLeft) {
		this.borderBottomLeft = borderBottomLeft;
	}

	/**
	 * @return
	 */
	public boolean isEnoughDiamond() {
		return this.enoughDiamond;
	}

	/**
	 * @param enoughDiamond
	 */
	public void setEnoughDiamond(boolean enoughDiamond) {
		this.enoughDiamond = enoughDiamond;
	}

	/**
	 * @return
	 */
	public BufferedImage getExitClosed() {
		return this.exitClosed;
	}

	/**
	 * @param exitClosed
	 */
	public void setExitClosed(BufferedImage exitClosed) {
		this.exitClosed = exitClosed;
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

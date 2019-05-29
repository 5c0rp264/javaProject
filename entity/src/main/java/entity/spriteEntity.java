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
	private static BufferedImage borderTopAndBottom;
	/**
	 * 
	 */
	private static BufferedImage borderLeft;
	/**
	 * 
	 */
	private static BufferedImage borderRight;
	/**
	 * 
	 */
	private static BufferedImage borderTopLeft;
	/**
	 * 
	 */
	private static BufferedImage borderTopRight;
	/**
	 * 
	 */
	private static BufferedImage borderBottomLeft;
	/**
	 * 
	 */
	private static BufferedImage borderBottomRight;
	/**
	 * 
	 */
	private static BufferedImage earth;
	/**
	 * 
	 */
	private static BufferedImage rock;
	/**
	 * 
	 */
	private static BufferedImage diamond;
	/**
	 * 
	 */
	private static BufferedImage way;
	/**
	 * 
	 */
	private static BufferedImage heroUp;
	/**
	 * 
	 */
	private static BufferedImage heroDown;
	/**
	 * 
	 */
	private static BufferedImage heroLeft;
	/**
	 * 
	 */
	private static BufferedImage heroRight;
	/**
	 * 
	 */
	private static BufferedImage ennemy;
	/**
	 * 
	 */
	private static BufferedImage exit;
	/**
	 * 
	 */
	private static BufferedImage exitClosed;
	/**
	 * 
	 */
	private static BufferedImage wall;

	/**
	 * 
	 */
	private static int lastBehavior = 2;
	/**
	 * 
	 */
	private static boolean enoughDiamond = false;

	/**
	 * @return
	 */
	public static spriteEntity getInstance() {
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
			if (spriteEntity.getBorderTopAndBottom() == null) {
				spriteEntity.setBorderTopAndBottom(ImageIO.read(new File("../Bordure face.png")));
			}
			break;
		case 'a':
			// code border
			if (spriteEntity.getBorderLeft() == null) {
				spriteEntity.setBorderLeft(ImageIO.read(new File("../Bordure gauche.png")));
			}
			break;
		case 'j':
			// code border
			if (spriteEntity.getBorderRight() == null) {
				spriteEntity.setBorderRight(ImageIO.read(new File("../Bordure droite.png")));
			}
			break;
		case 'z':
			// code border
			if (spriteEntity.getBorderTopLeft() == null) {
				spriteEntity.setBorderTopLeft(ImageIO.read(new File("../Bordure coin sup gauche.png")));
			}
			break;
		case 'w':
			// code border
			if (spriteEntity.getBorderTopRight() == null) {
				spriteEntity.setBorderTopRight(ImageIO.read(new File("../Bordure coin sup droit.png")));
			}
			break;
		case 'o':
			// code border
			if (spriteEntity.getBorderBottomLeft() == null) {
				spriteEntity.setBorderBottomLeft(ImageIO.read(new File("../Bordure coin inf gauche.png")));
			}
			break;
		case 'k':
			// code border
			if (spriteEntity.getBorderBottomRight() == null) {
				spriteEntity.setBorderBottomRight(ImageIO.read(new File("../Bordure coin inf droit.png")));
			}
			break;
		case 't':
			// code earth
			if (spriteEntity.getEarth() == null) {
				spriteEntity.setEarth(ImageIO.read(new File("../Terre.png")));
			}
			break;
		case 'r':
			// code rock
			if (spriteEntity.getRock() == null) {
				spriteEntity.setRock(ImageIO.read(new File("../Rocher.png")));
			}
			break;
		case 'd':
			// code diamond
			if (spriteEntity.getDiamond() == null) {
				spriteEntity.setDiamond(ImageIO.read(new File("../Diamant.png")));
			}
			break;
		case 'c':
			// code way
			if (spriteEntity.getWay() == null) {
				spriteEntity.setWay(ImageIO.read(new File("../Chemin.png")));
			}
			break;
		case 's':
			// code spawn
			//System.out.println("\n\nHello\n\n\n");
			switch (lastBehavior) {
			case 5:
				if (spriteEntity.getHeroUp() == null) {
					spriteEntity.setHeroUp(ImageIO.read(new File("../HeroDos.png")));
				}
				//System.out.println("\n\nHello\n\n\n");
				break;
			case 2:
				if (spriteEntity.getHeroDown() == null) {
					spriteEntity.setHeroDown(ImageIO.read(new File("../HeroFace.png")));
				}
				break;
			case 1:
				if (spriteEntity.getHeroLeft() == null) {
					spriteEntity.setHeroLeft(ImageIO.read(new File("../HeroGauche.png")));
				}
				break;
			case 3:
				if (spriteEntity.getHeroRight() == null) {
					spriteEntity.setHeroRight(ImageIO.read(new File("../HeroDroite.png")));
				}
				break;
			default:
				if (spriteEntity.getHeroUp() == null) {
					spriteEntity.setEnnemy(ImageIO.read(new File("../HeroDos.png")));
				}
				break;
			}
			break;
		case 'e':
			// code ennemy
			if (spriteEntity.getEnnemy() == null) {
				spriteEntity.setEnnemy(ImageIO.read(new File("../Ennemi.png")));
			}
			break;
		case 'x':
			// code exit
			if (spriteEntity.isEnoughDiamond()) {
				if (spriteEntity.getExit() == null) {
					spriteEntity.setExit(ImageIO.read(new File("../Sortie ouverte.png")));
				}
			}else {
				if (spriteEntity.getExitClosed() == null) {
					spriteEntity.setExitClosed(ImageIO.read(new File("../Sortie fermee.png")));
				}
			}
			break;
		case 'm':
			// code wall
			if (spriteEntity.getWall() == null) {
				spriteEntity.setWall(ImageIO.read(new File("../Mur.png")));
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
			if (spriteEntity.isEnoughDiamond()) {
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
	public static BufferedImage getBorderTopAndBottom() {
		return borderTopAndBottom;
	}

	/**
	 * @param border
	 */
	public static void setBorderTopAndBottom(BufferedImage border) {
		spriteEntity.borderTopAndBottom = border;
	}

	/**
	 * @return
	 */
	public static BufferedImage getEarth() {
		return earth;
	}

	/**
	 * @param earth
	 */
	public static void setEarth(BufferedImage earth) {
		spriteEntity.earth = earth;
	}

	/**
	 * @return
	 */
	public static BufferedImage getDiamond() {
		return diamond;
	}

	/**
	 * @param diamond
	 */
	public static void setDiamond(BufferedImage diamond) {
		spriteEntity.diamond = diamond;
	}

	/**
	 * @return
	 */
	public static BufferedImage getRock() {
		return rock;
	}

	/**
	 * @param rock
	 */
	public static void setRock(BufferedImage rock) {
		spriteEntity.rock = rock;
	}

	/**
	 * @return
	 */
	public static BufferedImage getWay() {
		return way;
	}

	/**
	 * @param way
	 */
	public static void setWay(BufferedImage way) {
		spriteEntity.way = way;
	}

	/**
	 * @return
	 */
	public static BufferedImage getEnnemy() {
		return ennemy;
	}

	/**
	 * @param ennemy
	 */
	public static void setEnnemy(BufferedImage ennemy) {
		spriteEntity.ennemy = ennemy;
	}

	/**
	 * @return
	 */
	public static BufferedImage getExit() {
		return exit;
	}

	/**
	 * @param exit
	 */
	public static void setExit(BufferedImage exit) {
		spriteEntity.exit = exit;
	}

	/**
	 * @return
	 */
	/**
	 * @return
	 */
	public static BufferedImage getWall() {
		return wall;
	}

	/**
	 * @param wall
	 */
	/**
	 * @param wall
	 */
	public static void setWall(BufferedImage wall) {
		spriteEntity.wall = wall;
	}

	/**
	 * @return
	 */
	/**
	 * @return
	 */
	public static int getLastBehavior() {
		return lastBehavior;
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
	public static void setLastBehavior(int lastBehavior) {
		if (lastBehavior == 5 || lastBehavior == 1 || lastBehavior == 3 || lastBehavior == 1) {
			spriteEntity.lastBehavior = lastBehavior;
		}else {
			
		}
	}

	/**
	 * @return
	 */
	public static BufferedImage getHeroUp() {
		return heroUp;
	}

	/**
	 * @param heroUp
	 */
	public static void setHeroUp(BufferedImage heroUp) {
		spriteEntity.heroUp = heroUp;
	}

	/**
	 * @return
	 */
	public static BufferedImage getHeroDown() {
		return heroDown;
	}

	/**
	 * @param heroDown
	 */
	public static void setHeroDown(BufferedImage heroDown) {
		spriteEntity.heroDown = heroDown;
	}

	/**
	 * @return
	 */
	public static BufferedImage getHeroRight() {
		return heroRight;
	}

	/**
	 * @param heroRight
	 */
	public static void setHeroRight(BufferedImage heroRight) {
		spriteEntity.heroRight = heroRight;
	}

	/**
	 * @return
	 */
	public static BufferedImage getHeroLeft() {
		return heroLeft;
	}

	/**
	 * @param heroLeft
	 */
	public static void setHeroLeft(BufferedImage heroLeft) {
		spriteEntity.heroLeft = heroLeft;
	}

	/**
	 * @return
	 */
	public static BufferedImage getBorderLeft() {
		return borderLeft;
	}

	/**
	 * @param borderLeft
	 */
	public static void setBorderLeft(BufferedImage borderLeft) {
		spriteEntity.borderLeft = borderLeft;
	}

	/**
	 * @return
	 */
	public static BufferedImage getBorderTopLeft() {
		return borderTopLeft;
	}

	/**
	 * @param borderTopLeft
	 */
	public static void setBorderTopLeft(BufferedImage borderTopLeft) {
		spriteEntity.borderTopLeft = borderTopLeft;
	}

	/**
	 * @return
	 */
	public static BufferedImage getBorderRight() {
		return borderRight;
	}

	/**
	 * @param borderRight
	 */
	public static void setBorderRight(BufferedImage borderRight) {
		spriteEntity.borderRight = borderRight;
	}

	/**
	 * @return
	 */
	public static BufferedImage getBorderTopRight() {
		return borderTopRight;
	}

	/**
	 * @param borderTopRight
	 */
	public static void setBorderTopRight(BufferedImage borderTopRight) {
		spriteEntity.borderTopRight = borderTopRight;
	}

	/**
	 * @return
	 */
	public static BufferedImage getBorderBottomRight() {
		return borderBottomRight;
	}

	/**
	 * @param borderBottomRight
	 */
	public static void setBorderBottomRight(BufferedImage borderBottomRight) {
		spriteEntity.borderBottomRight = borderBottomRight;
	}

	/**
	 * @return
	 */
	public static BufferedImage getBorderBottomLeft() {
		return borderBottomLeft;
	}

	/**
	 * @param borderBottomLeft
	 */
	public static void setBorderBottomLeft(BufferedImage borderBottomLeft) {
		spriteEntity.borderBottomLeft = borderBottomLeft;
	}

	/**
	 * @return
	 */
	public static boolean isEnoughDiamond() {
		return spriteEntity.enoughDiamond;
	}

	/**
	 * @param enoughDiamond
	 */
	public static void setEnoughDiamond(boolean enoughDiamond) {
		spriteEntity.enoughDiamond = enoughDiamond;
	}

	/**
	 * @return
	 */
	public static BufferedImage getExitClosed() {
		return exitClosed;
	}

	/**
	 * @param exitClosed
	 */
	public static void setExitClosed(BufferedImage exitClosed) {
		spriteEntity.exitClosed = exitClosed;
	}
}

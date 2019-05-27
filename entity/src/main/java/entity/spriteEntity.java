package entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class spriteEntity {

	private static spriteEntity spriteEntityInstance = null;
	char associatedChar;
	private static BufferedImage border;
	private static BufferedImage earth;
	private static BufferedImage rock;
	private static BufferedImage diamond;
	private static BufferedImage way;
	private static BufferedImage heroUp;
	private static BufferedImage heroDown;
	private static BufferedImage heroLeft;
	private static BufferedImage heroRight;
	private static BufferedImage ennemy;
	private static BufferedImage exit;
	private static BufferedImage wall;

	private static int lastBehavior = 2;

	public static spriteEntity getInstance() {
		if (spriteEntity.spriteEntityInstance == null) {
			spriteEntity.spriteEntityInstance = new spriteEntity();
		}
		return spriteEntity.spriteEntityInstance;
	}

	public spriteEntity() {
		//spriteEntity.setLastBehavior(5);
	}

	public void setCorrepondingEntity(char _associatedChar) throws IOException {
		// System.out.println(_associatedChar);
		this.associatedChar = _associatedChar;
		switch (_associatedChar) {
		case '#':
			// code border
			if (spriteEntity.getBorder() == null) {
				spriteEntity.setBorder(ImageIO.read(new File("../Bordure.png")));
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
			if (spriteEntity.getExit() == null) {
				spriteEntity.setExit(ImageIO.read(new File("../Sortie.png")));
			}
			break;
		case 'm':
			// code wall
			if (spriteEntity.getWall() == null) {
				spriteEntity.setWall(ImageIO.read(new File("../Mur.png")));
			}
			break;
		default:
			break;
		// code block
		}

	}

	public BufferedImage getMyPicture() {
		switch (this.associatedChar) {
		case '#':
			// code border
			return getBorder();
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
				System.out.println("Going up");
				return getHeroUp();
			case 2:
				System.out.println("Going down");
				return getHeroDown();
			case 1:
				System.out.println("Going left");
				return getHeroLeft();
			case 3:
				System.out.println("Going right");
				return getHeroRight();
			default:
				return getHeroDown();
			}
		case 'e':
			// code ennemy
			return getEnnemy();
		case 'x':
			// code exit
			return getExit();
		case 'm':
			// code wall
			return getWall();
		default:
			return getWall();
		// code block
		}
	}

	public static BufferedImage getBorder() {
		return border;
	}

	public static void setBorder(BufferedImage border) {
		spriteEntity.border = border;
	}

	public static BufferedImage getEarth() {
		return earth;
	}

	public static void setEarth(BufferedImage earth) {
		spriteEntity.earth = earth;
	}

	public static BufferedImage getDiamond() {
		return diamond;
	}

	public static void setDiamond(BufferedImage diamond) {
		spriteEntity.diamond = diamond;
	}

	public static BufferedImage getRock() {
		return rock;
	}

	public static void setRock(BufferedImage rock) {
		spriteEntity.rock = rock;
	}

	public static BufferedImage getWay() {
		return way;
	}

	public static void setWay(BufferedImage way) {
		spriteEntity.way = way;
	}

	public static BufferedImage getEnnemy() {
		return ennemy;
	}

	public static void setEnnemy(BufferedImage ennemy) {
		spriteEntity.ennemy = ennemy;
	}

	public static BufferedImage getExit() {
		return exit;
	}

	public static void setExit(BufferedImage exit) {
		spriteEntity.exit = exit;
	}

	public static BufferedImage getWall() {
		return wall;
	}

	public static void setWall(BufferedImage wall) {
		spriteEntity.wall = wall;
	}

	public static int getLastBehavior() {
		return lastBehavior;
	}

	public static void setLastBehavior(int lastBehavior) {
		spriteEntity.lastBehavior = lastBehavior;
	}

	public static BufferedImage getHeroUp() {
		return heroUp;
	}

	public static void setHeroUp(BufferedImage heroUp) {
		spriteEntity.heroUp = heroUp;
	}

	public static BufferedImage getHeroDown() {
		return heroDown;
	}

	public static void setHeroDown(BufferedImage heroDown) {
		spriteEntity.heroDown = heroDown;
	}

	public static BufferedImage getHeroRight() {
		return heroRight;
	}

	public static void setHeroRight(BufferedImage heroRight) {
		spriteEntity.heroRight = heroRight;
	}

	public static BufferedImage getHeroLeft() {
		return heroLeft;
	}

	public static void setHeroLeft(BufferedImage heroLeft) {
		spriteEntity.heroLeft = heroLeft;
	}
}

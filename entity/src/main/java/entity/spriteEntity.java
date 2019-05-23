package entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class spriteEntity {

	char associatedChar;
	private static BufferedImage border;
	private static BufferedImage earth;
	private static BufferedImage rock;
	private static BufferedImage diamond;
	private static BufferedImage way;
	private static BufferedImage hero;
	private static BufferedImage ennemy;
	private static BufferedImage exit;
	private static BufferedImage wall;

	public spriteEntity(char _associatedChar) throws IOException {
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
			if (spriteEntity.getHero() == null) {
				spriteEntity.setHero(ImageIO.read(new File("../Hero.png")));
			}
			break;
		case 'e':
			// code ennemy
			if (spriteEntity.getEnnemy() == null) {
				spriteEntity.setEnnemy(ImageIO.read(new File("../Ennemi.png")));
			}
			break;
		case 'X':
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
			return getHero();
		case 'e':
			// code ennemy
			return getEnnemy();
		case 'X':
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

	public static BufferedImage getHero() {
		return hero;
	}

	public static void setHero(BufferedImage hero) {
		spriteEntity.hero = hero;
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
}

package entity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class spriteEntity {
	
	private BufferedImage myPicture;
	
	public spriteEntity(char associatedChar) throws IOException {
		switch(associatedChar) {
		  case '#':
		    // code border
			setMyPicture(ImageIO.read(new File("../Bordure.png")));
		    break;
		  case't':
		    // code earth
				setMyPicture(ImageIO.read(new File("../Bordure.png")));

		    break;
		  case'r':
			    // code rock
				setMyPicture(ImageIO.read(new File("../Rocher.png")));

			    break;
		  case'd':
			    // code diamand
				setMyPicture(ImageIO.read(new File("../Diamant.png")));
			    break;
		  case'c':
			    // code way
				setMyPicture(ImageIO.read(new File("../Chemin.png")));
			    break;
		  case's':
			    // code spawn no sprite
				setMyPicture(ImageIO.read(new File("../Player.png")));
			    break;
		  case'e':
			    // code ennemi no sprite
				setMyPicture(ImageIO.read(new File("../Enemi.png")));
			    break;
		  case'X':
			    // code exit
				setMyPicture(ImageIO.read(new File("../Sortie.png")));
			    break;
		  case'm':
			    // code wall no sprite
				setMyPicture(ImageIO.read(new File("../mur.png")));
			    break;
		  default:
			  break;
		    // code block
		}
		
	}

	public BufferedImage getMyPicture() {
		return myPicture;
	}

	public void setMyPicture(BufferedImage myPicture) {
		this.myPicture = myPicture;
	}
}

package model;

import java.util.ArrayList;


import entity.level;
//import entity.spriteEntity;

public class collisionHandler {
	
	/**
	 * 
	 */
	public int lastPurposeMonster = 5;
	/**
	 * 
	 */
	private boolean shouldBeLowerCase = true;
	/**
	 * @param playerPositionY
	 * @param playerPositionX
	 * @param behavior
	 * @param _level
	 * @param _model
	 * @param charList
	 * @return Boolean checks the player's position and collisions.
	 */
	public Boolean checkCollisionForPlayerPositionMovementAndPush(int playerPositionY, int playerPositionX,
			int behavior, level _level, Model _model, ArrayList<ArrayList<Character>> charList) {
		char theOneToReach = 0;
		switch (behavior) {
		case 5: // Have to add check on extremity to not except when I am at 1.
			/*if (Character.toLowerCase(charList.get(playerPositionY - 2).get(playerPositionX)) == 'c'
					&& Character.toLowerCase(charList.get(playerPositionY - 1).get(playerPositionX)) == 'r') {
				charList.get(playerPositionY - 2).set(playerPositionX, 'r');
				charList.get(playerPositionY - 1).set(playerPositionX, 'c');
			}*/
			theOneToReach = Character.toLowerCase(charList.get(playerPositionY - 1).get(playerPositionX));
			// System.out.println("The char is : " + theOneToReach);
			break;
		case 2:
			/*if (Character.toLowerCase(charList.get(playerPositionY + 2).get(playerPositionX)) == 'c'
					&& Character.toLowerCase(charList.get(playerPositionY + 1).get(playerPositionX)) == 'r') {
				charList.get(playerPositionY + 2).set(playerPositionX, 'r');
				charList.get(playerPositionY + 1).set(playerPositionX, 'c');
			}*/
			theOneToReach = Character.toLowerCase(charList.get(playerPositionY + 1).get(playerPositionX));
			// System.out.println("The char is : " + theOneToReach);
			break;
		case 1:
			if (Character.toLowerCase(charList.get(playerPositionY).get(playerPositionX - 2)) == 'c'
					&& Character.toLowerCase(charList.get(playerPositionY).get(playerPositionX - 1)) == 'r') {
				charList.get(playerPositionY).set(playerPositionX - 2, 'r');
				charList.get(playerPositionY).set(playerPositionX - 1, 'c');
			}
			theOneToReach = Character.toLowerCase(charList.get(playerPositionY).get(playerPositionX - 1));
			// System.out.println("The char is : " + theOneToReach);
			//
			break;
		case 3:
			if (Character.toLowerCase(charList.get(playerPositionY).get(playerPositionX + 2)) == 'c'
					&& Character.toLowerCase(charList.get(playerPositionY).get(playerPositionX + 1)) == 'r') {
				charList.get(playerPositionY).set(playerPositionX + 2, 'r');
				charList.get(playerPositionY).set(playerPositionX + 1, 'c');
			}
			theOneToReach = Character.toLowerCase(charList.get(playerPositionY).get(playerPositionX + 1));
			// System.out.println("The char is : " + theOneToReach);
			break;
		default:
			break;

		}
		if (theOneToReach == '#' || theOneToReach == 'r' || theOneToReach == 'm' || theOneToReach == 'a'
				|| theOneToReach == 'j' || theOneToReach == 'z' || theOneToReach == 'w' || theOneToReach == 'o'
				|| theOneToReach == 'k') {
			return false;
		} else if (theOneToReach == 'x') {
			// this.haveToReturnFalseForNewLevel = true;
			if (_level.getDiamondGot()>= _level.getMinDiamond()) {
				_model.loadLevel(_level.getLevelID() + 1);
				_model.flagObserver();
			}
			return false;
		} else if (theOneToReach == 'd') {
			_model.getLevel().setDiamondGot(_model.getLevel().getDiamondGot() + 1);
			//System.out.println("Diamant : " + _model.getLevel().getDiamondGot());
			return true;
		} else if (theOneToReach == 'e') {
			initDeath(_level);
			return false;
		}else if (theOneToReach != 0) {
			return true;
		}
		return false;
	}

	/**
	 * @param _level
	 * @param _model
	 */
	public void makeEverythingFallDownAndEnnemyMove(level _level, Model _model) {
		//System.out.println(_level.getLevelAsString());
		ArrayList<ArrayList<Character>> charList = _level.getLevelAsList();
		boolean beahviorChanged = false;
		for (int i = charList.size() - 2; i >= 0; i--) {
			for (int j = charList.get(i).size() - 1; j >= 0; j--) {
				if (charList.get(i).get(j) != 't' && charList.get(i).get(j) != 's' && charList.get(i).get(j) != '#'
						&& charList.get(i).get(j) != 'x' && charList.get(i).get(j) != 'm'
						&& charList.get(i).get(j) != 's' && charList.get(i).get(j) != 'c') {
					if (charList.get(i + 1).get(j) == 'c'  && Character.toLowerCase(charList.get(i).get(j)) != 'e') {//make any sprite fall down if there is a way under
						charList.get(i + 1).set((j), Character.toUpperCase(charList.get(i).get(j)));
						charList.get(i).set(j, 'c');
					} else if ((Character.toLowerCase(charList.get(i + 1).get(j)) == 'r' 
							|| Character.toLowerCase(charList.get(i + 1).get(j)) == 'd')// make rock fall aside of diamond or other rock
							&& charList.get(i).get(j) == 'r') { 
						if (charList.get(i + 1).get(j - 1) == 'c' && charList.get(i).get(j - 1) == 'c') { // fall left
							charList.get(i + 1).set((j - 1), Character.toUpperCase(charList.get(i).get(j)));
							charList.get(i).set(j, 'c');
						} else if (charList.get(i + 1).get(j + 1) == 'c' && charList.get(i).get(j + 1) == 'c') {// fall right
							charList.get(i + 1).set((j + 1), Character.toUpperCase(charList.get(i).get(j)));
							charList.get(i).set(j, 'c');
						}
					} else if ((charList.get(i).get(j) == 'R' || charList.get(i).get(j) == 'D' ) && Character.toLowerCase(charList.get(i+1).get(j)) == 'e') { // make ennemy die
						//System.out.println("Ennemy should die")	;
						charList.get(i+1).set(j, charList.get(i).get(j));
						charList.get(i).set(j, 'c');
						_level.setDiamondGot(_level.getDiamondGot()+4);
					}else if (Character.toLowerCase(charList.get(i).get(j)) == 'e') { //animate if this is an ennemy
						switch (this.lastPurposeMonster) {
						case 5:
							if ((charList.get(i-1).get(j) == 'c' || charList.get(i-1).get(j) == 's') && charList.get(i).get(j) == 'e' && shouldBeLowerCase){
								if (charList.get(i-1).get(j) == 's') {
									initDeath(_level);
								}
								//System.out.println("Move up1");
								charList.get(i-1).set(j,'E');
								charList.get(i).set(j,'c');
							} else if ((charList.get(i-1).get(j) == 'c' || charList.get(i-1).get(j) == 's') && charList.get(i).get(j) == 'E' && !shouldBeLowerCase){
								if (charList.get(i-1).get(j) == 's') {
									initDeath(_level);
								}
								//System.out.println("Move up2");
								charList.get(i-1).set(j,'e');
								charList.get(i).set(j,'c');
							}else if (beahviorChanged == false) {
								this.lastPurposeMonster = 1;
								beahviorChanged = true;
							}
							break;
						case 2:
							if ((charList.get(i+1).get(j) == 'c' || charList.get(i+1).get(j) == 's') && charList.get(i).get(j) == 'e' && shouldBeLowerCase){
								if (charList.get(i+1).get(j) == 's') {
									initDeath(_level);
								}
								//System.out.println("Move down");
								charList.get(i+1).set(j,'E');
								charList.get(i).set(j,'c');
							}else if ((charList.get(i+1).get(j) == 'c' || charList.get(i+1).get(j) == 's') && charList.get(i).get(j) == 'E' && !shouldBeLowerCase){
								if (charList.get(i+1).get(j) == 's') {
									initDeath(_level);
								}
								//System.out.println("Move down");
								charList.get(i+1).set(j,'e');
								charList.get(i).set(j,'c');
							}else if (beahviorChanged == false) {
								this.lastPurposeMonster = 3;
								beahviorChanged = true;
							}
							break;
						case 1:
							if ((charList.get(i).get(j-1) == 'c' || charList.get(i).get(j-1) == 's' )&& charList.get(i).get(j) == 'e' && shouldBeLowerCase){
								if (charList.get(i).get(j-1) == 's') {
									initDeath(_level);
								}
								//System.out.println("Move left");
								charList.get(i).set(j-1,'E');
								charList.get(i).set(j,'c');
							}else if ((charList.get(i).get(j-1) == 'c' || charList.get(i).get(j-1) == 's') && charList.get(i).get(j) == 'E' && !shouldBeLowerCase){
								if (charList.get(i).get(j-1) == 's') {
									initDeath(_level);
								}
								//System.out.println("Move left");
								charList.get(i).set(j-1,'e');
								charList.get(i).set(j,'c');
							}else if (beahviorChanged == false) {
								this.lastPurposeMonster = 2;
								beahviorChanged = true;
							}
							break;
						case 3:
							if ((charList.get(i).get(j+1) == 'c' || charList.get(i).get(j+1) == 's') && charList.get(i).get(j) == 'e' && shouldBeLowerCase){
								if (charList.get(i).get(j+1) == 's') {
									initDeath(_level);
								}
								//System.out.println("Move right");
								charList.get(i).set(j+1,'E');
								charList.get(i).set(j,'c');
							}else if ((charList.get(i).get(j+1) == 'c'  || charList.get(i).get(j+1) == 's' )&& charList.get(i).get(j) == 'E' && !shouldBeLowerCase){
								if (charList.get(i).get(j+1) == 's') {
									initDeath(_level);

								}
								//System.out.println("Move right");
								charList.get(i).set(j+1,'e');
								charList.get(i).set(j,'c');
							}else if (beahviorChanged == false) {
								this.lastPurposeMonster = 5;
								beahviorChanged = true;
							}
							break;
						default :
							break;
						}
					} else if (charList.get(i + 1).get(j) == 's' && Character.isUpperCase(charList.get(i).get(j)) == true) { // kill player if an UpperCase fall on him
						
						
						
						//This is the end of the game
						initDeath(_level);
				        
				        
				        
					} else if (Character.toLowerCase(charList.get(i + 1).get(j)) != 'e'){
						charList.get(i).set((j), Character.toLowerCase(charList.get(i).get(j))); //if can't fall down go lower case
					}
				}
			}
		}
		_level.setLevelAsList(charList);
		_model.flagObserver();
		this.shouldBeLowerCase = !shouldBeLowerCase;
	}
	
	/**
	 * @param _level
	 */
	private void initDeath(level _level) {
		//System.out.println("You died");
		_level.setDead(true);
        //System.exit(0);
	}
}


//
// _______  __  ____    ____  _______     __    __       _______.        ___      .__   __.         ___      
///  _____||  | \   \  /   / |   ____|   |  |  |  |     /       |       /   \     |  \ |  |        /   \     
//|  |  __ |  |  \   \/   /  |  |__      |  |  |  |    |   (----`      /  ^  \    |   \|  |       /  ^  \    
//|  | |_ ||  |   \      /   |   __|     |  |  |  |     \   \       /  /_\  \   |  . `  |      /  /_\  \   
//|  |__| ||  |    \    /    |  |____    |  `--'  | .----)   |       /  _____  \  |  |\   |     /  _____  \  
//\______| |__|     \__/     |_______|    \______/  |_______/       /__/     \__\ |__| \__|    /__/     \__\ 
//

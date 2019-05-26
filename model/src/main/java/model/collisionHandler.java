package model;

import java.util.ArrayList;

import entity.level;

public class collisionHandler {
	Boolean haveToReturnFalseForNewLevel = false;

	public Boolean checkCollisionForPlayerPositionMovementAndPush(int playerPositionY, int playerPositionX, int behavior,
			level _level, Model _model, ArrayList<ArrayList<Character>> charList ) {
		if (haveToReturnFalseForNewLevel == false) {
			char theOneToReach = 0;
			switch (behavior) {
			case 5: //Have to add check on extremity to not except when I am at 1.qssssssss
				if (Character
						.toLowerCase(charList.get(playerPositionY - 2).get(playerPositionX)) == 'c' && Character
						.toLowerCase(charList.get(playerPositionY - 1).get(playerPositionX)) == 'r') {
					charList.get(playerPositionY-2).set(playerPositionX, 'r');
					charList.get(playerPositionY-1).set(playerPositionX, 'c');
				}
				theOneToReach = Character
						.toLowerCase(charList.get(playerPositionY - 1).get(playerPositionX));
				// System.out.println("The char is : " + theOneToReach);
				break;
			case 2:
				if (Character
						.toLowerCase(charList.get(playerPositionY + 2).get(playerPositionX)) == 'c' && Character
						.toLowerCase(charList.get(playerPositionY + 1).get(playerPositionX)) == 'r') {
					charList.get(playerPositionY+2).set(playerPositionX, 'r');
					charList.get(playerPositionY+1).set(playerPositionX, 'c');
				}
				theOneToReach = Character
						.toLowerCase(charList.get(playerPositionY + 1).get(playerPositionX));
				// System.out.println("The char is : " + theOneToReach);
				break;
			case 1:
				if (Character
						.toLowerCase(charList.get(playerPositionY).get(playerPositionX-2)) == 'c' && Character
						.toLowerCase(charList.get(playerPositionY).get(playerPositionX-1)) == 'r') {
					charList.get(playerPositionY).set(playerPositionX-2, 'r');
					charList.get(playerPositionY).set(playerPositionX-1, 'c');
				}
				theOneToReach = Character
						.toLowerCase(charList.get(playerPositionY).get(playerPositionX - 1));
				// System.out.println("The char is : " + theOneToReach);
				break;
			case 3:
				if (Character
						.toLowerCase(charList.get(playerPositionY).get(playerPositionX+2)) == 'c' && Character
						.toLowerCase(charList.get(playerPositionY).get(playerPositionX+1)) == 'r') {
					charList.get(playerPositionY).set(playerPositionX+2, 'r');
					charList.get(playerPositionY).set(playerPositionX+1, 'c');
				}
				theOneToReach = Character
						.toLowerCase(charList.get(playerPositionY).get(playerPositionX + 1));
				// System.out.println("The char is : " + theOneToReach);
				break;
			default:
				break;

			}
			if (theOneToReach == '#' || theOneToReach == 'r' || theOneToReach == 'm') {
				return false;
			} else if (theOneToReach == 'x') {
				//this.haveToReturnFalseForNewLevel = true;
				_model.loadLevel(_level.getLevelID() + 1);
				_model.flagObserver();
				return false;
			}else if (theOneToReach =='d') {
				_model.setDiamond(_model.getDiamond() + 1);
				System.out.println("Diamant : " + _model.getDiamond());
				return true;
			}else if (theOneToReach != 0) {
				return true;
			}
			return false;
		}else {
			return false;
		}
	}

	public void makeEverythingFallDown(level _level, Model _model) {
		ArrayList<ArrayList<Character>> charList = _level.getLevelAsList();
		for (int i = charList.size() - 1; i >= 0; i--) {
			// System.out.println("i="+i);
			for (int j = charList.get(i).size() - 1; j >= 0; j--) {
				// System.out.println("j="+j);
				// System.out.println("char ="+charList.get(i).get(j));
				if (i < charList.size() - 1) {
					if (charList.get(i).get(j) != 't' && charList.get(i).get(j) != 's' && charList.get(i).get(j) != '#'
							&& charList.get(i).get(j) != 'x' && charList.get(i).get(j) != 'm'
							&& charList.get(i).get(j) != 's' && charList.get(i).get(j) != 'c') {
						if (charList.get(i + 1).get(j) == 'c') {
							charList.get(i + 1).set((j), Character.toUpperCase(charList.get(i).get(j)));
							charList.get(i).set(j, 'c');
						} else if (charList.get(i + 1).get(j) == 'r' && charList.get(i).get(j) == 'r') {
							if (charList.get(i + 1).get(j - 1) == 'c') {
								charList.get(i + 1).set((j - 1), Character.toUpperCase(charList.get(i).get(j)));
								charList.get(i).set(j, 'c');
							} else if (charList.get(i + 1).get(j + 1) == 'c') {
								charList.get(i + 1).set((j + 1), Character.toUpperCase(charList.get(i).get(j)));
								charList.get(i).set(j, 'c');
							}
						} else if (charList.get(i + 1).get(j) == 's'
								&& Character.isUpperCase(charList.get(i).get(j)) == true) {
							System.out.println("\n\n\nYou died MF\n\n\n");
							System.exit(0);
						} else {
							charList.get(i).set((j), Character.toLowerCase(charList.get(i).get(j)));
						}
					}
				}
			}
			_level.setLevelAsList(charList);
			_model.flagObserver();
		}
	}

}

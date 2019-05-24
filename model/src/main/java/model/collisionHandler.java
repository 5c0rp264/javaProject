package model;

import java.util.ArrayList;

import entity.level;

public class collisionHandler {
	public Boolean checkCollisionForPlayerPositionAndMovement(int playerPositionY, int playerPositionX, int behavior,
			level _level) {
		char theOneToReach;
		switch (behavior) {
		case 5:
			theOneToReach = _level.getLevelAsList().get(playerPositionY-1).get(playerPositionX);
			//System.out.println("The char is : " + theOneToReach);
			if ( theOneToReach == '#' || theOneToReach == 'r' || theOneToReach == 'm') {
				return false;
			}else {
				return true;
			}
		case 2:
			theOneToReach = _level.getLevelAsList().get(playerPositionY+1).get(playerPositionX);
			//System.out.println("The char is : " + theOneToReach);
			if ( theOneToReach == '#' || theOneToReach == 'r' || theOneToReach == 'm') {
				return false;
			}else {
				return true;
			}
		case 1:
			theOneToReach = _level.getLevelAsList().get(playerPositionY).get(playerPositionX-1);
			//System.out.println("The char is : " + theOneToReach);
			if ( theOneToReach == '#' || theOneToReach == 'r' || theOneToReach == 'm') {
				return false;
			}else {
				return true;
			}
		case 3:
			theOneToReach = _level.getLevelAsList().get(playerPositionY).get(playerPositionX+1);
			//System.out.println("The char is : " + theOneToReach);
			if ( theOneToReach == '#' || theOneToReach == 'r' || theOneToReach == 'm') {
				return false;
			}else {
				return true;
			}
		default:
			break;

		}
		return true;
	}
	
	public void makeEverythingFallDown(level _level, Model _model) {
		ArrayList<ArrayList<Character>> charList = _level.getLevelAsList();
		for (int i = charList.size()-1 ; i >= 0 ; i--) {
			//System.out.println("i="+i);
			for (int j = charList.get(i).size()-1 ; j >= 0 ; j--) {
				//System.out.println("j="+j);
				//System.out.println("char ="+charList.get(i).get(j));
				if ( i < charList.size()-1) {
					if (charList.get(i).get(j) != 't' && charList.get(i).get(j) != 's' && charList.get(i).get(j) != '#'  && charList.get(i).get(j) != 'X'  && charList.get(i).get(j) != 'm' && charList.get(i).get(j) != 's') {
						if (charList.get(i+1).get(j) == 'c') {
							charList.get(i+1).set((j), charList.get(i).get(j));
							charList.get(i).set(j, 'c');
						}
						if (charList.get(i+1).get(j) == 'r' && charList.get(i).get(j) == 'r') {
							if (charList.get(i+1).get(j-1) == 'c') {
								charList.get(i+1).set((j-1), charList.get(i).get(j));
								charList.get(i).set(j, 'c');
							} else if (charList.get(i+1).get(j+1) == 'c') {
								charList.get(i+1).set((j+1), charList.get(i).get(j));
								charList.get(i).set(j, 'c');
							}
						}
					}
				}
			}
			_level.setLevelAsList(charList);
			_model.flagObserver();
		}
	}
	
}

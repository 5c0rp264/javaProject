package model;

import entity.level;

public class collisionHandler {
	public Boolean checkCollisionForPlayerPositionAndMovement(int playerPositionY, int playerPositionX, int behavior,
			level _level) {
		char theOneToReach;
		switch (behavior) {
		case 5:
			theOneToReach = _level.getLevelAsList().get(playerPositionY-1).get(playerPositionX);
			System.out.println("The char is : " + theOneToReach);
			if ( theOneToReach == '#' || theOneToReach == 'r' || theOneToReach == 'm') {
				return false;
			}else {
				return true;
			}
		case 2:
			theOneToReach = _level.getLevelAsList().get(playerPositionY+1).get(playerPositionX);
			System.out.println("The char is : " + theOneToReach);
			if ( theOneToReach == '#' || theOneToReach == 'r' || theOneToReach == 'm') {
				return false;
			}else {
				return true;
			}
		case 1:
			theOneToReach = _level.getLevelAsList().get(playerPositionY).get(playerPositionX-1);
			System.out.println("The char is : " + theOneToReach);
			if ( theOneToReach == '#' || theOneToReach == 'r' || theOneToReach == 'm') {
				return false;
			}else {
				return true;
			}
		case 3:
			theOneToReach = _level.getLevelAsList().get(playerPositionY).get(playerPositionX+1);
			System.out.println("The char is : " + theOneToReach);
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
}

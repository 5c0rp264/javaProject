package model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;
import entity.level;
import entity.spriteEntity;

/**
 * The Class Model.
 *
 * @author Quentin AOUSTIN
 */
public final class Model extends Observable implements IModel {

	
	
	/** The helloWorld. */
	private level level;

	/**
	 * Instantiates a new model.
	 */
	public Model() {
		this.level = new level();
	}
	
	private String swap(String str, int j, int i) { 
        System.out.println("Before :\n"+str+"\n goalIndex: "+i+"playerIndex:"+j);
		if (j == str.length() - 1) 
            return str.substring(0, i) + str.charAt(j) 
             + str.substring(i + 1, j) + str.charAt(i); 
  
        return str.substring(0, i) + str.charAt(j) 
               + str.substring(i + 1, j) + str.charAt(i)  
               + str.substring(j + 1, str.length()); 
    }

	
	
	public void loadLevel(final int lvlNum) {
		System.out.println("getting level with SQL");
		try {
			final DAOLevel leveldao = new DAOLevel(DBConnection.getInstance().getConnection());
			this.setLevel(leveldao.find(lvlNum));
			System.out.println(this.level.getLevelAsString());
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/**
     * Gets the observable.
     *
     * @return the observable
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}

	@Override
	public entity.level getLevel() {
		// TODO Auto-generated method stub
		return this.level;
	}

	public void setLevel(level _level) {
		this.level = _level;
		this.setChanged();
		this.notifyObservers();
	}

	@Override
	public void movePlayer(int directionIndex) {
		// TODO Auto-generated method stub
		System.out.println("movePlayer called");
		String lvlAsStr = level.getLevelAsString();
		int x=1;
		int xMax = 0;
		int y=1;
		int playerIndex;
		int goalPlace;
		for (int i = 0; i < lvlAsStr.length(); i++) {
			if (lvlAsStr.charAt(i) == '\n') {
				//System.out.println("That's a \\n");
				y++;
				xMax=x;
				x=1;
			}else if (lvlAsStr.charAt(i) == 's') {
				//System.out.println("That's a \\r");
				playerIndex = i;
				//if (y>1) {
				switch (directionIndex) {
					case 5 :
						goalPlace = ((y-2)*xMax)+x-1;
						break;
					case 2 :
						while (lvlAsStr.charAt(i) == '\n') {
							xMax++;
						}
						goalPlace = ((y)*xMax)+x-1;
						break;
					case 1 :
						goalPlace = ((y-1)*xMax)+x-2;
						break;
					case 3 :
						goalPlace = ((y-1)*xMax)+x;
						break;
					default:
						goalPlace = playerIndex;
						break;
				}
				level.setLevelAsString(this.swap(lvlAsStr,playerIndex,goalPlace));
				this.setChanged();
				this.notifyObservers();
			}else{
				x++;
			}
			
		}
	}

}

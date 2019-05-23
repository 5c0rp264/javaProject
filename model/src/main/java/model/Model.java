package model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
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
		ArrayList<ArrayList<Character>> charList = level.getLevelAsList();
		int newSXposition = 0;
		int newSYPosition = 0;
		int oldSXposition = 0;
		int oldSYPosition = 0;
		for (int i = 0; i < charList.size(); i++) {
			for (int j = 0; j < charList.get(i).size(); j++) {
				if (charList.get(i).get(j) == 's') {
					collisionHandler cH = new collisionHandler();
					if (cH.checkCollisionForPlayerPositionAndMovement(i, j, directionIndex, level) == true) {
						switch (directionIndex) {
						case 5:
							newSXposition = j;
							newSYPosition = i - 1;
							oldSXposition = j;
							oldSYPosition = i;
							break;
						case 2:
							newSXposition = j;
							newSYPosition = i + 1;
							oldSXposition = j;
							oldSYPosition = i;
							break;
						case 1:
							newSXposition = j-1;
							newSYPosition = i;
							oldSXposition = j;
							oldSYPosition = i;
							break;
						case 3:
							newSXposition = j+1;
							newSYPosition = i;
							oldSXposition = j;
							oldSYPosition = i;
						default:
							break;
						}
					}

				}
			}
		}
		if (newSXposition != 0 && newSYPosition != 0) {
			charList.get(oldSYPosition).set(oldSXposition, 'c');
			charList.get(newSYPosition).set((newSXposition), 's');
			level.setLevelAsList(charList);
			this.setChanged();
			this.notifyObservers();
		}
		
	}

}

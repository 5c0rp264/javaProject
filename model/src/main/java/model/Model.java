package model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

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
	private Model model = this;
	private int diamond = 0;
	collisionHandler cH = new collisionHandler();

	/**
	 * Instantiates a new model.
	 */
	public Model() {
		this.loadLevel(1);
	}
	
	public void flagObserver() {
		this.setChanged();
		this.notifyObservers();
	}
	
	
	public void startTimerFallingObject(){
	    TimerTask repeatedTask = new TimerTask() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				level.setCurrentScore(level.getCurrentScore()+1);
				System.out.println(level.getCurrentScore());
				cH.makeEverythingFallDown(level, model);
			}
	    };
	    Timer timer = new Timer("fallingObjectTimer");
	     
	    long delay  = 0;
	    long period = 250;
	    timer.scheduleAtFixedRate(repeatedTask, delay, period);
	}
	
	
	
	

	public void loadLevel(final int lvlNum) {
		System.out.println("getting level with SQL");
		try {
			final DAOLevel leveldao = new DAOLevel(DBConnection.getInstance().getConnection());
			this.setLevel(leveldao.find(lvlNum));
			//this.flagObserver();
			System.out.println(leveldao.find(lvlNum).getLevelAsString());
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		startTimerFallingObject();
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
		this.flagObserver();
	}

	@Override
	public void movePlayer(int directionIndex) {
		// TODO Auto-generated method stub
		//System.out.println("movePlayer called");
		ArrayList<ArrayList<Character>> charList = level.getLevelAsList();
		int newSXposition = 0;
		int newSYPosition = 0;
		int oldSXposition = 0;
		int oldSYPosition = 0;
		for (int i = 0; i < charList.size(); i++) {
			for (int j = 0; j < charList.get(i).size(); j++) {
				if (charList.get(i).get(j) == 's') {
					if (this.cH.checkCollisionForPlayerPositionAndMovement(i, j, directionIndex, level, this.model) == true) {
						switch (directionIndex) {
						case 5:
							newSXposition = j;
							newSYPosition = i - 1;
							if (charList.get(newSXposition).get(newSYPosition)=='d') {
								this.diamond++;
							}
							oldSXposition = j;
							oldSYPosition = i;
							break;
						case 2:
							newSXposition = j;
							newSYPosition = i + 1;
							if (charList.get(newSXposition).get(newSYPosition)=='d') {
								this.diamond++;
							}
							oldSXposition = j;
							oldSYPosition = i;
							break;
						case 1:
							newSXposition = j-1;
							newSYPosition = i;
							if (charList.get(newSXposition).get(newSYPosition)=='d') {
								this.diamond++;
							}
							oldSXposition = j;
							oldSYPosition = i;
							break;
						case 3:
							newSXposition = j+1;
							newSYPosition = i;
							if (charList.get(newSXposition).get(newSYPosition)=='d') {
								this.diamond++;
							}
							oldSXposition = j;
							oldSYPosition = i;
							break;
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
			this.flagObserver();
		}else {
			cH.haveToReturnFalseForNewLevel = false;
		}
		
		System.out.println("Level at the end of movePlayer:\n\n"+this.getLevel().getLevelAsString());
		
	}

}

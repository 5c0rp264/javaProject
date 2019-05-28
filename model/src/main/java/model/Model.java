package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

import contract.IModel;
import entity.level;
import entity.spriteEntity;

import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;
import java.io.*;

/**
 * The Class Model.
 *
 * @author Quentin AOUSTIN
 */
public final class Model extends Observable implements IModel  {

	/** The helloWorld. */
	private level level;
	private Model model = this;
	collisionHandler cH = new collisionHandler();
	private Player audioplayer;
	private TimerTask repeatedTask;

	public TimerTask getRepeatedTask() {
		return repeatedTask;
	}

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

	
	
	
	
	
	public void startTimerFallingObject() {
		if (repeatedTask != null) {
			repeatedTask.cancel();
		}
		
		
		
		repeatedTask = new TimerTask() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				if (level.getTimeRemaining() <= 0) {
					level.setDead(true);
					model.flagObserver();
					repeatedTask.cancel();
				}else {
					level.setTimeRemaining(level.getTimeRemaining() - 1);
					//System.out.println(level.getTimeRemaining());
					cH.makeEverythingFallDownAndEnnemyMove(level, model);
					if (level.getDiamondGot()>= level.getMinDiamond()) {
						spriteEntity.setEnoughDiamond(true);
					}
				}
			}
		};
		
		
		
		Timer timer = new Timer("fallingObjectTimer");
		long delay = 0;
		long period = 100;
		timer.scheduleAtFixedRate(repeatedTask, delay, period);
	}
	
	
	
	

	public void loadLevel(final int lvlNum) {
		//System.out.println("getting level with SQL");

		try {
			final DAOLevel leveldao = new DAOLevel(DBConnection.getInstance().getConnection());
			this.setLevel(leveldao.find(4));
			// this.flagObserver();
			//System.out.println(leveldao.find(lvlNum).getLevelAsString());
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		startTimerFallingObject();
		
		File f=new File("../music.wav");
		try {
			if (audioplayer != null) {
				audioplayer.stop();
			}
			audioplayer = Manager.createRealizedPlayer(f.toURI().toURL());
			audioplayer.start();
		} catch (NoPlayerException | CannotRealizeException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		spriteEntity.setEnoughDiamond(false);
		cH.lastPurposeMonster = 5;
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
		//String bip = "‪music.mp3";
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
		spriteEntity.setLastBehavior(directionIndex);
		for (int i = 0; i < charList.size(); i++) {
			for (int j = 0; j < charList.get(i).size(); j++) {
				if (charList.get(i).get(j) == 's') {
					if (this.cH.checkCollisionForPlayerPositionMovementAndPush(i, j, directionIndex, level, this.model,
							charList) == true) {
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
							newSXposition = j - 1;
							newSYPosition = i;
							oldSXposition = j;
							oldSYPosition = i;
							break;
						case 3:
							newSXposition = j + 1;
							newSYPosition = i;
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
		} /*
			 * else { cH.haveToReturnFalseForNewLevel = false; }
			 */

		// System.out.println("Level at the end of
		// movePlayer:\n\n"+this.getLevel().getLevelAsString());

	}

	

}

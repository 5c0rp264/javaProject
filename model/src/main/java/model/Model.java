package model;

import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;
import entity.level;

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

	/**
     * Gets the hello world.
     *
     * @return the hello world
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage()
	 */

	/**
     * Sets the hello world.
     *
     * @param helloWorld
     *            the new hello world
     */

	/**
     * Load hello world.
     *
     * @param code
     *            the code
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage(java.lang.String)
	 */
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

}

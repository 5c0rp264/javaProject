package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import entity.level;

public class DAOLevel extends DAOEntity<level> {

	/**
	 * @param connection
	 * @throws SQLException
	 */
	public DAOLevel(Connection connection) throws SQLException {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	/**
	 *
	 */
	@Override
	public boolean create(level entity) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 *
	 */
	@Override
	public boolean delete(level entity) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 *
	 */
	@Override
	public boolean update(level entity) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 *
	 */
	@Override
	public level find(int numLevel) {
		level _level = null;
		try {
			_level = new level();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			final String sql = "{call getLevel(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, numLevel);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			if (resultSet.first()) {
				_level = new level(numLevel, resultSet.getInt("highScore"), resultSet.getString("levelAsTxt"), resultSet.getInt("maxTimeToDoLevel"), resultSet.getInt("minDiams"));
				//System.out.println(resultSet.getString("levelAsTxt"));
			}
			return _level;
		} catch (final SQLException | InstantiationException e) {
			e.printStackTrace();
		}
		return null;
	}


}

//
// _______  __  ____    ____  _______     __    __       _______.        ___      .__   __.         ___      
///  _____||  | \   \  /   / |   ____|   |  |  |  |     /       |       /   \     |  \ |  |        /   \     
//|  |  __ |  |  \   \/   /  |  |__      |  |  |  |    |   (----`      /  ^  \    |   \|  |       /  ^  \    
//|  | |_ ||  |   \      /   |   __|     |  |  |  |     \   \         /  /_\  \   |  . `  |      /  /_\  \   
//|  |__| ||  |    \    /    |  |____    |  `--'  | .----)   |       /  _____  \  |  |\   |     /  _____  \  
//\______| |__|     \__/     |_______|    \______/  |_______/       /__/     \__\ |__| \__|    /__/     \__\ 
//

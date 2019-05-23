package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import entity.level;

public class DAOLevel extends DAOEntity<level> {

	public DAOLevel(Connection connection) throws SQLException {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(level entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(level entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(level entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public level find(int numLevel) {
		level _level = new level();

		try {
			final String sql = "{call getLevel(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, numLevel);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			if (resultSet.first()) {
				_level = new level(numLevel, resultSet.getInt("highScore"), resultSet.getString("levelAsTxt"));
				System.out.println(resultSet.getString("levelAsTxt"));
			}
			return _level;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


}

package model;

import java.sql.Connection;
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
	public level find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public level find(String code) {
		// TODO Auto-generated method stub
		return null;
	}



}

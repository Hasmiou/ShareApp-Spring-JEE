package com.gustaveeiffel.upem.Dao;

import com.gustaveeiffel.upem.datasource.DataSource;
import com.gustaveeiffel.upem.datasource.Database;
import com.gustaveeiffel.upem.datasource.MySQLDataSource;

public class DatabaseLauncher {

	private  Database db;
	private DataSource ds;
	public DatabaseLauncher() {
		ds = new MySQLDataSource("localhost","db_partage","root");
		db = new Database(ds);
	}
	public  Database dbinit() {
		return db;
	}
}

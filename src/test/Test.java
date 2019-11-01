package test;

import com.gustaveeiffel.upem.Dao.DatabaseLauncher;
import com.gustaveeiffel.upem.datasource.Database;

public class Test {
private Database db;
	public Test() {
		db=initDb();
	}
	
	
	public Database initDb() {
		DatabaseLauncher start = new DatabaseLauncher();
		return start.dbinit();
	}
	
	public void testAjoutProduit() {
		
	}
}

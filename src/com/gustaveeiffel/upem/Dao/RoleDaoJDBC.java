package com.gustaveeiffel.upem.Dao;

import com.gustaveeiffel.upem.datasource.Database;
import com.gustaveeiffel.upem.models.Role;

public class RoleDaoJDBC implements RoleDao {
private Database db;
	@Override
	public boolean insererRole(Role r) {
		if(db.Insert("role","roleid","nomRole")>0)return true;
	return false;
	}

	@Override
	public boolean supprimerRole(int id) {
		if (db.Delete("role","roleid", id)==0) return false;
		return true;
		
	}


	
}

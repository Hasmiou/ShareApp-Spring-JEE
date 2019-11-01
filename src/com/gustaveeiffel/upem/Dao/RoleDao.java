package com.gustaveeiffel.upem.Dao;

import com.gustaveeiffel.upem.models.Role;

public interface RoleDao {

	public boolean insererRole(Role r);
	public boolean supprimerRole(int roleId);
	
}

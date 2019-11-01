package com.gustaveeiffel.upem.business;

import com.gustaveeiffel.upem.Dao.RoleDao;
import com.gustaveeiffel.upem.models.Role;

public class RoleServiceDefault implements RoleService{
 private RoleDao dao;
	
	public boolean AjouterRole(Role r) {
		if(dao.insererRole(r)) return true;
		return false;
	}

	public boolean supprimer(int id) {
		if(dao.supprimerRole(id)) return true;
		return false;
	}

}

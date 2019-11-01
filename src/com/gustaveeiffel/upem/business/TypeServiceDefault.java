package com.gustaveeiffel.upem.business;

import java.util.List;

import com.gustaveeiffel.upem.Dao.TypeDao;
import com.gustaveeiffel.upem.models.Type;

public class TypeServiceDefault implements TypeService {
TypeDao dao;
	
	public boolean ajouterType(Type t) {
		if(dao.insererType(t))return true;
		return false;
	}

	
	public boolean supprimer(int id) {
		if(dao.supprimerType(id)) return true;
		return false;
	}

	public List<Type> listTypes() {
		return dao.listType();
	}

}

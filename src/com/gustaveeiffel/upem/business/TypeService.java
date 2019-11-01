package com.gustaveeiffel.upem.business;

import java.util.List;

import com.gustaveeiffel.upem.models.Type;

public interface TypeService {

	public  boolean ajouterType(Type t);
	public boolean supprimer(int id);
	public List<Type> listTypes();
}

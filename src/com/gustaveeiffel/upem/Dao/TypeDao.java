package com.gustaveeiffel.upem.Dao;

import java.util.List;

import com.gustaveeiffel.upem.models.Role;
import com.gustaveeiffel.upem.models.Type;

public interface TypeDao {
	public boolean insererType(Type t);
	public boolean supprimerType(int typeId);
	public List<Type> listType();
}

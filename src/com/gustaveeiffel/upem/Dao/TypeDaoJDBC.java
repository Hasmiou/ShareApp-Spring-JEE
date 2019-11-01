package com.gustaveeiffel.upem.Dao;

import java.util.List;
import java.util.Vector;

import com.gustaveeiffel.upem.datasource.Database;
import com.gustaveeiffel.upem.models.Produit;
import com.gustaveeiffel.upem.models.Type;

public class TypeDaoJDBC implements TypeDao{

	private Database db;
	public boolean insererType(Type t) {
		if(db.Insert("Type","idType","nomType")>0)return true;
		return false;
	}

	
	public boolean supprimerType(int typeId) {
		if (db.Delete("Type","idType", typeId)==0) return false;
		return true;
	}

	
	public List<Type> listType() {
		String data[][] = db.select("Type");
		if (data == null) return null;
		List<Type> types = new Vector<>();
		
		for (int i = 1; i < data.length; i++) {
			types.add( new Type(data[i]));
		}
		return types;
		}

}

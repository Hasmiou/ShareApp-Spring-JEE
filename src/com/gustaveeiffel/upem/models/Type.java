package com.gustaveeiffel.upem.models;

public class Type {
private int typeid;
private String nomType;

public int getTypeid() {
	return typeid;
}
public void setTypeid(int typeid) {
	this.typeid = typeid;
}
public String getNomType() {
	return nomType;
}
public void setNomType(String nomType) {
	this.nomType = nomType;
}
public Type(String ...row) {
	this.typeid = Integer.parseInt(row[0]);
	this.nomType = row[1];
}

}

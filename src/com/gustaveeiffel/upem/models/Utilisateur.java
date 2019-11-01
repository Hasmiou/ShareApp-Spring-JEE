package com.gustaveeiffel.upem.models;

public class Utilisateur {
private int userid;
private String nom;
private String prenom;
private int nombreEmprunt;
private Role userRole;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public int getNombreEmprunt() {
	return nombreEmprunt;
}
public void setNombreEmprunt(int nombreEmprunt) {
	this.nombreEmprunt = nombreEmprunt;
}
public Role getUserRole() {
	return userRole;
}
public void setUserRole(Role userRole) {
	this.userRole = userRole;
}


}

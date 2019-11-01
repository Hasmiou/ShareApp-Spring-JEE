package com.gustaveeiffel.upem.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Produit {
private int produitId;
private String nomProduit;
private Type typeProduit;
private Boolean estDispo;
private String commentaire;
private String note;
private int utilisateurId;
private double prix;
private int nombreEmprunt;
private Date dateAjout;

public Produit() {
	
}

public Produit(int produitId,String nomProduit,Type typProduit,String commentaire,String note,int utilisateurId,Date dateAjout) {
	this.produitId=produitId;
	this.nomProduit= nomProduit;
	this.typeProduit = typProduit;
	this.commentaire= commentaire;
	this.note= note;
	this.utilisateurId = utilisateurId;
	dateAjout = Calendar.getInstance().getTime();
	//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	//to show the date | String theDate = formatter.format(date)
}

public Produit(String ...row) {
	//	id,nom,note,commentaire,nbEmprunts,date,type,utilisateurid

	this.produitId = Integer.parseInt(row[0]);
	this.nomProduit = row[1];
	this.note = row[2];
	this.commentaire = row[3];
	this.nombreEmprunt= Integer.parseInt(row[4]);
	try {
		this.dateAjout=new SimpleDateFormat("dd/MM/yyyy").parse(row[5]);
	} catch (ParseException e) {
		e.printStackTrace();
	}
	this.typeProduit.setTypeid(Integer.parseInt(row[6]));
	this.utilisateurId= Integer.parseInt(row[7]);
}

public int getProduitId() {
	return produitId;
}
public void setProduitId(int produitId) {
	this.produitId = produitId;
}
public String getNomProduit() {
	return nomProduit;
}
public void setNomProduit(String nomProduit) {
	this.nomProduit = nomProduit;
}
public Type getTypeProduit() {
	return typeProduit;
}
public void setTypeProduit(Type typeProduit) {
	this.typeProduit = typeProduit;
}
public Boolean getEstDispo() {
	return estDispo;
}
public void setEstDispo(Boolean estDispo) {
	this.estDispo = estDispo;
}
public String getCommentaire() {
	return commentaire;
}
public void setCommentaire(String commentaire) {
	this.commentaire = commentaire;
}
public String getNote() {
	return note;
}
public void setNote(String note) {
	this.note = note;
}
public int getUtilisateurId() {
	return utilisateurId;
}
public void setUtilisateurId(int utilisateurId) {
	this.utilisateurId = utilisateurId;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public int getNombreEmprunt() {
	return nombreEmprunt;
}
public void setNombreEmprunt(int nombreEmprunt) {
	this.nombreEmprunt = nombreEmprunt;
}
public Date getDateAjout() {
	return dateAjout;
}
public void setDateAjout(Date dateAjout) {
	this.dateAjout = dateAjout;
}

}

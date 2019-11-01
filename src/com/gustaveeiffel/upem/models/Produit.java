package com.gustaveeiffel.upem.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Date;


public class Produit {
	private int produitId;
	private String nomProduit;
	private int  typeProduit;
	private Boolean estDispo;
	private String commentaire;
	private String note;
	private int utilisateurId;
	private double prix;
	private int nombreEmprunt;
	private Date dateAjout;


	public Produit() {

	}

	public Produit(int produitId,String nomProduit,int typProduit,String commentaire,String note,int utilisateurId,Date dateAjout) {
		this.produitId=produitId;
		this.nomProduit= nomProduit;
		this.typeProduit = typProduit;
		this.commentaire= commentaire;
		this.note= note;
		this.utilisateurId = utilisateurId;
		Calendar calendar = Calendar.getInstance();
		dateAjout = new Date(calendar.getTime().getTime());
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
			java.util.Date utilDate = new SimpleDateFormat("yyyy-mm-dd").parse(row[8]);
			this.dateAjout=new Date(utilDate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.typeProduit=(Integer.parseInt(row[5]));
		this.utilisateurId= Integer.parseInt(row[6]);
		if(row[7].equals("1")) {
			this.estDispo= true;
		}
		else {
			this.estDispo= false;
		}
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
	public int getTypeProduit() {
		return typeProduit;
	}
	public void setTypeProduit(int typeProduit) {
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

	@Override
	public String toString() {
		return "Produit [produitId=" + produitId + ", nomProduit=" + nomProduit + ", typeProduit=" + typeProduit
				+ ", estDispo=" + estDispo + ", commentaire=" + commentaire + ", note=" + note + ", utilisateurId="
				+ utilisateurId + ", prix=" + prix + ", nombreEmprunt=" + nombreEmprunt + ", dateAjout=" + dateAjout + "]";
	}

}

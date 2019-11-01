package com.gustaveeiffel.upem.Dao;

import java.util.List;
import java.util.Vector;

import com.gustaveeiffel.upem.datasource.DataSource;
import com.gustaveeiffel.upem.datasource.Database;
import com.gustaveeiffel.upem.models.Produit;
import com.gustaveeiffel.upem.models.Utilisateur;

public class ProduitDaoJDBC implements ProduitDao {

	private Database db;
	
	public ProduitDaoJDBC(Database db) {
		db = new Database();
	}
	
	@Override
	public boolean insertProduit(Produit p) {
		int operation=db.Insert("Produit",p.getProduitId(),p.getNomProduit(),p.getNote(),p.getCommentaire(),
				p.getNombreEmprunt(),p.getDateAjout(),p.getEstDispo(),p.getTypeProduit().getTypeid()
				,p.getUtilisateurId());
		if(operation>0) return true;
		else return false;
	}

	
	public List<Produit> chercherProduit(String motcle) {
		String data[][] =db.selectLike("Produit","nom", motcle);
		if (data == null) return null;
		List<Produit> produits = new Vector<>();
		
		for (int i = 1; i < data.length; i++) {
			produits.add(new Produit(data[i]));
		}
		return produits;
	}

	
	public boolean supprimerProduit(String id) {
		if( db.Delete("Produit","idProduit" , id)==0) return false; 
		return true;
	}

	
	public boolean emprunterProduit(Produit p, Utilisateur u) {
		//recuperer le produit
		return false;
	}

	
	public List<Produit> listeProduits() {
		String data[][] = db.select("Produit");
		if (data == null) return null;
		List<Produit> produits = new Vector<>();
		
		for (int i = 1; i < data.length; i++) {
			produits.add( new Produit(data[i]));
		}
		return produits;
	}

	
	public boolean restituer(Produit p, Utilisateur u) {
        //on doit savoir si l'utilisateur possedait le produit 
		return false;
	}
	

}

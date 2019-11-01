package com.gustaveeiffel.upem.business;

import java.util.List;
import java.util.Vector;

import com.gustaveeiffel.upem.Dao.DatabaseLauncher;
import com.gustaveeiffel.upem.Dao.ProduitDao;
import com.gustaveeiffel.upem.Dao.ProduitDaoJDBC;
import com.gustaveeiffel.upem.datasource.Database;
import com.gustaveeiffel.upem.models.Produit;
import com.gustaveeiffel.upem.models.Utilisateur;

public class ProduitServiceDefault implements ProduitService {

	private ProduitDao dao;
	public ProduitServiceDefault(Database db) {
	dao = new ProduitDaoJDBC(db);
	}
	public void Ajouter(Produit p) {
	 dao.insertProduit(p);
	}

	
	public void Emprunter(Produit p, Utilisateur u) {
		/*Lors de l'emprunt d'un utilisateur on doit savoir 
		*si'il est on top veut dire c'est a lui d'emprunter 
		*sinon on lui notifie qu'il reste dans la liste d'attente 
		*et notifie on meme temps l'utilisateur qui doit l'avoir pour le récuperer
		*/
	}

	
	public boolean deleteProduct(String id) {
		  if(!dao.supprimerProduit(id)) return false;
		  return true;
		}

	
	public List<Produit> listeProduit() {
		return dao.listeProduits();
	}
	
	public List<Produit> chercherProduit(String motcle) {
		return null;
	}
	
	@Override
	public void restituer(Produit p, Utilisateur u) {
		
	}

	

	
	
	
}

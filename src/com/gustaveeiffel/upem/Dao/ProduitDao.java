package com.gustaveeiffel.upem.Dao;

import java.util.List;

import com.gustaveeiffel.upem.datasource.DataSource;
import com.gustaveeiffel.upem.models.Produit;
import com.gustaveeiffel.upem.models.Utilisateur;

public interface ProduitDao {
	public boolean insertProduit(Produit p);
	public List<Produit> chercherProduit(String motcle);
	public boolean supprimerProduit(String id);
	public boolean emprunterProduit(Produit p,Utilisateur u);
	public List<Produit> listeProduits();
	public boolean restituer(Produit p , Utilisateur u);
}

package com.gustaveeiffel.upem.business;

import java.util.List;

import com.gustaveeiffel.upem.models.Produit;
import com.gustaveeiffel.upem.models.Utilisateur;

public interface ProduitService {
public boolean Ajouter(Produit p);
public List<Produit> chercherProduit(String motcle);
public void update(Produit p);
public void Emprunter(Produit p,Utilisateur u);
public void restituer(Produit p,Utilisateur u);//quel produit et qui le posséde
public boolean deleteProduct(String id);
public List<Produit> listeProduit();

}

package com.gustaveeiffel.upem.Dao;

import com.gustaveeiffel.upem.models.Utilisateur;

public interface UtilisateurDao {

	public boolean insererutilisateur(Utilisateur u);
	
	public boolean supprimerUtilisateur(int id);
	public boolean modifierUtilisateur(Utilisateur u);
}

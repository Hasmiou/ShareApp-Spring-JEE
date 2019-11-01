package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.sql.Date;
import com.gustaveeiffel.upem.Dao.DatabaseLauncher;
import com.gustaveeiffel.upem.business.ProduitService;
import com.gustaveeiffel.upem.business.ProduitServiceDefault;
import com.gustaveeiffel.upem.datasource.Database;
import com.gustaveeiffel.upem.models.Produit;

public class TestProduit {
	private Database db;
	public TestProduit() {
		db=initDb();
		//testAjoutProduit();
		testChercherProduit();
	}


	public Database initDb() {
		DatabaseLauncher start = new DatabaseLauncher();
		return start.dbinit();
	}

	public void testAjouterRole() {

	}


	public void testAjoutProduit() { 
		ProduitService produitservice = new ProduitServiceDefault(db);
		//creeons notre produit 
		Produit p = new Produit();
		//p.setProduitId(1);
		p.setPrix(0);
		//p.setDateAjout();
		p.setEstDispo(true);
		p.setNomProduit("Livre : initiation a Spring boot");
		p.setNombreEmprunt(0);
		p.setNote("Trés bon livre ");
		java.util.Date utild=null;
		try {
			utild = new SimpleDateFormat("yyyy-mm-dd").parse("2019-11-01");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		p.setDateAjout(new Date(utild.getTime()));
		p.setCommentaire("Je recommande fortement ce livre");
		p.setUtilisateurId(1);
		p.setTypeProduit(3);
		produitservice.Ajouter(p);
	}

	public void testChercherProduit() {
		ProduitService produitservice = new ProduitServiceDefault(db);
		List<Produit> produits= produitservice.chercherProduit("spring");
		for(Produit p:produits) {
			System.out.println(p);
		}

	}

	public static void main(String[] args) {
		new TestProduit();
	}
}

package adapter;

public class ImpIAdaptee implements Utilisateur {
	
	private String Nom ;
	private String Poste;
public ImpIAdaptee(String nom, String poste) {
		super();
		Nom = nom;
		Poste = poste;
	}
public void AfficherNom() {
	System.out.println("le nom de client est : " +this.Nom);
}
public void AfficherPoste () {
	System.out.println("le poste  de client est : " +this.Poste );
}
@Override
public void AfficherUtilisateur(String Nom, String Poste) {
	// TODO Auto-generated method stub
	
}


	
}



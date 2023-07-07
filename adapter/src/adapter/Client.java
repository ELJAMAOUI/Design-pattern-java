package adapter;

public class Client {
	private String Nom;

	public Client(String nom) {
		super();
		Nom = nom;
	}

	public void AfficherUtilisateur(String Nom, String Post) {
        System.out.println("Nom de l'utilisateur:"+this.Nom);
		
	}


}

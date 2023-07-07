
package adapter;

public class EmployeAdapter  implements Utilisateur  {
	
	

private ImpIAdaptee employe;

	

	public EmployeAdapter(ImpIAdaptee employe) {
		super();
		this.employe = employe;
	}



	@Override
	public void AfficherUtilisateur(String Nom, String Poste) {
		// TODO Auto-generated method stub
		employe.AfficherNom();
		employe.AfficherPoste();

		
	}

}

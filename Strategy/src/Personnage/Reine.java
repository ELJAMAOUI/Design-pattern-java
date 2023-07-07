package Personnage;
import stratgy.ComportementArcEtFleche;
public class Reine extends Personnage {
	
	public Reine() {
	this.compertementArme = new ComportementArcEtFleche();
	}

	@Override
	public void combattre() {
		System.out.println("iam the queen");
		this.compertementArme.utiliserArme();
	}

}

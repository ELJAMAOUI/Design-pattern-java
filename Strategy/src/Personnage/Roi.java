package Personnage;

import stratgy.ComportementArcEtFleche;

public class Roi extends Personnage{
	public Roi() {
		this.compertementArme = new ComportementArcEtFleche();
		}

	
	
	@Override
	public void combattre() {
		// TODO Auto-generated method stub
		
		System.out.println("iam the king");
		this.compertementArme.utiliserArme();
	
	
	}

}

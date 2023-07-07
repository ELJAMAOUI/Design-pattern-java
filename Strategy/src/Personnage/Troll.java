package Personnage;

import stratgy.ComportementArcEtFleche;

public class Troll extends Personnage {

	
	public Troll() {
		this.compertementArme = new ComportementArcEtFleche();
		}

	
	@Override

	public void combattre() {
		// TODO Auto-generated method stub
		
		System.out.println("iam the poignard");
		this.compertementArme.utiliserArme();
	
	
	}}


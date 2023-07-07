package Personnage;
import stratgy.CompertementArme;

public  abstract class Personnage {
	protected String nom;
	protected int score;

	protected CompertementArme compertementArme;
	
		
	public abstract void combattre();


	


	public void setCompertementArme(CompertementArme compertementArme) {
		this.compertementArme = compertementArme;
	}
	

}

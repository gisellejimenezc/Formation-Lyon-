package tp1;

public class Ville {

	private String nom;
	private String pays;
	private boolean capital;
	private double nbHabitant;

	public Ville() {
	}

	public Ville(String nom, String pays, boolean capital, double nbHabitant) {
		super();
		this.nom = nom;
		this.pays = pays;
		this.capital = capital;
		this.nbHabitant = nbHabitant;
	}

	public String comparer(Ville ville2) {
		if (this.nbHabitant == ville2.nbHabitant)
			return this.nom + " et " + ville2.nom + " sont de meme taille";
		return (this.nbHabitant < ville2.nbHabitant) ? this.nom + " est plus petite que " + ville2.nom
				: ville2.nom + " est plus petite que " + this.nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public boolean isCapital() {
		return capital;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	public double getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(double nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	@Override
	public String toString() {
		return (this.nom + " " + this.pays + " " + nbHabitant);
	}

}

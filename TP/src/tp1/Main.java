package tp1;

public class Main {

	public static void main(String[] args) {
		
		Ville Bogota = new Ville("Bogota", "Colombia", true, 9);
		Ville SanFrancisco = new Ville("San Francisco", "USA", false, 0.8);
		Ville Marseille = new Ville("Marseille", "France", false, 1.2);
		
		System.out.println(Bogota.comparer(Marseille));
				
		System.out.println(Bogota.toString());
		System.out.println(Marseille.toString());
		System.out.println(SanFrancisco.toString());
		
		Bogota.setPays("Brazil");
		Marseille.setNbHabitant(0.8);
		System.out.println(SanFrancisco.getPays());
		
		System.out.println(Bogota.toString());
		System.out.println(Marseille.toString());
		System.out.println(SanFrancisco.toString());
		
		System.out.println(SanFrancisco.comparer(Marseille));

	}

}

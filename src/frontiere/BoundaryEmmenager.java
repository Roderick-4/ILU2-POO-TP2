package frontiere;

import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println(
					"Mais vous êtes déjà un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("Êtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					break;

				case 2:
					System.out.println("Bienvenue villageois " + nomVisiteur + ".\n");
					int choixForce = Clavier.entrerEntier("Quelle est votre force ?\n");
					controlEmmenager.ajouterGaulois(nomVisiteur, choixForce);
					break;

				default:
					System.out
							.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		System.out.println("Bienvenue druide " + nomVisiteur);
		int choixForce = Clavier.entrerEntier("Quelle est votre force ?\n");
		int effetPotionMin = Clavier.entrerEntier("Quel est la force de la potion la plus faible que vous produisez ?");
		int effetPotionMax = Clavier.entrerEntier("Quel est la force de la potion la plus forte que vous produisez ?");
		while(effetPotionMax < effetPotionMin) {
			if (effetPotionMax < effetPotionMin) {
				System.out.println("Attention druide, vous vous etes trompes entre le minimum et le maximum");
			}
			effetPotionMin = Clavier.entrerEntier("Quel est la force de la potion la plus faible que vous produisez ?");
			effetPotionMax = Clavier.entrerEntier("Quel est la force de la potion la plus forte que vous produisez ?");
		}
		controlEmmenager.ajouterDruide(nomVisiteur, choixForce, effetPotionMin, effetPotionMax);
	}
}

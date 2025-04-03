package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import villagegaulois.Village;

import org.junit.jupiter.api.Test;

import personnages.Chef;

class ControlVerifierIdentiteTest {
	private ControlVerifierIdentite controlVerifierIdentite;
	private Village village;
	private Chef chef;
	
//	@BeforeEach
//	public void initSituation() {
//		System.out.println("Initialisation");
//		village = new Village("le village des irréductibles", 10, 5);
//		chef = new Chef("Abraracourcix", 10, village);
//		village.setChef(chef);
//		controlEmmenager.ajouterGaulois("Bonemine", 10);
//		controlVerifierIdentite = new ControlVerifierIdentite(village);
//	}
	

	@Test
	public void testControlVerifierIdentite() {
		assertNotNull(controlVerifierIdentite, "Constructeur ne renvoie pas null");
	}
	
//	@Test
//	public void testVerifierIdentite() {
//		assertTrue(controlVerifierIdentite.verifierIdentite("Abraracourcix"));
//		controlEmmenager.ajouterGaulois("Bonemine", 10);
//		assertTrue(controlVerifierIdentite.verifierIdentite("Bonemine"));
//		controlEmmenager.ajouterDruide("Panoramix", 10, 1, 5);
//		assertTrue(controlEmmenager.isHabitant("Panoramix"));
//		assertFalse(controlEmmenager.isHabitant("Existe pas"));
//		}
}

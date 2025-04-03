package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import villagegaulois.Village;

import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import personnages.Druide;

class ControlVerifierIdentiteTest {
	private ControlVerifierIdentite controlVerifierIdentite;
	private Village village;
	private Chef chef;
	
	@BeforeEach
	public void initSituation() {
		System.out.println("Initialisation");
		village = new Village("le village des irréductibles", 10, 5);
		chef = new Chef("Abraracourcix", 10, village);
		village.setChef(chef);
		controlVerifierIdentite = new ControlVerifierIdentite(village);
	}
	
	
	@Test
	public void testVerifierIdentite() {
		Gaulois bonemine = new Gaulois("Bonemine", 5);
		assertTrue(controlVerifierIdentite.verifierIdentite("Bonemine"));
		assertFalse(controlVerifierIdentite.verifierIdentite("Existe pas"));
		}
}

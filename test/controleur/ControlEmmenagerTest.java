package controleur;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ResourceBundle.Control;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import villagegaulois.Village;
import personnages.Chef;


class ControlEmmenagerTest {
	private ControlEmmenager controlEmmenager;
	private Village village;
	private Chef chef;
	
	@BeforeEach
	public void initSituation() {
		System.out.println("Initialisation");
		village = new Village("le village des irréductibles", 10, 5);
		chef = new Chef("Abraracourcix", 10, village);
		village.setChef(chef);
		controlEmmenager = new ControlEmmenager(village);
	}

	@Test
	void testControlEmmenager() {
		assertNotNull(controlEmmenager, "Constructeur ne renvoie pas null");
	}
	
	@Test
	void testIsHabitant() {
		assertTrue(controlEmmenager.isHabitant("Abraracourcix"));
		controlEmmenager.ajouterGaulois("Bonemine", 10);
		assertTrue(controlEmmenager.isHabitant("Bonemine"));
		controlEmmenager.ajouterDruide("Panoramix", 10, 1, 5);
		assertTrue(controlEmmenager.isHabitant("Panoramix"));
		assertFalse(controlEmmenager.isHabitant("Existe pas"));
	}
	
	@Test
	void testAjouterDruide() {
		assertFalse(controlEmmenager.isHabitant("Panoramix"));
		controlEmmenager.ajouterDruide("Panoramix", 10, 1, 5);
		assertTrue(controlEmmenager.isHabitant("Panoramix"));
	}
	
	@Test
	void testAjouterGaulois() {
		assertFalse(controlEmmenager.isHabitant("Bonemine"));
		controlEmmenager.ajouterGaulois("Bonemine", 10);
		assertTrue(controlEmmenager.isHabitant("Bonemine"));
		assertFalse(controlEmmenager.isHabitant("PasBonemine"));
	}

}

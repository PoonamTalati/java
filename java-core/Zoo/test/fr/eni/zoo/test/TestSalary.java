package fr.eni.zoo.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;

import fr.eni.zoo.bo.Addresse;
import fr.eni.zoo.bo.Caregiver;
import fr.eni.zoo.bo.Salary;
import fr.eni.zoo.bo.TypeAnimal;
import fr.eni.zoo.bo.Guardian;
public class TestSalary {
	
	@Test
	public void testDefaultConstructor()
	{
		Salary caregiver=new Caregiver();
		Salary guardian=new Guardian();
		
		assertNotNull(caregiver);
		assertNotNull(guardian);	
	}
	@Test
	public void testWithParamaterConstructor()
	{
		
		Addresse a1 = new Addresse(1, "9", " chemin des bois", "Nantes", "44000");
		Salary caregiver = new Caregiver(2, "Martin", "Julie", 1750, a1, TypeAnimal.SINGE);
		Salary guardian = new Guardian(3, "Dubois", "Sophie", 1600, a1, true);
	
		
		assertNotNull(caregiver);
		assertNotNull(guardian);
		
		assertAll(
				()->assertNotNull(caregiver.getId()),
				()->assertNotNull(caregiver.getSurname()),
				()->assertNotNull(caregiver.getFirstname()),
				()->assertNotNull(caregiver.getSalary()),
				()->assertNotNull(caregiver.getAddress()),
				()->assertNotNull(guardian.getId()),
				()->assertNotNull(guardian.getSurname()),
				()->assertNotNull(guardian.getFirstname()),
				()->assertNotNull(guardian.getSalary()),
				()->assertNotNull(guardian.getAddress())
				);	
	}
}

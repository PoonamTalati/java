package fr.eni.zoo.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.*;

import fr.eni.zoo.bo.Animal;

public class Testzoo {
		@Test
		public void testDefaultConstructor()
		{
			Animal a=new Animal();
			assertNotNull(a);		
		}
		@Test
		public void testWithParamaterConstructor()
		{
			Animal a=new Animal(1,"toto",true,null);
			assertNotNull(a);
			assertAll(
					()->assertEquals(1,a.getId()),
					()->assertEquals("toto",a.getName()),
					()->assertEquals(true,a.isFemale()),
					()->assertEquals(null,a.getTypeanimal())
					);
		}
}

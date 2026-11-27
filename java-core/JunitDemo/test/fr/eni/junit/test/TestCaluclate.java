package fr.eni.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import fr.eni.junitdemo.Calculate.ArithematicCaluculator;

public class TestCaluclate {
 
	@Test
	public void testAddition()
	{
		System.out.println("Calling test method");	
		ArithematicCaluculator c1=new ArithematicCaluculator();
		int n1=20;
		int n2=30;
		int ans=c1.addition(n1, n2);
		assertEquals(50, ans,"Probmlem in Addition Code");
	}
	
}

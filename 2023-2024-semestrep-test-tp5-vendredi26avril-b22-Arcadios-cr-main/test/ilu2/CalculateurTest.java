package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateurTest {
	
	Calculateur calculateur = new Calculateur();
	
	@Test
	void test1() {
		assertEquals("42",calculateur.ajoute("42"));
		assertEquals("0",calculateur.ajoute("0"));
		assertEquals("555",calculateur.ajoute("555"));
	}
	
	@Test
	void test2() {
		assertEquals("0",calculateur.ajoute(""));
		assertEquals("0",calculateur.ajoute("0"));
	}
	
	@Test
	void test3() {
		assertEquals("3",calculateur.ajoute("1,2"));
		assertEquals("0",calculateur.ajoute("0,0"));
		assertEquals("50",calculateur.ajoute("30,20"));
	}
	
	@Test
	void test4() {
		assertEquals("6",calculateur.ajoute("1,2,3"));
		assertEquals("10",calculateur.ajoute("1,2,4,1,1,1"));
		assertEquals("102",calculateur.ajoute("100,0,2"));
	}
	
	@Test
	void test5() {
		assertEquals("3",calculateur.ajoute("1,1000,2000,2"));
		assertEquals("1",calculateur.ajoute("1000,1,2000"));
		assertEquals("0",calculateur.ajoute("1000,5000,2000,3000"));
		assertEquals("1001",calculateur.ajoute("1000,1,2000,1,999,2000"));
	}
	
	@Test
	void test6() {
		assertEquals("6",calculateur.ajoute("1, 2, 3"));
		assertEquals("6",calculateur.ajoute("1 , 2 , 3 "));
		assertEquals("15",calculateur.ajoute("1, 2, 3,4,5 "));
	}
	
	@Test
	void test7() {
		assertEquals("erreur",calculateur.ajoute("-666"));
		assertEquals("erreur",calculateur.ajoute("7,-5"));
		assertEquals("erreur",calculateur.ajoute("-7,5"));
		assertEquals("erreur",calculateur.ajoute("7,-1"));
	}
	
	@Test
	void test8() {
		assertEquals("erreur",calculateur.ajoute("1, 2, 3, "));
		assertEquals("erreur",calculateur.ajoute("1, ,2"));
		assertEquals("erreur",calculateur.ajoute("1, "));
		assertEquals("erreur",calculateur.ajoute(" ,"));
	}
	
	@Test
	void test9() {
		assertEquals("6",calculateur.ajoute("1\n2, 3"));
		assertEquals("7",calculateur.ajoute("1\n2, 3\n1"));
		assertEquals("erreur",calculateur.ajoute(" \n"));
		assertEquals("erreur",calculateur.ajoute("1\n2, 3\n-55"));
	}
}

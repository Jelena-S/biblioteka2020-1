package biblioteka;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KnjigaTest {

	private Autor a;	
	private Knjiga k;
	
	@Before
	public void setUp() throws Exception {
		a = new Autor();
		a.setIme("Pera");
		a.setPrezime("Peric");
		
		k = new Knjiga();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
		k = null;
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetNaslovNull() {
		k.setNaslov(null);
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetNaslovPrazanString() {
		k.setNaslov("");
	}
	
	@Test 
	public void testSetNaslov() {
		k.setNaslov("Knjiga 1");
		
		assertEquals("Knjiga 1", k.getNaslov());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIsbnNull() {
		k.setIsbn(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIsbnDuzinaManjaOd8() {
		k.setIsbn("1234567");
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIsbnDuzinaOd8do13() {
		k.setIsbn("123456789");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIsbnDuzinaOd8do132() {
		k.setIsbn("123456789101");
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetIsbnDuzinaVecaOd13() {
		k.setIsbn("12345678910111");
	}
	
	@Test
	public void testSetIsbnDuzina8() {
		k.setIsbn("12345678");
	}
	
	@Test
	public void testSetIsbnDuzina13() {
		k.setIsbn("1234567891011");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetAutoriNull() {
		k.setAutori(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetAutoriPraznaLista() {
		k.setAutori(new LinkedList<Autor>());
	}
	
	@Test
	public void testSetAutori() {
		LinkedList<Autor> autori = new LinkedList<Autor>();
		
		autori.add(a);
		
		k.setAutori(autori);
		
		assertEquals(autori, k.getAutori());
	}

	@Test
	public void testSetIzdavac() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetIzdanje() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

}

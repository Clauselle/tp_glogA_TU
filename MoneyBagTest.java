package fr.emse.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyBagTest {

	@Before
	public void setUp() {
		var f12CHF = new Money(12, "CHF");
		var f14CHF = new Money(14, "CHF");
		var f7USD = new Money(7, "USD");
		var f21USD = new Money(21, "USD");
		var fMB1 = new MoneyBag(f12CHF, f7USD);
		var fMB2 = new MoneyBag(f14CHF, f21USD);

	}
	
	@Test
	public void testBagEquals() {
		assertTrue(!fMB1.equals(null));
		assertEquals(fMB1, fMB1);
		assertTrue(!fMB1.equals(f12CHF));
		assertTrue(!f12CHF.equals(fMB1));
		assertTrue(!fMB1.equals(fMB));
	}
	
	@Test
	public void testMixedSimpleAdd() {
	// [12 CHF] + [7 USD] == {[12 CHF][7 USD]}
	Money bag[] = { f12CHF, f7USD };
	MoneyBag expected = new MoneyBag(bag);
	assertEquals(expected, f12CHF.add(f7USD));
	}

}
package tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankTest {

	Bank c;

	@Before
	public void init() {
		c = new Bank();
	}

	@Test
	public void testcreateAccount() {
		int result = c.createAccount(0, 0, "Suraj", "Saving", "Active");
		assertEquals(1, result);
	}

	@Test
	public void testCreateAccountcurrent() {
		int result = c.createAccount(1, 0, "Suraj", "Current", "Active");
		assertEquals(1, result);
	}

	@Test
	public void testdeactivateAccount() {
		int result = c.deactivateAccount(0);
		assertEquals(0, result);
	}

	@Test
	public void testactivateAccount() {
		int result = c.activateAccount(0);
		assertEquals(0, result);
	}

	@Test
	public void testactivateAccount2() {
		int result = c.activateAccount(3);
		assertEquals(0, result);
	}

	@Test
	public void testdeactivateAccount2() {
		int result = c.deactivateAccount(2);
		assertEquals(0, result);
	}

}

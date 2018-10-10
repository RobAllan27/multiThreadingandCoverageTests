package multiThreadingTestCases;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.anarsoft.vmlens.concurrent.junit.ConcurrentTestRunner;
import com.anarsoft.vmlens.concurrent.junit.ThreadCount;

import multiThreadingCases.BankAccountCheck;

@RunWith(ConcurrentTestRunner.class)
public class BankAccountCheckTest {

	private BankAccountCheck bankAccount = new BankAccountCheck();
	private final static int THREAD_COUNT = 8;
	
	@Before
	public void testInitialize() {
		bankAccount.createIntialDeposit(3);
	}

	@Test
	@ThreadCount(THREAD_COUNT)
	public void testAddOneUnit() {
		assertEquals(bankAccount.addOneUnit(),1);
	}

	@Test
	@ThreadCount(THREAD_COUNT)
	public void testAddThreeUnit() {
		assertEquals(bankAccount.addThreeUnit(),3);
	}

	@Test
	@ThreadCount(THREAD_COUNT)
	public void testRemoveOneUnit() {
		
		assertEquals(bankAccount.removeOneUnit(),-1);
	}

	@After
	public void testGetAccountValue() {
		System.out.println("Bank account " + bankAccount.getAccountValue());
		assertEquals(bankAccount.getAccountValue(),27);
	}
}

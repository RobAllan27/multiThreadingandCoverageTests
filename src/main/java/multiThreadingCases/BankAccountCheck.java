package multiThreadingCases;

// we will use this as this counter can be updated atomically - it is thread safe. 

import java.util.concurrent.atomic.AtomicInteger;

public class BankAccountCheck {
	private final AtomicInteger account = new AtomicInteger();
	
	public synchronized void createIntialDeposit(int number){
		account.set(number);
	}
	
	public synchronized int addOneUnit() {
		System.out.println("prior to adding 1 = " + account.get());
		account.incrementAndGet();
		System.out.println("after adding 1 = " + account.get());
		System.out.println("Adding one unit");
		return 1;
	}
	
	public synchronized int addThreeUnit() {
		System.out.println("prior to adding 3 = " + account.get());
		account.addAndGet(3);
		System.out.println("after adding  3  = " + account.get());
		System.out.println("Adding three units");
		return 3;
	}
	
	public synchronized int removeOneUnit() {
		System.out.println("prior to decrementing = " + account.get());
		account.decrementAndGet();
		System.out.println("after decrementing = " + account.get());
		System.out.println("Removing one unit");
		return -1;
	}
	
	public int getAccountValue() {
		return account.get();
	}
}
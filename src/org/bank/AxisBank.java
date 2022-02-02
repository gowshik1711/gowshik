package org.bank;

public class AxisBank extends BankINFO {
	public void deposit(int Amount) {
		System.out.println("Amount deposited in 2021:" + Amount);
		super.deposit(75000);
	}
	private void bb() {
		System.out.println("bank");

	}

	public static void main(String[] args) {
		AxisBank A = new AxisBank();
		A.deposit(150000);
	}

}

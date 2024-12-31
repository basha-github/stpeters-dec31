package edu.peters.session;

public class SBIBank implements Bank{
	
	int balance;
	
	

	public SBIBank(int balance) {
		super();
		this.balance = balance;
	}



	@Override
	public void withDraw(int amt)  {
	try {
		if(amt > this.balance) {
			System.out.println("amt "+amt+" trying to withdraw...");
			throw new InSufficientBalanceException("Balance is not enough");
			
		}
		else {
			System.out.println("successfully withdrawn amount...."+amt);
			this.balance = this.balance - amt;
		}
	}catch(InSufficientBalanceException e) {
		System.out.println("error occurred during with draw...");
		e.printStackTrace();
	}
		
	}
	

}

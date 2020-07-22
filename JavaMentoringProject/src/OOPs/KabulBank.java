package OOPs;

public class KabulBank implements USBank, UKBank {
	

	@Override
	public void homeLoan() {
		System.out.println("Kabul Bank homeloan");
		
	}

	@Override
	public void carloan() {
		System.out.println("Kabul bank car loan");
		
	}

	@Override
	public void credit() {
		System.out.println("Kabul bank dredit card");
		
	}

	@Override
	public void debit() {
		System.out.println("Kabul bank debit card");
		
	}
	
	public void moneyTransfer() {
		System.out.println("Kabul bank money transfer service");
	}
	public void insurance() {
		System.out.println("Kabul bank insurance services");
	}
	
}

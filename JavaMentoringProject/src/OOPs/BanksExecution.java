package OOPs;

public class BanksExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KabulBank KB=new KabulBank();
		KB.credit();
		KB.credit();
		
		KB.homeLoan();
		KB.carloan();
		
		KB.moneyTransfer();
		KB.insurance();
		
		System.out.println(UKBank.fee);
		
		

	}

}

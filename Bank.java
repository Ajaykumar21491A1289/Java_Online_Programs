package online;
class Account{
	int accountno;
	String acttype;
	int actbalance;
	public  void setAccountDetails(int accountno,String acttype,int actbalance) {
		this.accountno=accountno;
		this.acttype=acttype;
		this.actbalance=actbalance;
	}
	public void withdraw()
	{
		actbalance = actbalance-1000;
	}
	public void deposit()
	{
		actbalance=actbalance+1000;
	}
	public void disAccountDetails() {
		System.out.println("Account number is "+ accountno);
		System.out.println("Account type is " + acttype);
		System.out.println("Account Balance is "+actbalance);
	}
}
public class Bank {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.setAccountDetails(121,"Savings", 2000);
		ac.withdraw();
		ac.toString();
		ac.deposit();
		ac.disAccountDetails();
		
	}

}

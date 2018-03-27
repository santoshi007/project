package pro;

public class BankAccount {

	int	 accountnumber;
	String customername;
	int balance;

	 //define operations such as deposit, withdraw and get balance.
	
	public BankAccount(int Accountnumber, String Customername, int Balance) {
		this.accountnumber = Accountnumber;
		this.customername = Customername;
		this.balance = Balance;
	}
	
	int amount;
	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
	//	int deposit;
		this.balance = balance;
	}	
		
	
	public void setDeposit(int amount,BankAccount account){
		int currentbalance=account.getBalance();
		currentbalance=currentbalance+amount;
		account.setBalance(currentbalance);
		//return currentbalance;
	}
	
	public void Deposit(int amount){
		System.out.println("The original balance amount in the acoount of "+this.customername + " was "+this.balance);
		int currentbalance=this.getBalance();
		currentbalance=currentbalance+amount;
		this.setBalance(currentbalance);
		System.out.println("The balance after depositing is "+this.getBalance());
		//return currentbalance;
	}
	
	public void setWithdraw(int amount,BankAccount account){
		int currentbalance=account.getBalance();
		if(currentbalance>1000)
		{
		currentbalance=currentbalance-amount;
		account.setBalance(currentbalance);
		}
		else
		{
			System.out.println("Not sufficient balance in account to withdraw");
			System.out.println("Sorry visit again");
		}
	}
	
	public void Withdraw(int amount){
		System.out.println("The original balance amount in the acoount of "+this.customername + " was "+this.balance);
		int currentbalance=this.getBalance();
		if(currentbalance>1000)
		{
		currentbalance=currentbalance-amount;
		this.setBalance(currentbalance);
		System.out.println("The balance after withdrawing is "+this.getBalance());
		}
		else
		{
			System.out.println("Not sufficient balance in account to withdraw");
			System.out.println("Sorry visit again");
		}
	}
	
	


	
	public void Transfer(BankAccount sender,BankAccount receiver,int value){
		int senderbalance=sender.getBalance();
		int receiverbalance=receiver.getBalance();
		if(senderbalance>1000)
		{
		senderbalance=senderbalance-value;
		int gst=value*5/100;
		receiverbalance=receiverbalance+value;
		receiverbalance=receiverbalance-gst;
		sender.setBalance(senderbalance);
		receiver.setBalance(receiverbalance);
		}
		else
		{
			System.out.println("Not sufficient balance in account to withdraw");
			System.out.println("Sorry visit again");
			
		}
	}
	
}
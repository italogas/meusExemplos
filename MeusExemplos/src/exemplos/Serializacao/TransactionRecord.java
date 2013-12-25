package exemplos.Serializacao;

public class TransactionRecord {

	private int account;
	private double amount;
	
	public TransactionRecord() {
		this(0, 0.0);
	}

	public TransactionRecord(int acct, double amot) {
		setAccount(acct);
		setAmount(amot);
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}

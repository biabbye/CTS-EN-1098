package ro.ase.cts.g1098.assignment1;

public class Account {
	static final float BROKER_FEE = 0.125f;
	
	AccountType accountType;
	AccountMonthlyRate monthlyRate;

	
	@Override
	public String toString() {
		return "Loan: "+monthlyRate.LOAN_VALUE+"; rate: "+monthlyRate.RATE+"; days active:"+accountType.getActiveDays()+"; Type: "+accountType+";";
	}


	public void print() {
		
		System.out.println("This is an account");
	}
	
	public double computeFinalFee(AccountType accountType, AccountMonthlyRate monthlyRate) {
		double feeValue=0.0;
		
		if(accountType == AccountType.PREMIUM || accountType == AccountType.SUPER_PREMIUM) {
			
			feeValue += BROKER_FEE * (monthlyRate.getLoan() * Math.pow(monthlyRate.RATE,accountType.getActiveDays()/365)) - monthlyRate.getLoan();

		}
		return feeValue;
	}
	
	public static double calculate(Account[] accounts)
	{
		double totalFee = 0.0;
		Account account;
		for	(int i=0;i<accounts.length;i++) {
			account = accounts[i];
			totalFee += account.computeFinalFee(account.accountType, account.monthlyRate);
		}
		return totalFee;
	
	}

	public Account(AccountMonthlyRate monthlyRate, AccountType account_Type) throws MissingMonthlyRateException {
		if(monthlyRate == null)
			throw new MissingMonthlyRateException();
		else
		{
			this.monthlyRate = monthlyRate;
		}
		this.accountType = account_Type;
	}
	
	
}

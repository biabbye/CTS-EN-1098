package ro.ase.cts.g1098.assignment1;

public class AccountMonthlyRate implements MonthlyRateInterface {

	
	public double LOAN_VALUE;
	public double RATE;
	
	public double getRate() {
		System.out.println("The rate is "+RATE);
		return this.RATE;
	}
	
	public double getLoan() {
		System.out.println("The rate is "+RATE);
		return this.RATE;
	}
	
	
	public void setLoan(double value) throws Exception {
		if(value<0)
			throw new IllegalValueException();
		else
		{
			LOAN_VALUE = value;
		}
		
	}
	
	@Override
	public double getAccountMonthlyRate() {
		return LOAN_VALUE*RATE;
	}

	public AccountMonthlyRate(double lOAN_VALUE, double RATE) {
		super();
		this.LOAN_VALUE = lOAN_VALUE;
		this.RATE = RATE;
	}
	
	
	
	
	
}

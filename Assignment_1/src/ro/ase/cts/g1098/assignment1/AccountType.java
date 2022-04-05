package ro.ase.cts.g1098.assignment1;

public enum AccountType {
	STANDARD(1, 0), BUDGET(2, 1), PREMIUM(3, 2), SUPER_PREMIUM(4, 3);

	
	int id;
	int activeDays;
		
	private AccountType(int id, int activeDays) {
		this.id = id;
		this.activeDays = activeDays;
	}
	
	int getActiveDays () {
		return this.activeDays;
	}
	
}

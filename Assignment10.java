
public class Assignment10 {
	
	public void calculateInterest(double amount, int timeInYears, double interest) {
		
		interest = (amount * timeInYears * interest) / 100;
		amount = amount + interest;
		
		System.out.println("Simple interest: "+ interest + " - Final amount: "+ amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment10 amount = new Assignment10();
		
		amount.calculateInterest(50000,5,6.8);

	}

}
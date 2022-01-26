
public class Assignment9 {
	
	public void calculateSalaryAfterTax(float salary, float taxRate) {
		
		salary = salary - (salary*(taxRate/100));
		
		System.out.println("Salary after tax: "+ salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment9 salary = new Assignment9();
		
		salary.calculateSalaryAfterTax(85000,20);

	}

}


public class Assignment8 {
	
	public void calculateBillAmount(float amountOfPizza, float priceOfPizza, float discount) {
		
		priceOfPizza = (amountOfPizza*priceOfPizza) - ((amountOfPizza*priceOfPizza)*(discount/100));
		System.out.println("Final bill amount: "+ priceOfPizza);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment8 pizzaBill = new Assignment8();
		
		pizzaBill.calculateBillAmount(2,399,20);
		

	}

}

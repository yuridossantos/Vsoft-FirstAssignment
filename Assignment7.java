
public class Assignment7 {
	
	public void calculatePlanCost(float cost, float rate) {
		
		cost = cost + (cost*(rate/100));
		
		System.out.println("Final plan cost: "+ cost);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment7 costOfPlan = new Assignment7();
		
		costOfPlan.calculatePlanCost(699,18);

	}

}


public class Assignment6 {
	public void swapFourNumbers(int a, int b, int c, int d){
		
		//a = b, b = c, c = d, d = a 
		int temp =0;
		temp =a;		
		
		a = b;
		b = c;
		c = d;
		d = temp;
		
		System.out.println("After swapping: num1 = "+a+ " num2 = "+b+" num3 = "+c+" num4 = "+d);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment6 swap4 = new Assignment6();
		
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		System.out.println("Before swapping: num1 = "+num1+ " num2 = "+num2+" num3 = "+num3+ " num4 = "+num4);
		
		swap4.swapFourNumbers(num1,num2,num3,num4);
		
		
	}
}

public class Assignment3 {
	
	public void swapThreeNumbers(int a, int b, int c){
		int temp =0;		
		
		temp =b;
		// b has value of a
		b=a;
		
		// a has value of c
		a =c;
		
		// c has value of b
		c=temp;
				
		System.out.println("After swapping: num1 = "+a+ " num2 = "+b+" num3 = "+c);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3 swap3 = new Assignment3();
		
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		System.out.println("Before swapping: num1 = "+num1+ " num2 = "+num2+" num3 = "+num3);
		
		swap3.swapThreeNumbers(num1,num2,num3);
		
		
	}

}

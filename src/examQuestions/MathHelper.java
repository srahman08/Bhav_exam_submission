package examQuestions;

public class MathHelper {
static int a = 16;
static int b =8;
int sum, difference, product, quotient;
	public static void main(String[] args) {
		
		int[] values ={9,4,6,7,2,10,18};
	
		MathHelper mh=new MathHelper();
		System.out.println("The sum of the numbers is: " + mh.Add( 16, 8));
		System.out.println("The difference between the numbers is: " +mh.Subtr(16, 8));
		System.out.println("The quotient of the numbers is: " +mh.divide(a, b));
		System.out.println("The product of the numbers is: " +mh.Multiple(a, b));
		System.out.println("The maximum value in the array is: " +mh.GetMax(values));
	}
		public int Add(int firstOperand, int secondOperand) {
			
		return (sum =firstOperand + secondOperand);

	}
		public int Subtr(int firstOperand, int secondOperand) {
			return (difference=firstOperand - secondOperand);
		}
		public int divide(int firstOperand, int secondOperand) {
			if(secondOperand!=0) {
				
			}
			return (quotient=firstOperand /secondOperand);			
		}
		public int Multiple(int firstOperand, int secondOperand) {
			int secOperand=b;
			return (product=firstOperand*secOperand);
		}
		
		public int GetMax(int [] values) {
			int max=values[0];
			System.out.println("Length of the values array is: " + values.length);
			for (int i=0; i<values.length; i++) {
			if (values[i]>max){
				max=values[i];
			}

		}
			return max;
		}
		
}

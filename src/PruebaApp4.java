
public class PruebaApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 1;
		int result = 0;
		
		System.out.println("Valor de N = "+N);
		int []arrNum = {77, -3, 2};
		String []arrString = {"Incremento de N en 77 = ", "Decremento de N en 33 = ", "Doble de N = "};
		
		for (int i = 0; i<3; i++) {
			if(i < 2) {
				N =+ (N+arrNum[i]);
				result =+ N;
				System.out.println(arrString[i]+result);
			}	
		}
		System.out.println(arrString[2]+ result*arrNum[2]);
		
		
		

	}

}


public class PruebaApp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 500;
		int B = 1024;
		int C = -13;
		int D = 4;
		/*
		 * pasamos valores por referencia la nueva variable así 
		 * pues apunta al espacio de memoria física de la varaiable asignada
		 * */
		
		
		System.out.println("Valor de A = " + A + "\nValor de B = " + B + "\nValor de C = " + C + "\nValor de D = " + D);
		B = C;
		System.out.println("Valor de B después de pasarle el valor de C = "+B );
		C = A;
		System.out.println("Valor de C después de pasarle el valor de A = "+C );
		A = D;
		System.out.println("Valor de A después de pasarle el valor de D = "+A );
		
		System.out.println("Valor de D después de pasarle el valor de B = "+D );
		
		
		

	}

}

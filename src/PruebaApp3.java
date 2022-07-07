
public class PruebaApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X = 7;
		int Y = 4;
		double N = 3.12;
		double M = 1.08;		
		int suma = X + Y;
		int resta = X - Y;
		int division = X / Y;
		int producto = X * Y;
		int modulo = X % Y;
		
		
		
		System.out.println("Valor de X = "+X+"\nValor de Y = "+Y+"\nValor de N = "+N+"\nValor de M = "+M+"\nValor de M = "+M+"\n");	
		System.out.println("X + Y = "+suma+"\nX - Y = "+resta+"\nX / Y = "+division+"\nX * Y = "+producto+"\nX % Y = "+modulo+"\n");	
		System.out.println("X + N = "+(X+N)+"\nX / M = "+(X/M)+"\nX + N = "+(X%M)+"\n");
		System.out.println("Doble de X = "+(X*2)+"\nDoble de Y = "+(Y*2)+"\nDoble de N = "+(N*2)+"\nDoble de M = "+(M*2)+"\nDoble de M = "+(M*2)+"\n");
		System.out.println("Suma de todas las variables = "+(X+Y+N+M));
		System.out.println("Producto de todas las variables = "+(X*Y*N*M));
		
		
	}

}

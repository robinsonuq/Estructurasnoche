package recursividad;

public class Matruska {

	public static void main(String[] args) {
		int n = 5;
		imprimir_matruska(n);
		System.out.println();
	}

	private static void imprimir_matruska(int n) {
		// casos base
		if(n == 0) {
			System.out.println("Termino");
		}else {
			System.out.println("Abriendo Matruska :"+n);
			//caso recursivo
			imprimir_matruska(n - 1);
			System.out.println("Cerrando Matruska :"+n);
		}
	}
}

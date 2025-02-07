package arreglo;

public class Arreglo {

	public static void main(String[] args) {
		
		int arreglo [] = {1,2,3,4,5,6,7};
		sumarArreglo(arreglo, 0);
	}
	private static int sumarArreglo(int[] arreglo, int i) {

		 if(i == arreglo.length - 1) {
			 return arreglo[i];
		 }else {
			 return arreglo[i]+sumarArreglo(arreglo, i  + 1);
		 }
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



















	private static void imprimirArreglo(int[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			int j = arreglo[i];
			System.out.println(j);
		}
	}
	
	private static void imprimirArreglo3(int[] arreglo, int i) {
		//caso base
		if(i == 0) {
			System.out.println("Valor "+arreglo[i]);
		}else {
			System.out.println("Valor "+arreglo[i]);
			imprimirArreglo(arreglo,i - 1);
		}
	}
	
	private static void imprimirArreglo(int[] arreglo, int i) {
		//caso base
		if(i == arreglo.length -1 ) {
			System.out.println("Valor "+arreglo[i]);
		}else {
			System.out.println("Valor "+arreglo[i]);
			imprimirArreglo(arreglo,i + 1);
		}
	}
	
	private static void imprimirArreglo2(int[] arreglo, int i) {
		//caso base
		if(i < arreglo.length ) {
			
			imprimirArreglo(arreglo, i + 1);
			System.out.println("Valor "+arreglo[i]);
		}
	}
	
	
}

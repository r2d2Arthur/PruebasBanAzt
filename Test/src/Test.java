import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10]; 
        int digito = 0;
        System.out.println("Lectura de los elementos del array: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("numeros[" + (i + 1) + "]= ");
            digito = sc.nextInt();
            numeros[i]= digito;
			if(i != 0 ) {
				if (ExisteCliente(digito,numeros,i)) {
			        System.out.println("Numero repetido en arreglo existente o no ordenado");
					break;
				}		  
			}
        }
        sc.close();
        Arrays.sort(numeros);
        System.out.println("Numero Minimo: " + numeros[0] + " Numero Máximo " + numeros[numeros.length - 1] );
        System.out.println("Diferencia entre Minimo y Máximo es: " + Math.abs (numeros[0] - numeros[numeros.length - 1]) + " y los números son: " );
        for (int i = numeros[0]; i < numeros[numeros.length - 1]; i++) {
        	System.out.println(i);
        }
	}
	public static boolean ExisteCliente(int digito, int[] numeros,int posicion)
	{
	   boolean existe = false;

	   for(int i = 0; i < numeros.length; i++)
	   {
		  if (posicion != i ) { 
		      if(numeros[i] == digito || digito < numeros[i] )
		      {
		         existe = true;
		         break;
		      }
		  }
	   }
	   return existe;
	}
	
}

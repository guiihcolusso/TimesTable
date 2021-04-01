import java.util.Scanner;

public class TimesTable {
	public static void main(String[] args) {
		
		int resultados, contador, numero;
		float i;
		
		java.util.Scanner scn = new Scanner(System.in);
		
		System.out.print("Digite o Numero Para a Tabuada : ");
		numero = (int) scn.nextFloat();
		
		scn.close();
		
		for (i = 0; i < 50; ++i) {
			System.out.println();
		}
		
		for (contador = 0; contador < 11; ++contador) {
			resultados = numero * contador;
		       System.out.println(numero + "x" + contador + "=" + resultados); 
			
		}

	}
	

}

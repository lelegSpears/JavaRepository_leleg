import java.util.Locale;
import java.util.Scanner;

public class Estruturas_Repetição {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		// Estrutura while
		System.out.print(" Escolha um numero de 0 a 10: ");
		int x = sc.nextInt();
		while (0 > x || x > 10) {
			System.out.print(" Escolha um numero de 0 a 10: ");
			x = sc.nextInt();
			sc.nextLine();
		}
		
		// Estrutura "for" com indice
		System.out.print(" Quantos numeros voce quer somar?: ");
		int escolha = sc.nextInt();	// Escolher quantos numeros
		int nf = 0;
		int pedido = escolha;
		for (int i=0; i<escolha; i++) {	// Inicio; Condição; Incremento;
			int faltam = escolha - i;	// Para saber quantos números faltam;
			System.out.printf(" Digite mais %d números: ", faltam);
			int escolha2 = sc.nextInt();	// Escolher os números para soma
			nf += escolha2;	// Resultado final da soma
		}
		sc.close();
		System.out.printf("Você decidiu somar %d números, que somados resultaram em %d.", pedido, nf);
}}

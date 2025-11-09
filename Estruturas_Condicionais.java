import java.util.Locale;
import java.util.Scanner;

public class Estruturas_Condicionais {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		System.out.print(" Digite sua nota da prova: ");
		Scanner sc = new Scanner(System.in);  // Cria Scanner
		Double NotaProva = sc.nextDouble();   // Pega a nota da Prova
		sc.nextLine();
		System.out.print(" Digite sua nota da redação: ");
		Double NotaRedacao = sc.nextDouble(); // Pega a nota da Redação
		sc.nextLine();
// if com &&
		if (NotaProva > 670.7 && NotaRedacao > 0) {  	 // Se a notaP for maior que 670.7 e a notaR for maior que 0
			System.out.printf(" Voce foi aceito\n"); 	 // Aprovado
		} else { // Se não
			System.out.printf(" Voce foi Reprovado\n");  // Reprovado
		}
		double NotaFinal = (NotaProva + NotaRedacao) / 2; 		// Calcula a média
		System.out.printf(" Sua média foi %.2f\n\n", NotaFinal); 	// Mostra

		System.out.print(" Digite sua forma de pagamento: ");
		String FormaPagamento = sc.next(); // Escolha a forma de pagamento(debito ou credito)
		sc.nextLine();
// if com ||
		if (FormaPagamento.equalsIgnoreCase("debito") || FormaPagamento.equalsIgnoreCase("credito")) { // Se for debito OU credito
			System.out.printf(" Pagamento recebido.\n"); // Recebido
		} else { 									  	 // Se não
			System.out.printf(" Pagamento recusado.\n"); // Recusado
		}
		
		
		String dia;
		System.out.printf(" Escolha um dia de 1 a 7 (Começando em domingo): ");
		int escolha = sc.nextInt();
		sc.close();	// Fechando o Scanner
// Switch		
		switch (escolha) {		// Switch para escolher invés de varios "else if"
			case 1:
				dia = "domingo";
				break;
			case 2:
				dia = "segunda";
				break;
			case 3:
				dia = "terça";
				break;
			case 4:
				dia = "quarta";
				break;
			case 5:
				dia = "quinta";
				break;
			case 6:
				dia = "sexta";
				break;
			case 7:
				dia = "sábado";
				break;
			default:	// Else para o Switch
				dia = "um valor inválido.";
				break;
			}
		System.out.printf(" Você escolheu %s.\n", dia);
	}
}


import java.util.Scanner;
public class Vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// Quantas palavras
		sc.nextLine();
		String[] vetorPalavras = new String[n];	// Criando vetor com numero N de palavras
		
		for(int i=0; i<n; i++) {	// Cria palavras até n
			vetorPalavras[i] = sc.next();	// Quais palavras
			sc.nextLine();
		}
		System.out.printf("Você escolheu digitar %d Palavras, as palavras foram %s.\n", n, String.join(", ", vetorPalavras));
		sc.close();
		}}

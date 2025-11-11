import java.util.Scanner;
import entities.Pessoa;

public class ClasseBasica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa x, y;	// Declara Classe Pessoa x e y
		x = new Pessoa();	// Inicializa a pessoa x
		y = new Pessoa();	// Inicializa a pessoa y
		
		x.nome = sc.nextLine();
		x.idade = sc.nextInt();
		sc.nextLine();
		x.sexo = sc.nextLine();
		
		y.nome = sc.nextLine();
		y.idade = sc.nextInt();
		sc.nextLine();
		y.sexo = sc.nextLine();
		
		sc.close();
		
		System.out.printf(" Pessoa x = %s, %d, %s\n", x.nome, x.idade, x.sexo);
		System.out.printf(" Pessoa x = %s, %d, %s", y.nome, y.idade, y.sexo);
	}
}

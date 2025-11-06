import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String nome = "jao";
		byte idade = 50;
		double salario = 5.300;
		
		
		System.out.printf("%s tem %d anos e recebe %.2f de salario", nome, idade, salario);
	}

}

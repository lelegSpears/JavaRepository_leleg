
public class BoxinUnboxingWrapper {

	public static void main(String[] args) {
		
		int x = 20; // Valor primitivo, guardado no Stack
		Object obj = (int) x;	// Cria um Object(Classe padrao mais generica do java "wrapper") no Stack apontado para o 20 no Heap, dizendo que é int com (int) x; (Porem existe o autoboxing)
		
		System.out.println(obj);
		
		int y = 10;
		Integer obj2 = y; // "Ponteiro" referencial Integer(Classe padrão para numeros int) dentro do Stack, aponta para o 10 dentro do Heap.
		
		System.out.println(obj2);
		
		
		/* Referencias Descartaveis ficam no stack para dar referencia, e o heap guarda coisas que não podem sumir(Pelomenos não enquanto tiverem referencia),
		 * principalmente valores/informações principais, e se tirar a referencia que esta no stack o garbageCollector da um jeito no Heap sem referencia.*/
	}

}

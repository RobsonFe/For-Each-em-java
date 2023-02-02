
public class Programa {

	public static void main(String[] args) {
		
		String[] vetor = new String[] {"Maria", "Bob", "Alex" };
		// outra forma de fazer um vetor
		
		// laço do vetor 
		for (int i=0; i<vetor.length; i++) {
			System.out.println(vetor.length);
			
			System.out.println("--------------------------");
			
			// laço For Each
			
			for(String obj: vetor ) {
				System.out.println(obj);
			}
			// Esse laço pecorre todos os elementos do meu vetor chamando ele de "obj".
		}

	}

}

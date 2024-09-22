
public class ResultadoEscolar {
    public static void main(String[] args) {
        
        /* int nota = 6;

        //estrutura condicional composta (dois fluxos)

        if (nota >= 7) 
        System.out.println("Aprovado");
        else 
        System.out.println("Reprovado");
        */

        // estrutura condicional encadeada
        int nota = 6;

        if (nota >= 7) 
        System.out.println("Aprovado");
        // poderiam ter várias dessas com propostas diferentes
        else if (nota >= 5 && nota < 7)
        System.out.println("Prova de Recuperação");

        else 
        System.out.println("Reprovado");

        /* estrutura condicional ternária
        // Cenário 1
public class ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
	}
}
    estrutura condicional ternária encadeada
// Cenário 2
public class ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}
} */
    }
}

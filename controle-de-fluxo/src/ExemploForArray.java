public class ExemploForArray {
    public static void main(String[] args) {
        
        // OBS : Array é um conjunto de elementos de um tipo correspondente
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
    
        // os indices sempre se iniciam em 0
        for (int x=0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    
    }
}



package estruturas.excepcionais;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        //exemplo de try catch
        // o try irá analisar todo o código
        try {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        
            
        

        //supondo q nós coloquemos quinze por extenso ao invez do numero
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        //supondo q nós coloquemos vírgula na altura ao invez de ponto
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();
        //caso executarmos assim dara erro na idade ou na altura, e ira parar todo o código

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close(); 
        } 
        // e caso o try veja algum erro ele soltára a mensagem a seguir
        catch(Exception e) {
            System.out.println("Por favor, digite sua idade por números e utilize ponto em altura ao invez de vírgula");
        }
    }
}

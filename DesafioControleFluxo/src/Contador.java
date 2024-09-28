import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = scan.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = scan.nextInt();

        try {   
            contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException exception){
            System.out.println("O Parametro 1 deve ser menor que o parametro 2");
        }
    }
        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
            if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException ();
            }

            int contagem = parametroDois - parametroUm;
            for (int contador = 0 ; contador <= contagem; contador ++)
            System.out.println("Imprimindo o número: " + contador);
     }
 }



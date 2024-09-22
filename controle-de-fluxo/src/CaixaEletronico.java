
public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
                
        
        double saldo = 25.0;
        // caso o valor solicitado seja maior q saldo, a estrutura n será executada
        double valorSolicitado = 17.0;

        //estrutura condicional simples (um fluxo)
        if (valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;


        System.out.println(saldo);

        /* estrutura condicional composta
          
          double saldo = 25.0;
          double valorSolicitado = 17.0;
          
          caso a estrutura tenha mais de uma função é necessário o uso de {}.
          
          if (valorSolicitado < saldo) {
        saldo = saldo - valorSolicitado;
        System.out.println("Novo saldo" + saldo)}

        else
        System.out.println("Saldo insuficiente");
         
         */

    }
}

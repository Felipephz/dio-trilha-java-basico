package candidatura;

//import da utilidade de valores aleatórios
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
            String candidatos [] = {"FELIPE","ARTUR","MAQUENA","BICHOLAS","ISAAC"};
            for (String candidato : candidatos)
            entrandoEmContato(candidato);
    }   
        static void entrandoEmContato (String candidato) {
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu=false;
            do {
                atendeu=atender();
                continuarTentando =!atendeu;
                if (continuarTentando)
                    tentativasRealizadas++;
                else
                    System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
            while (continuarTentando && tentativasRealizadas<3); {
                if (atendeu)
                System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
                else
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO DE TENTATIVAS " + tentativasRealizadas );
            }
        }
        //metodo auxiliar
        static boolean  atender () {
            return new Random().nextInt(3)==1;
        }
        static void imprimirCandidatos () {
            String candidatos [] = {"FELIPE","ARTUR","MAQUENA","BICHOLAS","ISAAC"};

            for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
            }
            //metodo abreviado com for each
            for (String candidato : candidatos)
            System.out.println("O candidato escolhido é: " + candidato);
        }
        static void selecaoCandidatos () {
            String candidatos [] = {"FELIPE","ARTUR","MAQUENA","BICHOLAS","ISAAC","ANTONY","TERRY","PEDRO","MATHEUS","ELIAS","DOUGLAS"};
            int candidatosSelecionados = 0;
            int candidatosAtual = 0;
            double salarioBase = 2000.0;

            // o uso do && foi preciso para limitar a quantidade de candidatos atuais para os da nossa lista, para não dar erro
            while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
                //pega um candidato da nossa string candidatos e o coloca em candidatosAtual
                String candidato = candidatos [candidatosAtual];
                double salarioPretendido = valorPretendido();
                System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
                
                if (salarioBase > salarioPretendido) {
                    System.out.println("O candidato " + candidato + " foi selecionado para a vaga ");
                    candidatosSelecionados ++;
                }
                else {
                    System.out.println("O candidato " + candidato + " não foi selecionado ");
                }
                candidatosAtual ++;
            }
        }
        //metodo para nos dar valores aleátorios
        static double valorPretendido() {
            // utilidade para gerar valores aleatorios de 1800 até 2200 para nós
            return ThreadLocalRandom.current().nextDouble(1800, 2200);
        }
        static void analisarCandidatos (double salarioPretendido) {

            double salarioBase = 2000.0;

            if (salarioBase > salarioPretendido)
            System.out.println("LIGAR PARA CANDIDATO");
            else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
            else 
            System.out.println("AGUARDANDO A RESPOSTA DOS DEMAIS CANDIDATOS");
        }
}

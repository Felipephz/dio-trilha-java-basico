package estruturas.repeticao;
public class ContadorNegativos {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 10; numero ++){
            // o continue para o fluxo de somente uma interação, como por exemplo este exercicio
            // sempre que o numero for algum positivo o continue ignora esse numero e continua a adcionar
            // no caso mantendo apenas os numeros negativos
            if (numero == 2)
            continue;
            else if (numero == 4)
            continue;
            else if (numero == 6)
            continue;
            else if (numero == 8)
            continue;
            else if (numero == 10)
            continue;
            
            System.out.println(numero);
            // o break é o oposto disso, porque ao invez de continuar, ele iria parar todo o fluxo
            // como por exemplo:
            /*
            for (int numero = 1; numero <= 10; numero ++){
            if (numero == 3)
            break;
            System.out.println(numero);
            //vai retornar 1 e 2, pois o break parou todo o fluxo
            }

            */
        }
    }
}

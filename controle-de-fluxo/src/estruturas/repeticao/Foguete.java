package estruturas.repeticao;

public class Foguete {
    public static void main(String[] args) {
        int contagem = 10;
        System.out.println("O foguete ira decolar em: ");

        while (contagem > 0){
            contagem --;
            System.out.println(contagem);
        }
        System.out.println("Foguete decolando!!!");
    }
}

public class SistemaDeCadastro {
    public static void main(String[] args) {
        //pegamos o método Pessoa e trouxemos para cá, com suas respectivas informações
        Pessoa marcos = new Pessoa("901", "marcos");
        
        //setamos o endereço de marcos
        marcos.setEndereço("Jandira");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf() + " - " + marcos.getEndereço());
    }
}

public class Pessoa {

        private String nome;
        private String cpf;
        private String endereço;

        //metodo construtor para podermos colocar as respectivas informações do usuario
        public Pessoa (String cpf, String nome) {
            this.cpf = cpf;
            this.nome = nome;
        }
        //getters...
        public String getNome() {
            return nome;
        }
        public String getCpf () {
            return cpf;
        }
        public String getEndereço () {
            return endereço;
        }
        //setters...
        public void setEndereço (String newEndereço) {
            endereço = newEndereço;
        }
    }


public class Item {
    String nome;
    double preco;
    int quantidade;

    public Item(String nome, double preço, int quantidade) {
        this.nome = nome;
        this.preco = preço;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    @Override
    public String toString() {
        return String.format("%s - R$ %.2f (Quantidade: %d)", nome, preco, quantidade);
    }
}

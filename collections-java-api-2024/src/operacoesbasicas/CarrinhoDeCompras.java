package operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
        List<Item>ItemList;

    public CarrinhoDeCompras() {
        this.ItemList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade) {
        ItemList.add(new Item(nome, preco, quantidade));
    }
    public void removerItem (String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : ItemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        ItemList.removeAll(itensParaRemover);
    }
    public double calcularTotal () {
        double total = 0.0;
        for (Item item : ItemList) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }
    public void exibirItens() {
        for (Item item : ItemList) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("banana", 1.50, 3);
        carrinhoDeCompras.adicionarItem("maçã", 1.50, 3);
        System.out.println("os itens são :");
        carrinhoDeCompras.exibirItens();
    }
}


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        produtos.add(new Produto("Notebook Dell G15", 4500.99,15));
        produtos.add(new Produto("Teclado", 95.99, 3));
        produtos.add(new Produto("Mouse", 105.99, 10));

        System.out.println("Lista original de Produtos:");
        for(Produto p : produtos){
            System.out.println(p);
        }

        Collections.sort(produtos, new Comparator<Produto>() {
            @Override
            public int compare(Produto p1, Produto p2) {
                return Double.compare(p1.getPreco(), p2.getPreco());
            }
        });

        System.out.println("\nLista de produtos ordenada pelo preço:");
        for (Produto p : produtos) {
            System.out.println(p);
        }

    }
}
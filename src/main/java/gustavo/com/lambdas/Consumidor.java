package gustavo.com.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.println(p.nome + " Preço: " + p.preco);

        Produto p1 = new Produto("caneta", 12.34, 0.09);
        imprimir.accept(p1);

        Produto p2 = new Produto("caneta", 12.34, 0.09);
        Produto p3 = new Produto("caneta", 12.34, 0.09);
        Produto p4 = new Produto("caneta", 12.34, 0.09);
        Produto p5 = new Produto("caneta", 12.34, 0.09);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}

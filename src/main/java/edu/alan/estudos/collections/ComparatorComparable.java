package edu.alan.estudos.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorComparable  {

    public static void main(String[] args) {
        List<Product> produtos = new ArrayList<Product>();

        Product produto3 = new Product("Alan", 3);
        Product produto2 = new Product("Alan", 2);
        Product produto = new Product("Alan", 1);

        produtos.add(produto3);
        produtos.add(produto2);
        produtos.add(produto);

        System.out.println(produtos);

        Collections.sort(produtos);
        System.out.println(produtos);


    }
}

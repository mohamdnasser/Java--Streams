package stream.map;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Product{
    int id;
    String name;
    int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class MapDemo4 {
    public static void main(String[] args){
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Dell" ,2000));
        products.add(new Product(2,"HP" ,3000));
        products.add(new Product(3,"Mac" ,4000));
        products.add(new Product(4,"Lenovo" ,5000));

        // collection >> Stream >> filter >> Map >> collection
        List<Integer> newList =
                products.stream().filter(product -> product.price > 3000).map(product -> product.price + 500).collect(Collectors.toList());
        System.out.println(newList);

    }
}

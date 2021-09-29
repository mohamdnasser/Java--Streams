package stream.filter;

import java.util.ArrayList;
import java.util.List;

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

public class FilterDemo4 {
    public static void main(String[] args){
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"HP",1000));
        products.add(new Product(2,"DELL",2000));
        products.add(new Product(3,"MAC",3000));
        products.add(new Product(4,"LENOVO",4000));

        products.stream().filter(product -> product.price > 2000).forEach(product -> System.out.println(product.name));

    }
}

package de.telran.Melkonov.Oleg.hw20231005;

import Classes.lecture231005.UnionStringCollector;

import java.util.*;
import java.util.stream.Collectors;

public class ShopMain {
    public static void main(String[] args) {
        List<Product> productList1 = new ArrayList<>(5);
        productList1.add(new Product(4,"Apple",Category.FRUIT));
        productList1.add(new Product(10,"Canned fish",Category.GROCERY));
        productList1.add(new Product(70,"Dog food",Category.PET_PRODUCT));
        productList1.add(new Product(60,"Potato",Category.VEGETABLE));
        productList1.add(new Product(100,"Pork",Category.MEAT));
        Shop shop1 = new Shop("Alenka","Berlin",22,productList1);

        List<Product> productList2 = new ArrayList<>(5);
        productList2.add(new Product(3,"Pear",Category.FRUIT));
        productList2.add(new Product(60,"Canned pork",Category.GROCERY));
        productList2.add(new Product(80,"Cat food",Category.PET_PRODUCT));
        productList2.add(new Product(70,"Carrot",Category.VEGETABLE));
        productList2.add(new Product(130,"Lamb",Category.MEAT));
        Shop shop2 = new Shop("Mashenka","Hamburg",21,productList2);

        List<Product> productList3 = new ArrayList<>(5);
        productList3.add(new Product(80,"Plum",Category.FRUIT));
        productList3.add(new Product(40,"Canned beef",Category.GROCERY));
        productList3.add(new Product(50,"Parrot food",Category.PET_PRODUCT));
        productList3.add(new Product(20,"Onion",Category.VEGETABLE));
        productList3.add(new Product(110,"Beef",Category.MEAT));
        Shop shop3 = new Shop("Matreshka","Munich",20,productList3);

        Map<String, Integer> shops = Arrays.asList(shop1, shop2, shop3).stream()
                .flatMap(shop -> shop.getProducts().stream())
                .collect(Collectors.toMap(key -> key.name, value -> value.price, (f,s) -> f+s, () -> new HashMap<>()));
        System.out.println(shops);

        Map<String, Integer> shops1 = Arrays.asList(shop1, shop2, shop3).stream()
                .flatMap(shop -> shop.getProducts().stream())
                .collect(Collectors.toMap(key -> key.name, value -> value.price, (f,s) -> f+s, () -> new TreeMap<>()));
        System.out.println(shops1);

        List<String> fruits = Arrays.asList(shop1, shop2, shop3).stream()
                .filter(shop -> shop.getWorkTo() > 18)
                .flatMap(shop -> shop.getProducts().stream())
                .filter(product -> product.getCategory().equals(Category.FRUIT))
                .filter(product -> product.getPrice() < 5)
                .map(n -> n.name)
                .toList();
        System.out.println(fruits);

        Map<String, List<Product>> fruitsByName = Arrays.asList(shop1, shop2, shop3).stream()
                .filter(shop -> shop.getWorkTo() > 18)
                .flatMap(shop -> shop.getProducts().stream())
                .filter(product -> product.getCategory().equals(Category.FRUIT))
                .filter(product -> product.getPrice() < 5)
                .collect(Collectors.groupingBy(Product::getName));
        System.out.println(fruitsByName);

        Map<Category, Long> categoryNum = Arrays.asList(shop1, shop2, shop3).stream()
                .flatMap(shop -> shop.getProducts().stream())
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));
        System.out.println(categoryNum);

        Map<Category, Set<String>> categoryName = Arrays.asList(shop1, shop2, shop3).stream()
                .flatMap(shop -> shop.getProducts().stream())
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.mapping(Product::getName, Collectors.toSet())));
        System.out.println(categoryName);

        String joinedProducts = Arrays.asList(shop1, shop2, shop3).stream()
                .flatMap(shop -> shop.getProducts().stream())
                .map(n -> n.name)
                .collect(Collectors.joining(", "));
        System.out.println(joinedProducts);

    }
}

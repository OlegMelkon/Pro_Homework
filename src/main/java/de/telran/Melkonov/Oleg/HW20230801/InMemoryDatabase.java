package de.telran.Melkonov.Oleg.HW20230801;

import java.util.Scanner;

public class InMemoryDatabase implements ProductDatabase{
    private static Product[] prodBase;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите желаемое количество продуктов: ");
        int num = sc.nextInt();

        prodBase = new Product[num];
        for (int i = 0; i < num; i++){
            System.out.print("Введите название " + i + "-го продукта: ");
            String prod = sc.next();
            prodBase[i] = new Product(prod);

        }


        System.out.print("Добавить продукт? Да - 1, Нет - 2: ");
        int yesNo = sc.nextInt();
        if (yesNo == 1){
            System.out.print("Введите название нового продукта: ");
            String name = sc.next();
            Product newProd = new Product(name);
            save(newProd);

        } else {
            for (int i = 0; i < prodBase.length; i++){
                System.out.println(prodBase[i].getTitle());
            }
            System.out.println("Спасибо!");
        }

        System.out.print("Поиск продукта. Введите название продукта: ");
        String nameToFind = sc.next();
        if (findByTitle(nameToFind) != null) System.out.println("Продукт " + findByTitle(nameToFind).getTitle() + " найден!");
        else System.out.println("Продукт не найден!");

        sc.close();
    }
    public static void save(Product product){

        Product[] newProdBase = new Product[prodBase.length+1];
            for (int i = 0; i < prodBase.length; i++){
                newProdBase[i] = prodBase[i];
            }
            newProdBase[newProdBase.length-1] = product;

            prodBase = new Product[newProdBase.length];
            for (int i = 0; i < prodBase.length; i++){
                prodBase[i] = newProdBase[i];
            }

            for (int i = 0; i < prodBase.length; i++){
                System.out.println(prodBase[i].getTitle());
            }
        }

    public static Product findByTitle(String productTitle){
        for (int i = 0; i < prodBase.length; i++){
            if (prodBase[i].getTitle().equals(productTitle))
                return prodBase[i];
        } return null;
    }
}

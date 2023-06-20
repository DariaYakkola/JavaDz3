package HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
//        Получить наименования товаров заданного сорта с наименьшей ценой.
public class Task2 {
    public static void main(String[] args) {
        Item product1 = new Item("Яблоки", "Россия", 2.5, 313, 3);
        Item product2 = new Item("Груши", "Россия", 1.5, 300, 1);
        Item product3 = new Item("Апельсины", "Россия", 1.0, 150, 2);
        Item product4 = new Item("Бананы", "Россия", 3.0, 270, 1);
        Item product5 = new Item("Виноград", "Россия", 1.0, 150, 2);
        List<Item> products = new ArrayList<>();
        List<Item> result = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сорт: ");
        int productSort = sc.nextInt();
        for (Item product : products) {
            if (product.getSort() == productSort) {
                result.add(product);
            }
        }
        int min = result.get(0).getCost();
        for (int i = 1; i < result.size(); i++) {
            if (result.get(i).getCost() < min) {
                min = result.get(i).getCost();
            }
        }
        for (Item product : result) {
            if (product.getCost() == min) {
                System.out.println(product.getName());
            }
        }
    }
}
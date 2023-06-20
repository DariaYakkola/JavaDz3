package HomeWork;

import java.util.ArrayList;
import java.util.List;

//Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2-го сорта
// среди товаров, название которых содержит «высший».
public class Task1 {
    public static void main(String[] args) {
        Product product1 = new Product("Макароны Высший Сорт", 156, 1);
        Product product2 = new Product("Макароны Шебекинские", 55, 2);
        Product product3 = new Product("Рис Высший Националь", 130, 3);
        Product product4 = new Product("Рис Высший Сорт", 156, 1);
        Product product5 = new Product("Мука Высший Сорт", 75, 2);
        List<Product> catalog = new ArrayList<>();
        List<Product> result = new ArrayList<>();
        catalog.add(product1);
        catalog.add(product2);
        catalog.add(product3);
        catalog.add(product4);
        catalog.add(product5);
        for (Product products : catalog) {
            if ((products.getName().toLowerCase().contains("высший"))
                    && (products.getSort() == 1 | products.getSort() == 2)) {
                result.add(products);
            }
        }
        int max = result.get(0).getCost();
        for (int i = 1; i < result.size(); i++) {
            if (result.get(i).getCost() > max) {
                max = result.get(i).getCost();
            }
        }
        System.out.println("Наибольшая стоимоть - " + max + " рублей");
    }
}
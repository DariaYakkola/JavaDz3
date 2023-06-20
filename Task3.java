package HomeWork;

import java.util.ArrayList;
import java.util.List;

//Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
//Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А»
//и год издания после 2010 г, включительно.
public class Task3 {
    public static void main(String[] args) {
        Book book1 = new Book("Белые ночи", "Достоевский", 299, 2022, 317);
        Book book2 = new Book("Портрет Дориана Грея", "Уайльд", 200, 2022, 317);
        Book book3 = new Book("Зеленый свет", "Макконахи", 798, 2022, 320);
        Book book4 = new Book("Мастер и Маргарита", "Булгаков", 220, 2009, 509);
        Book book5 = new Book("Три товарища", "Ремарк", 317, 2010, 479);
        List<Book> books = new ArrayList<>();
        List<Book> result = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        for (int i = 0; i < books.size(); i++) {
            int count = 0;
            for (int j = 3; j <= books.get(i).getPages() - 1; j += 2) {
                if (books.get(i).getPages() % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                result.add(books.get(i));
            }
        }
        for (Book item : result) {
            if ((item.getName().toLowerCase().contains("а"))
                    && (item.getYear() >= 2010)) {
                System.out.println(item.getName());
            }
        }
    }
}

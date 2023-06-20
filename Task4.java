package HomeWork;

import java.util.ArrayList;
import java.util.List;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> positiveNumbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(10);
        numbers.add(1);
        numbers.add(5);
        numbers.add(6);
        numbers.add(9);
        numbers.add(7);
        numbers.add(-8);
        numbers.add(2);
        numbers.add(8);
        int max = 0;
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        int min = max;
        for (int j = 0; j < numbers.size(); j++) {
            if (numbers.get(j) < min) {
                min = numbers.get(j);
            }
        }
        int average = sum / numbers.size();
        for (int k = 0; k < numbers.size(); k++) {
            if (numbers.get(k) < 0) {
                positiveNumbers.add(numbers.get(k) * -1);
            } else {
                positiveNumbers.add(numbers.get(k));
            }
        }
        int averageResult = max;
        int positiveResult = 0;
        int averageNumber = numbers.get(0);
        for (int q = 0; q < numbers.size(); q++) {
            if ((positiveNumbers.get(q) - average < averageResult) && (positiveNumbers.get(q) - average >= 0)) {
                averageNumber = numbers.get(q);
            } else if (positiveNumbers.get(q) - average < 0) {
                positiveResult = (positiveNumbers.get(q) - average) * -1;
                if (positiveResult < averageResult) {
                    averageResult = positiveResult;
                    averageNumber = numbers.get(q);
                }
            }
        }
        System.out.println("Максимальное число - " + max);
        System.out.println("Минимальное число - " + min);
        System.out.println("Среднее число - " + averageNumber);
    }
}

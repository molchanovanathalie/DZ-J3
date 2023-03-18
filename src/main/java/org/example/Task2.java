//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

package org.example;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        System.out.print("Введите количество элементов в целочисленном списке: ");
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            list.add(random.nextInt(10));
        }
        System.out.println("Целочисленный список: " + list);
        System.out.printf("Минимальное число в целочисленном списке: %d\n ", Collections.min(list));
        System.out.printf("Максимальное число в целочисленном списке: %d\n ",Collections.max(list));

        double sum = list.stream().mapToInt(Integer::intValue).sum();
        double arithmeticMean = sum/q;
        System.out.printf("Среднее арифметическое элементов в целочисленном списке: %s\n ",arithmeticMean);
    }
}
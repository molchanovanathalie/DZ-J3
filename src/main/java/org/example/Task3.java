// Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
            myList.add("Masha");
            myList.add("Natasha");
            myList.add(String.valueOf(1));
            myList.add(String.valueOf(22));

            System.out.println("Первичный список " + myList);
            Iterator<String> iterator = myList.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().matches("-?\\d+(\\.\\d+)?$")) {
                    iterator.remove();
                }
            }
            System.out.println(myList);

    }
}

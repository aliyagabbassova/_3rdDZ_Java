package org.example;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
        Object[] i;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();
        LinkedList<Integer> list6 = new LinkedList<>();
        Collections.sort(list);
        compare(list);
        even_numbers(list1);
        minimax(list2);
        merge(list3);
        thousand_null(list5);
        thousand_zero(list6);
        collate(list6);

    }

    //Реализовать алгоритм сортировки списков компаратором.
    public static void compare(ArrayList<Integer> array) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(8);
        list.add(2);
        list.add(10);
        list.add(3);
        list.add(9);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o1 - o2;
            }
        });

        System.out.println(array);
        list.forEach(n -> System.out.print(n + ","));
    }

    //Пусть дан произвольный список целых чисел, удалить из него чётные числа
    public static void even_numbers(ArrayList<Integer> array) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        int i = 0;
        for (i = 0; i < 10; i++) {
            list1.add(new Random().nextInt(10));
        }
        System.out.println(list1);
        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            } else {
                i++;
            }
            System.out.println(list1);
        }
    }

    //Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
    public static void minimax(ArrayList<Integer> array) {
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        System.out.println(Collections.max(list2));
        System.out.println(Collections.min(list2));
    }

    //Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
    public static void merge(ArrayList<Integer> array) {
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(3);
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(2);
        list4.add(3);
        list4.add(4);
        list4.removeAll(list3);
        list3.addAll(list4);
        System.out.println("Merged list without duplicates: " + list3);

    }

    //Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
    public static void thousand_null(ArrayList<Integer> array) {
        ArrayList<Integer> list5 = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list5.add(0, 0);
            System.out.println("List of 10000 zeros: " + list5);
        }

        //Повторить пятый пункт но с LinkedList.
        public static void thousand_zero (LinkedList < Integer > list6) {
            LinkedList<Integer> list6 = new LinkedList<>();
            for (int i = 0; i < 10000; i++) {
                list6.addFirst(0);
            }
            System.out.println("Linked list of 10000 zeros: " + list6);
        }

        //Сравнить время работы пятого и шестого пунктов.
        public static void collate (ArrayList < Integer > array) {
            long start = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                list5.add(0, 0);
            }
            long end = System.currentTimeMillis();
            System.out.println("ArrayList time: " + (end - start) + " ms");

            start = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                list6.addFirst(0);
            }
            end = System.currentTimeMillis();
            System.out.println("LinkedList time: " + (end - start) + " ms");

        }

    }
}

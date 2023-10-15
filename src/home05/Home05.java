package home05;

import java.util.Arrays;
import java.util.Scanner;

public class Home05 {
    public static void main(String[] args) {
        /*
        Метод Arrays.equals(...) используется для сравнения двух массивов.
        Он возвращает true, если массивы содержат одинаковые элементы в том же порядке,
        и false в противном случае. Этот метод сравнивает каждый элемент массива
        с соответствующим элементом другого массива.

        Метод Arrays.compare(...) тоже используется для сравнения двух массивов.
        Но он возвращает отрицательное число, если первый массив меньше второго,
        положительное число, если первый массив больше второго,
        и ноль, если массивы равны. Возвращает результат сравнения первых несовпадающих элементов.

        Метод Arrays.mismatch(...) используется для поиска индекса первого
        несовпадающего элемента в двух массивах.
        Он возвращает индекс первого несовпадающего элемента или -1,
        если все элементы массивов совпадают. Этот метод сравнивает элементы массивов по порядку,
        начиная с первого элемента, и возвращает индекс первого несовпадающего элемента.

         */
        /* Задача #1
        Объявить массив целых чисел. Длина массива - 15. Заполнить массив четными числами в диапазоне [10, 100).
        Для заполнения массива использовать цикл.
         */
        int[] array = new int[15];
        int minI = 10; //начальное значение интервала
        int maxI = 99; //конечное значение интервала

        for (int i = 0; i < array.length; i++) {
            int numberRandom = minI + (int) (Math.random() * (maxI - minI + 1));
            if (numberRandom % 2 == 0) {
                array[i] = numberRandom;
            } else {
                array[i] = numberRandom - 1;
            }
            System.out.println(array[i]);
        }
        /* Задача #2
        Создать два массива целых чисел на 5 элементов каждый.
        Массивы необходимо заполнять значениями в цикле. Значения вводит пользователь с клавиатуры.

        Если число отрицательное, добавить его в первый массив.
        Если число положительное, добавить его во второй массив.
        Программа завершает работу, когда оба массива заполнены или, если пользователь ввёл 0

         */
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int index1 = 0;
        int index2 = 0;

        Scanner scanner = new Scanner(System.in);

        while (index1 < array1.length || index2 < array2.length) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            if (number < 0) {
                if (index1 < array1.length) {
                    array1[index1] = number;
                    index1++;
                }
            } else if (number > 0) {
                if (index2 < array2.length) {
                    array2[index2] = number;
                    index2++;
                }
            } else {
                break;
            }
        }

        System.out.println("Первый массив:");
        for (int i = 0; i < index1; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("Второй массив:");
        for (int i = 0; i < index2; i++) {
            System.out.println(array2[i]);
        }
        /*
        Задача #3
        Заполните массив на len элементов (размер массива вводит пользователь)
        случайным целыми числами и выведете максимальное,
        минимальное и среднее арифметическое значение элементов массива.
         */
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        int[] array3 = new int[len];
        int sum = 0;
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (int) (Math.random() * 100);

            sum += array3[i];
        }
        System.out.println(Arrays.toString(array3));
        Arrays.sort(array3);
        int max = array3[0];
        int min = array3[array3.length-1];

        double average = (double) sum / array3.length;

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее арифметическое: " + average);

    }
}

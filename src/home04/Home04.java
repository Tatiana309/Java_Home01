package home04;

import java.util.Scanner;

public class Home04 {
    public static void main(String[] args) {
        //1 Вывести на экран первые 10 элементов последовательности 2 4 6 8 10 и тд
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        //2 Для введённого пользователем с клавиатуры целого положительного числа посчитайте сумму всех его цифр

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите положительное целое число");
        int userInput = scanner.nextInt();
        int sum = 0;
        while (userInput > 0) {
            sum += userInput % 10;
            userInput /= 10;
        }
        System.out.println("Сумма цифр числа = " + sum);

        /* Программа загадывает число в диапазоне [1;9]
        Пользователь вводит число с клавиатуры
        Программа в зависимости от введенного числа выводит в консоль следующее:
        "загаданное число больше"
        "загаданное число меньше"
        "Вы угадали" (программа завершает работу)
        Если введен 0, вывести "выход из программы" (программа завершает работу)
         */

        int minI = 1; //начальное значение интервала
        int maxI = 9; //конечное значение интервала
        int numberRandom = 1 + (int) (Math.random() * (maxI - minI + 1));

        int userInputNumber;
        do {
            System.out.println("\nВведите положительное целое число");
            userInputNumber = scanner.nextInt();
            if (userInputNumber < numberRandom)
                System.out.println("загаданное число больше");
            else if (userInputNumber > numberRandom) {
                System.out.println("загаданное число меньше");
            } else System.out.println("Вы угадали");
        } while (userInputNumber != 0 && userInputNumber != numberRandom);

        /*Пользователь загадывает число в диапазоне от [1 до 100].
        Пользователь загадывает в уме, программа не хранит это число, а пытается его угадать.
        Программа пытается его угадать (вместо обычного перебора постарайтесь
        использовать метод бинарного поиска, т.е деление отрезка на 2, пока число не будет найдено).
        Программа может задавать пользователю вопросы: Число равно ...?, Число больше ...? и, в зависимости
        от ответа пользователя, принимать решения.
        Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
        Для вывода текста и значения переменной используйте оператор сложения, например
        System.out.println("Число равно " + number);
        середина отрезка: a = 1, b = 100; mid = (a + b) / 2;
         */
        int a = 1;
        int b = 100;
        int mid;
        int answer;

        System.out.println("Загадайте число от 1 до 100");
        while (true) {
            mid = (a + b) / 2;
            System.out.println("Число равно " + mid + "? Введите 1 - ДА, 0 - НЕТ");
            answer = scanner.nextInt();

            if (answer == 1) {
                System.out.println("Ура! Угадал!");
                break;
            } else {
                System.out.println("Число больше " + mid + "? Введите 1 - ДА, 0 - НЕТ");
                answer = scanner.nextInt();

                if (answer == 1) {
                    a = mid + 1;
                } else {
                    b = mid - 1;
                }
            }
        }
    }
}

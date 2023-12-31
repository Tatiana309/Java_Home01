package home03;

public class Home03 {
    public static void main(String[] args) {
        /*
        Задача #1 на Math.random() и ветвление
            Самостоятельно изучить Math.random() для генерации псевдослучайных чисел.
            Написать код, который будет проверять попало ли случайно сгенерированное целое число из отрезка
            [10;500] в интервал (25;200) и выводить результат в консоль.

            Примеры работы программы: Число 345 не содержится в интервале (25;200) Число 110 содержится в интервале (25;200)
         */
        int minI = 10; //начальное значение интервала
        int maxI = 500; //конечное значение интервала
        int numberRandom = 10 + (int) (Math.random() * (maxI - minI + 1));
        if (numberRandom > 25 && numberRandom < 200) {
            System.out.println("Число " + numberRandom + " попало в интервал");
        } else {
            System.out.println("Число " + numberRandom + " не попало в интервал");
        }

        /*Задача #2 на if else
        Дана переменная currentScoreValue - количество очков, набранное пользователем.

                Если пользователь набрал 90 и более очков, он занял первое место.
                Если пользователь набрал от 80 до 89, он занял второе место.
                Если пользователь набрал от 70 до 79, он занял третье место.
                Если пользователь набрал меньше 70, он не занял никакого места.
        Вывести в консоль, какое место занял пользователь.
         */

        int currentScoreValue = 86;
        if (currentScoreValue < 70)
            System.out.println("Вы не заняли никакого места");
        else if (currentScoreValue >= 70 && currentScoreValue <= 79) {
            System.out.println("Вы заняли третье место");
        } else if (currentScoreValue >= 80 && currentScoreValue <= 89) {
            System.out.println("Вы заняли второе место");
        } else System.out.println("Вы  заняли первое место");

        /*Задача #3 на if else
        Даны переменные x и y - координаты точки на плоскости.

        Необходимо определить четверть координатной плоскости, которой принадлежит данная точка.
        Результат вывести в консоль.

        Если обе координаты положительны, точка принадлежит первой четверти.
        Если координата x отрицательна, а y положительна, точка принадлежит второй четверти.
        Если обе координаты отрицательны, точка принадлежит третьей четверти.
        Если координата x положительна, а y отрицательна, точка принадлежит четвёртой четверти.
        */

        double x = 14, y = 3.5;
        if (x > 0 && y > 0) {
            System.out.println("Точка принедалежит первой четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка принедалежит второй четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка принедалежит третьей четверти");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка принедалежит четвертой четверти");
        } else System.out.println("Точка лежит на оси или в начале координат");


        /*Задача #4 на switch
        Дана переменная monthNumber, которая хранит порядковый номера месяца. И переменная isLeap, которая
        хранит информацию о том, является ли год високосным.

        Написать программу, которая в зависимости от значения monthNumber выводит в консоль количество дней
        в этом месяце. Необходимо рассмотреть два случая: год не является високосным и год является високосным.
         */
        int monthNumber = 2;
        boolean isLeap = false;
        switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("В месяце 31 день");
            case 4, 6, 9, 11 -> System.out.println("В месяце 30 дней");
            case 2 -> {
                if (isLeap)
                    System.out.println("В месяце 29 дней");
                else System.out.println("В месяце 28 дней");
            }
        }
        /*Задача #5 на switch
        Даны переменные couponNumber - номер купона и resultSum - сумма покупки.

        Если номер купона - 1111, скидка 10%,
        Если номер купона - 3333, скидка 20%,
        Если номер купона - 5555, скидка 30%.
        В остальных случаях скидка не предусмотрена.
        Необходимо вычислить и сохранить в переменную resultSum сумму с учетом скидки, если она предусмотрена.
        Вывести значение resultSum в консоль.
        */

        int couponNumber = 3333;
        double resultSum = 4590;
        resultSum = switch (couponNumber) {
            case 1111 -> 0.9 * resultSum;
            case 3333 -> 0.8 * resultSum;
            case 5555 -> 0.7 * resultSum;
            default -> resultSum;
        };
        System.out.println("Сумма покупки " + resultSum);
    }
}

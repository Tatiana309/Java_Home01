package home02;

public class Home02 {
    public static void main(String[] args) {
        //1 объявите переменные для хранения информации об общем количестве писем и о количестве отправленных писем.
        // Присвойте значения этим переменным. Выведите в консоль, сколько писем осталось отправить.
        int countLettersAll, countLetterSent;
        countLettersAll=20;
        countLetterSent=15;
        int countLetterToSend=countLettersAll-countLetterSent;
        System.out.println("Осталось отправить "+countLetterToSend+ " писем");

        //2 Объявить и инициализировать переменные для хранения времени (в часах) и расстояния (в километрах).
        // Найти и вывести в консоль скорость, выраженную в метрах в секунду.

        double time=2.5, distance=7;
        double speed=(distance*1000)/(time*3600);
        System.out.println("Скорость ="+speed);

        //3 Найти сумму цифр целого положительного двузначного числа. Результат вывести в консоль.

        int number=36;
        int sumOfDigits=number/10+number%10;
        System.out.println("Сумма цифр числа ="+sumOfDigits);

        //4 Поменять значения 2х переменных местами, используя арифметические операторы. Результат вывести в консоль.

        int numberOne=23, numberTwo=34;
        numberOne+=numberTwo;
        numberTwo=numberOne-numberTwo;
        numberOne=numberOne-numberTwo;
        System.out.println(numberOne);
        System.out.println(numberTwo);

    }
}

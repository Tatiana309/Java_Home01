package home06;

import java.util.Arrays;

public class Home06 {

    public static void main(String[] args) {
        /*
        Задача #1
        Дана строка, содержащая только буквы и цифры. Вывести информацию о том,
        является ли данная трока палиндромом.
         */
        String str = "Abcba";
        str = str.toLowerCase();

        int i = 0;
        int j = str.length() - 1;
        boolean isPalindrome = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
            }
            i++;
            j--;
        }
        if (isPalindrome) {
            System.out.println(str + " Данная строка является палиндромом");
        } else {
            System.out.println(str + " Данная строка не является палиндромом");
        }


        /*
        Задача #2
        Даны две строки, строки, содержащие только буквы английского алфавита.
        Вывести информацию о том, являются ли одна строка анаграммой другой строки.
         */

        String str1 = "Arts";
        String str2 = "Star";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] arr1=str1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr2);

        boolean isAnagram=Arrays.equals(arr1, arr2);
        if (isAnagram) {
            System.out.println("Данные строки являются анаграммами");
        } else {
            System.out.println("Данные строки не являются анаграммами");
        }
    }


}


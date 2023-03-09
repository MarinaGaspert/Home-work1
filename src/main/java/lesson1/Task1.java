//  Задать одномерный массив и найти в нем минимальный и максимальный элементы

package lesson1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {6, 8, 3, 5, 1, 9};

//        inputNameAndPrintHi();
        findMax(arr);
        findMin(arr);

        System.out.println("Min element is " + findMin(arr));
        System.out.println("Max element is " + findMax(arr));

    }

    // Задать одномерный массив и найти в нем минимальный и максимальный элементы
    // Метод нахождения Мах элемента
    private static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;

    }

    // Метод нахождения Мin элемента
    private static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    //    Метод приветствия (Семинар)
    private static void inputNameAndPrintHi() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите свое имя ");
        String name = in.nextLine();
        System.out.printf("Привет, %s!", name);
        in.close();
    }
}

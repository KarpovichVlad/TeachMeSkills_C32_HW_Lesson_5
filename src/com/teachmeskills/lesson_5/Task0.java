package com.teachmeskills.lesson_5;
import java.util.Scanner;

/** 0. Создать трехмерный массив из целых чисел.
 * С помощью циклов "пройти" по всему массиву и увеличить каждый
 * элемент на заданное число. Пусть число, на которое будет
 * увеличиваться каждый элемент, задается из консоли.
 */
public class Task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number: ");
        int a = scanner.nextInt();
        int[][][] array = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}}};

        for(int i = 0; i< array.length; i++){
    for(int j = 0; j< array[i].length;j++){
        for(int e = 0; e < array[i][j].length;e++){
            array[i][j][e] +=a;
        }
    }
}
        System.out.println(" Modified array: ");
        for(int i = 0; i< array.length;i++){
            for(int j = 0; j< array[i].length;j++){
                for(int e = 0; e < array[i][j].length;e++){
                  System.out.print(array[i][j][e]+ " ")  ;
                }
                System.out.println();
            }
        }


    }



}
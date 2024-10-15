package com.teachmeskills.lesson_5;

/**
 * 2*. Умножение двух матриц
 * Создайте два массива целых чисел (две матрицы).
 * Напишите программу для умножения двух матриц.
 * Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Ожидаемый результат: 1 2 3 1 1 1 0 0 0
 */
public class Task2 {
    public static void main(String[] args) {
        ;
        int[][] array1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] result = new int[array1.length][array2[0].length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                for (int x = 0; x < array1[0].length; x++) {
                    result[i][j] += array1[i][x] * array2[x][j];
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}






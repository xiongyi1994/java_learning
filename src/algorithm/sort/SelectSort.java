package algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 选择排序
 * 不稳定 排序
 * 最好时间复杂度 O(n^2)
 * 最坏时间复杂度 O(n^2)
 **/
public class SelectSort {

    private static int[] numbers;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            numbers = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
            selectSort();
            print();
        }
        scanner.close();
    }

    private static void selectSort() {
        for (int i = 0; i < numbers.length - 1; i++) {
            int min = numbers[i]; // 最小数
            int k = i; // 最小数索引
            for (int j = i + 1; j < numbers.length; j++) {
                if (min > numbers[j]) {
                    min = numbers[j];
                    k = j;
                }
            }
            numbers[k] = numbers[i];
            numbers[i] = min;
        }
    }

    private static void print() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            System.out.print(" ");
        }
    }
}


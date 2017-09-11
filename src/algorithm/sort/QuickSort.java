package algorithm.sort;

import java.util.Scanner;

public class QuickSort {
    private static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] stringArray = scanner.nextLine().trim().split(" ");
        array = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }
        quickSort(0, array.length - 1);
        print(array);
        scanner.close();
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1)
                System.out.print(arr[i] + " ");
            else
                System.out.print(arr[i]);
        }
    }

    private static void swap(int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    private static void quickSort(int start, int end) {

        if (start >= end)
            return;
        int mid = array[end];
        int left = start, right = end - 1;
        while (left < right) {
            while (array[left] <= mid && left < right)
                left++;
            while (array[right] >= mid && left < right)
                right--;
            swap(left, right);
        }
        if (array[left] >= array[end])
            swap(left, end);
        else
            left++;
        quickSort(start, left - 1);
        quickSort(left + 1, end);
    }
}

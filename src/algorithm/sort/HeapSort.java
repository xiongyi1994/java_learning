package algorithm.sort;

/**
 * 堆排序
 */

public class HeapSort {
    public static void main(String[] args) {
        int[] a = {5, 2, 7, 3, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        heapSort(a);
        print(a);
    }

    private static void heapSort(int[] a) {
        for (int i = a.length - 1; i >= 0; --i) {
            heapAdjust(a, i);
            swap(a, 0, i);
        }
    }

    private static void heapAdjust(int[] a, int m) {
        for (int i = m / 2 - 1; i >= 0; --i) {
            int max = i;
            if (a[i] < a[2 * i]) {
                max = 2 * i;
            }
            if (2 * i + 1 <= m) {
                if (a[max] < a[2 * i + 1]) {
                    max = 2 * i + 1;
                }
            }
            swap(a, i, max);
        }
    }
    
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void print(int[] a) {
        for (int anA : a) {
            System.out.print(anA + "、");
        }
    }
}

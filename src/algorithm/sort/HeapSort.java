package algorithm.sort;

/**
 * 堆排序
 * 不稳定排序
 * 平均时间复杂度 O(nlogn)
 * 最坏时间复杂度 O(nlogn)
 * 最好时间复杂度 O(nlogn)
 */
public class HeapSort {
    public static void main(String[] args) {
//        int[] a = {5, 2, 7, 3, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 8};
        int[] a = {5, 2, 7, 3, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8};
//        int[] a = {4, 6, 8, 5, 9};
//        int[] a = {4, 5, 8, 6, 9};
//        int[] a = {5, 4, 8, 6, 9};
        heapSort(a);
        print(a);
    }

    private static void heapSort(int[] a) {
        // 1、将数组堆化
        // 从第一个非叶子节点开始
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            heapAdjust(a, i, a.length - 1);
        }

        // 对堆化数据进行排序
        for (int i = a.length - 1; i > 0; i--) {
            swap(a, 0, i);
            heapAdjust(a, 0, i - 1);
        }
    }

    private static void heapAdjust(int[] a, int i, int length) {
        int leftIndex = 2 * i + 1;
        int rightIndex = 2 * i + 2;
        int maxIndex = leftIndex;
        if (leftIndex > length) {
            return;
        }
        // 判断左右子节点 哪个大
        if (rightIndex <= length &&
                a[leftIndex] < a[rightIndex]) {
            maxIndex = rightIndex;
        }
        if (a[i] < a[maxIndex]) {
            swap(a, i, maxIndex);
            heapAdjust(a, maxIndex, length);
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

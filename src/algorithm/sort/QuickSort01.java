package algorithm.sort;

public class QuickSort01 {
    public static void main(String[] args) {
        int[] a = {5, 3, 2, 4, 6, 7, 8, 52};
        quick(a, 0, a.length - 1);
        print(a);
    }

    private static void quick(int[] a, int low, int high) {
        int left = low;
        int right = high;
        if (left < right) {
            int pivot = a[left];
            while (left < right) {
                while (left < right && a[right] > pivot) {
                    right--;
                }
                a[left] = a[right];
                while (left < right && a[left] < pivot) {
                    left++;
                }
                a[right] = a[left];
            }
            a[left] = pivot;
            quick(a, low, left - 1);
            quick(a, left + 1, high);
        }
    }

    private static void print(int[] a) {
        for (int anA : a) {
            System.out.print(anA + "、");
        }
    }
}

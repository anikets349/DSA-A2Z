import java.util.Arrays;

public class ReverseArr {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int l, int r, int[] arr) {
        if (l >= r)
            return;
        swap(arr, l, r);
        reverse(l + 1, r - 1, arr);
    }

    public static void reverse(int i, int[] arr) {
        if (i >= arr.length / 2)
            return;
        swap(arr, i, arr.length - i - 1);
        reverse(i + 1, arr);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2 };
        System.out.println(Arrays.toString(arr));
        // reverse(0, arr.length - 1, arr);
        reverse(0, arr);
        System.out.println(Arrays.toString(arr));
    }
}
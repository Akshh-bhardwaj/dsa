package Arrays;

public class MaxMinElement {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 6};
        int n = arr.length;
        int max = arr[0], min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

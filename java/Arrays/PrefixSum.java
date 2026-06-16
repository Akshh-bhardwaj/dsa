package Arrays;

public class PrefixSum {

    public static void buildPrefixSum(int[] arr, int[] prefix) {
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
    }

    /* Sum of arr[l..r] inclusive */
    public static int rangeSum(int[] prefix, int l, int r) {
        if (l == 0) return prefix[r];
        return prefix[r] - prefix[l - 1];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;
        int[] prefix = new int[n];

        buildPrefixSum(arr, prefix);

        System.out.print("Array  : ");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        System.out.print("\nPrefix : ");
        for (int i = 0; i < n; i++) System.out.print(prefix[i] + " ");
        System.out.println();

        System.out.println("Sum of arr[1..3] = " + rangeSum(prefix, 1, 3)); /* 4+6+8 = 18 */
        System.out.println("Sum of arr[0..4] = " + rangeSum(prefix, 0, 4)); /* 30 */
    }
}

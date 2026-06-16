package Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] arr) {
        int pos = 0; /* position to place next non-zero */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[pos++] = arr[i];
            }
        }
        /* Fill remaining positions with 0 */
        while (pos < arr.length) {
            arr[pos++] = 0;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        System.out.print("Original : ");
        printArray(arr);

        moveZeroes(arr);

        System.out.print("After    : ");
        printArray(arr);
    }
}

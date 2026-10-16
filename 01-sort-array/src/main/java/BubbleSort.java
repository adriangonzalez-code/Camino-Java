public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int interations = 0; // Variable to count the number of iterations
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                interations++; // Increment the iteration count
            }
        }
        System.out.println("Number of iterations: " + interations);
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 1};
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
package org.driagon.ordenamiento;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int[] list1 = {5, 3, 8, 4, 2, 7, 1, 6, 9, 0};
        int[] list2 = {5, 3, 8, 4, 2, 7, 1, 6, 9, 0};
        int[] list3 = {5, 3, 8, 4, 2, 7, 1, 6, 9, 0};
        int[] list4 = {5, 3, 8, 4, 2, 7, 1, 6, 9, 0};
        int[] qsIterations = {0};

        sort(list1);
        sort2(list2);
        sort3(list3);
        quickSort(list4, 0, list4.length - 1, qsIterations);

        for (int i = 0; i < list4.length; i++) {
            System.out.print(list4[i] + " ");
        }
        System.out.println("Completed in " + qsIterations[0] + " iterations");
    }

    static void sort(int[] list) {
        int iterations = 0;
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if (list[i] < list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
                iterations++;
            }
        }

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println("Completed in " + iterations + " iterations");
    }

    static void sort2(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println();

        int iterations = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
                iterations++;
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("Completed in " + iterations + " iterations");
    }

    static void sort3(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println();

        int iterations = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
                iterations++;
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println("Completed in " + iterations + " iterations");
    }

    static void quickSort(int[] list, int left, int right, int[] iterations) {
        if (left < right) {
            int pivot = list[right];
            int i = left - 1;
            for (int j = left; j <= right; j++) {
                if (list[j] < pivot) {
                    i++;
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
            int temp = list[i + 1];
            list[i + 1] = list[right];
            list[right] = temp;
            pivot = i + 1;

            quickSort(list, left, pivot - 1, iterations);
            quickSort(list, pivot + 1, right, iterations);
        }

        iterations[0]++;
    }
}
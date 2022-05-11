//J1.S.P0001

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

    private static int getInt(String msg, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        do {
            try {
                System.out.print(msg);
                a = Integer.parseInt(sc.nextLine());
                if (a < min || a > max) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.print("\nWRONG INPUT");
            }
        } while (true);
        return a;
    }

    private static int[] RandomArray(int n) {
        Random rd = new Random();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(n) + 1;
        }
        return a;
    }

    private static void bubbleSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    private static void printArray(String msg, int a[]) {
        
        System.out.print(msg + "[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int size = getInt("\nEnter number of array: ", 0, Integer.MAX_VALUE);
        int a[] = RandomArray(size);
        printArray("Unsorted array: ", a);
        bubbleSort(a);
        printArray("\nSorted array: ", a);

    }

}

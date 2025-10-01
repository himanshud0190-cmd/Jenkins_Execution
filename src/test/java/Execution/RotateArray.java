package Execution;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        int[] arr = new int[4];
        System.out.println("Enter 4 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // rotate left (move first element to last)
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;

        // output
        System.out.print("Output: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

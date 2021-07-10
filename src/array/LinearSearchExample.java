package array;

import java.util.Scanner;

public class LinearSearchExample {
    public static void main(String[] args) {
        LinearSearchExample object = new LinearSearchExample();
        object.func();
    }
    void func() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int arr[] = new int[sc.nextInt()];
        System.out.println("Enter elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter searching element : ");
        int search = sc.nextInt();

        //process
        boolean found = false;
        for (int j = 0; j < arr.length; j++) {
            if(search == arr[j]) {
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element Not Found !!");
        } else {
            System.out.println("Element Found !!");
        }
    }
}

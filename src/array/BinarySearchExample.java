package array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {
    public static void main(String[] args) {
        BinarySearchExample obj = new BinarySearchExample();
        obj.func();
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

        Arrays.sort(arr);

        int lb = 0;
        int ub = arr.length - 1;
        int mid;
        int count = 0;

        while(lb<=ub){
            mid = (lb+ub)/2;
            if(search == arr[mid]){
                count++;
                break;
            }
            else if(search<arr[mid])
                ub = mid - 1;
            else if(search>arr[mid])
                lb = mid + 1;
        }

        if(count>0)
            System.out.println("Element found");
        else
            System.out.println("Element Not Found");
    }
}

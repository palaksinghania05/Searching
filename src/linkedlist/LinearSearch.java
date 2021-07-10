package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

class LinearMain {
    public static void main(String[] args) {
        LinkedListSearch<Integer> linearSearch = new LinkedListSearch<>();
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Enter number of elements : ");
        int numberOfElements = sc.nextInt();
        System.out.println("Enter elements : ");
        for(int i = 0; i < numberOfElements; i++) {
            linkedList.add(sc.nextInt());
        }
        System.out.println("Enter elements you want to search : ");
        int searchElement = sc.nextInt();
        String message = linearSearch.linearSearch(linkedList,searchElement) ?
                "Element found !" : "Element not found !";
        System.out.println(message);
    }
}
class LinkedListSearch<T> {
    public boolean linearSearch(LinkedList<T> list, T searchElement) {
        return list.contains(searchElement);
    }
}

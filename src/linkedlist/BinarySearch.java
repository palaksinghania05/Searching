package linkedlist;

import java.util.*;

class BinaryMain {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayList<Integer> list = new ArrayList<>();
       System.out.println("Enter number of elements : ");
       int numberOfElements = sc.nextInt();
       System.out.println("Enter elements : ");
       for(int i = 0; i < numberOfElements; i++) {
           list.add(sc.nextInt());
       }
       System.out.println("Enter elements you want to search : ");
       int searchElement = sc.nextInt();
       BinarySearch obj = new BinarySearch();
       Collections.sort(list);
       int result = obj.search(searchElement, list);
       //int result = Collections.binarySearch(list,searchElement);
       if(result!=-1)
           System.out.println("Element found");
       else
           System.out.println("Element not found");
   }
}
class BinarySearch {
    public static int search(int search, ArrayList<Integer> list) {
        int lowerBound = 0;
        int upperBound = list.size()-1;
        while (lowerBound <= upperBound) {
            int mid = (lowerBound + upperBound) / 2;
            int cmp = list.get(mid).compareTo(search);
            if (cmp > 0)
                upperBound = mid - 1;
            else if (cmp < 0) lowerBound = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}

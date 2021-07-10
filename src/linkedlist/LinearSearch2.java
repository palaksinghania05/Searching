package linkedlist;

import java.util.LinkedList;

public class LinearSearch2 {
    public static void main(String[] args) {
        LinearSearch2 linearSearch2 = new LinearSearch2();
        linearSearch2.search2();
    }

    private void search2() {
    }

    /* public int search2(Integer item, LinkedList<Integer> list) {
         int response = -1;
         // write a loop to traverse the linked list
         for (int i = 0; i < list.size(); i++) {
             // fetch the data of the current node
           //  Integer data = this.getNode(i).getData();
             // check if the item is equal to the data of the current node
          //   if (item.equals(data)) {
                 response = i;
                 break;
             }
       //  }
        // return response;
   //  }

 }*/
    class Node<E> {
        // these are the fields for the singly-linked list
        private E data;
        private Node<E> next;

        // constructor to initialize the data field of the node
        private Node(E data) {
            this.data = data;
        }

        // constructor to initialize both the fields of the node
        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        // getter method for the node's data field
        private E getData() {
            return data;
        }

        // getter method for the node's next field
        private Node<E> getNext() {
            return next;
        }
    }
}

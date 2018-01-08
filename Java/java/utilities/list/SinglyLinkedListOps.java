package utilities.list;

/**
 * Created by eaton on 1/5/2018.
 */


public class SinglyLinkedListOps {

    public SinglyLinkedListNode arrayToSinglyLinkedList(int[] arr) {

        SinglyLinkedListNode headNode = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            SinglyLinkedListNode listNode = new SinglyLinkedListNode(arr[i], headNode);
            headNode = listNode;
        }

        return headNode;
    }


    public void printSinglyLinkedList(SinglyLinkedListNode listNode) {

        String split = "->";

        while (listNode.next != null) {
            System.out.print(listNode.val + split);
            listNode = listNode.next;
        }
        System.out.println(listNode.val);
    }


    public void printSinglyLinkedList(SinglyLinkedListNode listNode, String split) {
        while (listNode.next != null) {
            System.out.print(listNode.val + split);
            listNode = listNode.next;
        }
        System.out.println(listNode.val);
    }


//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//
//        SinglyLinkedListOps listOps = new SinglyLinkedListOps();
//
//        SinglyLinkedListNode list = listOps.arrayToSinglyLinkedList(arr);
//
//        listOps.printSinglyLinkedList(list);
//    }

}


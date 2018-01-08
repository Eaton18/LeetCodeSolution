package utilities.list;

/**
 * Created by Eaton on 1/5/2018.
 */
// Definition for singly-linked list.
public class SinglyLinkedListNode {

    public int val;
    public SinglyLinkedListNode next;

    SinglyLinkedListNode(int x) {
        this.val = x;
        this.next = null;
    }

    SinglyLinkedListNode(int x, SinglyLinkedListNode next) {
        this.val = x;
        this.next = next;
    }

}

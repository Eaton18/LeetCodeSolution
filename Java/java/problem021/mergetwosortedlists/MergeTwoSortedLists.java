package problem021.mergetwosortedlists;

import utilities.list.SinglyLinkedListNode;
import utilities.list.SinglyLinkedListOps;
import utilities.testcase.TestCase;

/**
 * problem link: https://leetcode.com/problems/merge-two-sorted-lists/description/
 */
public class MergeTwoSortedLists {

    /**
     * Iteration
     * <p>
     * Time complexity: O(n+m)
     * Space complexity: O(1)
     *
     * @param l1
     * @param l2
     * @return
     */
    public static SinglyLinkedListNode mergeTwoLists_Iteration(SinglyLinkedListNode l1, SinglyLinkedListNode l2) {
        SinglyLinkedListNode headNode = null;
        SinglyLinkedListNode curtNode = null;

        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val <= l2.val) {
            headNode = l1;
            l1 = l1.next;
        } else {
            headNode = l2;
            l2 = l2.next;
        }

        curtNode = headNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curtNode.next = l1;
                l1 = l1.next;
            } else {
                curtNode.next = l2;
                l2 = l2.next;
            }
            curtNode = curtNode.next;
        }

        curtNode.next = l1 == null ? l2 : l1;

        return headNode;
    }


    /**
     * Recursion
     * <p>
     * Time complexity: O(n+m)
     * Space complexity: O(n+m)
     *
     * @param l1
     * @param l2
     * @return
     */
    public static SinglyLinkedListNode mergeTwoLists_Recursion(SinglyLinkedListNode l1, SinglyLinkedListNode l2) {
        if (l1 == null)
            return l2;

        if (l2 == null)
            return l1;

        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists_Recursion(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists_Recursion(l1, l2.next);
            return l2;
        }

    }

    public static void main(String[] args) {
        // Input: 1->2->4, 1->3->4
        // Output: 1->1->2->3->4->4

        SinglyLinkedListNode list1 = null;
        SinglyLinkedListNode list2 = null;
        SinglyLinkedListOps listOps = new SinglyLinkedListOps();

        TestCase testcase = TestCase.TESTCASE_1;
        switch (testcase) {
            case TESTCASE_1:
                int[] testcase1Arr1 = {1, 2, 4};
                int[] testcase1Arr2 = {1, 3, 4};

                list1 = listOps.arrayToSinglyLinkedList(testcase1Arr1);
                list2 = listOps.arrayToSinglyLinkedList(testcase1Arr2);

                break;
            default:
                break;
        }

        SinglyLinkedListNode resList = mergeTwoLists_Recursion(list1, list2);

        listOps.printSinglyLinkedList(resList);
    }
}

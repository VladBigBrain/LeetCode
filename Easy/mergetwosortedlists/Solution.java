package Easy.mergetwosortedlists;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// Input: list1 = [1,2,4], list2 = [1,3,4]
// Output: [1,1,2,3,4,4]

public class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode cur = result;
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                cur.next = list2;
                list2 = list2.next;
            } else {
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }

        cur.next = list1 == null ? list2 : list1;

        result = result.next;
        return result;
    }

    public static void printList(ListNode listNode) {
        ListNode temp = listNode;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void main(String[] str) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(4);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        printList(listNode);
        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(4);
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        printList(listNode4);
        System.out.println("Result");
        ListNode result = mergeTwoLists(listNode, listNode4);
        printList(result);
    }

}

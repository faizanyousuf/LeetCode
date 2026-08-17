public class ReverseLinkedList{
    public static void main(String[] arg){

        Solution sol = new Solution();
        ListNode node1 = new ListNode(20);
        ListNode node2 = new ListNode(40,node1);
        ListNode node3 = new ListNode(70,node2);
        ListNode node4 = new ListNode(55,node3);
        ListNode node5 = new ListNode(90,node4);

        ListNode current = node5;

        while(current != null){
            System.out.print(current.val+" ");
            current = current.next;
        }
        System.out.println();

         sol.reverseList(node5);

        ListNode current1 = node1;

        while(current1 != null){
            System.out.print(current1.val+" ");
            current1 = current1.next;
        }
        System.out.println();

    }

}

//Definition for singly-linked list.

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode current = head;
        ListNode prev = null;

        while(current != null){
            ListNode temp =  current;
            current = current.next;
            temp.next = prev;
            prev = temp;
        }
        head = prev;
        return head;
    }
}
package Linkedlist;



public class LinkedlistTest {
    public static void main(String[] args){

    }
}



class ListNode{
    public int value;
    public ListNode next;
    public ListNode(int v){
        value = v;
    }
}


class Solution{
    public ListNode reverse(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode prev = null, curr = head, nxt = null;
        while (curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }



    // Time O(n)
    // Space O(n)
    ///recursion Method
    public ListNode reverse2(ListNode head){
        if (head == null || head.next == null){
            return head;
        }

        ListNode subHead = reverse2(head.next);
        head.next.next = head;
        head.next = null;
        return subHead;
    }

    // Time O(n)
    // Space O(1)
    public ListNode findMiddle(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public boolean hasCircle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }


    // Time O(n)
    // Space O(1)
    public ListNode insert(ListNode head, int target){
        ListNode newNode = new ListNode(target);
        if (head == null || target < head.value){
            newNode.next = head;
            return newNode;
        }
        ListNode prev = head;
        while (prev.next != null && prev.next.value < target){
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        return head;
    }


    public ListNode merge(ListNode h1, ListNode h2){
        ListNode dummy = new ListNode(1996);
        ListNode a = h1, b = h2, c = dummy;
        while (a != null && b != null){
            if (a.value < b.value){
                c.next = a;
                a = a.next;
                c = c.next;
            }else{
                c.next = b;
                b = b.next;
                c = c.next;
            }
        }
        if (a != null){
            c.next = a;
        }else if (b != null){
            c.next = b;
        }
        return dummy.next;
    }


    public ListNode divide(ListNode head, int target){
        if (head == null || head.next == null){
            return head;
        }
        ListNode sD = new ListNode(1996);
        ListNode lD = new ListNode(810);
        ListNode a = sD, b =lD, c = head;
        while (c != null){
            if (c.value < target){
                a.next = c;
                a = a.next;
                c = c.next;
            }else{
                b.next = c;
                b = b.next;
                c= c.next;
            }
        }
        a.next = lD.next;
        b.next = null;
        return sD.next;
    }
}
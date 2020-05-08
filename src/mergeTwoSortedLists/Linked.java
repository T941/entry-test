package mergeTwoSortedLists;

public class Linked {
    public ListNode mergeSortedList(ListNode a, ListNode b) {
        return merge(a, b);
}
    public ListNode merge(ListNode a, ListNode b) {
        ListNode temp = new ListNode();
        ListNode finalList = temp;

        while(a != null && b != null) {
            if(a.val < b.val) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }
        temp.next = (a == null) ? b : a;
        return finalList.next;
    }
    public ListNode getNewNode(int key) {
        ListNode a = new ListNode();
        a.next = null;
        a.val = key;
        return a;
    }
    public ListNode insert(int key, ListNode node) {

        if (node == null)
            return getNewNode(key);
        else
            node.next = insert(key, node.next);

        return node;
    }

    public void printList(ListNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.val + " ");
        printList(node.next);
    }

}



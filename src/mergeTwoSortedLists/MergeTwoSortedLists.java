package mergeTwoSortedLists;

import java.awt.*;
import java.lang.reflect.Array;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode head1 = null;
        Linked a = new Linked();

        head1 = a.insert(1, head1);
        head1 = a.insert(3, head1);
        head1 = a.insert(5, head1);

        ListNode head2 = null;
        head2 = a.insert(2, head2);
        head2 = a.insert(4, head2);

        ListNode mergeList = a.mergeSortedList(head1, head2);
        a.printList(mergeList);
    }
}

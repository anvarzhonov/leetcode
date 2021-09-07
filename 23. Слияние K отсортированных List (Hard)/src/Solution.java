

class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length ==0 ) return null;

        return mergeKLists(lists, 0, lists.length-1);
    }

    // Divide and conquer
    public ListNode mergeKLists(ListNode[] lists, int start, int end){

        // basic case
        if (start == end) return lists[start];

        int middle = start + (end-start)/2;

        ListNode left  = mergeKLists(lists, start, middle);

        ListNode right = mergeKLists(lists, middle+1, end);

        return compare(left, right); // comparing and merging this lists.
    }

    public ListNode compare(ListNode l1, ListNode l2){
        ListNode result = new ListNode(-1);
        ListNode current = result;

        while( l1 != null || l2!= null){
            if (l1 == null){
                current.next = l2;
                l2 = l2.next;
            } else if (l2 ==null){
                current.next = l1;
                l1 = l1.next;
            }
            else if (l1.val<l2.val){
                current.next = l1;
                l1= l1.next;
            }else{
                current.next= l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        return result.next;
    }
}
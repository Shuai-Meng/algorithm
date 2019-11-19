package basic.list;

/**
 * @Author mengshuai
 * @Date 2019/10/4
 */
public class ListNode {
    private int val;
    private ListNode next;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode() {}

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this(val, null);
    }

    public static ListNode generateList(int[] array) {
        ListNode res = new ListNode(0);
        ListNode listNode = res;

        for (int i : array) {
            listNode.setNext(new ListNode(i));
            listNode = listNode.next;
        }

        return res.getNext();
    }


    public boolean equals(ListNode e) {
        ListNode listNode = this;

        while (listNode != null && e != null) {
            if (listNode.val != e.val) {
                return false;
            }
            listNode = listNode.next;
            e = e.next;
        }

        if (listNode != null || e != null) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

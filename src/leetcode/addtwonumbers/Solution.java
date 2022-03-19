package leetcode.addtwonumbers;

import java.util.Objects;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int up = 0;
        ListNode resultNode = new ListNode();
        ListNode nextNode = resultNode.next;

        int h = 0;
        while (l1 != null || l2 != null || up == 1) {

            int val = 0;
            int val1 = 0;

            if (l1 != null) {
                val = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                val1 = l2.val;
                l2 = l2.next;
            }

            int i = val + val1 + up;

            if (i >= 10) {
                i = i % 10;
                up = 1;
            } else {
                up = 0;
            }

            if (h == 0) {
                resultNode.val = i;

                if (l1 == null && l2 == null && up == 0) {
                    return resultNode;
                }

                resultNode.next = new ListNode();
                nextNode = resultNode.next;
                h++;
                continue;
            }

            nextNode.val = i;
            if (l1 != null || l2 != null || up == 1) {
                nextNode.next = new ListNode();
            }
            nextNode = nextNode.next;

        }

        return resultNode;
    }

    public static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            ListNode listNode = (ListNode) o;
            return val == listNode.val && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }
}

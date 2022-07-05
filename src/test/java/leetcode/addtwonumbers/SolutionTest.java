package leetcode.addtwonumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        Solution.ListNode listNode = new Solution.ListNode(2, new Solution.ListNode(4, new Solution.ListNode(3, null)));
        Solution.ListNode listNode2 = new Solution.ListNode(5, new Solution.ListNode(6, new Solution.ListNode(4, null)));

        Solution.ListNode result1 = solution.addTwoNumbers(listNode, listNode2);
        assertEquals(new Solution.ListNode(7, new Solution.ListNode(0, new Solution.ListNode(8))), result1);

        Solution.ListNode listNode3 = new Solution.ListNode(0);
        Solution.ListNode listNode4 = new Solution.ListNode(0);

        Solution.ListNode result2 = solution.addTwoNumbers(listNode3, listNode4);
        assertEquals(result2, new Solution.ListNode(0));

        Solution.ListNode listNode5 = new Solution.ListNode(5);
        Solution.ListNode listNode6 = new Solution.ListNode(5);

        Solution.ListNode result3 = solution.addTwoNumbers(listNode5, listNode6);
        assertEquals(new Solution.ListNode(0, new Solution.ListNode(1)), result3);

        Solution.ListNode listNode7 = new Solution.ListNode(9);
        Solution.ListNode listNode8 = new Solution.ListNode(1, new Solution.ListNode(9, new Solution.ListNode(9)));

        Solution.ListNode result4 = solution.addTwoNumbers(listNode7, listNode8);
        assertEquals(new Solution.ListNode(0, new Solution.ListNode(0, new Solution.ListNode(0, new Solution.ListNode(1)))), result4);
    }

}
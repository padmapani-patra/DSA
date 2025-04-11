import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode node) {
        this.val = val;
        this.next = node;
    }
}

class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i : nums)
            set.add(i);

        int l = nums.length;
        for (int i = 1; i <= l; i++) {
            if (!set.contains(i))
                res.add(i);
        }

        return res;
    }
}
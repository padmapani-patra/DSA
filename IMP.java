import java.util.*;

public class IMP {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total_sum = (n * (n + 1)) / 2;
        for (int i : nums) {
            total_sum -= i;
        }
        return total_sum;
    }
}

class AllDissappearedNumbers {
    List<Integer> allDissappearedNumbersUsingSet(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i))
                res.add(i);
        }
        return res;

    }

    List<Integer> allDissappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for (int n : nums) {
            int index = Math.abs(n) - 1;
            if (nums[index] > 0)
                nums[index] = -nums[index];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                res.add(i + 1);
        }

        return res;
    }
}

class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast)
                break;
        }

        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}

class FindAllDuplicate {
    public List<Integer> findAllDuplicate(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int n : nums) {
            int index = Math.abs(n) - 1;

            if (nums[index] < 0)
                res.add(Math.abs(n));
            else
                nums[index] = -nums[index];
        }
        return res;
    }
}

class SingleNumber {
    int singleNumber(int[] nums) {
        int s = 0;
        for (int n : nums) {
            s ^= n;
        }
        return s;
    }
}

class StockBuyAndSell {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int p : prices) {
            minPrice = Math.min(minPrice, p);
            maxProfit = Math.max(maxProfit, p - minPrice);
        }
        return maxProfit;
    }

    public int maxProfitTwoTransactions(int[] prices) {
        int n = prices.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            left[i] = Math.max(left[i - 1], prices[i] - minPrice);
        }
        int maxPrice = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxPrice = Math.max(maxPrice, prices[i]);
            right[i] = Math.max(right[i + 1], maxPrice - prices[i]);
        }
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, left[i] + right[i]);
        }
        return maxProfit;
    }
}

class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

class TrappingWater {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        int water = 0;
        for (int i = 0; i < n; i++) {
            water += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return water;
    }
}

class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() < t.length())
            return "";
        Map<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray())
            need.put(c, need.getOrDefault(c, 0) + 1);
        int left = 0, count = 0, minLen = Integer.MAX_VALUE, start = 0;
        Map<Character, Integer> window = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (need.containsKey(c) && window.get(c) <= need.get(c))
                count++;
            while (count == t.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                char lc = s.charAt(left);
                window.put(lc, window.get(lc) - 1);
                if (need.containsKey(lc) && window.get(lc) < need.get(lc))
                    count--;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}

class MeetingRoom {
    public int minMeetingRooms(int[][] intervals) {
        int n = intervals.length;
        int[] start = new int[n], end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int rooms = 0, maxRooms = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (start[i] < end[j]) {
                rooms++;
                maxRooms = Math.max(maxRooms, rooms);
                i++;
            } else {
                rooms--;
                j++;
            }
        }
        return maxRooms;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow)
                return true;
        }
        return false;
    }
}

class BinarySearch {
    public int search(int[] nums, int x) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == x)
                return mid;

            else if (nums[mid] < x)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}

class BinarySearchInRotatedSortedArray {
    public int search(int[] nums, int x) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == x)
                return mid;
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= x && x <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] <= x && x <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}

class LowerBound {
    public int search(int[] nums, int x) {

        int left = 0, right = nums.length - 1;
        int res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= x) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return res;
    }
}

class UpperBound {
    public int search(int[] nums, int x) {
        int left = 0, right = nums.length - 1;
        int res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > x) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
}

class FindPeak {
    public int search(int[] nums) {
        int len = nums.length;
        int left = 0, right = nums.length - 1;
        if (nums.length == 1)
            return 0;
        if (nums[0] > nums[1])
            return 0;
        if (nums[len - 1] > nums[len - 2])
            return len - 1;
        int res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((mid == 0 || nums[mid] > nums[mid - 1]) &&
                    (mid == len - 1 || nums[mid] > nums[mid + 1])) {
                return mid;
            }

            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
}

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = cols - 1, top = 0, bottom = rows - 1;

        List<Integer> res = new ArrayList<>();

        while (res.size() < rows * cols) {
            // top++;
            // right--;
            // bottom--;
            // left++;

            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class MinDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null)
            return 1 + minDepth(root.right);
        if (root.right == null)
            return 1 + minDepth(root.left);
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}

class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null)
            return 1 + maxDepth(root.right);
        if (root.right == null)
            return 1 + maxDepth(root.left);
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

class DiameterOfBinaryTree {
    int d = 0;

    public int solve(TreeNode root) {
        if (root == null)
            return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        d = Math.max(d, left + right);
        return 1 + Math.max(left, right);
    }

    public int diameter(TreeNode root) {
        solve(root);
        return d;
    }
}

class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null && targetSum != 0)
            return false;
        targetSum -= root.val;
        if (root.left == null && root.right == null && targetSum == 0)
            return true;
        return (hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum));
    }
}

class InvertTree {
    TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        if (root.left == null)
            return root.right;
        if (root.right == null)
            return root.left;

        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }
}

class TreeTraversal {
    List<Integer> preOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.right != null)
                stack.add(node.right);
            if (node.left != null)
                stack.add(node.left);
        }
        return res;
    }

    void prOrder1(TreeNode root) {
        if (root == null)
            return;
        System.out.println(root.val);
        prOrder1(root.left);
        prOrder1(root.right);
    }

    List<Integer> postOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> output = new Stack<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            output.add(node);
            if (node.right != null)
                stack.add(node.right);
            if (node.left != null)
                stack.add(node.left);
        }

        while (!output.isEmpty()) {
            res.add(output.pop().val);
        }
        return res;
    }

    List<Integer> inOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;
        while (!stack.isEmpty() || curr != null) {
            while (curr != null) {
                stack.add(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }

}

class TwoSum {
    int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff))
                return new int[] { i, map.get(diff) };
            else
                map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }
}

class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> t1 = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '#' && !s1.isEmpty())
                s1.pop();
            else
                s1.push(ch);
        }

        for (char ch : t.toCharArray()) {
            if (ch == '#' && !t1.isEmpty())
                t1.pop();
            else
                t1.push(ch);
        }

        return s1.equals(t1);
    }
}

class IsSuubsequence {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length(), tLen = t.length();
        int i = 0, j = 0;

        while (i < sLen && j < tLen) {
            if (s.charAt(i) == t.charAt(j))
                i++;
            j++;
        }

        return i == sLen;
    }
}

class MaxAverageSubArray {
    public double findMaxAverage(int[] nums, int k) {
        int s = 0;
        for (int i = 0; i < k; i++) {
            s += nums[i];
        }

        int wind = s;

        for (int i = 1; i < nums.length - k + 1; i++) {
            wind = wind - nums[i - 1] + nums[i + k - 1];
            s = Math.max(s, wind);
        }

        return s;
    }
}

class ProductOfArrayExceptItself {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, 1);
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * right;
            right *= nums[i];
        }

        return res;
    }
}

class ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c = 0;
        for (int n : arr) {
            if (n % 2 != 0) {
                c++;
                if (c == 3)
                    return true;
            } else
                c = 0;
        }
        return false;
    }
}

class ZerosToBeReplacedByMinNumber {
    // public long minSum(int[] nums1, int[] nums2) {
    // int sum1 = 0, sum2 = 0;
    // int zero1 = 0, zero2 = 0;

    // for (int n : nums1) {
    // if (n == 0) zero1++;
    // sum1 += n;
    // }

    // for (int n : nums2) {
    // if (n == 0) zero2++;
    // sum2 += n;
    // }

    // int minSum1 = sum1 + zero1;
    // int minSum2 = sum2 + zero2;

    // if(zero1 ==0 && zero2==0) return sum1 == sum2 ? sum1 : -1;
    // if(zero1 == 0) return minSum2 <= sum1 ? sum1: -1;
    // if(zero2 == 0) return minSum1 <= sum2 ? sum2: -1;

    // return Math.max(minSum1, minSum2);
    // }

    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0, sum2 = 0;
        long zero1 = 0, zero2 = 0;

        for (int n : nums1) {
            if (n == 0)
                zero1++;
            sum1 += n;
        }
        for (int n : nums2) {
            if (n == 0)
                zero2++;
            sum2 += n;
        }

        if (zero1 == 0 && zero2 == 0)
            return sum1 == sum2 ? sum1 : -1;
        if (zero1 == 0)
            return sum2 + zero2 >= sum1 ? sum2 + zero2 : -1;
        if (zero2 == 0)
            return sum1 + zero1 >= sum2 ? sum1 + zero1 : -1;

        return Math.max(sum1 + zero1, sum2 + zero2);
    }

}

class CountPalindromicSubString {
    public int expandFromCenter(int i, int j, String s) {
        int count = 0;
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            count++;
            i--;
            j++;
        }
        return count;
    }

    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += expandFromCenter(i, i, s);
            count += expandFromCenter(i, i + 1, s);
        }

        return count;
    }
}

class FindNumberOfLIS {

    // public int findNumberOfLIS(int[] nums) {
    // int n = nums.length;
    // int[] length = new int[n];
    // int[] count = new int[n];

    // Arrays.fill(length, 1);
    // Arrays.fill(count, 1);

    // int maxLen = 1;

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < i; j++) {
    // if (nums[j] < nums[i]) {
    // if (length[j] + 1 > length[i]) {
    // length[i] = length[j] + 1;
    // count[i] = count[j];
    // } else if (length[j] + 1 == length[i]) {
    // count[i] += count[j];
    // }
    // }
    // }
    // maxLen = Math.max(maxLen, length[i]);
    // }

    // int result = 0;
    // for (int i = 0; i < n; i++) {
    // if (length[i] == maxLen) {
    // result += count[i];
    // }
    // }

    // return result;
    // }

    public int backtrack(int i, int prevI, int[] nums) {
        if (i == nums.length)
            return 0;
        int len = 0 + backtrack(i + 1, prevI, nums);
        if (prevI == -1 || nums[i] > nums[prevI])
            len = Math.max(len, 1 + backtrack(i + 1, i, nums));

        return len;
    }

    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        return backtrack(0, -1, nums);
    }
}

class FrogJumpWithKDistance {
    static int solve(int ind, int[] height, int k) {
        if (ind == 0)
            return 0;
        int diff = Integer.MAX_VALUE;
        for (int j = 1; j <= k; j++) {
            if (ind - j >= 0) {
                int jump = Math.abs(height[ind] - height[ind - j]) + solve(ind - j, height, k);
                diff = Math.min(diff, jump);
            }
        }
        return diff;
    }
}

class NinjaTraining {
    static int solve(int[][] points, int last, int day) {
        if (day == 0) {
            int maxi = 0;
            for (int i = 0; i < 3; i++) {
                if (last != i) {
                    maxi = Math.max(maxi, points[0][i]);
                }
            }
            return maxi;
        }

        int maxi = 0;
        for (int i = 0; i <= 2; i++) {
            if (i != last) {
                int activity = points[day][i] + solve(points, i, day - 1);
                maxi = Math.max(activity, maxi);
            }
        }
        return maxi;
    }

    static int ninjaTraining(int n, int[][] points) {
        // Initialize a memoization table with -1 values
        int dp[][] = new int[n][4];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return solve(points, 3, points.length - 1);
    }
}

class CountWays {
    static int solve(int i, int j, int[][] obstacleGrid) {
        if (i == 0 && j == 0)
            return 1;
        if (i < 0 || j < 0 || obstacleGrid[i][j] == 1)
            return 0;

        int up = solve(i - 1, j, obstacleGrid);
        int left = solve(i, j - 1, obstacleGrid);

        return up + left;
    }

    static int countWays(int[][] obstacleGrid, int m, int n) {
        return solve(m - 1, n - 1, obstacleGrid);
    }
}

class SubsetSum {
    public boolean solve(int i, int target, int[] nums, int[][] dp) {
        if (target == 0)
            return true;
        if (i == 0)
            return nums[0] == target;
        if (dp[i][target] != -1)
            return dp[i][target] == 1 ? true : false;
        boolean notTake = solve(i - 1, target, nums, dp);
        boolean take = false;
        if (target >= nums[i])
            take = solve(i - 1, target - nums[i], nums, dp);
        dp[i][target] = (take || notTake ? 1 : 0);
        return take || notTake;
    }

    public boolean subsetSum(int target, int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][target + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return solve(nums.length - 1, target, nums, dp);
    }

    public boolean equalSubsetSum(int[] nums) {
        int s = 0;
        for (int i : nums)
            s += i;
        if (s % 2 != 0)
            return false;
        int target = (int) s / 2;
        int n = nums.length;
        int[][] dp = new int[n][target + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return solve(nums.length - 1, target, nums, dp);
    }
}

class CanPartitionKSubsets {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int total = 0;
        for (int i : nums) {
            total += i;
        }

        if (total % k != 0)
            return false;

        int target = (int) total / k;
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        boolean[] used = new boolean[nums.length];
        return backtrack(nums, used, 0, k, 0, target);
    }

    public boolean backtrack(int[] nums, boolean[] used, int start, int k, int currentSum, int target) {
        if (k == 1)
            return true;
        if (currentSum == target)
            return backtrack(nums, used, 0, k - 1, 0, target);

        for (int i = start; i < nums.length; i++) {
            if (!used[i] && currentSum + nums[i] <= target) {
                used[i] = true;
                if (backtrack(nums, used, i + 1, k, currentSum + nums[i], target))
                    return true;
                used[i] = false;
            }
        }
        return false;
    }

}

class MinimumDifference {
    public int minimumDifference(int[] nums) {
        int total = 0;
        int n = nums.length;
        for (int i : nums)
            total += i;
        boolean[][] dp = new boolean[n][total + 1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }
        if (nums[0] <= total)
            dp[0][nums[0]] = true;

        for (int i = 1; i < n; i++) {
            for (int target = 1; target <= total; target++) {
                boolean notTake = dp[i - 1][target];
                boolean take = false;
                if (nums[i] <= target)
                    take = dp[i - 1][target - nums[i]];

                dp[i][target] = take || notTake;
            }
        }

        int mini = Integer.MAX_VALUE;

        for (int i = 0; i <= total; i++) {
            if (dp[n - 1][i]) {
                int diff = Math.abs(i - (total - i));
                mini = Math.min(mini, diff);
            }
        }
        return mini;
    }
}

class FlattenNTimes {
    List<Object> flattenNTimes(List<Object> list, int n) {
        if (n <= 0)
            return list;

        List<Object> res = new ArrayList<>();

        for (Object lis : list) {
            if (lis instanceof List<?>) {
                res.addAll((List<?>) lis);
            } else {
                res.add(lis);
            }
        }
        return flattenNTimes(res, n - 1);
    }
}

class LetterFrequency {
    public static void printLetterFrequency(String s) {
        Map<Character, Integer> feq = new HashMap<>();

        for (char ch : s.toLowerCase().toCharArray()) {
            feq.put(ch, feq.getOrDefault(ch, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(feq.entrySet());

        sortedList.sort((a, b) -> {
            int freq = b.getValue().compareTo(a.getValue());
            return freq != 0 ? freq : a.getValue().compareTo(b.getValue());
        });

        for (Map.Entry<Character, Integer> es : feq.entrySet()) {
            System.out.println(es.getKey() + " : " + es.getValue());
        }
    }
}

class PrimeFactorization{
    public static void primeFactorization(int n) {
        // Divide by 2 until odd
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        
        // Check odd factors
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        
        // If n is still > 2, it's prime
        if (n > 2) {
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        primeFactorization(84); // Output: 2 2 3 7
    }
}
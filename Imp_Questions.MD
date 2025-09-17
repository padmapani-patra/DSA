# IMP.java - Problem List, Descriptions, Examples, and Method Signatures

This document lists all the problems solved in `IMP.java`, with a brief description, example, and the Java method signature for each solution.

---

## 1. Missing Number
**Description:**  
Find the missing number in an array containing numbers from 0 to n with one missing.

**Example:**  
Input: `[3, 0, 1]`  
Output: `2`

**Method Signature:**  
```java
public int missingNumber(int[] nums)
```

---

## 2. All Disappeared Numbers
**Description:**  
Find all numbers in the range [1, n] that do not appear in the array.

Input: `[4,3,2,7,8,2,3,1]`  
Output: `[5,6]`

**Method Signatures:**  
```java
List<Integer> allDissappearedNumbersUsingSet(int[] nums)
List<Integer> allDissappearedNumbers(int[] nums)
```

---

## 3. Find Duplicate
**Description:**  
Find the duplicate number in an array containing n+1 integers where each integer is between 1 and n.
**Example:**  
Input: `[1,3,4,2,2]`  
Output: `2`

**Method Signature:**  
```java
public int findDuplicate(int[] nums)
```

---

## 4. Find All Duplicates
**Description:**  
Find all elements that appear twice in an array.
**Example:**  
Input: `[4,3,2,7,8,2,3,1]`  
Output: `[2,3]`

**Method Signature:**  
```java
public List<Integer> findAllDuplicate(int[] nums)
```


## 5. Single Number
**Description:**  
Find the element that appears only once in an array where every other element appears twice.

Input: `[4,1,2,1,2]`  
Output: `4`

**Method Signature:**  
```java
int singleNumber(int[] nums)
```

---

## 6. Stock Buy and Sell (Max Profit)
**Description:**  
Find the maximum profit from buying and selling a stock once.
**Example:**  
Input: `[7,1,5,3,6,4]`  
Output: `5`

**Method Signature:**  
```java
public int maxProfit(int[] prices)
```

---

## 7. Linked List Cycle
**Description:**  
Detect if a linked list has a cycle.

**Example:**  
Input: `1->2->3->4->2 (cycle)`  
Output: `true`

**Method Signature:**  
```java
public boolean hasCycle(ListNode head)
```

---

## 8. Binary Search
**Description:**  
Find the index of a target value in a sorted array.

**Example:**  
Input: `[1,2,3,4,5], target=4`  
Output: `3`

**Method Signature:**  
```java
public int search(int[] nums, int x)
```

---

## 9. Binary Search in Rotated Sorted Array
**Description:**  
Search for a target in a rotated sorted array.

**Example:**  
Input: `[4,5,6,7,0,1,2], target=0`  
Output: `4`

**Method Signature:**  
```java
public int search(int[] nums, int x)
```

---

## 10. Lower Bound
**Description:**  
Find the first index where the value is greater than or equal to the target.

**Example:**  
Input: `[1,2,2,2,3], target=2`  
Output: `1`

**Method Signature:**  
```java
public int search(int[] nums, int x)
```

---

## 11. Upper Bound
**Description:**  
Find the first index where the value is greater than the target.

**Example:**  
Input: `[1,2,2,2,3], target=2`  
Output: `4`

**Method Signature:**  
```java
public int search(int[] nums, int x)
```

---

## 12. Find Peak
**Description:**  
Find a peak element in an array.

**Example:**  
Input: `[1,2,3,1]`  
Output: `2` (index of 3)

**Method Signature:**  
```java
public int search(int[] nums)
```

---

## 13. Spiral Matrix
**Description:**  
Return all elements of a matrix in spiral order.

**Example:**  
Input:  
```
[[1,2,3],
 [4,5,6],
 [7,8,9]]
```
Output: `[1,2,3,6,9,8,7,4,5]`

**Method Signature:**  
```java
public List<Integer> spiralOrder(int[][] matrix)
```

---

## 14. Min Depth of Binary Tree
**Description:**  
Find the minimum depth of a binary tree.

**Example:**  
Input: `[3,9,20,null,null,15,7]`  
Output: `2`

**Method Signature:**  
```java
public int minDepth(TreeNode root)
```

---

## 15. Max Depth of Binary Tree
**Description:**  
Find the maximum depth of a binary tree.

**Example:**  
Input: `[3,9,20,null,null,15,7]`  
Output: `3`

**Method Signature:**  
```java
public int maxDepth(TreeNode root)
```

---

## 16. Diameter of Binary Tree
**Description:**  
Find the diameter (longest path) of a binary tree.

**Example:**  
Input: `[1,2,3,4,5]`  
Output: `3`

**Method Signature:**  
```java
public int solve(TreeNode root)
```

---

## 17. Path Sum
**Description:**  
Check if a binary tree has a root-to-leaf path with a given sum.

**Example:**  
Input: `[5,4,8,11,null,13,4,7,2,null,null,null,1], sum=22`  
Output: `true`

**Method Signature:**  
```java
public boolean hasPathSum(TreeNode root, int sum)
```

---

## 18. Invert Tree
**Description:**  
Invert a binary tree (mirror it).

**Example:**  
Input: `[4,2,7,1,3,6,9]`  
Output: `[4,7,2,9,6,3,1]`

**Method Signature:**  
```java
public TreeNode invertTree(TreeNode root)
```

---

## 19. Tree Traversals (Preorder, Inorder, Postorder)
**Description:**  
Traverse a binary tree in preorder, inorder, and postorder.

**Example:**  
Input: `[1,null,2,3]`  
Output:  
- Preorder: `[1,2,3]`
- Inorder: `[1,3,2]`
- Postorder: `[3,2,1]`

**Method Signatures:**  
```java
public List<Integer> preorderTraversal(TreeNode root)
public List<Integer> inorderTraversal(TreeNode root)
public List<Integer> postorderTraversal(TreeNode root)
```

---

## 20. Two Sum
**Description:**  
Find indices of two numbers that add up to a target.

**Example:**  
Input: `[2,7,11,15], target=9`  
Output: `[0,1]`

**Method Signature:**  
```java
public int[] twoSum(int[] nums, int target)
```

---

## 21. Backspace String Compare
**Description:**  
Compare two strings after processing backspaces (`#`).

**Example:**  
Input: `s = "ab#c", t = "ad#c"`  
Output: `true`

**Method Signature:**  
```java
public boolean backspaceCompare(String s, String t)
```

---

## 22. Is Subsequence
**Description:**  
Check if one string is a subsequence of another.

**Example:**  
Input: `s = "abc", t = "ahbgdc"`  
Output: `true`

**Method Signature:**  
```java
public boolean isSubsequence(String s, String t)
```

---

## 23. Max Average Subarray
**Description:**  
Find the maximum average of a subarray of length k.

**Example:**  
Input: `[1,12,-5,-6,50,3], k=4`  
Output: `12.75`

**Method Signature:**  
```java
public double findMaxAverage(int[] nums, int k)
```

---

## 24. Product of Array Except Self
**Description:**  
Return an array where each element is the product of all other elements.

**Example:**  
Input: `[1,2,3,4]`  
Output: `[24,12,8,6]`

**Method Signature:**  
```java
public int[] productExceptSelf(int[] nums)
```

---

## 25. Three Consecutive Odds
**Description:**  
Check if the array contains three consecutive odd numbers.

**Example:**  
Input: `[2,6,4,1]`  
Output: `false`

**Method Signature:**  
```java
public boolean threeConsecutiveOdds(int[] arr)
```

---

## 26. Zeros To Be Replaced By Min Number
**Description:**  
Replace zeros in two arrays to make their sums equal with the minimum possible sum.

**Example:**  
Input: `nums1=[0,2,3], nums2=[1,0,4]`  
Output: `6`

**Method Signature:**  
```java
public long minSum(int[] nums1, int[] nums2)
```

---

## 27. Count Palindromic Substrings
**Description:**  
Count the number of palindromic substrings in a string.

**Example:**  
Input: `"abc"`  
Output: `3`

**Method Signature:**  
```java
public int countSubstrings(String s)
```

---

## 28. Find Number of LIS
**Description:**  
Find the number of longest increasing subsequences in an array.

**Example:**  
Input: `[1,3,5,4,7]`  
Output: `2`

**Method Signature:**  
```java
public int findNumberOfLIS(int[] nums)
```

---

## 29. Frog Jump With K Distance
**Description:**  
Minimum energy to reach the end of an array, jumping up to k steps at a time.

**Example:**  
Input: `height=[10,30,40,50,20], k=3`  
Output: `30`

**Method Signature:**  
```java
static int solve(int ind, int[] height, int k)
```

---

## 30. Ninja Training
**Description:**  
Maximize points in n days, choosing one of three activities each day, not repeating the previous day's activity.

**Example:**  
Input: `points=[[1,2,5],[3,1,1],[3,3,3]]`  
Output: `11`

**Method Signatures:**  
```java
static int solve(int[][] points, int last, int day)
static int ninjaTraining(int n, int[][] points)
```

---

## 31. Count Ways (Unique Paths with Obstacles)
**Description:**  
Count the number of unique paths in a grid with obstacles.

**Example:**  
Input:  
```
[[0,0,0],
 [0,1,0],
 [0,0,0]]
```
Output: `2`

**Method Signatures:**  
```java
static int solve(int i, int j, int[][] obstacleGrid)
static int countWays(int[][] obstacleGrid, int m, int n)
```

---

## 32. Subset Sum / Equal Subset Sum
**Description:**  
Check if a subset with a given sum exists, or if the array can be partitioned into two subsets with equal sum.

**Example:**  
Input: `[1,5,11,5]`  
Output: `true`

**Method Signatures:**  
```java
public boolean subsetSum(int target, int[] nums)
public boolean equalSubsetSum(int[] nums)
```

---

## 33. Can Partition K Subsets
**Description:**  
Partition array into k subsets with equal sum.

**Example:**  
Input: `[4,3,2,3,5,2,1], k=4`  
Output: `true`

**Method Signature:**  
```java
public boolean canPartitionKSubsets(int[] nums, int k)
```

---

## 34. Minimum Difference (Partition Array)
**Description:**  
Partition array into two subsets such that the difference of their sums is minimized.

**Example:**  
Input: `[1,6,11,5]`  
Output: `1`

**Method Signature:**  
```java
public int minimumDifference(int[] nums)
```

---

## 35. Flatten N Times
**Description:**  
Flatten a nested list n times.

**Example:**  
Input: `[[1,2],[3,[4]],5], n=1`  
Output: `[1,2,3,[4],5]`

**Method Signature:**  
```java
List<Object> flattenNTimes(List<Object> list, int n)
```

---

## 36. Letter Frequency
**Description:**  
Print the frequency of each letter in a string.

**Example:**  
Input: `"aabbc"`  
Output:  
```
a : 2
b : 2
c : 1
```

**Method Signature:**  
```java
public static void printLetterFrequency(String s)
```

## 41. Generate Parentheses
**Description:**  
Given n pairs of parentheses, generate all combinations of well-formed parentheses.

**Example:**  
Input: `n = 3`  
Output: `["((()))","(()())","(())()","()(())","()()()"]`

**Method Signature:**  
```java
public List<String> generateParenthesis(int n)
```

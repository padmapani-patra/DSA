You are given an integer array nums and an integer target.

You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.

For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
Return the number of different expressions that you can build, which evaluates to target.

 

Example 1:

Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.\
-1 + 1 + 1 + 1 + 1 = 3 \
+1 - 1 + 1 + 1 + 1 = 3 \
+1 + 1 - 1 + 1 + 1 = 3 \
+1 + 1 + 1 - 1 + 1 = 3 \
+1 + 1 + 1 + 1 - 1 = 3 


# Python

```python
class Solution:
    def findTargetSumWays(self, nums: List[int], target: int) -> int:
        total = sum(nums)
        if target > total or (total + target) % 2:
            return 0

        p = (total + target) // 2
        d = defaultdict(int)

        d[0] = 1
        for n in nums:
            temp = d.copy()
            for key, value in temp.items():
                if d[key + n] <= p:
                    d[key + n] += value
        return d[p]

```

<br />
<br />
<br />

# JS
```js

```

<br />
<br />
<br />

# JAVA
```java

```
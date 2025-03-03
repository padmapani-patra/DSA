# Python

```python
class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        res = []

        def backtrack(start):
            if start == len(nums):
                res.append(nums[:])
                return
            for i in range(start, len(nums)):
                nums[i], nums[start] = nums[start], nums[i]
                backtrack(start + 1)
                nums[i], nums[start] = nums[start], nums[i]

        backtrack(0)
        return res
  
```

<br />
<br />
<br />

# JS
```js
/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var permute = function(nums) {
    let res = [];
    
    function backtrack(start){
        
        
        if (start == nums.length-1){
           res.push([...nums]);
            return
        }
       for (let i = start; i < nums.length; i++) {
           [nums[start], nums[i]] = [nums[i], nums[start]];
            backtrack(start+1);
            [nums[start], nums[i]] = [nums[i], nums[start]];
        }
    }
    backtrack(0)
    return res;
};

```

<br />
<br />
<br />

# JAVA
```java
import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res);
        return res;
    }

    private void backtrack(int start, int[] nums, List<List<Integer>> res) {
        if (start == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) temp.add(num);
            res.add(temp); // Store a new copy
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, i, start);   // Swap
            backtrack(start + 1, nums, res);
            swap(nums, i, start);   // Backtrack (restore original state)
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3};
        System.out.println(sol.permute(nums));
    }
}

```
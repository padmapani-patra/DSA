# Python
```python
class Solution0:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()

        def dfs(path, i):
            res.append(path[:])
            for j in range(i, len(nums)):
                if j != i and nums[j-1] == nums[j]: continue
                path.append(nums[j])
                dfs(path, j+1)
                path.pop()
        dfs([], 0)
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
var subsetsWithDup = function(nums) {
    let ans = [];
    nums.sort((a,b)=>a-b);
    function dfs(index, t) {
        ans.push([...t])
        for(let i = index; i<nums.length; i++){
            if (i != index && nums[i] == nums[i-1]) continue;
            t.push(nums[i])
            dfs(i+1, t)
            t.pop()
        }
        
    }
    
    dfs(0, [])
    return ans;
};
```

<br />
<br />
<br />

# JAVA
```java
import java.util.*;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);  // Sort to handle duplicates easily
        backtrack(0, nums, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int start, int[] nums, List<Integer> subset, List<List<Integer>> res) {
        res.add(new ArrayList<>(subset));  // Add the current subset to result

        for (int i = start; i < nums.length; i++) {
            // Skip duplicates
            if (i > start && nums[i] == nums[i - 1]) continue;

            subset.add(nums[i]);          // Include nums[i]
            backtrack(i + 1, nums, subset, res);  // Recurse with next index
            subset.remove(subset.size() - 1);  // Backtrack: remove last added element
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 2};
        System.out.println(solution.subsetsWithDup(nums));
    }
}

```
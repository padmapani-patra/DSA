# Python

```python
class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = []
        def backtrack(path, i):
            if i>= len(nums):
                res.append(path)
                return
            backtrack(path + [nums[i]], i+1)
            backtrack(path, i+1)
        backtrack([], 0)
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

const dfs = function(i, subset){
    if (i >= this.nums.length) {
        this.res.push(subset)
        return
    }
    dfs(i+1, [...subset, [nums[i]]]);
    dfs(i+1, subset);
}

var subsets = function(nums) {
    this.res = [];
    this.nums= nums;
    dfs(0, [])
    return this.res
};
```

<br />
<br />
<br />

# JAVA
```java

```
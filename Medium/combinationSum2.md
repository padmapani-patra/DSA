# Python

```python
class Solution:
    def combinationSum2(self, nums: List[int], target: int) -> List[List[int]]:
        res = []
        nums = sorted(nums)
        def backtrack(target, i =0, path = []):
            if target == 0:
                res.append(path[:])
                return
            if i >= len(nums):
                return
            
            if target>=nums[i]:
                backtrack(target - nums[i], i+1, path+[nums[i]])
            
            j = i+1
            while j <len(nums) and nums[j] == nums[i]:
                j+=1
                
            backtrack(target, j, path)
            
        backtrack(target)
        return res



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
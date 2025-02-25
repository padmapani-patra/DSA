# Python

```python
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dic = {}
        for i in range(len(nums)):
            rem = target - nums[i]
            if rem in dic:
                return [dic[rem], i]
            dic[nums[i]] = i
        return [-1, -1]
```

<br />
<br />
<br />

# JS
```js
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let obj = {};
    let n = nums.length;
    for (let i = 0; i<n; i++){
        let rem = target - nums[i];
        if (rem in obj){
            return [obj[rem], i];
        }
        obj[nums[i]] = i;
    }
    return [-1, -1];
};
```

<br />
<br />
<br />

# JAVA
```java

```
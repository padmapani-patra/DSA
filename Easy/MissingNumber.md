# Python

```python
class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        total_sum = (n*(n+1))//2
        s = set(nums)
        for i in s:
            total_sum-=i
        
        return total_sum
        
```

<br />
<br />
<br />

# JS
```js
/**
 * @param {number[]} nums
 * @return {number}
 */
var missingNumber = function(nums) {
    let n = nums.length;
    let totalSum = (n*(n+1))/2;
    let s = new Set(nums);
    for (i of s){
        totalSum -= i;
    }
    return totalSum;
};
```

<br />
<br />
<br />

# JAVA
```java

```
# Python

```python
class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        seen = set(nums)
        max_count = 0
        for i in seen:
            if i-1 not in seen:
                count = 0
                while i in seen:
                    count += 1
                    i+=1
                max_count = max(max_count, count)

        return max_count
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
var longestConsecutive = function(nums) {
    let maxCount = 0;
    let seen = new Set(nums);
    for (let num of seen){
        let count = 0;
        
        if(!seen.has(num-1)){
            while (seen.has(num)){
                count++;
                num++;
            }
        }
        maxCount = Math.max(count, maxCount)
    }
    return maxCount;
};
```

<br />
<br />
<br />

# JAVA
```java

```
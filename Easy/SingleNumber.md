# Python

```python
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        s = 0
        for i in nums:
            s ^= i
        return s
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
var singleNumber = function(nums) {
    let s = 0;
    for (a of nums){
        s ^= a;
    }
    return s;
};
```

<br />
<br />
<br />

# JAVA
```java

```
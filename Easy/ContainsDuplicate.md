# Python

```python
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        s = set(nums)
        return len(s) != len(nums)
```

<br />
<br />
<br />

# JS
```js
/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    let s = new Set(nums);
    return s.size != nums.length;
};
```

<br />
<br />
<br />

# JAVA
```java

```
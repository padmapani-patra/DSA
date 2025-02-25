# Python

```py
class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        major = 0
        count = 0
        for num in nums:
            if count == 0: major = num
            count += 1 if major == num else -1
        return major
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
var majorityElement = function (nums) {
    let major = 0;
    let count = 0;
    for (let i of nums){
        if (count == 0) major = i;
        count += major == i ? 1 : -1;
    }
    return major
}
```

<br />
<br />
<br />

# JAVA
```java

```
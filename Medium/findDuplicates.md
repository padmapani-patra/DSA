`Flip the number at the index to negative to mark it as seen. If we come across an index with negative value then it's duplicate.`

# Python

```python
class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        res = []

        for n in nums:
            index = abs(n) - 1
            if nums[index] < 0:
                res.append(abs(n))
            else:
                nums[index] = -nums[index]

        return res

```

<br />
<br />
<br />

# JS
```js
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDuplicates = function(nums) {
    let res = [];

    for (let n of nums){
        let index = Math.abs(n) - 1;
        if (nums[index] < 0) res.push(Math.abs(n));
        else nums[index] = -nums[index];
    }

    return res
};
```

<br />
<br />
<br />

# JAVA
```java

```
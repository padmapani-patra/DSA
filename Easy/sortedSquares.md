# Python

```python
class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res = [0] * n
        left = 0
        right = n - 1

        for i in range(n - 1, -1, -1):
            if abs(nums[left]) > abs(nums[right]):
                res[i] = nums[left] ** 2
                left += 1
            else:
                res[i] = nums[right] ** 2
                right -= 1

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
var sortedSquares = function (nums) {
    let res = new Array(nums.length).fill(0);

    let n = nums.length;
    let left = 0;
    let right = n - 1;

    for (let i = n - 1; i >= 0; i--) {
        if (Math.abs(nums[left]) > Math.abs(nums[right])) {
            res[i] = nums[left] ** 2;
            left += 1;
        } else {
            res[i] = nums[right] ** 2;
            right -= 1;
        }
    }

    return res;
};
```

<br />
<br />
<br />

# JAVA

```java

```

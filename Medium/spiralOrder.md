# Python

```python
class Solution:
    def spiralOrder(self, nums: List[List[int]]) -> List[int]:
        if not nums:
            return []

        rows, cols = len(nums), len(nums[0])
        left, right, top, bottom = 0, cols - 1, 0, rows - 1

        res = []
        while len(res) < rows * cols:
            for i in range(left, right + 1):
                res.append(nums[top][i])
            top += 1

            for i in range(top, bottom + 1):
                res.append(nums[i][right])
            right -= 1

            if top <= bottom:
                for i in range(right, left - 1, -1):
                    res.append(nums[bottom][i])
                bottom -= 1

            if left <= right:
                for i in range(bottom, top - 1, -1):
                    res.append(nums[i][left])
                left += 1

        return res

```

<br />
<br />
<br />

# JS
```js
/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function (nums) {
    let rows = nums.length, cols = nums[0].length;

    let left = 0, right = cols - 1;
    let top = 0, bottom = rows - 1;

    let res = [];
    while (res.length < rows * cols) {
        for (let i = left; i<= right; i++) {
            res.push(nums[top][i]);
        }
        top += 1;

        for (let i = top; i <= bottom; i++) {
            res.push(nums[i][right]);
        }
        right -= 1;

        if (top <= bottom) {
            for (let i = right; i >= left; i--) {
                res.push(nums[bottom][i]);
            }
            bottom -= 1;
        }

        if (left <= right) {
            for (let i = bottom; i >= top; i--) {
                res.push(nums[i][left]);
            }
            left += 1;
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
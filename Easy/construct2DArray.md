# Python

```python
class Solution:
    def construct2DArray(self, nums: List[int], m: int, n: int) -> List[List[int]]:
        l = len(nums)
        if l != m*n: return[]
        res = []
        c = 0
        for _ in range (m):
            row = []
            for _ in range(n):
                row.append(nums[c])
                c += 1
            res.append(row)
        return res
```

<br />
<br />
<br />

# JS
```js
/**
 * @param {number[]} nums
 * @param {number} m
 * @param {number} n
 * @return {number[][]}
 */
var construct2DArray = function (nums, m, n){
    if (nums.length != m * n) return [];
    let c = 0;
    let res = []
    for (let i = 0; i < m; i++) {
        let row = [];
        for (let j = 0; j < n; j++) {
            row.push(nums[c]);
            c++;
        }
        res.push(row);
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
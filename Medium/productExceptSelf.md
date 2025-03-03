# Python

```python
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l = len(nums)
        res = [1] * l

        for i in range(1, l):
            res[i] = res[i-1] * nums[i-1]

        right_prod = 1
        for i in range(l-1, -1, -1):
            res[i] *= right_prod
            right_prod *= nums[i]
        
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
var productExceptSelf = function(nums) {
    let l = nums.length;
    let res = new Array(l).fill(1);

    for (let i = 1; i < l; i++){
        res[i] = res[i- 1] * nums[i-1];
    }
    let rightProd = 1;
    for (let i = l-1; i>= 0; i--){
        res[i] *= rightProd;
        rightProd *= nums[i];
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
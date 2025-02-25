# Python

```python
class NumArray:

    def __init__(self, nums: List[int]):
        self.pre_sum = nums
        for i in range(len(nums) - 1):
            self.pre_sum[i+1] += nums[i]



    def sumRange(self, left: int, right: int) -> int:
        if left == 0: return self.pre_sum[right]
        return self.pre_sum[right]- self.pre_sum[left-1]


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)
```

<br />
<br />
<br />

# JS
```js
/**
 * @param {number[]} nums
 */
var NumArray = function(nums) {
    this.nums = [...nums]
    for(let i = 0; i< nums.length - 1; i++){
        this.nums[i+1] = this.nums[i+1] + nums[i]
    }
};

/** 
 * @param {number} left 
 * @param {number} right
 * @return {number}
 */
NumArray.prototype.sumRange = function(left, right) {
    if (left == 0) return this.nums[right]
    return this.nums[right] - this.nums[left-1]
};

/** 
 * Your NumArray object will be instantiated and called as such:
 * var obj = new NumArray(nums)
 * var param_1 = obj.sumRange(left,right)
 */
```

<br />
<br />
<br />

# JAVA
```java

```
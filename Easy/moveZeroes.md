# Python

```python
class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        n = 0
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[i], nums[n] = nums[n], nums[i]
                n+=1
            
        return nums
```

<br />
<br />
<br />

# JS
```js
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var moveZeroes = function(nums) {
    let left = 0;
    for (let i = 0; i< nums.length; i++){
        if (nums[i] != 0){
            let temp = nums[i];
            nums[i] = nums[left];
            nums[left] = temp;
            left++;
        }
    }
    return nums
};
```

<br />
<br />
<br />

# JAVA
```java

```
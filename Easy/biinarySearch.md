# Python

```python
class Solution:
    def search(self, nums: List[int], target: int) -> int:
        n = len(nums)
        left = 0
        right = n-1
        while(left <= right):
            mid = left + (right-left)//2

            if nums[mid] == target: return mid

            if nums[mid] > target:
                right = mid-1
            else:
                left = mid+1
        return -1
        
```

<br />
<br />
<br />

# JS
```js
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
    let l = 0;
    let r = nums.length-1
    while (l<=r){
        let m = Math.floor((l+r)/2);
        if (target < nums[m]) r = m-1;
        else if(target > nums[m]) l = m+1;
        else return m;
    }
    return -1
};
```

<br />
<br />
<br />

# JAVA
```java

```
# Python

```python
class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:

        res = window = sum(nums[:k])
        for i in range(1, len(nums)-k +1):
            window = window - nums[i-1] + nums[i+k-1]
            res = max(res, window)
            
        return res/k
        
```

<br />
<br />
<br />

# JS
```js
/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var findMaxAverage = function(nums, k) {
    let window = nums.slice(0, k).reduce((a,b) => a+b, 0);
    let res = window;
    for (let i = 1; i< nums.length-k+1; i++){
        window = window - nums[i-1] + nums[i+k-1];
        res = Math.max(res, window)
    }
    return res/k;
};
```

<br />
<br />
<br />

# JAVA
```java
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Calculate the sum of the first window of size k
        int window = 0;
        for (int i = 0; i < k; i++) {
            window += nums[i];
        }

        int res = window;

        // Slide the window across the array
        for (int i = 1; i <= nums.length - k; i++) {
            window = window - nums[i - 1] + nums[i + k - 1];
            res = Math.max(res, window);
        }

        // Return the maximum average
        return (double) res / k;
    }
}
```
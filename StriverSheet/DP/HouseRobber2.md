# Python

```python
        
```

<br />
<br />
<br />

# JS

```

```

<br />
<br />
<br />

# JAVA
```java
class Solution {
    public int robHelper(int[] nums, int start, int end){
        int rob1 = 0, rob2 = 0;
        for (int i = start; i < end; i++){
            int temp = rob2;
            rob2 = Math.max(rob2, rob1 + nums[i]);
            rob1 = temp;
        }
        return rob2;
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        return Math.max(nums[0], robHelper(nums, 1, n), robHelper(nums, 0, n-1));
    }
}
```
# Python

```python
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curr_sum = max_sum = float('-inf')
        for n in nums:
            curr_sum = max(n, curr_sum+n)
            max_sum = max(max_sum, curr_sum)
        return max_sum
```

<br />
<br />
<br />

# JS
```js

```

<br />
<br />
<br />

# JAVA
```java

```
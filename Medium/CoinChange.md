# Python

```python
class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        dp = [amount + 1] * (amount + 1)
        dp[0] = 0

        for a in range(1, amount + 1):
            for c in coins:
                if a - c >= 0:
                    dp[a] = min(dp[a], 1 + dp[a - c])

        return dp[amount] if dp[amount] != amount + 1 else -1

```

```py

class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        n = len(nuums)
        counts = [1]*n
        
        for i in range(n - 1, -1, -1):
            for j in range(i+1,n):
                if nums[i] < nums[j]:
                    counts[i] = max(counts[i], counts[j]+1)
        return max(counts)
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
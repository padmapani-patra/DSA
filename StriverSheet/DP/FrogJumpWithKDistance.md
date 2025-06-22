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
import java.util.*;

public class Solution {
    public int frogJumpK(int[] heights, int k) {
        int n = heights.length;
        int[] dp = new  int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int cost = dp[i - j] + Math.abs(heights[i] - heights[i - j]);
                    dp[i] = Math.min(dp[i], cost);
                }
            }
        }

        return dp[n - 1];
    }
}
```
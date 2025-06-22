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

import java.util.Arrays;

class Solution {
  public int findWaysUntil(int[] arr, int i, int k, int[][] dp) {
    if (k == 0)
      return 1;
    if (i == 0)
      return arr[0] == k ? 1 : 0;

    if (dp[i][k] != -1)
      return dp[i][k];

    int notTake = findWaysUntil(arr, i - 1, k, dp);
    int take = 0;
    if (arr[i] <= k)
      take = findWaysUntil(arr, i - 1, k - arr[i], dp);

    return dp[i][k] = take + notTake;

  }

  public int findWays(int[] num, int k) {
    int n = num.length;
    int[][] dp = new int[n][k + 1];

    for (int[] row : dp) {
      Arrays.fill(row, -1);
    }
    return findWaysUntil(num, n - 1, k, dp);
  }
}

///////////////////////////////////////////

class Solution1 {
  public int findWays(int[] num, int k) {
    int n = num.length;
    int[][] dp = new int[n][k + 1];

    for (int i = 0; i < n; i++) {
      dp[i][0] = 1;
    }

    if (num[0] <= k) {
      dp[0][num[0]] = 1;
    }

    for (int i = 1; i < n; i++) {
      for (int target = 0; target <= k; target++) {

        int notTake = dp[i - 1][target];
        int take = 0;
        if (num[i] <= target)
          take = dp[i - 1][target - num[i]];

        dp[i][target] = take + notTake;

      }
    }
    return dp[n - 1][k];
  }
}

```
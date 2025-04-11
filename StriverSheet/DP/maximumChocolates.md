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

class Solution {

    public int solve(int[][] arr, int i, int j1, int j2, int n, int m, int[][][] dp) {
        if (j1 < 0 || j1 >= m || j2 < 0 || j2 >= m)
            return Integer.MIN_VALUE;

        if (dp[i][j1][j2] != -1)
            return dp[i][j1][j2];

        if (i == n - 1) {
            if (j1 == j2) {
                return arr[i][j1];
            } else {
                return arr[i][j1] + arr[i][j2];
            }
        }

        int maxi = Integer.MIN_VALUE;
        for (int dj1 = -1; dj1 <= 1; dj1++) {
            for (int dj2 = -1; dj2 <= 1; dj2++) {
                int ans;
                if (j1 == j2) {
                    ans = arr[i][j1] + solve(arr, i + 1, j1 + dj1, j2 + dj2, n, m, dp);
                } else {
                    ans = arr[i][j1] + arr[i][j2] + solve(arr, i + 1, j1 + dj1, j2 + dj2, n, m, dp);
                }
                maxi = Math.max(ans, maxi);
            }
        }

        return dp[i][j1][j2] = maxi;
    }

    public int maximumChocolates(int n, int m, int[][] grid) {
        int[][][] dp = new int[n][m][m];

        for (int[][] row : dp) {
            for (int[] row1 : row) {
                Arrays.fill(row1, -1);
            }
        }

        return solve(grid, 0, 0, m - 1, n, m, dp);
    }
}
```
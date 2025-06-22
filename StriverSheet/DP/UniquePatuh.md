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
class Solution{
    public int solve(int[][] arr, int m, int n, int[][] dp) {
        if (m == 0 && n == 0)
            return 1;
        if (dp[m][n] != -1)
            return dp[m][n];
        int up = 0, left = 0;
        if (m > 0)
            up = solve(arr, m - 1, n, dp);
        if (n > 0)
            left = solve(arr, m, n - 1, dp);
        return dp[m][n] = up + left;
    }

    public int uniquePathsq(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(arr, m-1, n-1, dp);
    }
}

////////////////////////////////
class Solution {
    public int uniquePaths(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[] prev = new int[n];

        for (int i = 0; i < m; i++) {
            int[] row = new int[n];
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    row[j] = 1;
                    continue;
                }

                int up = 0, left = 0;
                if (i > 0)
                    up = prev[j];
                if (j > 0)
                    left = row[j - 1];
                row[j] = up + left;
            }
            prev = Arrays.copyOf(row, n);
        }
        return prev[n - 1];
    }
}
```

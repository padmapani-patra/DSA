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

    public int f(int i, int j, int n, int[][] matrix, int[][] dp) {
        if (j < 0 || j >= n)
            return Integer.MAX_VALUE;
        if (i == 0)
            return matrix[0][j];
        
        if (dp[i][j] != Integer.MAX_VALUE) return dp[i][j]; 

        int up = f(i - 1, j, n, matrix, dp);
        int ld = f(i - 1, j - 1, n, matrix, dp);
        int rd = f(i - 1, j + 1, n, matrix, dp);

        return dp[i][j] = matrix[i][j] + Math.min(up, Math.min(ld, rd));
    }

    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int minPathSum = Integer.MAX_VALUE;

        int[][] dp = new int[m][n];

        for (int[] row: dp) Arrays.fill(row, Integer.MAX_VALUE);

        // Start from any cell in the last row and take the minimum sum
        for (int j = 0; j < n; j++) {
            minPathSum = Math.min(minPathSum, f(m - 1, j, n, matrix, dp));
        }
        
        return minPathSum;
    }
}

////////////////////////////////////////////////////

import java.util.Arrays;

class Solution {

    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int mini = Integer.MAX_VALUE;

        int[][] dp = new int[m][n];

        dp[0] = Arrays.copyOf(matrix[0], n);

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int up = dp[i - 1][j];
                int ld = Integer.MAX_VALUE;
                int rd = Integer.MAX_VALUE;
                if (j > 0)
                    ld = dp[i - 1][j - 1];
                if (j < n - 1)
                    rd = dp[i - 1][j + 1];

                dp[i][j] = matrix[i][j] + Math.min(up, Math.min(ld, rd));
            }
        }

        for (int j = 0; j < n; j++) {
            mini = Math.min(mini, dp[m - 1][j]);
        }

        return mini;
    }
}

////////////////////////////////////////////////////////


import java.util.Arrays;

class Solution {

    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int mini = Integer.MAX_VALUE;

        int[] prev = new int[n];
        int[] curr = new int[n];

        prev = Arrays.copyOf(matrix[0], n);

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int up = prev[j];
                int ld = Integer.MAX_VALUE;
                int rd = Integer.MAX_VALUE;
                if (j > 0)
                    ld = prev[j-1];
                if (j < n - 1)
                    rd = prev[j + 1];

                curr[j] = matrix[i][j] + Math.min(up, Math.min(ld, rd));
            }
            prev = Arrays.copyOf(curr, n);
        }

        for (int j = 0; j < n; j++) {
            mini = Math.min(mini, prev[j]);
        }

        return mini;
    }
}
```
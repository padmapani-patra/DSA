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
    static int countWaysUtil(int m, int n, int[][] dp) {
        // Loop through each cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Base condition: If we are at the top-left cell (0, 0), there's one way to reach it.
                if (i == 0 && j == 0) {
                    dp[i][j] = 1;
                    continue;
                }

                int up = 0;
                int left = 0;

                // Calculate the number of ways by moving up (if possible) and left (if possible)
                if (i > 0)
                    up = dp[i - 1][j];
                if (j > 0)
                    left = dp[i][j - 1];

                // Store the total number of ways to reach the current cell in the DP array
                dp[i][j] = up + left;
            }
        }

        // Return the number of ways to reach the bottom-right cell (m-1, n-1)
        return dp[m - 1][n - 1];
    }

    // Function to count the number of ways to reach cell (m, n)
    static int countWays(int m, int n) {
        // Create a 2D DP array to store the results
        int dp[][] = new int[m][n];

        // Initialize the DP array with -1 to indicate uncomputed values
        for (int[] row : dp)
            Arrays.fill(row, -1);

        // Call the countWaysUtil function to calculate and return the result
        return countWaysUtil(m, n, dp);
    }
}


////////////////////////////////
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[] prev = new int[n];

        for (int i = 0; i < m; i++) {
            int[] row = new int[n];
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == -1) row[i][j] = 0;
                else if (i == 0 && j == 0) {
                    row[j] = 1;
                }

                else{
                    int up = 0, left = 0;

                if (i > 0)
                    up = prev[j];
                if (j > 0)
                    left = row[j - 1];

                row[j] = up + left;
                }
            }
            prev = row;
        }
        return prev[n - 1];
    }
}
```

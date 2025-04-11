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
import java.util.List;

class Solution {

    public int f(int i, int j, List<List<Integer>> triangle, int n) {
        if (i == n - 1)
            return triangle.get(i).get(j);

        int down = triangle.get(i).get(j) + f(i + 1, j, triangle, n);
        int diagonal = triangle.get(i).get(j) + f(i + 1, j + 1, triangle, n);

        return Math.min(down, diagonal);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        return f(0, 0, triangle, n);
    }
}

////////////////////////////////////////////////

import java.util.Arrays;
import java.util.List;

class Solution {

    public int f(int i, int j, List<List<Integer>> triangle, int n, int[][] dp) {
        if(dp[i][j] != -1) return dp[i][j];
        if (i == n - 1)
            return triangle.get(i).get(j);
        int down = triangle.get(i).get(j) + f(i + 1, j, triangle, n, dp);
        int diagonal = triangle.get(i).get(j) + f(i + 1, j + 1, triangle, n, dp);

        return dp[i][j] = Math.min(down, diagonal);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int m = triangle.get(0).size();
        int[][] dp = new int[n][n];

        for (int[] row: dp) Arrays.fill(row, -1);
        return f(0, 0, triangle, n, dp);
    }
}

///////////////////////////////////////////////

import java.util.List;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] front = new int[n]; // Stores the results for the current row
        int[] cur = new int[n];   // Stores the results for the next row

        // Initialize the front array with the values from the bottom row of the triangle
        for (int j = 0; j < n; j++) {
            front[j] = triangle.get(n - 1).get(j);
        }

        // Starting from the second to last row, calculate the minimum path sum for each element
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                // Calculate the two possible paths: moving down or moving diagonally
                int down = triangle.get(i).get(j) + front[j];
                int diagonal = triangle.get(i).get(j) + front[j + 1];

                // Store the minimum of the two paths in the cur array
                cur[j] = Math.min(down, diagonal);
            }
            
            // Update the front array with the values from the cur array for the next row
            front = cur.clone();
        }

        // The result is stored at the top of the front array
        return front[0];
    }
}

```
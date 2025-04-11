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

////////////////////////////////////////////////////////

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
```
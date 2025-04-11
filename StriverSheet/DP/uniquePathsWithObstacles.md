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
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[] prev = new int[n];

        for (int i = 0; i < m; i++) {
            int[] row = new int[n];
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1)
                    row[j] = 0;
                else if (i == 0 && j == 0) {
                    row[j] = 1;
                }

                else {
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

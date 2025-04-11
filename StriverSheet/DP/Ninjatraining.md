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
    
    int f(int day, int last, int[][] points, int[][] dp) {
        if (dp[day][last] != -1) return dp[day][last];
        if (day == 0) {
            int maxi = 0;
            for (int i = 0; i<=2; i++){
                if (i!= last){
                    maxi = Math.max(maxi, points[0][i]);
                }
            }
            dp[day][last] = maxi;
            return dp[day][last];
        }
        
        int maxi = 0;
        for (int i = 0; i<=2; i++){
            if (i != last){
                int point = points[day][i] + f(day-1, i, points, dp);
                maxi = Math.max(maxi, point);
            }
        }
        dp[day][last] = maxi;
        return dp[day][last];
    }
    
    public int maximumPoints(int arr[][]) {
        int n = arr.length;
        int[][] dp = new int[n][4];
        for (int[] row: dp){
            Arrays.fill(row, -1);
        }
        return f(n-1, 3, arr, dp);
    }
}


// ########################TABULATION############################################

class Solution {
    public int maximumPoints(int arr[][]) {
        int n = arr.length;
        int[][] dp = new int[n][4];
        dp[0][0] = Math.max(arr[0][1], arr[0][2]);
        dp[0][1] = Math.max(arr[0][0], arr[0][2]);
        dp[0][2] = Math.max(arr[0][0], arr[0][1]);
        dp[0][3] = Math.max(arr[0][0], Math.max(arr[0][1],arr[0][2]));

        for (int day = 1; day <n; day++){
            for (int last = 0; last<4; last++){
                dp[day][last] = 0;
                for (int i = 0; i<3; i++){
                    if (i!=last){
                        int point = arr[day][i] + dp[day-1][i];
                        dp[day][last] = Math.max(dp[day][last], point);
                    }
                }
            }
        }
        return dp[n-1][3];
    }
}

/////////////////////////////SPACE OPTIMIZATION/////////////////////////////////////////


class Solution {
    public int maximumPoints(int arr[][]) {
        int n = arr.length;
        int[] prev = new int[4];
        prev[0] = Math.max(arr[0][1], arr[0][2]);
        prev[1] = Math.max(arr[0][0], arr[0][2]);
        prev[2] = Math.max(arr[0][0], arr[0][1]);
        prev[3] = Math.max(arr[0][0], Math.max(arr[0][1],arr[0][2]));

        for (int day = 1; day <n; day++){
            int[] temp = new int[4];
            for (int last = 0; last<4; last++){
                temp[last] = 0;
                for (int i = 0; i<3; i++){
                    if (i!=last){
                        temp[last] = Math.max(temp[last], arr[day][i] + prev[i]);
                    }
                }
            }
            prev = temp;
        }

        return prev[3];
    }
}

```
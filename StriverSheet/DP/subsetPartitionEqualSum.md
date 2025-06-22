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
  public boolean solve(int i, int target, int[] arr) {
    if (target == 0)
      return true;
    if (i == 0)
      return target == arr[i];
    boolean notTake = solve(i - 1, target, arr);
    boolean take = false;
    if (target >= arr[i])
      take = solve(i - 1, target - arr[i], arr);

    return take || notTake;

  }

  public boolean isSubsetSum(int[] arr, int target) {
    int n = arr.length;
    return solve(n - 1, target, arr);
  }
}

/////////////////////////////////////

class Solution {
  public boolean solve(int i, int target, int[] arr, int[][] dp) {
    if (dp[i][target] != -1)
      return dp[i][target] == 1 ? true : false;
    if (target == 0)
      return true;
    if (i == 0)
      return target == arr[i];
    boolean notTake = solve(i - 1, target, arr);
    boolean take = false;
    if (target >= arr[i])
      take = solve(i - 1, target - arr[i], arr);

    dp[i][target] = (take || notTake) ? 1 : 0;

    return take || notTake;

  }

  public boolean isSubsetSum(int[] arr, int target) {
    int n = arr.length;
    int[][] dp = new int[n][target + 1];

    for (int[] row : dp) {
      Arrays.fill(row, -1);
    }

    return solve(n - 1, target, arr, dp);
  }
}

//////////////////////////////////////////////

class Solution1 {
  public boolean isSubsetSum(int[] arr, int target) {
    int n = arr.length;
    boolean[][] dp = new boolean[n][target + 1];

    for (int i = 0; i < n; i++) {
      dp[i][0] = true;
    }

    if (arr[0] <= target) {
      dp[0][arr[0]] = true;
    }

    for (int i = 1; i < n; i++) {
      for (int k = 1; k <= target; k++) {
        boolean notTake = dp[i - 1][k];
        boolean take = false;
        if (k >= arr[i])
          take = dp[i - 1][k - arr[i]];
        dp[i][k] = take || notTake;

      }
    }

    return dp[n - 1][target];
  }
}


//////////////////////////////////////////////

class Solution2 {
  public boolean isSubsetSum(int[] arr) {
    int sum = 0;
    for (int n : arr)
      sum += n;
    if (sum % 2 != 0)
      return false;
    int target = sum / 2;

    int n = arr.length;
    boolean[][] dp = new boolean[n][target + 1];

    for (int i = 0; i < n; i++) {
      dp[i][0] = true;
    }

    if (arr[0] <= target) {
      dp[0][arr[0]] = true;
    }

    for (int i = 1; i < n; i++) {
      for (int k = 1; k <= target; k++) {
        boolean notTake = dp[i - 1][k];
        boolean take = false;
        if (k >= arr[i])
          take = dp[i - 1][k - arr[i]];
        dp[i][k] = take || notTake;

      }
    }

    return dp[n - 1][target];
  }
}
```
```
# Python

```py
class Solution:
    def forg_jump(self, n, heights):
        prev, prev2 = 0, 0
        for i in range(1, n):
            fs = prev + abs(heights[i]-heights[i-1])
            ss = float('inf')
            if i > 1: ss = prev2 + abs(heights[i] - heights[i-2])
            curri = min(fs, ss)
            prev2 = prev
            prev = curri

        return prev

```

<br />
<br />
<br />

# JS
```js

```

<br />
<br />
<br />

# JAVA
```java
import java.util.*;

class Solution {
    int frogJump(int n, int[] heights) {
        int prev = 0, prev2 = 0;
        for (int i = 1; i < n; i++) {
            int fs = prev + Math.abs(heights[i] - heights[i - 1]);
            int ss = Integer.MAX_VALUE;
            if (i > 1) {
                ss = prev2 + Math.abs(heights[i] - heights[i - 2]);
            }
            int curri = Math.min(fs, ss);
            prev2 = prev;
            prev = curri;
        }
        return prev;
    }
}
```
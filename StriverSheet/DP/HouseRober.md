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
    public int rob(int[] nums) {
        int rob1 = 0, rob2 = 0;

        for (int n : nums) {
            int temp = rob2;
            rob2 = Math.max(rob2, rob1 + n);
            rob1 = temp;
        }

        return rob2;
    }
}
```
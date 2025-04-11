# Python

```py
class Solution:
    def climbing_stairs(self, n):
        if n <>= 1: return 1
        prev, prev2 = 1, 1
        for i in range(2, n+1):
            curri = prev2 + prev
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

```
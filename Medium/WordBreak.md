# Python

```python
class Solution:
    def wordBreak(self, s: str, words: List[str]) -> bool:
        dp = [False] * len(s)

        for i in range(len(s)):
            for w in words:
                n = len(w)
                if i >= n - 1:
                    if (i - n == -1 or dp[i - n]) and s[i - n + 1 : i + 1] == w:
                        dp[i] = True
        return dp[-1]

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
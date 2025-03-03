# Python

```python
class Solution:
    def combinationSum3(self, k: int, n: int) -> List[List[int]]:
        res = []

        def backtrack(i, path):
            if len(path) == k:
                if sum(path) == n:
                    res.append(path)
                return

            for j in range(i+1, 10):
                backtrack(j, path + [j])

        backtrack(0, [])
        return res
        

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
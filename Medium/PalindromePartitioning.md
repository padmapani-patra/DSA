# Python

```python
class Solution:
    def partition(self, s: str) -> List[List[str]]:

        res = []
        path = []
        def is_pallindrom(sub):
            return sub == sub[::-1]
        def backtrack(start):
            if start == len(s):
                res.append(path[:])
                return

            for end in range(start, len(s)):
                if is_pallindrom(s[start: end+1]):
                    path.append(s[start: end+1])
                    backtrack(end+1)
                    path.pop()
        backtrack(0)
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
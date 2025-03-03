# Python

```python
class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if not digits: return []
        dic = { "2": "abc", "3": "def", "4":"ghi", "5":"jkl", "6":"mno", "7":"pqrs", "8":"tuv", "9":"wxyz"}
        res = []

        def backtrack(i, path):
            if i >= len(digits):
                res.append(path[:])
                return

            s = dic[digits[i]]
            for c in s:
                backtrack(i+1, path+c)
        backtrack(0, "")
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
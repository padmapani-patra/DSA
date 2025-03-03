# Python

```python
class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        res = []

        def backtrack(c, path):
            if len(path) == k:
                res.append(path)
                return

            for i in range(c + 1, n + 1):
                backtrack(i, path + [i])

        backtrack(0, [])
        return res

```

<br />
<br />
<br />

# JS
```js
/**
 * @param {number} n
 * @param {number} k
 * @return {number[][]}
 */
var combine = function(n, k) {
    let res = []
    function backtrack(c, path){
        if(path.length == k ){
            res.push(path);
            return;
        }
        for(let i = c+1; i< n+1; i++){
            backtrack(i, [...path, i]);
        }
    }
    
    backtrack(0, []);
    return res;
};
```

<br />
<br />
<br />

# JAVA
```java

```
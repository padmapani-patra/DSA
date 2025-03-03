# Python

```python
class Solution:
    def combinationSum(self, candidates: List[int], k: int) -> List[List[int]]:
        res = []

        def backtrack(c, path):
            if sum(path) == k:
                res.append(path)
                return
            if sum(path) > k:
                return

            for i in range(c, len(candidates)):
                backtrack(i, path + [candidates[i]])

        backtrack(0, [])
        return res

```

<br />
<br />
<br />

# JS
```js
/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
var combinationSum = function(candidates, target) {
    
    let res = [];

    function backtrack(n = 0, path=[]){
        let sum = path.reduce((a, b) => a + b, 0);
        if(sum === target){
            res.push(path);
            return;
        }
        if(sum >= target){
            return;
        }
        for(let i = n; i< candidates.length; i++){
            // here i = n cause same numbers can be repeated for multiple times
            backtrack(i, [...path, candidates[i]]);
        }
    }
    
    backtrack()
    return res;
};
```

<br />
<br />
<br />

# JAVA
```java

```
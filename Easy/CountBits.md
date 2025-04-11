# Python

```python
class Solution:
    def countBits(self, n: int) -> List[int]:
        res = [0]
        for i in range(1, n+1):
            res.append(res[i//2]+ (i%2))
        return res
        
```

<br />
<br />
<br />

# JS
```js
/**
 * @param {number} n
 * @return {number[]}
 */
var countBits = function(n) {
    let res = [0];
    for (let i = 1; i<= n; i++){
        res.push(res[Math.floor(i/2)] + i%2)
    }
    return res
};
```

<br />
<br />
<br />

# JAVA
```java

class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] = 0;

        for (int i = 1; i<=n; i++){
            res[i] = res[i/2] + (i%2);
        }

        return res;
    }
}
```
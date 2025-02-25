# Python

```python
class Solution:
    def climbStairs(self, n: int) -> int:
        if n in [0, 1]: return 1
        left = self.climbStairs(n-1)
        right = self.climbStairs(n-2)
        return left+right

######################################
class Solution:
    def climbStairs(self, n: int) -> int:
        if n in [0, 1]: return 1
        a = b = 1
        for i in range(1, n):
            a, b = b, a+b

        return b

```

<br />
<br />
<br />

# JS
```js
/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function(n) {
    if(n==0 || n==1) return 1;
    let [a, b] = [1, 1];
    let i = 1;
    while(i < n){
        [a, b] = [b, a+b]
        i++;
    }
    return b;

};


```

<br />
<br />
<br />

# JAVA
```java

```
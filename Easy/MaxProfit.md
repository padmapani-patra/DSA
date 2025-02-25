# Python

```python
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        mn = float('inf')
        mx = float('-inf')

        for p in prices:
            mn = min(p, mn)
            mx = max(mx, p-mn)
        
        return mx
        
```

<br />
<br />
<br />

# JS
```js
/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let maxProfit = -Infinity;
    let currMin = Infinity;
    for (let p of prices){
        currMin = Math.min(currMin, p);
        maxProfit = Math.max(maxProfit, p-currMin);
    }
    return maxProfit;
};
```

<br />
<br />
<br />

# JAVA
```java

```
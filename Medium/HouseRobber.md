# Python

```python
class Solution:
    def rob(self, nums: List[int]) -> int:
        rob1 = rob2 = 0

        for n in nums:
            rob1, rob2 = rob2, max(rob2, rob1+n)
        
        return rob2
        
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
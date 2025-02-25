# Python

```python
class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        i, j = 0, 0
        ls = len(s)
        lt = len(t)

        while i < ls and j < lt:
            if s[i] == t[j]:
                i+=1
            j+=1
        return i == ls
```

<br />
<br />
<br />

# JS
```js
/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isSubsequence = function(s, t) {
    let ls = s.length, lt = t.length;
    let i = 0, j = 0;
    while(i<ls && j<lt){
        if(s[i] === t[j]) i++
        j++
    }
    return i === ls;
};
```

<br />
<br />
<br />

# JAVA
```java

```
# Python

```python
class Solution:
    def letterCasePermutation(self, s: str) -> List[str]:
        record = [""]
        for ch in s:
            if ch.isnumeric():
                for i in range(len(record)):
                    record[i] += ch
            if ch.isalpha():
                record*=2
                for i in range(len(record)):
                    if i*2 < len(record):
                        record[i] += ch.lower() 
                    else:
                        record[i] += ch.upper() 
        return record

        
```

<br />
<br />
<br />

# JS
```js
/**
 * @param {string} s
 * @return {string[]}
 */


function isAlpha(ch){
    return /[a-zA-Z]/i.test(ch)
}

var letterCasePermutation = function(s) {
    let res = [""]
    for (let ch of s){
        if (!isAlpha(ch)){
            for (let i = 0; i < res.length; i++){
                res[i] = `${res[i]}${ch}`
            }
        }
        
        if (isAlpha(ch)){
            res = [...res, ...res];
            for (let i = 0; i < res.length; i++){
                if(i*2<res.length) res[i] = `${res[i]}${ch.toLowerCase()}`
                else res[i]= `${res[i]}${ch.toUpperCase()}`
            }
        }
        
    }
    return res
};
```

<br />
<br />
<br />

# JAVA
```java
import java.util.*;

class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        res.add("");

        for (char c : s.toCharArray()) {
            int size = res.size();
            if (Character.isDigit(c)) {
                // Append digit to all existing strings
                for (int i = 0; i < size; i++) {
                    res.set(i, res.get(i) + c);
                }
            } else if (Character.isLetter(c)) {
                // Duplicate list and modify for both letter cases
                for (int i = 0; i < size; i++) {
                    res.add(res.get(i) + Character.toUpperCase(c));
                    res.set(i, res.get(i) + Character.toLowerCase(c));
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCasePermutation("a1b2"));
    }
}
```
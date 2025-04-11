# Python

```python
class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        s1 = []
        t1 = []
        for c in s:
            if c != '#':
                s1.append(c)
            elif c == '#' and len(s1) != 0:
                s1.pop()
        
        for c in t:
            if c != '#':
                t1.append(c)
            elif c == '#' and len(t1) != 0:
                t1.pop()
        
        return ''.join(s1) == ''.join(t1)        
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
var backspaceCompare = function(s, t) {
    let l1=[], l2=[];
    for (c of s){
        if (c == '#' && l1.length !=0) l1.pop()
        else if(c!='#') l1.push(c)
    }
    
    for (c of t){
        if (c == '#' && l2.length !=0) l2.pop()
         else if(c!='#') l2.push(c)
    }
    console.log(l1, l2)
    
    return l1.join('') == l2.join('')
};
```

<br />
<br />
<br />

# JAVA
```java
import java.util.*;

class Solution{

    public boolean backspaceCompare(String s, String t){
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for (char c: s.toCharArray()){
            if (c != '#'){
                s1.push(c);
            } else if(!s1.isEmpty()){
                s1.pop();
            }
        }

        for (char c: t.toCharArray()){
            if (c != '#'){
                s2.push(c);
            } else if(!s2.isEmpty()){
                s2.pop();
            }
        }

        return s1.equals(s2);
    }
}
```
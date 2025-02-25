# Python

```python
class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:

        n = len(letters)
        left = 0
        right = n-1
        res = letters[0]
        while left <= right:
            mid = left + (right-left)//2

            if letters[mid] > target:
                res = letters[mid]
                right = mid-1
            else:
                left = mid+1
        return res
```

<br />
<br />
<br />

# JS
```js
/**
 * @param {character[]} letters
 * @param {character} target
 * @return {character}
 */
var nextGreatestLetter = function (letters, target) {
    let n = letters.length;
    let low = 0;
    let high = n - 1;

    let res = letters[0]

    while (low <= high) {
        let mid = low + Math.floor((high - low) / 2);
        if (letters[mid] > target) {
            res = letters[mid];
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return res;
};
```

<br />
<br />
<br />

# JAVA
```java

```
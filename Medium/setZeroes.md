# Python

```python
class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        rows = len(matrix)
        cols = len(matrix[0])

        s1, s2 = set(), set()

        for i in range(rows):
            for j in range(cols):
                if matrix[i][j] == 0:
                    s1.add(i)
                    s2.add(j)

        for i in range(rows):
            for j in range(cols):
                if i in s1 or j in s2:
                    matrix[i][j] = 0
        
```

<br />
<br />
<br />

# JS
```js
/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var setZeroes = function (matrix) {
    let i_set = new Set();
    let j_set = new Set();
    let columnLength = matrix[0].length;
    let rowLength = matrix.length;

    for (let i = 0; i < rowLength; i++) {
        for (let j = 0; j < columnLength; j++) {
            if (matrix[i][j] === 0) {
                i_set.add(i);
                j_set.add(j);
            }
        }
    }

    for (let i = 0; i < rowLength; i++) {
        for (let j = 0; j < columnLength; j++) {
            if (i_set.has(i) || j_set.has(j)) {
                matrix[i][j] = 0
            }
        }
    }
    return matrix

};
```

<br />
<br />
<br />

# JAVA
```java

```
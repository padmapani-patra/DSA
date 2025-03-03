# Python

```python
class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """

        def transpose():
            rows, cols = len(matrix), len(matrix[0])
            for i in range(rows):
                for j in range(i, cols):
                    matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

        def reverse():
            rows, cols = len(matrix), len(matrix[0])
            for i in range(rows):
                left, right = 0, cols - 1
                while left < right:
                    matrix[i][left], matrix[i][right] = (
                        matrix[i][right],
                        matrix[i][left],
                    )
                    left += 1
                    right -= 1

        transpose()
        reverse()

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

function transpose(matrix) {
    const rows = matrix.length;
    const cols = matrix[0].length;
    for(let i = 0; i< rows; i++){
        for (let j = i; j<cols; j++){
            let temp = matrix[i][j];
            matrix[i][j] = matrix[j][i]
            matrix[j][i] = temp
        }
    }
    
    
}

function reverse(matrix) {
    const rows = matrix.length;
    for(let i = 0; i< rows; i++){
        let left = 0;
        let right = matrix[0].length-1
        while(left<right){
            let temp = matrix[i][left];
            matrix[i][left] = matrix[i][right]
            matrix[i][right] = temp
            left+=1;
            right-=1;
        }
    }
}

var rotate = function(matrix) {
    transpose(matrix)
    reverse(matrix)
};
```

<br />
<br />
<br />

# JAVA
```java

```
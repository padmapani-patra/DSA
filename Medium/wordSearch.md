# Python

```python
class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
    
        rows = len(board)
        cols = len(board[0])
        traversed = set()
        
        def dfs(r, c, i):
            if i == len(word): return True
        
            if (
                min(r, c) < 0
                or r >= rows
                or c >= cols
                or (r, c) in traversed
                or board[r][c] != word[i]
            ): 
                return False
            
            traversed.add((r,c))
            found = (
                dfs(r+1, c, i+1)
                or dfs(r-1, c, i+1)
                or dfs(r, c+1, i+1)
                or dfs(r, c-1, i+1)
            )
            traversed.remove((r,c))
            return found
        
        for r in range(rows):
            for c in range(cols):
                if dfs(r,c, 0): return True
        return False

```

<br />
<br />
<br />

# JS
```js
/**
 * @param {character[][]} board
 * @param {string} word
 * @return {boolean}
 */


function dfs(r, c, i){
    if (i == this.word.length) return true;
    
    let pair = `${r},${c}`
    
    if(
        Math.min(r,c) < 0
        || r >= this.rows
        || c >= this.cols
        || this.traversed.has(pair)
        || this.baord[r][c] != this.word[i]
    ) return false
    
    this.traversed.add(pair);
    let found = (
        dfs (r+1, c, i+1)
        || dfs (r-1, c, i+1)
        || dfs (r, c+1, i+1)
        || dfs (r, c-1, i+1)
    )
    
    this.traversed.delete(pair);
    return found;
}


var exist = function(board, word) {
    this.rows = board.length;
    this.cols = board[0].length;
    this.traversed = new Set();
    this.word = word
    this.baord = board
    
    for (let i = 0; i< rows; i++){
        for(let j = 0; j < cols; j++){
            if (dfs(i, j, 0)) return true 
        }
    }
    return false;
};
```

<br />
<br />
<br />

# JAVA
```java

```
# Python

```python
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        d = 0
        def dfs(node):
            nonlocal d
            if not node: return 0
            left = dfs(node.left)
            right = dfs(node.right)
            d = max(d, left + right)
            return 1 + max(left, right)    
        dfs(root)
        return d
        
```

<br />
<br />
<br />

# JS
```js
/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var diameterOfBinaryTree = function(root) {
    let d = 0;
    function dfs(node){
        if (!node) return 0;
        let left = dfs(node.left);
        let right = dfs(node.right);
        d = Math.max(d, left + right);
        return 1 + Math.max(left, right);
    }
    dfs(root);
    return d;
};
```

<br />
<br />
<br />

# JAVA
```java

```
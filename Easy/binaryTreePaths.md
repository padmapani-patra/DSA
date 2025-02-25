# Python

```python
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
        
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        res = []
        def dfs(node, path=''):
            path += f"{node.val}->"
            if not(node.left or node.right):
                res.append(path[:-2])
                return
            if node.left: dfs(node.left, path)
            if node.right: dfs(node.right, path)
        dfs(root)
        return res
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
 * @return {string[]}
 */


const dfs = function (root, path) {
    path += `${root.val}->`;
    if (!root.left && !root.right){
        this.res.push(path.slice(0, path.length-2))
        return path;
    }
    if (root.left) dfs(root.left, path)
    if (root.right) dfs(root.right, path)
}

var binaryTreePaths = function(root) {
    this.res = []
    dfs(root, "");
    return this.res;
};
```

<br />
<br />
<br />

# JAVA
```java

```
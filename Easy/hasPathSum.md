# Python

```python
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if not root: return False
        targetSum -= root.val
        if not root.left and not root.right and targetSum == 0: return True
        if root.left and self.hasPathSum(root.left, targetSum): return True
        if root.right and self.hasPathSum(root.right, targetSum): return True
        return False
        
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
 * @param {number} targetSum
 * @return {boolean}
 */
var hasPathSum = function(root, targetSum) {
    if (!root) return false
    targetSum -= root.val;
    if (!root.left && !root.right && targetSum == 0) return true;
    if (root.right && hasPathSum(root.right, targetSum)) return true;
    if (root.left && hasPathSum(root.left, targetSum)) return true;
    return false;
};
```

<br />
<br />
<br />

# JAVA
```java

```
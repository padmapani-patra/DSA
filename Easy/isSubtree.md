# Python

```python
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        if self.isSameTree(root, subRoot): return True
        if not root: return False
        return self.isSubtree(root.left, subRoot) or self.isSubtree(root.right, subRoot)


    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        if not(p or q): return True
        if not p or not q: return False
        return p.val == q.val and self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)
        
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
 * @param {TreeNode} subRoot
 * @return {boolean}
 */

var isSameTree = function (p, q) {
    if (!(p || q)) return true;
    if (!(p && q)) return false;

    return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
};

var isSubtree = function (root, subRoot) {
    if (isSameTree(root, subRoot)) return true;
    if (!root) return false;
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
};
```

<br />
<br />
<br />

# JAVA
```java

```
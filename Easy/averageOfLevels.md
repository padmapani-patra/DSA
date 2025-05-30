# Python

```python
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def averageOfLevels(self, root: Optional[TreeNode]) -> List[float]:
        res = []

        queue = deque([root])

        while queue:
            l = len(queue)
            s = 0
            for _ in range(l):
                node = queue.popleft()
                if node.left: queue.append(node.left)
                if node.right: queue.append(node.right)
                s += node.val
            res.append(s/l)
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
 * @return {number[]}
 */

var averageOfLevels = function (root) {
  if (!root) return [];
  let resAverages = [];
  let queue = []; // required for tree traversal
  queue.push(root);

  while (queue.length) {
    const next = []; // keeps track of nodes from each level
    let sum = 0;
    // iterate nodes from each level
    for (const node of queue) {
      sum += node.val;
      if (node.left) next.push(node.left);
      if (node.right) next.push(node.right);
    }
    // sum of nodes divided by no. of non-null nodes present in each level
    const avg = sum / queue.length;
    resAverages.push(avg);
    // queue has nodes from the next level
    queue = next;
  }
  return resAverages;
};
```

<br />
<br />
<br />

# JAVA

```java
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution{
    public List<Double> averageOfLevels (TreeNode root){
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            int l = queue.size();

            double sum = 0;

            for(int i = 0; i<l; i++){
                TreeNode node = queue.poll();

                sum += node.val;
                if (node.left != null) queue.add(node.left);
                if (node.right!= null) queue.add(node.right);
            }

            res.add(sum/l);
        }
        return res;
    }
}
```

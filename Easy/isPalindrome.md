# Python

```python
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        left = head
        def traverse(right):
            nonlocal left
            if not right: return True
            res = traverse(right.next) and right.val == left.val
            left = left.next
            return res
        return traverse(head.next)
        
```

<br />
<br />
<br />

# JS
```js
/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function(head) {
    let left = head;
    function traverse(head){
        if (!head) return true;
        res = traverse(head.next) && head.val == left.val;
        left = left.next;
        return res
    }
    return traverse(head);
};
```

<br />
<br />
<br />

# JAVA
```java

```
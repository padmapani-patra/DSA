# Python

```python
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        current = head
        prev = None
        while current:
            temp = current.next
            current.next = prev
            prev = current
            current = temp

        return prev
        
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
 * @return {ListNode}
 */
var reverseList = function(head) {
    let prev = null;
    let current = head;

    while (current){
        let temp = current.next;
        current.next = prev;
        prev = current;
        current = temp;
    }
    return prev;
};
```

<br />
<br />
<br />

# JAVA
```java

```
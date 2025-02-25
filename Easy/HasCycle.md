# Python

```python
class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        slow = head
        fast = head
        
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if fast == slow: return True
        return False
```

<br />
<br />
<br />

# JS
```js
var hasCycle = function(head) {
    let slow = head;
    let fast = head;

    while(fast && fast.next){
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) return true;
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
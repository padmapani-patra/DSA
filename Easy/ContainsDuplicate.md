# Python

```python
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        s = set(nums)
        return len(s) != len(nums)
```

<br />
<br />
<br />

# JS

```js
/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function (nums) {
  let s = new Set(nums);
  return s.size != nums.length;
};
```

<br />
<br />
<br />

# JAVA

```java
import java.util.HashSet;
import java.util.Set;

class Solution {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> s = new HashSet<>();

    for (int n : nums) {
      if (!s.add(n))
        return true;
    }
    return false;
  }
}
```

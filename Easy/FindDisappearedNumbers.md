# Python

```python
class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        res = []
        s = set(nums)
        n = len(nums)
        i = 1
        while i<=n:
            if i not in s: res.append(i)
            i+=1
        return res
```

<br />
<br />
<br />

# JS
```js
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
    let n = nums.length;
    let s = new Set(nums);
    let i = 1;
    let res = []
    while (i<=n){
        if (!s.has(i)) res.push(i);
        i++;
    }
    return res;
};
```

<br />
<br />
<br />

# JAVA
```java
class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i : nums)
            set.add(i);

        int l = nums.length;
        for (int i = 1; i <= l; i++) {
            if (!set.contains(i))
                res.add(i);
        }

        return res;
    }
}
```
// Leetcode 2344 

// Minimum Deletions to make array divisible


import math
class Solution:
    def minOperations(self, nums: List[int], numsDivide: List[int]) -> int:
        nums=sorted(nums)
        gcd=math.gcd(*numsDivide)
        deleted=0
        if nums[0]>gcd:
            return -1
        for i in nums:
            if gcd%i==0:
                return deleted
            else:
                deleted+=1
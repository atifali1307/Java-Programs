// Leetcode 1996
// The Number of Weak Characters in the Game

// Python Solution


class Solution:
    def numberOfWeakCharacters(self, p: List[List[int]]) -> int:
        p.sort(key=lambda x:(-x[0],x[1]))
        result=0
        curr_max=0
        for _,d in p:
            if d<curr_max:
                result+=1
            else:
                curr_max=d
        return result
// Leetcode 1578
// Minimum time to make rope colorfull

// Python solution

class Solution:
    def minCost(self, colors: str, neededTime: List[int]) -> int:
        i=0
        result=0
        colors=list(colors)
        while i<len(colors):
            j=i+1
            if j<len(colors) and colors[j]==colors[i]:
                while j<len(colors) and colors[j]==colors[i]:
                    j+=1
                for idx in range(i,j):
                    result+=neededTime[idx]
                result-=max(neededTime[i:j])
                i=j
            else:
                i+=1
        return result0
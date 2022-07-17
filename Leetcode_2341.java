// Leetcode 2341

// Maximum Number of Pairs in Array


class Solution {
public:
    vector<int> numberOfPairs(vector<int>& nums) {
        map<int,int>m;
        int x=0;
        int left=0;
        for(int i=0;i<nums.size();i++)
            m[nums[i]]++;
        for(auto i:m){
            x+=i.second/2;
            left+=i.second%2;
        }
        return {x,left};
    }
};
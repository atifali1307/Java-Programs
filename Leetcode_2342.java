// Leetcode 2342

// max sum of a pair with equal sum of digits


class Solution {
public:
    int maximumSum(vector<int>& nums) {
        int result=-1, x=nums.size();
        unordered_map<int,int>mp;
        for(auto &i:nums){
            string s=to_string(i);
            int sum=0;
            for(auto &ch:s)
                sum+=(ch-'0');
            if(mp.count(sum))
                result=max(result,i+mp[sum]);
            mp[sum]=max(i,mp[sum]);
        }
        return result;
    }
};
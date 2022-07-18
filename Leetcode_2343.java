// Leetcode 2343

// Query kth smallest Trimmed Number

class Solution {
public:
    vector<int> smallestTrimmedNumbers(vector<string>& nums, vector<vector<int>>& queries) {
        vector<int> result;
        for(auto x:queries){
            priority_queue<pair<string,int>> v;
            for(int i=0;i<nums.size();i++){
                int t=nums[i].length()-x[1];
                string a=nums[i].substr(t,x[1]);
                if(v.size()<x[0])
                    v.push({a,i});
                else{
                    if(v.top().first>a){
                        v.pop();
                        v.push({a,i});
                    }
                }
            }
            int value=v.top().second;
            result.push_back(value);
        }
        return result;
    }
};
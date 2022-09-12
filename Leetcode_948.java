// Leetcode 948
// Bag of Tokens

// C++ Solution


class Solution {
public:
    int bagOfTokensScore(vector<int>& tokens, int power) {
        if(tokens.size()==0)
            return 0;
        sort(tokens.begin(),tokens.end());
        int result=0,l=0,r=tokens.size()-1;
        while(true){
            if(power>=tokens[l]){
                power-=tokens[l++];
                result++;
            }
            else{
                if(l<r&&result){
                    power+=tokens[r--];
                    result--;
                }
                else if(l==r || !result){
                    break;
                }
            }
                if(l>r)
                    break;
            }
            return result;
        }
};
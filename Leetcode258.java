Leetcode 
question no 258
Add Digits

class Solution {
    public int addDigits(int num) {
        while(num>=10){
            int rem=num%10;
            int q=num/10;
            int result=rem+q;
            num=result;
            
        }
        return num;
    }
}
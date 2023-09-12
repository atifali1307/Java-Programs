class Solution {
    static int isPerfectNumber(long N) {
        // code here
        int i; long sum=1;
        if(N<=1)
            return 0;
        for(i=2;i<Math.sqrt(N);i++){
            if(N%i==0){
                sum+=i;
                sum+=(N/i);
            }
        }
        if(sum==N) return 1;
        else return 0;
    }
};
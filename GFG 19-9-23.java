class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        StringBuilder sb=new StringBuilder();
        int count=0;
        while(n>=1){
            int m=n%2;
            n=n/2;
            count++;
            sb.append(String.valueOf(m));
            if(m==1)
                break;
        }
        return count;
            
    }
}
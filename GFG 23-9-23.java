class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(n==1) return 1;
        long[] prefix=new long[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int i=0;
        int j=n-1;
        while(i!=j && (i+1)!=j){
            if(prefix[j]-prefix[i]==prefix[i+1])
                return i+2;
            else i++;
        }
        return -1;
        
    }
}
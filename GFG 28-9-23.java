class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        int i=0;
        for(int j=0;j<n/2;j++){
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
            i+=2;
        }
    }
}
   
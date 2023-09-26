class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int K) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        int n=arr.length;
        if(n<=3)
            return ans;
        for(int i=0;i<n-3;i++){
            if(i>0 && arr[i]==arr[i-1])
                continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && arr[j]==arr[j-1])
                    continue;
                int low=j+1;
                int high=n-1;
                while(low<high){
                    int sum=arr[low]+arr[high]+arr[i]+arr[j];
                    if(sum<K)
                        low++;
                    else if(sum>K)
                        high--;
                    else{
                        ArrayList<Integer> temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[low]);
                        temp.add(arr[high]);
                        ans.add(temp);
                        while(low<high && arr[low]==arr[low+1]) low++;
                        while(low<high && arr[high]==arr[high-1]) high--;
                        low++;
                        high--;
                    }
                }
            }
        }
        return ans;
    }
}
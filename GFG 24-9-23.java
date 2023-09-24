class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        TreeSet<Integer> ans=new TreeSet<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }else{
                ans.add(arr[i]);
            }
        }
        if(ans.size()==0){
            ans.add(-1);
            return new ArrayList<>(ans);
        }
        return new ArrayList<>(ans);
    }
}
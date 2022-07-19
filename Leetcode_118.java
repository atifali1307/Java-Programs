// Leetcode 118
// Pascal's Triangle


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<List<Integer>>(numRows);
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>(i+1);
            while(row.size()<=i) row.add(1);
            int mid=i>>1;
            for(int j=1;j<=mid;j++){
                int val=result.get(i-1).get(j-1)+result.get(i-1).get(j);
                row.set(j,val);
                row.set(row.size()-j-1,val);
            }
            result.add(row);
        }
        return result;
    }
}